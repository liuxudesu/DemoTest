package com.seiryo.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.seiryo.entity.Commodity;
import com.seiryo.entity.MyUserInfo;
import com.seiryo.entity.My_order_info;
import com.seiryo.service.CommodityService;
import com.seiryo.service.OrderService;
import com.seiryo.service.UserService;
import com.seiryo.service.impl.CommodityServiceImpl;
import com.seiryo.service.impl.OrderServiceImpl;
import com.seiryo.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	private OrderService orderService = new OrderServiceImpl();
	private CommodityService commodityService = new CommodityServiceImpl();
	private UserService userService = new UserServiceImpl();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String opt = req.getParameter("opt");
		if("select_order_by_user_id".equals(opt)) {
			queryOrderById(req,resp);
		}else if("add_order".equals(opt)){
			addOrder(req, resp);
		}
		
	}
	
	/**
	 * 新增订单
	 * @Title: addOrder  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @param req
	 * @param @param resp
	 * @param @throws ServletException
	 * @param @throws IOException    参数  
	 * @return void    返回类型  
	 * @throws
	 */
	private void addOrder(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String cidStr = req.getParameter("cid");
	    String priceStr = req.getParameter("price");
	    String phone = req.getParameter("phone");
	    String name = req.getParameter("insureName");
	    String yearStr = req.getParameter("year");
	    String city = req.getParameter("city");

	    if (cidStr == null || phone == null || name == null) {
	        resp.getWriter().write("error");
	        return;
	    }

	    Integer cid = Integer.parseInt(cidStr);
	    Integer year = Integer.parseInt(yearStr);

	    HttpSession session = req.getSession();
	    MyUserInfo user = (MyUserInfo) session.getAttribute("user");

	    if (user == null) {
	        resp.getWriter().write("login");
	        return;
	    }

	    Integer userId = user.getUser_id();

	    String yw = req.getParameter("yw");
	    String sc = req.getParameter("sc");
	    String cj = req.getParameter("cj");
	    String zy = req.getParameter("zy");
	    String zd = req.getParameter("zd");
	    String jt = req.getParameter("jt");
	    String jb = req.getParameter("jb");
	    
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
	    String orderId = sdf.format(new Date());
	    SimpleDateFormat sdfYear = new SimpleDateFormat("yyyy");
	    String startDate = sdfYear.format(new Date());

	    String endDate = String.valueOf(Integer.parseInt(startDate) + year);
	    Double oldMoney =  Double.valueOf(user.getUser_money());
	    Double sum =  Double.valueOf(priceStr);
	    if (oldMoney < sum) {
			return;
		}
	    String newMoney = String.valueOf(oldMoney- sum);
    	userService.changeMoneyById(newMoney,userId);
	    boolean flag = orderService.insertOrder(
	            orderId, userId, cid,
	            yw, sc, cj, zy, zd, jt, jb,
	            name, city, phone,
	            startDate, endDate,
	            yearStr,
	            priceStr
	    );
	    //更新user的session
	    MyUserInfo newUser = (MyUserInfo) userService.queryUserById(userId);
	    session.setAttribute("user", newUser);;
	    if (flag) {
	        resp.getWriter().write(String.valueOf(userId));
	    } else {
	        resp.getWriter().write("error");
	    }
	}
	/**
	 * 根据id查询订单
	 * @Title: queryOrderById  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @param req
	 * @param @param resp
	 * @param @throws ServletException
	 * @param @throws IOException    参数  
	 * @return void    返回类型  
	 * @throws
	 */
	private void queryOrderById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer id = Integer.parseInt(req.getParameter("id"));
		HttpSession session = req.getSession();
		MyUserInfo user = (MyUserInfo) session.getAttribute("user");
		
		List<My_order_info> orderList = orderService.queryOrderById(id,user.getUser_name());
		List<Commodity> commodityList = commodityService.selectAllCommodity(null);
		
		req.setAttribute("orderList", orderList);
		req.setAttribute("commodityList", commodityList);
	    req.getRequestDispatcher("my_order.jsp").forward(req, resp);
	}
	
}
