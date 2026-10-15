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
		<script type="text/javascript" src="js/my_info.js"></script>
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
					    <img src="images/my_img.jpg" width="100%" />
					</div>
				</div>
				<div id="context" class="context" style="height: auto;">
					<div id="context_text_1" style="height: 70px;">
						<a href="my_info.jsp"><div id="myinfo" style="background-color:#FF7F50;color: white;"><b>マイメッセージ</b></div></a>
						<a href="/Jsp_insure/OrderServlet?opt=select_order_by_user_id&id=${user.user_id}"><div id="myorder"><b>私の注文</b></div></a>
					</div>
					<div id="context_text_2">
						<div id="context_text_2_1">
							<b>${user.user_name}さん、あなたの情報は次の通りです。</b>
							<table id="table_myinfo">
								<tr>
									<th>メールアドレス：</th>
									<td>${user.user_email}</td>
								</tr>
								<tr>
									<th>パスワード：</th>
									<td><input type="password" name="userPass" value="${user.user_password}" id="userPass"/></td>
								</tr>
								<tr>
									<th>あなたの誕生日：</th>
									<td>${user.user_birthday}</td>
								</tr>
								<tr>
									<th>携帯番号：</th>
									<td>
										<input type="text" name="userPhone" id="userPhone" value="${user.user_phone}"/>
									</td>
								</tr>
								<tr>
									<th>現在の残高：</th>
									<td>
										${user.user_money}円&nbsp;&nbsp;
										チャージ金額の入力：<input type="text" maxlength="5" name="charge" id="charge" value="0">
									</td>
								</tr>
								<tr>
									<td colspan="2">
										<div id="updateuserinfo" style="cursor:pointer;">変更</div>
									</td>
								</tr>
							</table>
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