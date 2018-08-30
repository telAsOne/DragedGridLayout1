<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/fileProject/hj/css/painting.css" />
<title>发布日常_摄影_哔哩哔哩相簿</title>
<link rel="Shortcut Icon" href="${pageContext.request.contextPath}/fileProject/hj/img/resizeApi.png">
<link href="${pageContext.request.contextPath}/fileProject/hj/css/painting.css" type="text/css" rel="stylesheet" />
<link href="${pageContext.request.contextPath}/fileProject/hj/css/common.css" type="text/css" rel="stylesheet" />
<script src="${pageContext.request.contextPath}/fileProject/hj/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/fileProject/hj/js/paintingimgUp.js"></script>
<script src="${pageContext.request.contextPath}/fileProject/hj/js/painting.js"></script>
</head>
<body>
	<form method="POST"  enctype="multipart/form-data">
		<div id="day">
			<h2>发布日常</h2>
			<p class="p1">提示：标记·为必填项，否则无法发布</p>
			<p class="p2">上传图片</p>
			<div class="container" id="container">    
		     	  <img src="${pageContext.request.contextPath}/fileProject/hj/img/a11.png" id="uploadImg"/>
		     	  <input type="file" id="file_input" multiple/> <!--用input标签并选择type=file，记得带上multiple，不然就只能单选图片了-->    
        	</div>   
				
				
			<div id="information">
				<p>
					<span class="works">作品属性</span>
					<input type="radio" name="attribute" value="同人" checked="checked"/>
					<span class="attribute_span">同人</span>
					<input type="radio" name="attribute" value="同人"/>
					<span class="attribute_span">原创</span>
				</p>
				<p>
					<span class="works">作品分类</span>
					<input type="radio" name="classification"  value="画友.漫画"/>
					<span class="attribute_span">漫画</span>
					<input type="radio" name="classification"  value="画友.插画"/>
					<span class="attribute_span">插画</span>
					<input type="radio" name="classification" checked="checked"  value="画友.其他"/>
					<span class="attribute_span">其他</span>
				</p>
				<p>
					<span class="works">作品标题</span>
					<input type="text" id="works_title" name="title" placeholder="请输入标题"/>
				</p>
			</div>
			<p class="p3">作品简介</p>
			<textarea placeholder="请输入作品介绍，临摹作品请一定要注明作品的出处来源" class="input" maxlength="233" id="textarea"></textarea>
			<div class="hr" id="hr1"></div>
			<div class="addLabel" id="addLabel1">
				<span class="p1" >其他标签</span>
				<div id="addLabel1_div">
				</div> 
					<span id="width_caculator1" hidden="hidden"></span>
					<input class="i1" placeholder="添加作品，方便分享" id="input2" type="text"/>
					<span class="i2" >添加</span>
					<span class="ispan">按回车快速添加＼( ^▽^ )／</span>
			</div>
			
			<div class="addLabel">
				<span class="p1" id="p1">来源标签</span>
				<div id="addLabel_div">
				</div> 
					<span id="width_caculator" hidden="hidden"></span>
					<input class="i1" placeholder="添加作品来源，如阴阳师" type="text" id="i1"/>
					<span class="i2"  id="i2">添加</span>
					<span class="ispan" id="ispan2">按回车快速添加＼( ^▽^ )／</span>
			</div>

			<div class="hr" style="margin-top: 60px;"></div>
			<div id="reprinted">
				<input type="radio" checked="checked" value="1" name="reprinted"/>
				<span>不设置转载权限</span>
				<input type="radio" value="2" name="reprinted"/>
				<span>禁止转载</span>
			</div>
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