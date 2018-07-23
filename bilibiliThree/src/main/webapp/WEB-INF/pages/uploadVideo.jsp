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
	<section>
		<div class="fileButton"><i class="fa fa-share-square-o fa-fw"></i> 上传视频</div>
		<div id="backImg"><img src="img/background.png" alt="loading"></div>
		<div id="peopleImg"><img src="img/people.png" alt="loading"></div>

		<p class="loadingFont">点击此处选择文件上传</p>
		<p class="loadingFont">
			<span id="span_one">当前审核队列</span>				
		<a id="span_two">流畅</a>
		</p>

		<div id="placeholderDiv">
		<div class="warning">
			<a href="#">禁止发布的视频内容</a>
			<a href="#">视频大小</a>
			<a href="#">视频格式</a>
			<a href="#">视频码率</a>
		</div>

		<br/>
		<p style="text-align:center;color:#ABABAB;font-size:13px;">上传视频，即表示您已同意
			<span style="color:#00A1D6;">哔哩哔哩使用协议</span>
		，请勿上传色情，反动等违法视频。</p>

		<br/>
		<div class="settingUl">
			<a href="#">第三方工具</a>
			<a href="#"><i class="fa fa-sign-in" style="color:#ABABAB;"></i> 小丸压制工具原版</a>
			<a href="#"><i class="fa fa-tv" style="color:#ABABAB;"></i> 小丸压制工具Bilibili定制版</a>
		</div>
		</div>

		<img id="soccerImg" src="img/soccer.png" alt="广告">
	</section>
</body>
</html>