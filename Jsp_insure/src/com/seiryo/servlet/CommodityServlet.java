package com.seiryo.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.seiryo.entity.Commodity;
import com.seiryo.entity.Commodity_liability_info;
import com.seiryo.entity.MyUserInfo;
import com.seiryo.service.CommodityService;
import com.seiryo.service.impl.CommodityServiceImpl;
import com.seiryo.utile.JSONUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONException;

@WebServlet("/CommodityServlet")
public class CommodityServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	private CommodityService commodityService = new CommodityServiceImpl();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String opt = req.getParameter("opt");
		if("selectAllCommodityList".equals(opt)) {
			selectAllCommodityList(req,resp);
		}else if ("queryCommodityById".equals(opt)) {
			queryCommodityById(req,resp);
		}else if ("queryCommodityByType".equals(opt)) {
			queryCommodityByType(req,resp);
		}else if ("jumpPageInfo".equals(opt)) {
		    jumpPageInfo(req, resp);
		}else if ("jumpShop".equals(opt)) { // 新增跳转购物页
		    jumpShop(req, resp);
		}else if ("queryCommodityInfoById".equals(opt)) {
			queryCommodityInfoById(req,resp);
		}
	}
	/**
	 * 跳转购物页面
	 * @param req
	 * @param resp
	 */
	private void jumpShop(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idStr = req.getParameter("id");
		if(idStr == null || idStr.trim().isEmpty()){
			resp.sendRedirect("index.jsp");
			return;
		}
		Integer id = Integer.parseInt(idStr);
		Commodity_liability_info commodityInfo = commodityService.queryCommodity_liability_infoById(id);
		req.setAttribute("commodityInfo", commodityInfo);
		req.getRequestDispatcher("shop.jsp").forward(req, resp);
	}
	/**
	 * 跳转详情页面
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	private void jumpPageInfo(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer id = Integer.parseInt(req.getParameter("id"));
	    Commodity_liability_info commodityInfo = commodityService.queryCommodity_liability_infoById(id);
	    req.setAttribute("commodityInfo", commodityInfo);
	    req.getRequestDispatcher("page_info.jsp").forward(req, resp);
	}
	/**
	 * 根据ID查询详情
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	private void queryCommodityInfoById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    Integer id = Integer.parseInt(req.getParameter("id"));
	    Commodity_liability_info commodity = commodityService.queryCommodity_liability_infoById(id);
	    String json = null;
		try {
			json = JSONUtil.toJSONString(commodity);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	    resp.getWriter().write(json);
	}
	/**
	 * 根据ID查询保险信息
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	private void queryCommodityById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    Integer id = Integer.parseInt(req.getParameter("id"));
	    Commodity commodity = commodityService.queryCommodityById(id);
	    String json = null;
		try {
			json = JSONUtil.toJSONString(commodity);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	    resp.getWriter().write(json);
	}
	/**
	 * 查询全部保险信息,有年龄的时候优先推荐年龄范围内的
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	private void selectAllCommodityList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		Integer age = getLoginUserAge(req);
		List<Commodity> commodities = commodityService.selectAllCommodity(age);
		String json = null;
		try {
			json = JSONUtil.toJSONString(commodities);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	    resp.getWriter().write(json);
	}
	
	/**
	 * 根据类型查询保险信息
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	private void queryCommodityByType(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		Integer type = Integer.parseInt(req.getParameter("type"));
		List<Commodity> commodities;
		if(type == 0){
			// type=0 查询所有
			Integer age = getLoginUserAge(req);
			commodities = commodityService.selectAllCommodity(age);
		}else{
			// 按分类查询
			commodities = commodityService.queryCommodityByType(type);
		}
		String json = null;
		try {
			json = JSONUtil.toJSONString(commodities);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	    resp.getWriter().write(json);
	}
	//用户年龄
	private Integer getLoginUserAge(HttpServletRequest req) {
	    HttpSession session = req.getSession();
	    MyUserInfo user = (MyUserInfo) session.getAttribute("user");
	    // 未登录直接返回null
	    if (user == null) {
	        return null;
	    }
	    String birthStr = user.getUser_birthday();
	    if (birthStr == null || birthStr.trim().isEmpty()) {
	        return null;
	    }
	    try {
	        Integer birthday = Integer.parseInt(birthStr);
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	        Integer today = Integer.parseInt(sdf.format(new Date()));

	        int birthYear = birthday / 10000;
	        int birthMD = birthday % 10000;
	        int todayYear = today / 10000;
	        int todayMD = today % 10000;

	        Integer age = todayYear - birthYear;
	        if (todayMD < birthMD) {
	            age--;
	        }
	        return age;
	    } catch (NumberFormatException e) {
	        // 生日格式错误，返回null不排序
	        return null;
	    }
	}
	
}
