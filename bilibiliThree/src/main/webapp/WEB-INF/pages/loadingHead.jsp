<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title></title>
	<link rel="stylesheet" href="css/uploading.css">
	<link rel="stylesheet" href="font-awesome-4.7.0/css/font-awesome.min.css">
</head>
<body>
	<header>
		<ul class="menu">
			<li id="video">
				<a href="bi?iframeSrc=uploadVideo&src=loadingHead">视频投稿</a>
			</li>
			<li>专栏投稿</li>
			<li>音频投稿</li>
			<li>相簿投稿</li>
		</ul>
	</header>
	
	<section id="section">
		<iframe src="${pageContext.request.contextPath}/${iframeSrc}" scrolling="no" frameborder="0" width="1030px" height="768px"></iframe>
	</section>
	
	<script src="js/jquery.pjax.js"></script>
	<script>
		$.pjax({
			selector: 'a',
			container: '#section',
			show: 'fade',
			cache: false,
			storage: false,
			timeout : 0
		});
	</script>
</body>

</html>