$(function(){

	$(".xiugaijiage").hide();
	$(".save").hide();
	
	$(".editor").click(function(){
		
		$(this).prev().show();
		$(this).prev().prev().hide();
		$(this).next().show();
		$(this).hide();
		
		
	})
	
	
	
	
});


	
	function save2(){
		
			$(".editor").show();
			
			$(".save").hide();
		
			alert("bb");
			
			var jiage= $(this).prev().prev().attr("value");
			
			alert(jiage);
	}
	
$(function(){
	$(".save").click(function(){
		$(".editor").show();
//		alert("aa");
		
		$(this).hide();
//		取到了值
		var jiage=$(this).prev().prev().val();
			
			var goods_id=$(this).attr("goods_id");
//			alert(jiage);
//			alert(goods_id);
		$.getJSON("../tiaoServlet/updateinfo?sales_price="+jiage+"&goods_id="+goods_id,function(obj){
			
			
			$.each(obj, function(k,v) {
				
				alert("已更新");
				
			})
			
			$(".xiugaijiage").hide();
			window.location.reload();
			
			$(".yuanjiage").show();
//			$(this).prev().html(jiage);
			
//			history.go(0);
//			$(".yuanjiage").html(jiage);
		})
		
		
//		$(this).hide();
//		
//		$(".editor").show();
	})
	
})	
   
$(function(){

	
	
	
	$("#tijiao").click(function(){
		
	var role_id= $("#role_id").val();
	alert(role_id);
	
	
		$.ajax({
		
			type:"POST",
			url:"../tiaoServlet/supermanager?role_id="+role_id,
			data:$('#formadd').serialize(),
			async: false,
			error: function(request) {  //失败的话
                alert("Connection error");  
			},
           success: function(data) {  //成功
               alert(data);  //就将返回的数据显示出来
//               window.location.href="跳转页面"  
           	}	 
		})		
	})

})



