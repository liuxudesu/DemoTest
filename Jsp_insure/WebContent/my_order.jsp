<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>健康保険のホームページ</title>
		<link rel="stylesheet" type="text/css" href="css/index.css" />
		<link rel="stylesheet" href="https://at.alicdn.com/t/c/font_3881267_wfv3iyzbijg.css">
		<link rel="stylesheet" href="https://cdn.staticfile.org/font-awesome/4.7.0/css/font-awesome.css">
		<script type="text/javascript" src="js/banner.js"></script>
		<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
		<script type="text/javascript" src="js/index.js"></script>
	</head>
	<body>
		<div align="center" id="div_all">
			<div id="top1">
				<div id="top1_text">
					<div id="top1_text1">こんにちは、健康保険モールへようこそ</div>
					<div id="top1_text2">
						<span id="span1">最新情報：</span>
						<marquee id="lb" direction="left">
							ログインしてサインするとプレゼントがあります
						</marquee>
						<c:if test="${empty user}">
							<%-- 未登录：显示登录注册按钮 --%>
							<a href="login.jsp">
								<button type="button" id="userlogin">login/regist</button>
							</a>
						</c:if>
						<c:if test="${not empty user}">
							<%-- 已登录状态 --%>
							<a href="my_info.jsp">
								<span style="font-size:12px;white-space:nowrap;display:inline-block;margin-right:8px;padding:4px 10px;border:2px solid #666;border-radius:999px;">
							        <font color="red">${user.user_name}</font><font color="black">${user.user_sex == '男' ? '先生' : '女士'}、こんにちは！</font>
							    </span>
							</a>
						</c:if>
						
					</div>
				</div>
			</div>
			<div id="top2">
				<div id="top2_text">
					<ul id="top2_text_ul">
						<li data-type="0" style="cursor:pointer;"><b>すべての保険</b></li>
						<li data-type="1" style="cursor:pointer;"><b>健康保険</b></li>
						<li data-type="2" style="cursor:pointer;"><b>意外保険</b></li>
						<li data-type="3" style="cursor:pointer;"><b>企業保険</b></li>
						<li data-type="4" style="cursor:pointer;"><b>旅行保険</b></li>
						<li data-type="5" style="cursor:pointer;"><b>家計保険</b></li>
					</ul>
				</div>
			</div>
			<div id="context_all2">
				<div id="banner_img">
					<div id="banner_img_text">
					    <img src="images/my_img.jpg" width="100%" />
					</div>
				</div>
				<div id="context" class="context" style="height: auto;">
					<div id="context_text_1" style="height: 70px;">
						<a href="my_info.jsp"><div id="myinfo" ><b>マイメッセージ</b></div></a>
						<a href="/Jsp_insure/OrderServlet?opt=select_order_by_user_id"><div id="myorder" style="background-color:#FF7F50;color: white;"><b>私の注文</b></div></a>
					</div>
					<div id="context_text_2">
						<div id="context_text_2_1">
							<b>こんにちは、ご注文情報は以下の通りです！</b>
							<div id="order_table_wrap">
								<table id="table_orderinfo">
									<tr>
										<th>オーダー番号</th>
										<th>オーダー名</th>
										<th>注文価格</th>
										<th>保険加入者</th>
										<th>保証人</th>
										<th>開始時間</th>
										<th>終了時間</th>
										<th>保険加入期間</th>
									</tr>
									<c:forEach items="${orderList}" var="item">
										<tr>
											<td>${item.order_id}</td>
											<c:forEach items="${commodityList}" var="c">
												<c:if test="${item.commodity_id == c.commodity_id}">	
													<td>${c.commodity_name}</td>
												</c:if>
											</c:forEach>
											<td>${item.order_sum_price}</td>
											<td>${user.user_name}</td>
											<td>${item.order_beneficiary_name}</td>
											<td>${item.order_commodity_time_start}</td>
											<td>${item.order_commodity_time_end}</td>
											<td>${item.order_commodity_time_length}年間</td>
										</tr>
									</c:forEach>
								</table>
							</div>
						</div>
					</div>
				</div>
				<div id="foot">
					<h5 class="h51">カスタマーサービスホットライン：888-888-8888 （9:00~21:00）</h5>
					<h5 class="h52">○○健康保険株式会社 027-666666 &nbsp;&nbsp; ICP認証：UP9999999 &nbsp;&nbsp; Copyright © 2023 All Rights Reserved</h5>
				</div>
			</div>
		</div>
	</body>
</html>