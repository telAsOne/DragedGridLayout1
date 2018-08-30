<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title></title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/fileProject/hj/css/uploading.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/fileProject/hj/font-awesome-4.7.0/css/font-awesome.min.css">
</head>
<body>
	
	<section>
		<div id="basicInfo">
			<h3>基本信息</h3><br/>
			
			<p>视频封面设置
				<span class="placeholderSpan">（格式jpeg、png，文件大小≤5MB，建议尺寸≥1146*717，最低尺寸≥960*600）</span>
			</p>
			<div id="abbreviateImg"><img src="img/yu.png" alt="略缩图" width="190px" height="120px"></div>
			
			<p><span class="importance">*</span>类型</p>
			<p class="genre"><input type="radio" name="uploadType" value="create"/>自制</p>
			<p class="genre"><input type="radio" name="uploadType" value="reprint"/>转载</p>
			
			<br/><br/>
			<p><span class="importance">*</span>分区</p>
			<select class="zone">
				<option value="volvo">Volvo</option>
				<option value="saab">Saab</option>
				<option value="mercedes">Mercedes</option>
				<option value="audi">Audi</option>
			</select>
			
			<br/><br/>
			<p><span class="importance">*</span>标题</p>
			<input type="text" placeholder="请定义标题" maxlength="80" class="headline"/>
			
			<br/><br/>
			<p><span class="importance">*</span>标签
			<span class="placeholderSpan">（使用活动标签即可参与活动，默认以前三个标签同步生成动态话题）</span></p>
			<input type="text" placeholder="请定义标题" maxlength="10" class="headline"/>

			<br/><br/>
			<p><span class="importance">*</span>简介</p>
			<textarea placeholder="请输入视频简介" maxlength="2000" class="intro"></textarea>
			
			<button id="uploadingButton">立即投稿</button>
		</div>
	</section>
</body>
</html>