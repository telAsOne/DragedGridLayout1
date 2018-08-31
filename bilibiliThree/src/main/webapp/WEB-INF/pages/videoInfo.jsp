<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title></title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/fileProject/hj/css/uploading.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/fileProject/baseCss/font-awesome-4.7.0/css/font-awesome.min.css">
	<script src="${pageContext.request.contextPath}/fileProject/baseJs/jquery.js"></script>
	<script type="text/javascript">
		$(function() {
	
			/*批量导入*/
			/*#abbreviateImg:为按钮,点击后生成一个隐藏的input file标签*/
			$('#abbreviateImg').after('<input type="file" id="load_xls" name="imgFile" style="display:none" onchange="uploadFile()">');
			$('#abbreviateImg').click(function() {
				document.getElementById("load_xls").click();
			});
	
			$('#load_xls').change(function() {
				var file = $('#load_xls').get(0).files[0];
				var reader = new FileReader();
				reader.readAsDataURL(file);
				reader.onload=function(e){
					console.log(e);
					/*把选择的文件放入页面中显示*/
					$('#fileImge').get(0).src = e.target.result;
				};
			});
	
		});
	</script>
</head>
<body>
	<header>
		<ul class='menu'>
			<li id='video'><a id="videoAsd" class="asd" onclick="bian(this)"
				href="javascript:void(0)" >视频投稿</a></li>
			<li><a class="asd"  onclick="bian(this)"
				href="javascript:void(0)" id="column">专栏投稿</a></li>
			<li><a class="asd" onclick="bian(this)"
				href="javascript:void(0);" id="audio">音频投稿</a></li>
			<li><a class="asd" onclick="bian(this)"
				href="javascript:void(0)" id="photo">相簿投稿</a></li>
		</ul>
	</header>

	<c:if test="${!empty videoById}">
		<form id="updateImg" action="${pageContext.request.contextPath}/updateVideo" method="post" enctype="multipart/form-data">
	</c:if>
	<c:if test="${empty videoById}">
		<form id="updateImg" action="${pageContext.request.contextPath}/addVideo" method="post" enctype="multipart/form-data">
	</c:if>
	
	<section>
		<div id="basicInfo">
			<h3>基本信息</h3><br/>
			
			<p>视频封面设置
				<span class="placeholderSpan">（格式jpeg、png，文件大小≤5MB，建议尺寸≥1146*717，最低尺寸≥960*600）</span>
			</p>
			<div id="abbreviateImg"><img id="fileImge" src="${pageContext.request.contextPath}/fileProject/zch/images/${videoById.videoImage}" alt="请选择视频封面" width="190px" height="120px"></div>
			
			<p><span class="importance">*</span>类型</p>
			
			<c:if test="${!empty videoById}">
				<p class="genre" style="color:gray;"><input type="radio" name="videoType" value="自制" disabled="disabled"/>自制</p>
				<p class="genre" style="color:gray;"><input type="radio" name="videoType" value="转载" disabled="disabled"/>转载</p>
			</c:if>
			
			<c:if test="${empty videoById}">
				<p class="genre"><input type="radio" name="videoType" value="自制"/>自制</p>
				<p class="genre"><input type="radio" name="videoType" value="转载"/>转载</p>
			</c:if>
			
			<br/><br/>
			<p><span class="importance">*</span>分区</p>
			<select class="zone" name="videoDistrict" >
				<option value="动画">动画</option>
				<option value="番剧">番剧</option>
				<option value="国创">国创</option>
				<option value="音乐">音乐</option>
				<option value="舞蹈">舞蹈</option>
				<option value="游戏">游戏</option>
				<option value="科技">科技</option>
				<option value="生活">生活</option>
				<option value="鬼畜">鬼畜</option>
				<option value="时尚">时尚</option>
				<option value="广告">广告</option>
				<option value="娱乐">娱乐</option>
				<option value="影视">影视</option>
				<option value="放映厅">放映厅</option>
			</select>
			
			<br/><br/>
			<c:if test="${!empty videoById}">
				<input type="hidden" name="videoId" value="${videoById.videoId}"/>
			</c:if>
			
			<p><span class="importance">*</span>标题</p>
			<input type="text" value="${videoById.videoName}" placeholder="请定义标题" maxlength="80" class="headline" name="videoName" required="required""/>
			
			<br/><br/>
			<p><span class="importance">*</span>标签
			<span class="placeholderSpan">（使用活动标签即可参与活动，默认以前三个标签同步生成动态话题）</span></p>
			<input type="text" value="" placeholder="请定义标题" maxlength="10" class="headline" name="videoTag" />

			<br/><br/>
			<p><span class="importance">*</span>简介</p>
			<textarea placeholder="请输入视频简介" maxlength="2000" class="intro" name="videoInfo" required="required">${videoById.videoInfo}</textarea>
			
			<button type="submit" id="uploadingButton">立即投稿</button>
		</div>
	</section>
	
	</form>
	
</body>
</html>