<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>健康保険のホームページ</title>
		<link rel="stylesheet" type="text/css" href="css/index.css" />
		<link rel="stylesheet" type="text/css" href="css/regist.css" />
		<link rel="stylesheet" href="https://at.alicdn.com/t/c/font_3881267_wfv3iyzbijg.css">
		<link rel="stylesheet" href="https://cdn.staticfile.org/font-awesome/4.7.0/css/font-awesome.css">
		<script type="text/javascript" src="js/banner.js"></script>
		<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
		<script type="text/javascript" src="js/regist.js"></script>
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
						<a href="login.jsp">
							<button type="button" id="userlogin">login/regist</button>
						</a>
					</div>
				</div>
			</div>
			<div id="top2">
				<div id="top2_text">
					<ul id="top2_text_ul">
						<li><b>すべての保険</b></li>
						<li><b>健康保険</b></li>
						<li><b>意外保険</b></li>
						<li><b>企業保険</b></li>
						<li><b>旅行保険</b></li>
						<li><b>家計保険</b></li>
					</ul>
				</div>
			</div>
			<div id="context_all2">
				<div id="banner_img">
					<div id="banner_img_text">
					    <img src="images/123.jpg" width="100%" />
					</div>
				</div>
				<div id="context" class="context" style="height: auto;">
					<div id="context_text_2" style="height: 1050px">
						<div id="context_text_2_1">
							<b>保険加入個人情報は以下の通り記入する：</b>
							<hr size="5px" color="#DCDCDC" />
							<div id="context_text_21">
								<h6>ご契約者の皆さまのご意見・ご要望をお聞かせください。</h6>
								<h6 class="h61">·個人情報に関連するお申し出につきましては、プライバシー保護の観点からメールでのご回答はいたしておりません。</h6>
								<h6 class="h61">·お申し出内容によっては、電話や文書でご回答させていただく場合がございます。なお、お近くの支社などよりご回答さしあげる場合もございます。</h6>
								<h6 class="h61">·お申し出内容によっては、ご回答にお時間をいただくことがございます</h6>
								<h6 class="h61">·ご契約内容につきましては生涯設計eレポートでもご確認いただけます。</h6>
								<h6 class="h62">下記の必要項目を入力し、「確認画面へ」をクリックしてください。</h6>
								<h6 class="h61">※ 英数字は半角、それ以外は全角でご入力ください。</h6>
								<h6 class="h61"><a href="login.jsp">アカウントがありますので、ここをクリックしてください！</a></h6>
								<table class="table_regist">
									<tr class="tr1">
										<th style="border-bottom: 2px solid #D3D3D3;">
											<span>【必須】</span>
											<span>&nbsp;&nbsp;ご契約者さまのお名前（全角）</span><br />
											<span>【必須】</span>
											<span>&nbsp;&nbsp;フリガナ（全角カナ）</span>
										</th>
										<td style="border-bottom: 2px solid #D3D3D3;">
											&nbsp;&nbsp;&nbsp;
											<span>姓</span>
											<input type="text" id="userX"  />
											<span>名</span>
											<input type="text" id="userM" /><br />
											&nbsp;&nbsp;&nbsp;
											<span>セイ</span>
											<input type="text" id="userXq" />
											<span>メイ</span>
											<input type="text" id="userMq" />
										</td>
									</tr>
									<tr class="tr1">
										<th style="border-bottom: 2px solid #D3D3D3;">
											<span>【必須】</span>
											<span>ご契約者さまの生年月日（半角数字）</span>
										</th>
										<td style="border-bottom: 2px solid #D3D3D3;">
											&nbsp;&nbsp;&nbsp;
											<select id="nh">
												<option value="0">明治</option>
												<option value="1">大正</option>
												<option value="2" selected="selected">昭和</option>
												<option value="3">平成</option>
												<option value="4">令和</option>
											</select>
											<input type="text" maxlength="4" id="year" />年
											<select id="month">
												<option value="01" selected="selected">1</option>
												<option value="02">2</option>
												<option value="03">3</option>
											</select>月
											<select id="day">
												<option value="01" selected="selected">1</option>
												<option value="02">2</option>
												<option value="03">3</option>
											</select>日
										</td>
									</tr>
									<tr class="tr1">
										<th style="border-bottom: 2px solid D3D3D3;">
											<span>【必須】</span>
											<span>ご契約者さまの性別</span>
										</th>
										<td style="border-bottom: 2px solid D3D3D3;">
											&nbsp;&nbsp;&nbsp;
											<select id="userSex">
												<option value="0" selected="selected">女</option>
												<option value="1">男</option>
											</select>
										</td>
									</tr>
									<tr class="tr1">
										<th style="border-bottom: 2px solid #D3D3D3;">
											<span>【必須】</span>
											<span>日中のご連絡先電話番号（半角数字）</span>
										</th>
										<td style="border-bottom: 2px solid #D3D3D3;">
											&nbsp;&nbsp;&nbsp;
											<input type="text" maxlength="4" id="userPhone5" />-
											<input type="text" maxlength="4" id="userPhone4" />-
											<input type="text" maxlength="3" id="userPhone42" />
										</td>
									</tr>
									<tr class="tr1">
										<th style="border-bottom: 2px solid #D3D3D3;">
											<span>【必須】</span>
											<span>メールアドレス（半角英数字）</span>
										</th>
										<td style="border-bottom: 2px solid #D3D3D3;">
											&nbsp;&nbsp;&nbsp;
											<input type="text" id="userEmail1" />@
											<input type="text" id="userEmail2" /><br />
											&nbsp;&nbsp;&nbsp;
											<span>以下のドメインを受信できるように設定をお願いいたします。</span>
											<span>@dl.dai-ichi-life.co.jp</span>
										</td>
									</tr>
									<tr>
										<th>
											<span>【必須】</span>
											<span>パスワード（半角英数字）</span>
										</th>
										<td>
											&nbsp;&nbsp;&nbsp;
											<input type="password" id="userPass" maxlength="15" />
											<span>メールアドレス、パスワードでアカウントにログインする</span>
										</td>
									</tr>
								</table>
								<div id="register" align="center">
									<a href="#">
										<div align="center" id="userRegister">
											送信
										</div>
									</a>
								</div>
							</div>
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