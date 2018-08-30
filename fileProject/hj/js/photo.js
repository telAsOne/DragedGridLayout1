$(function(){
	var as=3;
	function insert(){
		if(as>0){
			var value=document.getElementById("i1").value;
			if(document.getElementById("i1").value!=""){
				as--;
				var d=document.createElement("input");
				d.setAttribute("name","inputName");
				d.setAttribute("class","addLabel_div_input");
				d.setAttribute("value",value);
				d.setAttribute("readonly","readonly");
				d.onclick = function() {
					as++;
					if(as>0){
						$("#i2").css("display","inline-block");
						$("#i1").css("display","inline-block");
						$("#ispan").css("display","inline-block");
					}
					remove(this,as);
				};
				//添加输入框
				document.getElementById("addLabel_div").appendChild(d);

				//清空输入框内容
				document.getElementById("i1").value="";
				//自动调整宽度
				$("#addLabel_div>input").each(function(event){input_resize(this);});
				if(as==0){
					$("#i2").css("display","none");
					$("#i1").css("display","none");
					$("#ispan").css("display","none");
				}
			}else{
				alert("矮油!输入内容");
			}
		}
	}
	//按回车创建标签
	$().ready(function () {
		$("#i1").keydown(function (e) { 
			var keyCode = e.keyCode ? e.keyCode : e.which ? e.which : e.charCode; //兼容IE 火狐 谷歌
			if (keyCode == 13) {
				insert();
				return false;
			}
		});
		$("#i2").click(function(){
			insert();
		});
	});
	
	
	var check1B=false;
	//点击复选框按钮
	$("#check1").click(function(){
		if(check1B==false){
			var span=document.createElement("span");
			span.setAttribute("id", "buttonSpan");
			span.innerHTML="提交发布";
			$("#button").remove();
			document.getElementById("agreement").appendChild(span);
		}else{
			var button=document.createElement("input");
			button.setAttribute("id", "button");
			button.setAttribute("type", "submit");
			button.setAttribute("value", "提交发布");
			$("#buttonSpan").remove();
			document.getElementById("agreement").appendChild(button);
		}
		check1B=!check1B;
	});
	
});
function remove(obj,as) {
	obj.remove();
}
/*自动调整输入框宽度*/
function input_resize(obj){
	$("#width_caculator").html(obj.value);
	$("#width_caculator").css("fontSize", $(obj).css('fontSize'));
	$(obj).css('width',$("#width_caculator").width()+40+"px");
}
