/**
 * shop.js文件
 */
//设置js方法来操作界面下拉框，动态设置值
function js(obj,v){
	var sum = parseFloat(obj.value) * 10;
	sessionStorage.setItem(v,sum + "");
	var sum_value = 0;
	var bo = true;
	if(getData() != ""){
		var $value = getData().split(",");
		for(var i = 0; i < $value.length; i++){
			if(v == $value[i]){
				bo = false;
				break;
			}
		}
	}
	if(bo){
		sessionStorage.setItem("dataValue",getData() + v);
	}
	if(getData() != ""){
		var $value = getData().split(",");
		for(var i = 0; i < $value.length -1; i++){
			sum_value = sum_value + parseFloat(sessionStorage.getItem($value[i]));
		}
	}
	sum_value = sum_value + parseFloat(document.getElementById("price_value").value);
	document.getElementById("price_view").innerHTML = sum_value;
}

//获取内容
function getData(){
	var dataValue = sessionStorage.getItem("dataValue");
	if(dataValue != null){
		return dataValue + ","
	}
	return "";
}

//设置当前时间
function setDate(){
	var date = new Date();
	document.getElementById("staDateTime").value = date.getFullYear();
}

//每次打开此网页进行清空sessionStorage避免出现金额增多情况
window.onload = function(){
	sessionStorage.clear();
	//运行
	setDate();
}

$(function () {
    $("#buyCommodity").click(function () {
    	var userMoney = parseFloat($("#userMoneyHidden").val());
    	var totalPrice = parseFloat($("#price_view").text());
        var data = {
            opt: "add_order",
            cid: $("#commodity_id").val(),
            price: $("#price_view").text(),
            phone: $("#userPhone2").val().trim(),
            insureName: $("#userName2").val().trim(),
            year: $("#endDataTime").val(),
            city: $("#userCity2").val().trim(),
            
            yw: $("#yw option:selected").text(),
            sc: $("#sc option:selected").text(),
            cj: $("#cj option:selected").text(),
            zy: $("#zy option:selected").text(),
            zd: $("#zd option:selected").text(),
            jt: $("#jt option:selected").text(),
            jb: $("#jb option:selected").text()
        };

        // 基础校验
        if (!data.insureName || !data.phone) {
            alert("被保険者の名前と携帯番号を入力してください！");
            return;
        }
        
        if (userMoney < totalPrice) {
            alert(
                "残高が足りませんので、先にチャージしてください！"
            );
        }
        // 根据手机号检测用户
        $.ajax({
            url: "UserServlet",
            type: "post",
            dataType: "json",
            data:{
                opt:"check_user_by_phone",
                phone: data.phone
            },
            success:function(userRes){
                //手机号无注册用户，直接阻断
                if(!userRes.exist){
                    alert("この被保険者はまだ登録していません、先に登録をお願いします");
                    return;
                }
                // 用户存在，拿到年龄、性别，再查询保险限制
                var insureAge = userRes.user_age;
                var insureGender = userRes.user_gender;
                var commodityId = data.cid;

                $.ajax({
                    url:"CommodityServlet",
                    type:"post",
                    dataType:"json",
                    data:{
                        opt:"queryCommodityById",
                        id: commodityId
                    },
                    success:function(commRes){
                        var minAge = commRes.commodity_age_start;
                        var maxAge = commRes.commodity_age_end;

                        // 年龄校验
                        if(insureAge < minAge || insureAge > maxAge){
                            alert("被保険者年齢が適用範囲外："+minAge+"～"+maxAge+"歳");
                            return;
                        }

                        //余额校验
                        $.ajax({
                            url: "OrderServlet",
                            type: "post",
                            data: data,
                            success: function (res) {
                                if(res === "moneyShort"){
                                    alert("残高が足りませんので、先にチャージしてください！");
                                }else if(res === "login"){
                                    alert("ログインしてください");
                                    location.href="login.jsp";
                                }else if(res === "error"){
                                    alert("購入失敗しました");
                                }else{
                                    alert("ご購入おめでとうございます。注文詳細画面をジャンプします！");
                                    window.location.href = "OrderServlet?opt=select_order_by_user_id&id=" + res;
                                }
                            },
                            error: function () {
                                alert("購入失敗しました");
                            }
                        });
                    }
                })
            }
        });
    });
});