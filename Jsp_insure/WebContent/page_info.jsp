<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>健康保険のホームページ</title>
		<link rel="stylesheet" type="text/css" href="css/index.css" />
		<link rel="stylesheet" href="https://at.alicdn.com/t/c/font_3881267_wfv3iyzbijg.css">
		<link rel="stylesheet" href="https://cdn.staticfile.org/font-awesome/4.7.0/css/font-awesome.css">
		<script type="text/javascript" src="js/banner.js"></script>
		<script src="https://cdn.staticfile.org/jquery/1.8.3/jquery.min.js"></script>
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
					    <img src="${commodityInfo.getCommodity_detailed_information1()}" width="100%" />
					</div>
				</div>
				<div id="context" class="context" style="height: auto;">
					<div id="context_text_1" style="height: 200px">
						<div id="context_text_info1" >
							<table id="context_text_info1_table">
								<tr>
									<td><b>該当の人：</b><span>${commodityInfo.commodity_age_start}～${commodityInfo.commodity_age_end}歳で生まれます</span></td>
									<td><b>保険期間：</b><span>${commodityInfo.commodity_time_length}</span></td>
								</tr>
								<tr>
									<td><b>販売範囲：</b><span>${commodityInfo.commodity_applicable_location}</span></td>
									<td><b>保証書形式：</b><span>${commodityInfo.commodity_signing_form}</span></td>
								</tr>
								<tr>
									<td colspan="2"><b>保険責任：</b><span>${commodityInfo.commodity_liability_zjs}</span></td>
								</tr>
							</table>
						</div>
						<div id="context_text_info2">
							<div class="price1">
								<span class="fh1"><b>¥</b></span>
								<span class="price_a1"><b>${commodityInfo.commodity_price}</b></span>
								<span class="fh1"><b>/起</b></span>
							</div>
							<c:if test="${user != null}">
								<a href="CommodityServlet?opt=jumpShop&id=${commodityInfo.commodity_id}&pd=shop.jsp">
									<div class="img_a1">
										<b>ただちに保険をかける</b>
									</div>
								</a>
							</c:if>
							<c:if test="${user == null}">
								<a href="login.jsp">
									<div class="img_a1">
										<b>ただちに保険をかける</b>
									</div>
								</a>
							</c:if>
						</div>
					</div>
					<div id="context_text_2">
						<div id="context_text_2_1">
							<b>保険の詳細は次のとおりです：</b>
						</div>
						<div id="context_text_2_2"></div>
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