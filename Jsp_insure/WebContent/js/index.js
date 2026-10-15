/**
 * 主界面商品遍历
 */
$(function(){
	// 获取地址栏type参数
	function getUrlParam(name){
		var reg = new RegExp("(^|&)"+name+"=([^&]*)(&|$)");
		var r = window.location.search.substr(1).match(reg);
		if(r!=null)return unescape(r[2]);return 0;
	}
	var initType = getUrlParam("type");
	
	// 封装加载商品方法
	function loadCommodity(type){
		var url = "/Jsp_insure/CommodityServlet";
		var dataParam;
		dataParam = {opt:"queryCommodityByType", type:type}
		$.ajax({
			url: url,
			type:"post",
			data: dataParam,
			dataType:"json",
			success:function(data){
				var html = "";
				$.each(data, function(index, item){
					html += '<div class="div_context">'
					+ '<div class="div_context_l">'
					+ '<img src="'+item.commodity_img+'" width="350px" height="260px"/>'
					+ '</div>'
					+ '<div class="div_context_r">'
					+ '<div class="div_context_r_1">'
					+ '<h2>'+item.commodity_name+'</h2>'
					+ '<p class="p1">️'+item.commodity_introduce+'</p>'
					+ '</div>'
					+ '<div class="div_context_r_2">'
					+ '<div class="price">'
					+ '<span class="fh"><b>¥</b></span>'
					+ '<span class="price_a"><b>'+item.commodity_price+'</b></span>'
					+ '<span class="fh"><b>/起</b></span>'
					+ '</div>'
					// 正确跳转详情页opt
					+ '<a href="CommodityServlet?opt=jumpPageInfo&id=' + item.commodity_id + '&pd=page_info.jsp">'
					+ '<div class="img_a"><b>詳細はこちら</b></div>'
					+ '</a>'
					+ '</div>'
					+ '</div>'
					+ '</div>';
				});
				// 清浮动防止布局错乱
				html += '<div style="clear:both;"></div>';
				$("#context_text").html(html);
			},
			error:function(){
				alert("ネットワークにエラーがあります。後で再試行してください！");
			}
		});
	}

	if ($("#context_text").length > 0) {
	    loadCommodity(initType);
	}

	// 顶部分类li点击切换商品（事件委托）
	$("#top2_text_ul").on("click","li",function(){
		var t = $(this).attr("data-type");
		window.location.href = "index.jsp?type=" + t;
	});
});