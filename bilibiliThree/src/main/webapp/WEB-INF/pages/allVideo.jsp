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
		<iframe src="uploadManage.jsp" scrolling="no" frameborder="0" width="1030px" height="50px"></iframe>
	</header>
	
	<section>
		
		<div id="manuscript">
			<ul>
				<li>全部稿件(1)</li>
				<li>进行中(0)</li>
				<li>已通过(1)</li>
				<li>未通过(0)</li>
			</ul>
			
			<div id="searchManuscript">
				<input type="text" placeholder="搜索稿件">
				<p class="selectP">全部分区</p>
				<p class="selectP">投稿时间排序</p>
			</div>
		</div>
		
		<div class="upVideo">
			<img src="img/yu.png" alt="略缩图">
			<div class="detailInfo">
				<p class="tag">美食</p>
				<p class="title">标题：鱼</p>
				<br/>
				<p class="time">18-07-06 11:02:50</p>
				<br/>
				<p class="detailP"><i class="fa fa-play-circle"></i> 播放 25</p>
				<p class="detailP"><i class="fa fa-bars"></i> 弹幕 2</p>
				<p class="detailP"><i class="fa fa-commenting"></i> 评论 5</p>
				<p class="detailP"><i class="fa fa-bullseye"></i> 硬币 2</p>
				<p class="detailP"><i class="fa fa-star"></i> 收藏 0</p>
				
				<p class="editVideo">编辑</p>
				<p class="dataVideo">数据</p>
				<i id="more" class="fa fa-plus-circle"></i>
			</div>
		</div>
		
		<div id="bottomDiv">
			<ul>
				<li>bilibili</li><a>|</a>
				<li>帮助中心</li><a>|</a>
				<li>问题反馈</li><a>|</a>
				<li>关于我们</li><a>|</a>
				<li>活动专题页</li>
			</ul>
			
			<i class="fa fa-weixin" id="weixinFont"></i>
			<i class="fa fa-weibo" id="weiboFont"></i>
		</div>
	</section>
</body>
</html>