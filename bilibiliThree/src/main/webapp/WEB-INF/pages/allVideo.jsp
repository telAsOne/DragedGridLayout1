<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/fileProject/zch/css/uploading.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/fileProject/baseCss/font-awesome-4.7.0/css/font-awesome.min.css">
<script src="${pageContext.request.contextPath}/fileProject/baseJs/jquery.js"></script>
<script type="text/javascript">
	$(function() {
		$(".dataVideo").click(function() {
			var href = $(this).children().attr("href");
			$("#delVideo").attr("action", href).submit();
			return false;
		});

		$("#allVideos").click(function() {
			$(".state0").show();
			$(".state1").show();
			$(".state2").show();
		});
		$("#goVideos").click(function() {
			$(".state0").show();
			$(".state1").hide();
			$(".state2").hide();
		});
		$("#okVideos").click(function() {
			$(".state0").hide();
			$(".state1").show();
			$(".state2").hide();
		});
		$("#notVideos").click(function() {
			$(".state0").hide();
			$(".state1").hide();
			$(".state2").show();
		});
		
	});
</script>
</head>
<body>
	
	<header>
		<ul class="menu">
			<li id="video"><a href="">视频管理</a></li>
			<li>专栏管理</li>
			<li>音频管理</li>
			<li>相簿管理</li>
		</ul>
	</header>
	
	<section>
	
		<div id="manuscript">
			<ul>
				<li id="allVideos">全部稿件(${fn:length(videoList)})</li>
				<li id="goVideos">进行中(${goVideo})</li>
				<li id="okVideos">已通过(${okVideo})</li>
				<li id="notVideos">未通过(${notVideo})</li>
			</ul>

			<div id="searchManuscript">
				<input type="text" placeholder="搜索稿件">
				<p class="selectP">全部分区</p>
				<p class="selectP">投稿时间排序</p>
			</div>
		</div>

		<form id="delVideo" method="post">
			<input type="hidden" name="_method" value="DELETE" />
		</form>
		
		<c:if test="${empty videoList}">
			<p id="no-file">你还没有投过一个稿件("▔□▔)</p>
			<div class="videos"><img src="${pageContext.request.contextPath}/fileProject/zch/images/no-video.png" alt="loading"></div>
			<div id="goLoad" class="fileButton">立即投稿 <i class="fa fa-arrow-circle-o-right"></i></div>
		</c:if>
		
		<c:if test="${!empty videoList}">
		<div style="overflow-y: auto; max-height: 630px; width: 1050px;">
			<c:forEach items="${videoList}" var="videoList" varStatus="status">
				<div class="upVideo state${videoList.videoState}" style="margin-bottom: 15px;">

					<img src="fileProject/zch/images/yu.png" alt="略缩图">
					<div class="detailInfo">
						<p class="tag">生活</p>
						<p class="title">标题：${videoList.videoName}</p>
						<br />
						<p class="time">${videoList.videoUptime}</p>
						<br />
						<p class="detailP">
							<i class="fa fa-play-circle"></i> 播放 ${videoList.playsum}
						</p>
						<p class="detailP">
							<i class="fa fa-bars"></i> 弹幕 11
						</p>
						<p class="detailP">
							<i class="fa fa-commenting"></i> 评论 ${videoList.comentsum}
						</p>
						<p class="detailP">
							<i class="fa fa-bullseye"></i> 硬币 5
						</p>
						<p class="detailP">
							<i class="fa fa-star"></i> 收藏 ${videoList.collectsum}
						</p>

						<input type="hidden" value="${videoList.videoId}" />
						<p class="editVideo">
							<a
								href="${pageContext.request.contextPath}/selectById/${videoList.videoId}"
								style="color: white;">编辑</a>
						</p>
						<p class="dataVideo">
							<a
								href="${pageContext.request.contextPath}/delVideo/${videoList.videoId}">删除</a>
						</p>
						<i id="more" class="fa fa-plus-circle"></i>
					</div>
				</div>

			</c:forEach>
		</div>
		</c:if>

		<div id="bottomDiv">
			<ul>
				<li>bilibili</li>
				<a>|</a>
				<li>帮助中心</li>
				<a>|</a>
				<li>问题反馈</li>
				<a>|</a>
				<li>关于我们</li>
			</ul>

			<i class="fa fa-weixin" id="weixinFont"></i> <i class="fa fa-weibo"
				id="weiboFont"></i>
		</div>
	</section>

</body>
</html>