<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/fileProject/hj/css/photo.css" />
<title>发布日常_摄影_哔哩哔哩相簿</title>
<link rel="Shortcut Icon" href="${pageContext.request.contextPath}/fileProject/hj/img/resizeApi.png">
<link href="${pageContext.request.contextPath}/fileProject/hj/css/photo.css" type="text/css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/fileProject/hj/css/common.css" type="text/css" rel="stylesheet" />
	<script src="${pageContext.request.contextPath}/fileProject/hj/js/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/fileProject/hj/js/photoimgUp.js"></script>
	<script src="${pageContext.request.contextPath}/fileProject/hj/js/photo.js"></script>
</head>
<body>
	<form action="column/photoData" method="POST" id="form1"  enctype="multipart/form-data">
		<div id="day">
			<h2>发布日常</h2>
			<p class="p1">提示：标记·为必填项，否则无法发布</p>
			<p class="p2">上传图片</p>
			<div class="container" id="container">    
		     	  <img src="${pageContext.request.contextPath}/fileProject/hj/img/a11.png" id="uploadImg"/>
		     	  <input type="file" id="file_input" multiple/> <!--用input标签并选择type=file，记得带上multiple，不然就只能单选图片了-->    
        	</div>   
				
			<p class="p3">我想说</p>
			<textarea placeholder="有什么新鲜事告诉大家？请输入DA※ZE~" name="textarea" maxlength="233" class="input" id="textarea"></textarea>
			<div class="hr" id="hr1"></div>
			<div class="addLabel">
				<span class="p1" id="p1">添加标签</span>
				<div id="addLabel_div">
				</div> 
					<span id="width_caculator" hidden="hidden"></span>
					<input class="i1" type="text" id="i1"/><span class="i2" id="i2">添加</span>
					<span id="ispan" >按回车快速添加＼( ^▽^ )／</span>
			</div>
			<div class="hr" style="margin-top: -20px;"></div>
			<div class="agreement" id="agreement">
				<ul>
					<li class="l1"><input type="checkbox" checked="checked" id="check1" value="123"
						name="name" class="check" /></li>
					<li class="l2"><p>我同意</p></li>
					<li class="l3"><a href="#">《bilibili link使用协议》</a></li>
				</ul>
				<input id="button"  value="提交发布" type="submit" />
			</div>
		</div>
	</form>
</body>
</html>