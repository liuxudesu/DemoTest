/**
 * 信息提交修改
 */
$(function(){
	$("#updateuserinfo").click(function(){
		var userPass = $("#userPass").val();
		var userPhone = $("#userPhone").val();
		var charge = $("#charge").val();
		
		// 密码判断
        var regPwd = /^(\w){6,16}$/;
        // 手机号判断
        var regPhone = /^1[3,4,5,6,7,8,9][0-9]{9}$/;
        // 金额判断
        var regMoney = /^\d+(\.\d{1,2})?$/;

        //校验密码
        if(!regPwd.test(userPass)){
            alert("パスワードには6桁以上15桁未満の数字が必要です！");
            return; // 终止，不提交
        }

        //校验手机号
        if(!regPhone.test(userPhone)){
            alert("入力した携帯番号に問題がありますよ！");
            return;
        }

        //校验充值金额
        if(!regMoney.test(charge)){
            alert("チャージ金額は数字のみ入力可能です");
            return;
        }
        // 转数字判断是否小于0
        var moneyNum = parseFloat(charge);
        if(moneyNum < 0){
            alert("チャージ金額は0以下にできません、0以上を入力してください");
            return;
        }
        //全部校验通过 → 发送ajax
		$.ajax({
			url:"/Jsp_insure/UserServlet?opt=user_update",
			type:"post",
			dataType:"json",
			data:{
				userPass: userPass,
				userPhone: userPhone,
				charge: charge
			},
			success:function(res){
				if(res > 0){
					alert("修正成功おめでとうございます！");
					// 刷新当前页面展示新数据
					location.reload();
				}else{
					alert("修正失敗！");
				}
			},
			error:function(){
				alert("ネット通信エラー");
			}
		});
	});
});