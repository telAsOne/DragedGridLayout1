function bian(a){
	$(".tougao").css("display","none");
	if(a.innerHTML=="视频投稿"){
		$("#section_video").css("display","block");
	}else if(a.innerHTML=="专栏投稿"){
		$("#section_column").css("display","block");
		$("#section_column_one").css("display","block");
		$("#section_column_tow").css("display","none");
		
		$("#head .headA").css("color","#000000");
		$("#head .headA").css("border","none");
		$("#headA").css("color","#1e90ff");
		$("#headA").css("display","inline-block");
		$("#headA").css("borderBottom","1px solid #1e90ff");
		$("#headA").css("paddingBottom","10px");
	}else if(a.innerHTML=="相簿投稿"){
		$("#section_photo").css("display","block");
	}
	$(".asd").css("color","#000000");
	$(".asd").css("border","none");
	a.style.color = "#1e90ff";
	a.style.display="inline-block";
	a.style.borderBottom="1px solid #00A1D6";
	a.style.width="70px";
}
//专栏草稿点击事件
function zhuanlan_tougao(obj){
	$("#head .headA").css("color","#000000");
	$("#head .headA").css("border","none");
	obj.style.color = "#1e90ff";
	obj.style.display="inline-block";
	obj.style.borderBottom="1px solid #1e90ff";
	obj.style.paddingBottom="10px";	
	if(obj.innerHTML=="专栏投稿"){
		$("#section_column_one").css("display","block");
		$("#section_column_tow").css("display","none");
	}else{
		$("#section_column_one").css("display","none");
		$("#section_column_tow").css("display","block");
	}
}

$(function(){
	 //隐藏ul
	$(".content_info_ul1_li>span").mouseover(function () {	
		$(".content_info_ul1_li>ul").css("display","none");
	});
	 var a=10;
	//按回车创建标签
	$().ready(function () {
		$("#txt_search").keydown(function (e) { 
			var keyCode = e.keyCode ? e.keyCode : e.which ? e.which : e.charCode; //兼容IE 火狐 谷歌
			if (keyCode == 13) {
				if(a>0){
					var value=document.getElementById("txt_search").value;
					if(document.getElementById("txt_search").value!=""){
						a--;
						var d=document.createElement("input");
						d.setAttribute("name","label");
						d.setAttribute("class","content_info_input_class");
						d.setAttribute("value",value);
						d.setAttribute("readonly","readonly");
						
						d.onclick = function() {
							a++;
							if(a>0){
								$("#txt_search").css("display","inline-block");
								$("#content_info_Enter").css("display","block");
							}
							remove(this,a);
						};
						//删除span
						document.getElementById("content_info_p2_span2").remove();
						//重新创建span
						var aa=document.createElement("span");
						aa.setAttribute("id","content_info_p2_span2");
						aa.setAttribute("class","span_family2");
						aa.innerHTML="(还可以添加"+a+"个标签)";
						
						//添加输入框
						document.getElementById("content_info_p2").appendChild(aa);
						document.getElementById("content_info_input").appendChild(d);

						//清空输入框内容
						document.getElementById("txt_search").value="";
						//自动调整宽度
						$("#content_info_input>input").each(function(event){input_resize(this);});

						if(a==0){
							$("#txt_search").css("display","none");
							$("#content_info_Enter").css("display","none");
						}
					}else{
						alert("矮油!输入内容");
					}
				}
				return false;
			}
		});
		
		$("#content_title").keydown(function (e) { 
			var keyCode = e.keyCode ? e.keyCode : e.which ? e.which : e.charCode; //兼容IE 火狐 谷歌
			if (keyCode == 13) {
				return false;
			}
		});
	});
	
	//同意阅读的复选框
	var selected=true;
	$("#content_info_div_input").click(function(){
		selected=!selected;
		if(selected==false){
			//创建a标签
			$("#content_info_ul2_li>span").remove();
			var content_info_div_a=document.createElement("button");
			content_info_div_a.setAttribute("id","content_info_ul2_li_button");
			content_info_div_a.setAttribute("type","submit");
			content_info_div_a.innerHTML="提交文章";
			document.getElementById("content_info_ul2_li").appendChild(content_info_div_a);
			$("#content_info_ul2_li_button").css("color","white");
			$("#content_info_ul2_li_button").css("backgroundColor","rgb(55, 200, 247)");
			$("#content_info_ul2_li").css("backgroundColor","rgb(55,200,247)");
		}else{
			//创建span元素
			$("#content_info_ul2_li_button").remove();
			$("#content_info_ul2_li").css("backgroundColor","rgb(229,233,239)");
			var span=document.createElement("span");
			span.innerHTML="提交文章";
			document.getElementById("content_info_ul2_li").appendChild(span);
		}
	});
	

	
	
	
});
/*自动调整输入框宽度*/
function input_resize(obj){
	$("#width_caculator").html(obj.value);
	$("#width_caculator").css("fontSize", $(obj).css('fontSize'));
	$(obj).css('width',$("#width_caculator").width()+20+"px");
}


function dianji(zt){
	if(zt.innerHTML=="动画")
		$("#content_info_ul1_li_anime").css("display","block");
	if(zt.innerHTML=="游戏")
		$("#content_info_ul1_li_game").css("display","block");
	if(zt.innerHTML=="影视")
		$("#content_info_ul1_li_movie").css("display","block");
	if(zt.innerHTML=="生活")
		$("#content_info_ul1_li_life").css("display","block");
	if(zt.innerHTML=="兴趣")
		$("#content_info_ul1_li_interest").css("display","block");
	if(zt.innerHTML=="轻小说")
		$("#content_info_ul1_li_novel").css("display","block");
	if(zt.innerHTML=="科技")
		$("#content_info_ul1_li_science").css("display","block");
}
function remove(obj,a) {
	obj.remove();
	//删除span
	document.getElementById("content_info_p2_span2").remove();
	//创建span
	var aa=document.createElement("span");
	aa.setAttribute("id","content_info_p2_span2");
	aa.setAttribute("class","span_family2");
	aa.innerHTML="(还可以添加"+a+"个标签)";
	document.getElementById("content_info_p2").appendChild(aa);
}
function count(){
	//得到多行文本框字符的个数
	var str=document.getElementById("column_cover_textarea").value;
	document.getElementById("column_cover_textarea_span").innerHTML
	= str.length+"/233";
}
$(function(){
	//分类
	$("#content_info_ul1 ul li").click(function(){
		$("[name=columnClassification]").attr("value",$(this).html());
		$("#content_info_ul1 ul li").css("color","black");
		$("#content_info_ul1 ul li").css("backgroundColor","white");
		$(this).css("backgroundColor","#f1f3f7");
		$(this).css("color","#88c8f7");
		$(".content_info_ul1_li").css("backgroundColor","#f1f3f7");
		$(".content_info_ul1_li").css("color","black");
		$(this).parent("ul").parent("li").css("backgroundColor","#37c8f7");
		$(this).parent("ul").parent("li").css("color","white");
		$("[name=columnType]").attr("value",$(this).parent("ul").prev("span").html());
	});
	
	
	$("#draft").click(function(){
		var inputValue="";
		$("input[name='label']").each(function(){
			inputValue+=$(this).val()+",";
		});
		$.ajax({
			async:false,		
            url : 'draft',    
            type : 'post', 
            dataType: 'text',  
			data:{
				draftTitle:$("[name=columnTitle]").val(),
				draftImgTitle:$("#titlImgContent").val(),
				draftContent:CKEDITOR.instances.editor1.getData(),
				draftType:$("[name=columnType]").val(),
				draftClassification:$("[name=columnClassification]").val(),
				draftLabel:inputValue
			}
		});
	});
});

