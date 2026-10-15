/**
 * 登陆
 */
$(function(){
	$("#user_login").click(function(){
		var user_email = $("#email").val();
		var user_pass = $("#password").val();
		var bo = false;
		if(user_email.length > 0){
			if(user_pass.length > 0){
				bo = true;
			}else{
				alert("パスワードを空にすることはできませんよ！");
			}
		}else{
			alert("メールボックスを空にすることはできませんよ！");
		}
		if(bo){
			$.ajax({
				url:"/Jsp_insure/UserServlet?opt=user_login",
				type:"post",
				data:{"userEmail":user_email,"userPass":user_pass},
				dataType:"json",
				success:function(date){
					if(date > 0){
						alert("ログイン成功おめでとうございます。もうすぐ画面をジャンプします！");
						window.location.href = "index.jsp";
					}else{
						alert("アカウントまたはパスワードが間違っている！");
					}
				},
				error:function(){
					alert("ネットワークにエラーがありました。後で再試行してください！");
				}
			});
		}
	});
});