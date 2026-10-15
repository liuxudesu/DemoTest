<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
    <meta charset="utf-8">
    <title>login/register</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css">
    <link rel="stylesheet" href="css/dmaku.css">
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <script type="text/javascript" src="js/login.js"></script>
</head>
<body>
    <div class="dowebok" id="dowebok">
        <div id="div_css" class="form-container sign-in-container">
                <h1>登録</h1>
                <div class="social-container">
                    <a href="#" class="social"><i class="fab fa-facebook-f"></i></a>
                    <a href="#" class="social"><i class="fab fa-google-plus-g"></i></a>
                    <a href="#" class="social"><i class="fab fa-linkedin-in"></i></a>
                </div>
                <span>またはアカウントを使用する</span>
                <input type="email" id="email" placeholder="メールボックス">
                <input type="password" id="password" placeholder="パスワード">
                <h2></h2>
                <button id="user_login">登録</button>
        </div>
        <div class="overlay-container">
            <div class="overlay">
                <div class="overlay-panel overlay-left">
                    <h1>既存のアカウント？</h1>
                    <p>アカウントを使用してログインしてください</p>
                    <button class="ghost" id="signIn">登録</button>
                </div>
                <div class="overlay-panel overlay-right">
                    <h1>アカウントがありません？</h1>
                    <p>すぐに登録して私たちに参加して、健康な生活を始めましょう！</p>
                    <a href="regist.jsp"><button class="ghost" id="signUp">regist</button></a>
                </div>
            </div>
        </div>
    </div>
    <div id="foot">
		<h5 class="h51">カスタマーサービスホットライン：888-888-8888 （9:00~21:00）</h5>
		<h5 class="h52">○○健康保険株式会社 027-666666 &nbsp;&nbsp; ICP認証：UP9999999 &nbsp;&nbsp; Copyright © 2023 All Rights Reserved</h5>
	</div>
</body>

</html>