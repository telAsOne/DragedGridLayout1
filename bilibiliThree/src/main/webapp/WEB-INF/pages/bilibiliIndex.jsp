<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>哔哩哔哩 (゜-゜)つロ 干杯~-bilibili</title>
<link rel="shortcut icon"
	href="${pageContext.request.contextPath}/fileProject/jyz/favicons/1.png">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/fileProject/jyz/css/reset.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/fileProject/jyz/css/common.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/fileProject/jyz/css/index.css">
</head>
<body>
	<header id="header">
		<div id="page_top">
			<div class="bg-wrap">
				<div class="bg"></div>
				<div class="mask"></div>
			</div>
			<div class="header-top">
				<div class="page-width clearfix">
					<div class="header-top__nav">
						<ul>
							<li class="item item-home"><a href="#">主站</a></li>
							<li class="item"><a href="#">画友</a></li>
							<li class="item"><a href="#">游戏中心</a>
								<div class="game-center header-hover">
									<div class="c clearfix">
										<div class="fl">
											<div class="imgbox">
												<a href="#"> <img
													src="${pageContext.request.contextPath}/fileProject/jyz/images/cont/game-center__img1.jpg"
													alt="#"> <span>命运-冠位指定（Fate/GO）</span>
												</a>
											</div>
											<div class="game-img">
												<a href="#"> <img
													src="${pageContext.request.contextPath}/fileProject/jyz/images/cont/game_img1.png"
													alt="#"> <span>刀剑乱舞</span>
												</a> <a href="#"> <img
													src="${pageContext.request.contextPath}/fileProject/jyz/images/cont/game_img2.png"
													alt="#"> <span>刀剑乱舞</span>
												</a> <a href="#"> <img
													src="${pageContext.request.contextPath}/fileProject/jyz/images/cont/game_img3.jpg"
													alt="#"> <span>刀剑乱舞</span>
												</a>
											</div>
										</div>
										<div class="fr">
											<div class="game-list">
												<div class="title">
													<i></i> <a href="#">游戏论坛</a>
												</div>
												<div class="all">
													<a href="#">仙剑奇侠传幻璃镜</a> <a href="#">魔法禁书目录</a> <a href="#">萌王EX</a>
													<a href="#">妖精的衣橱</a> <a href="#">神代梦华谭</a> <a href="#">碧蓝航线</a>
													<a href="#">光明大陆</a>
												</div>
											</div>
										</div>
									</div>
									<div id="gameImg"></div>
								</div></li>
							<li class="item"><a href="#">直播</a>
								<div class="live-box header-hover">
									<div class="live-box__c">
										<div class="fl">
											<div class="title">热门直播:</div>
											<div class="cont">
												<a href="#"> <img
													src="${pageContext.request.contextPath}/fileProject/jyz/images/cont/live-box__img1.jpg"
													alt="#"> <i>LIVE</i>
													<p>热爱电竞の三三</p>
												</a> <a href="#"> <img
													src="${pageContext.request.contextPath}/fileProject/jyz/images/cont/live-box__img2.jpg"
													alt="#"> <i>LIVE</i>
													<p>大角虫漫画</p>
												</a> <a href="#"> <img
													src="${pageContext.request.contextPath}/fileProject/jyz/images/cont/live-box__img3.jpg"
													alt="#"> <i>LIVE</i>
													<p>木本青</p>
												</a> <a href="#"> <img
													src="${pageContext.request.contextPath}/fileProject/jyz/images/cont/live-box__img4.gif"
													alt="#"> <i>LIVE</i>
													<p>一只小鹿噜噜噜</p>
												</a> <a href="#"> <img
													src="${pageContext.request.contextPath}/fileProject/jyz/images/cont/live-box__img5.jpg"
													alt="#"> <i>LIVE</i>
													<p>污叶妹屮</p>
												</a> <a href="#"> <img
													src="${pageContext.request.contextPath}/fileProject/jyz/images/cont/live-box__img6.jpg"
													alt="#"> <i>LIVE</i>
													<p>污污_永远的魔法师_</p>
												</a>
											</div>
										</div>
										<div class="fl">
											<div class="title">热门直播:</div>
										</div>
									</div>
								</div></li>
							<li class="item"><a href="#">周边</a></li>
							<li class="item"><a href="#">移动端</a> <!-- <div class="header-app header-hover">
                  <i></i>
                </div> --></li>
						</ul>
					</div>
					<div class="header-top__user">
						<div class="login-box">
							<a href="#">登录</a> <span></span> <a href="#">注册</a>
						</div>
						<div class="user-post">
							<a href="bi?iframeSrc=loadingHead" class="link">投稿</a>
							<div class="user-post__hover header-hover">
								<a href="#" class="post">视频投稿</a> <a href="#" class="manage">投稿管理</a>
								<a href="#" class="create">创作中心</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="header-c">
			<div class="page-width">
				<a href="#" id="header_logo"></a>
				<p id="header_title"></p>
				<div id="search" class="clearfix">
					<div class="search-rank">排行榜</div>
					<div class="search-box">
						<input type="text" class="text" placeholder="Search here...">
						<a href="#" class="btn"><i></i></a>
						<div class="search-history">
							<div class="title">历史搜索</div>
							<div class="list">
								<a href="#">努巴尼欢乐秀<i></i></a> <a href="#">主播真会玩守望篇<i></i></a> <a
									href="#">主播真会玩女神篇<i></i></a> <a href="#">暴暴勺暴暴<i></i></a> <a
									href="#">OverWatch<i></i></a>
							</div>
						</div>
					</div>
				</div>
				<div class="header-title">哔哩哔哩 (゜-゜)つロ 干杯~</div>
			</div>
		</div>
	</header>

	<nav id="nav">
		<div class="page-width clearfix">
			<ul class="nav-list">
				<li class="item item-home"><a href="#" class="link">首页</a></li>
				<c:forEach items="${label}" var="menu">
					<li class="item"><a href="#" class="link">
							<div class="num">
								<i>887</i>
							</div> ${menu.vlName}
					</a>
						<ul class="nav-item__hover">
							<li><a href="#"> <em>MAD·AMV<i></i></em>
							</a></li>
							<li><a href="#"> <em>MMD·3D<i></i></em>
							</a></li>
							<li><a href="#"> <em>短片·手书·配音<i></i></em>
							</a></li>
							<li><a href="#"> <em>综合<i></i></em>
							</a></li>
						</ul></li>
				</c:forEach>
				<li class="item item-square"><a href="#" class="link">广场</a>
					<div class="nav-square__hover">
						<ul>
							<li><a href="#"><i class="icon-activity"></i>活动中心</a></li>
							<li><a href="#"><i class="icon-game"></i>游戏中心</a></li>
							<li><a href="#"><i class="icon-news"></i>新闻中心</a></li>
							<li><a href="#"><i class="icon-friend"></i>画友</a></li>
							<li><a href="#"><i class="icon-tv"></i>芒果TV</a></li>
						</ul>
						<a href="#" class="activity"><img
							src="images/cont/nav-square__img.jpg" alt="#"></a>
					</div></li>
				<li class="item item-live"><a href="#" class="link">直播</a>
					<ul class="nav-item__hover">
						<li><a href="#"> <em>推荐主播<i></i></em>
						</a></li>
						<li><a href="#"> <em>手机直播<i></i></em>
						</a></li>
						<li><a href="#"> <em>绘画专区<i></i></em>
						</a></li>
						<li><a href="#"> <em>唱见舞见<i></i></em>
						</a></li>
						<li><a href="#"> <em>御宅文化<i></i></em>
						</a></li>
						<li><a href="#"> <em>单机联机<i></i></em>
						</a></li>
						<li><a href="#"> <em>网络游戏<i></i></em>
						</a></li>
						<li><a href="#"> <em>电子竞技<i></i></em>
						</a></li>
						<li><a href="#"> <em>手游直播<i></i></em>
						</a></li>
						<li><a href="#"> <em>放映厅<i></i></em>
						</a></li>
					</ul></li>
				<li class="item item-room"><a href="#" class="link">小黑屋</a></li>
			</ul>
			<div class="nav-gif">
				<img src="images/cont/nav_img.gif" alt="求领养">
			</div>
		</div>
	</nav>
	<div id="banner">
		<div class="page-width clearfix">
			<div class="slider fl">
				<div class="slider-img">
					<c:forEach items="${slideImg}" var="slide">
						<a href="${slide.linkaddress}" slider-title="${slide.slideTitle}"><img
							src="${slide.imageurl}" alt="${slide.slideContent}"></a>
					</c:forEach>
				</div>
				<div class="slider-title">
					<p>${slideImg[0].slideTitle}</p>
				</div>
				<div class="slider-btn">
					<c:forEach items="${slideImg}" varStatus="varStatus">
						<c:if test="${varStatus.index == 0}">
							<span class="cur"></span>
						</c:if>
						<c:if test="${varStatus.index > 0}">
							<span></span>
						</c:if>
					</c:forEach>
				</div>
				<a href="#" class="slider-more">More</a>
			</div>
			<div class="banner-list fr">
				<ul>
					<li><a href="#"> <img src="images/cont/main_pic.jpg"
							alt="#">
							<div class="info">
								<p class="title">【初音ミク】39 TECHNO【八王子P】</p>
								<p class="author">up主：丧尸の桑</p>
								<p class="play">播放：48243</p>
							</div>
					</a></li>
					<li><a href="#"> <img src="images/cont/main_pic.jpg"
							alt="#">
							<div class="info">
								<p class="title">【初音ミク】39 TECHNO【八王子P】</p>
								<p class="author">up主：丧尸の桑</p>
								<p class="play">播放：48243</p>
							</div>
					</a></li>
					<li><a href="#"> <img src="images/cont/main_pic.jpg"
							alt="#">
							<div class="info">
								<p class="title">【初音ミク】39 TECHNO【八王子P】</p>
								<p class="author">up主：丧尸の桑</p>
								<p class="play">播放：48243</p>
							</div>
					</a></li>
					<li><a href="#"> <img src="images/cont/main_pic.jpg"
							alt="#">
							<div class="info">
								<p class="title">【初音ミク】39 TECHNO【八王子P】</p>
								<p class="author">up主：丧尸の桑</p>
								<p class="play">播放：48243</p>
							</div>
					</a></li>
					<li><a href="#"> <img src="images/cont/main_pic.jpg"
							alt="#">
							<div class="info">
								<p class="title">【初音ミク】39 TECHNO【八王子P】</p>
								<p class="author">up主：丧尸の桑</p>
								<p class="play">播放：48243</p>
							</div>
					</a></li>
					<li><a href="#"> <img src="images/cont/main_pic.jpg"
							alt="#">
							<div class="info">
								<p class="title">【初音ミク】39 TECHNO【八王子P】</p>
								<p class="author">up主：丧尸の桑</p>
								<p class="play">播放：48243</p>
							</div>
					</a></li>
				</ul>
				<a href="#" class="btn btn-prev">昨日</a> <a href="#"
					class="btn btn-next">一周</a>
			</div>
		</div>
	</div>
	<div id="main">
		<div class="page-width">
			<!-- 推广 -->
			<div class="mainCont clearfix" id="promote">
				<div class="pic-list fl">
					<div class="pic-list__title">
						<i class="icon icon-promote"></i>
						<h2>推广</h2>
						<a href="#" class="promote-link">来感受创作的力量吧！</a>
					</div>
					<ul class="pic-list__wrapper clearfix">
						<c:forEach items="${extension}" var="ex">
							<li class="item"><a href="#" class="img-link"> <img
									src="${ex.videoImage}" alt="#"> <span class="mask"></span>
									<span class="time">3:39</span>
							</a>
								<div class="img-info">
									<a href="#">${ex.videoName}</a>
								</div></li>
						</c:forEach>
					</ul>
				</div>
				<div class="main-side fr">
					<div class="promote-side__title">
						<a href="#">在线人数：715509</a> <span>|</span> <a href="#">最新投稿：5806</a>
					</div>
					<a href="#" class="promote-side__img"><img
						src="images/cont/main_pic.jpg" alt="#"></a>
				</div>

				<c:forEach items="${video}" var="label">
					<div class="mainCont clearfix" id="${label.homename}" js-move="true">
						<div class="pic-list fl" js-tab="true">
							<div class="pic-list__title">
								<i class="icon ${label.icon}"></i>
								<h2>${label.vlName}</h2>
								<div class="tab-title">
									<a href="#" class="cur">有新动态</a> <a href="#">最新投稿</a>
								</div>
								<a href="#" class="main-link"><i></i>我的十月新番打开方式一定有问题</a>
								<div class="more-wrap">
									<a href="#" class="dynamic"><i></i>392条新动态</a> <a href="#"
										class="more">更多<i></i></a>
								</div>
							</div>
							<ul
								class="pic-list__wrapper clearfix tab-cont__item tab-cont__cur">
								<c:forEach items="${label.news}" var="news">
									<li class="item"><a href="#" class="img-link"> <img
											src="${news.video.videoImage}" alt="#"> <span
											class="mask"></span> <span class="time">3:39</span>
									</a>
										<div class="img-info">
											<a href="#">${news.video.videoName}</a>
											<div class="btm">
												<div class="user">
													<i></i>${news.userInfo.nickname}
												</div>
												<div class="online">
													<i></i>${news.video.playsum}
												</div>
											</div>
										</div></li>
								</c:forEach>
							</ul>
							<ul class="pic-list__wrapper clearfix tab-cont__item">
								<c:forEach items="${label.latestPosts}" var="latestPosts">
									<li class="item"><a href="#" class="img-link"> <img
											src="${latestPosts.video.videoImage}" alt="#"> <span
											class="mask"></span> <span class="time">3:39</span>
									</a>
										<div class="img-info">
											<a href="#">${latestPosts.video.videoName}</a>
											<div class="btm">
												<div class="user">
													<i></i>${latestPosts.userInfo.nickname}
												</div>
												<div class="online">
													<i></i>${latestPosts.video.playsum}
												</div>
											</div>
										</div></li>
								</c:forEach>
								
							</ul>
						</div>
						<div class="main-side fr" js-tab="true">
							<div class="main-side__title">
								<div class="rank-t">
									<h3>排行</h3>
								</div>
								<div class="tab-title">
									<a href="#" class="cur">全部</a> <a href="#">原创</a>
								</div>
								<div class="side-select">
									<span>三日</span> <i></i>
								</div>
							</div>
							<div class="main-side__cont">
								<div class="tab-cont">
									<ul class="tab-cont__item main-rank">
										<li class="item item-one"><a href="#"> <i class="n1">1</i>
												<img src="images/cont/main-rank__img1.jpg" alt="#">
												<div>
													<p class="title">【1月】小林家的龙女仆 10【独家正版】</p>
													<p class="mark">综合评分: 109.3万</p>
												</div>
										</a></li>
										<li class="item"><a href="#"><i class="n2">2</i>
												【1月】火影忍者 疾风传 719</a></li>
										<li class="item"><a href="#"><i class="n3">3</i>
												【4月】双星之阴阳师 48</a></li>
										<li class="item"><a href="#"><i>4</i>狐妖小红娘 52 狗血大戏正上演
												OP特效又更换</a></li>
										<li class="item"><a href="#"><i>5</i>少年锦衣卫 第一季 06 怪谈</a></li>
										<li class="item"><a href="#"><i>6</i>画江湖之不良人Ⅱ 35 阋墙之祸</a>
										</li>
										<li class="item"><a href="#"><i>7</i>【1月】黑白来看守所
												24【独家正版】</a></li>
									</ul>
									<ul class="tab-cont__item main-rank">
										<li class="item item-one"><a href="#"> <i class="n1">1</i>
												<img src="images/cont/main-rank__img2.jpg" alt="#">
												<div>
													<p class="title">【1月】小林家的龙女仆 10【独家正版】</p>
													<p class="mark">综合评分: 109.3万</p>
												</div>
										</a></li>
										<li class="item"><a href="#"><i class="n2">2</i>
												【1月】火影忍者 疾风传 719</a></li>
										<li class="item"><a href="#"><i class="n3">3</i>
												【4月】双星之阴阳师 48</a></li>
										<li class="item"><a href="#"><i>4</i>狐妖小红娘 52 狗血大戏正上演
												OP特效又更换</a></li>
										<li class="item"><a href="#"><i>5</i>少年锦衣卫 第一季 06 怪谈</a></li>
										<li class="item"><a href="#"><i>6</i>画江湖之不良人Ⅱ 35 阋墙之祸</a>
										</li>
										<li class="item"><a href="#"><i>7</i>【1月】黑白来看守所
												24【独家正版】</a></li>
									</ul>
								</div>
								<a href="#" class="more">查看更多<i></i></a>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
	</div>
	<footer id="footer">
		<div class="page-width">
			<ul class="footer-c clearfix">
				<li>
					<h6>dilidili</h6> <a href="#" class="card">关于我们</a> <a href="#"
					class="card">友情链接</a> <a href="#" class="card">周边</a> <a href="#"
					class="card">联系我们</a> <a href="#" class="card">加入我们</a> <a href="#"
					class="card">官方认证</a>
				</li>
				<li class="middle">
					<h6>传送门</h6> <a href="#" class="card">帮助中心</a> <a href="#"
					class="card">高级弹幕</a> <a href="#" class="card">活动专题页</a> <a
					href="#" class="card">侵权申诉</a> <a href="#" class="card">分院帽计划</a> <a
					href="#" class="card">活动中心</a> <a href="#" class="card">用户反馈论坛</a>
					<a href="#" class="card">壁纸站</a> <a href="#" class="card">名人堂</a>
				</li>
				<li class="footer-icon">
					<div class="cont">
						<a href="#" class="app"> <i></i> <em>手机端下载</em> <img
							src="images/app-qrcode.png" alt="#">
						</a> <a href="#" class="weibo"> <i></i> <em>新浪微博</em> <img
							src="images/weibo-qrcode.png" alt="#">
						</a> <a href="#" class="weixin"> <i></i> <em>官方微信</em> <img
							src="images/weixin-arcode.gif" alt="#">
						</a>
					</div>
				</li>
			</ul>
		</div>
	</footer>

	<div id="sideBar">
		<div class="sideBar-list">
			<c:forEach items="${video}" var="label">
				<a href="#" id="${label.homename}-a">${label.vlName}</a>
			</c:forEach>
			  <a href="javascript:void(0);"><i></i>排序</a>
		</div>
		<div class="sideBar-line"></div>
		<a href="javascript:void(0);" class="sideBar-toTop" id="backTop"></a>
	</div>
	<script
		src="${pageContext.request.contextPath}/fileProject/baseJs/jquery.js"></script>
	<script
		src="${pageContext.request.contextPath}/fileProject/jyz/js/script.js"></script>
</body>
</html>