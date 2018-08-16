<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%
	String path = request.getContextPath();
	String basePath = request.getServerName() + ":"
			+ request.getServerPort() + path + "/";
	String videoPath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String basePath2 = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!doctype html>
<html class="no-js" lang="">
<head>
<meta charset="utf-8">
<title>Material-UI Example</title>
<link rel="shortcut icon"
	href="/bilibiliThree/fileProject/hp/images/image1/favicons/1.png">

<link rel="stylesheet"
	href="/bilibiliThree/fileProject/hp/css/reset.css">
<link rel="stylesheet"
	href="/bilibiliThree/fileProject/hp/css/common.css">
<link rel="stylesheet"
	href="/bilibiliThree/fileProject/hp/css/indexs.css">
	
<link rel="stylesheet" href="/bilibiliThree/fileProject/hp/css/videoCT.css">
<link rel="stylesheet" href="/bilibiliThree/fileProject/hp/css/index.css">

<script type='text/javascript' src="/bilibiliThree/fileProject/hp/js/jquery.min.js"></script>
<script type='text/javascript' src="/bilibiliThree/fileProject/hp/js/videoCT.js"></script>
<script type='text/javascript' src="/bilibiliThree/fileProject/hp/js/index.js"></script>
</script>
<script>

var path = '<%=basePath%>';
var uid=${uid eq null?-1:uid};

var from=uid;
var fromName='${name}';
var to=uid==1?2:1;

var websocket;
if ('WebSocket' in window) {
	websocket = new WebSocket("ws://" + path + "/ws?uid="+uid);
} else if ('MozWebSocket' in window) {
	alert("2"+"/t"+"ws://" + path + "/ws"+uid);
	websocket = new MozWebSocket("ws://" + path + "/ws"+uid);
} else {
	alert("3"+"/t"+"http://" + path + "/ws/sockjs"+uid);
	websocket = new SockJS("http://" + path + "/ws/sockjs"+uid);
}
websocket.onopen = function(event) {
	console.log("WebSocket:已连接");
	console.log(event);
};
websocket.onerror = function(event) {
	console.log("WebSocket:发生错误 ");
	console.log(event);
};
websocket.onclose = function(event) {
	console.log("WebSocket:已关闭");
	console.log(event);
}
websocket.onmessage = function(event) {
	var data=JSON.parse(event.data);
	console.log("WebSocket:收到一条消息",data);
	var textCss=data.from==-1?"sfmsg_text":"fmsg_text";
	 var $that = $('.video-comment');
     $that.find('.setBox').fadeOut();
     $that.removeClass('commentActive');
    $('canvas').barrager([{"msg":data.word,"C":data.color,"T":data.top/100*700}]);
};
websocket.onerror = function(event) {
	console.log("WebSocket:发生错误 ");
	console.log(event);
};
websocket.onclose = function(event) {
	console.log("WebSocket:已关闭");
	console.log(event);
}
	
	function scrollToBottom(){
		var div = document.getElementById('content');
		div.scrollTop = div.scrollHeight;
	}
	
	Date.prototype.Format = function (fmt) { //author: meizz 
	    var o = {
	        "M+": this.getMonth() + 1, //月份 
	        "d+": this.getDate(), //日 
	        "h+": this.getHours(), //小时 
	        "m+": this.getMinutes(), //分 
	        "s+": this.getSeconds(), //秒 
	        "q+": Math.floor((this.getMonth() + 3) / 3), //季度 
	        "S": this.getMilliseconds() //毫秒 
	    };
	    if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
	    for (var k in o)
	    if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
	    return fmt;
	}
		function getJson(){
			
		}
		function clearJson(){
				
		}
	function bian() {
		var a = document.getElementById("sign");
		var b = document.getElementById("text-on");
		b.style.display = "none";
		a.style.height = "60px";
	}
	function bian2() {
		var a = document.getElementById("sign");
		var b = document.getElementById("text-on");
		b.style.display = "";
		a.style.height = "40px";
	}
	function xian(b) {
		var a = document.getElementById("xx");
		if (b) {
			a.style.top = "60px";
		} else {
			a.style.top = "40px";
			a.style.left = "60px";
		}
		a.style.display = "block";
	}
	function mei(b) {
		var a = document.getElementById("xx");
		if (!b) {
			a.style.left = "0px";
		}
		a.style.display = "none";
	}
	function hp(b) {
		var a = document.getElementById("xx");
		if (b) {
			a.style.display = "block";
		} else {
			a.style.display = "none";
		}

	}
</script>
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
													src="/bilibiliThree/fileProject/hp/images/image1/cont/game-center__img1.jpg"
													alt="#"> <span>命运-冠位指定（Fate/GO）</span>
												</a>
											</div>
											<div class="game-img">
												<a href="#"> <img
													src="/bilibiliThree/fileProject/hp/images/image1/cont/game_img1.png"
													alt="#"> <span>刀剑乱舞</span>
												</a> <a href="#"> <img
													src="/bilibiliThree/fileProject/hp/images/image1/cont/game_img2.png"
													alt="#"> <span>刀剑乱舞</span>
												</a> <a href="#"> <img
													src="/bilibiliThree/fileProject/hp/images/image1/cont/game_img3.jpg"
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
													src="/bilibiliThree/fileProject/hp/images/image1/cont/live-box__img1.jpg"
													alt="#"> <i>LIVE</i>
													<p>热爱电竞の三三</p>
												</a> <a href="#"> <img
													src="/bilibiliThree/fileProject/hp/images/image1/cont/live-box__img2.jpg"
													alt="#"> <i>LIVE</i>
													<p>大角虫漫画</p>
												</a> <a href="#"> <img
													src="/bilibiliThree/fileProject/hp/images/image1/cont/live-box__img3.jpg"
													alt="#"> <i>LIVE</i>
													<p>木本青</p>
												</a> <a href="#"> <img
													src="/bilibiliThree/fileProject/hp/images/image1/cont/live-box__img4.gif"
													alt="#"> <i>LIVE</i>
													<p>一只小鹿噜噜噜</p>
												</a> <a href="#"> <img
													src="/bilibiliThree/fileProject/hp/images/image1/cont/live-box__img5.jpg"
													alt="#"> <i>LIVE</i>
													<p>污叶妹屮</p>
												</a> <a href="#"> <img
													src="/bilibiliThree/fileProject/hp/images/image1/cont/live-box__img6.jpg"
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
							<a href="#" class="link">投 稿</a>
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
				<li class="item item-home"><a href="#" class="link">首页</a> <span
					id="xiahuaxian"></span></li>
				<li class="item"><a href="#" class="link">
						<div class="num">
							<i>887</i>
						</div> 动画
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
				<li class="item"><a href="#" class="link">
						<div class="num">
							<i>23</i>
						</div> 番剧
				</a>
					<ul class="nav-item__hover">
						<li><a href="#"> <em>连载动画<i></i></em>
						</a></li>
						<li><a href="#"> <em>完结动画<i></i></em>
						</a></li>
						<li><a href="#"> <em>国产动画<i></i></em>
						</a></li>
						<li><a href="#"> <em>资讯<i></i></em>
						</a></li>
						<li><a href="#"> <em>官方延伸<i></i></em>
						</a></li>
						<li><a href="#"> <em>新番时间表<i></i></em>
						</a></li>
						<li><a href="#"> <em>番剧索引<i></i></em>
						</a></li>
					</ul></li>
				<li class="item"><a href="#" class="link">
						<div class="num">
							<i>999+</i>
						</div> 音乐
				</a>
					<ul class="nav-item__hover">
						<li><a href="#"> <em>原创音乐<i></i></em>
						</a></li>
						<li><a href="#"> <em>翻唱<i></i></em>
						</a></li>
						<li><a href="#"> <em>VOCALOID·UTAU<i></i></em>
						</a></li>
						<li><a href="#"> <em>演奏<i></i></em>
						</a></li>
						<li><a href="#"> <em>三次元音乐<i></i></em>
						</a></li>
						<li><a href="#"> <em>OP/ED/OST<i></i></em>
						</a></li>
						<li><a href="#"> <em>音乐选集<i></i></em>
						</a></li>
					</ul></li>
				<li class="item"><a href="#" class="link">
						<div class="num">
							<i>152</i>
						</div> 舞蹈
				</a>
					<ul class="nav-item__hover">
						<li><a href="#"> <em>宅舞<i></i></em>
						</a></li>
						<li><a href="#"> <em>三次元舞蹈<i></i></em>
						</a></li>
						<li><a href="#"> <em>舞蹈教程<i></i></em>
						</a></li>
					</ul></li>
				<li class="item"><a href="#" class="link">
						<div class="num">
							<i>999+</i>
						</div> 游戏
				</a>
					<ul class="nav-item__hover">
						<li><a href="#"> <em>单机联机<i></i></em>
						</a></li>
						<li><a href="#"> <em>网游·电竞<i></i></em>
						</a></li>
						<li><a href="#"> <em>音游<i></i></em>
						</a></li>
						<li><a href="#"> <em>Mugen<i></i></em>
						</a></li>
						<li><a href="#"> <em>GMV<i></i></em>
						</a></li>
					</ul></li>
				<li class="item"><a href="#" class="link">
						<div class="num">
							<i>999+</i>
						</div> 科技
				</a>
					<ul class="nav-item__hover">
						<li><a href="#"> <em>纪录片<i></i></em>
						</a></li>
						<li><a href="#"> <em>趣味科普人文<i></i></em>
						</a></li>
						<li><a href="#"> <em>野生技术协会<i></i></em>
						</a></li>
						<li><a href="#"> <em>演讲·公开课<i></i></em>
						</a></li>
						<li><a href="#"> <em>星海<i></i></em>
						</a></li>
						<li><a href="#"> <em>数码<i></i></em>
						</a></li>
						<li><a href="#"> <em>机械<i></i></em>
						</a></li>
					</ul></li>
				<li class="item"><a href="#" class="link">
						<div class="num">
							<i>999+</i>
						</div> 生活
				</a>
					<ul class="nav-item__hover">
						<li><a href="#"> <em>搞笑<i></i></em>
						</a></li>
						<li><a href="#"> <em>日常<i></i></em>
						</a></li>
						<li><a href="#"> <em>美食圈<i></i></em>
						</a></li>
						<li><a href="#"> <em>动物圈<i></i></em>
						</a></li>
						<li><a href="#"> <em>手工<i></i></em>
						</a></li>
						<li><a href="#"> <em>绘画<i></i></em>
						</a></li>
						<li><a href="#"> <em>运动<i></i></em>
						</a></li>
					</ul></li>
				<li class="item"><a href="#" class="link">
						<div class="num">
							<i>77</i>
						</div> 鬼畜
				</a>
					<ul class="nav-item__hover">
						<li><a href="#"> <em>鬼畜调教<i></i></em>
						</a></li>
						<li><a href="#"> <em>音MAD<i></i></em>
						</a></li>
						<li><a href="#"> <em>人力VOCALOID<i></i></em>
						</a></li>
						<li><a href="#"> <em>教程演示<i></i></em>
						</a></li>
					</ul></li>
				<li class="item"><a href="#" class="link">
						<div class="num">
							<i>416</i>
						</div> 时尚
				</a>
					<ul class="nav-item__hover">
						<li><a href="#"> <em>美妆<i></i></em>
						</a></li>
						<li><a href="#"> <em>服饰<i></i></em>
						</a></li>
						<li><a href="#"> <em>健身<i></i></em>
						</a></li>
						<li><a href="#"> <em>资讯<i></i></em>
						</a></li>
					</ul></li>
				<li class="item"><a href="#" class="link">
						<div class="num">
							<i>100</i>
						</div> 广告
				</a></li>
				<li class="item"><a href="#" class="link">
						<div class="num">
							<i>999+</i>
						</div> 娱乐
				</a>
					<ul class="nav-item__hover">
						<li><a href="#"> <em>综艺<i></i></em>
						</a></li>
						<li><a href="#"> <em>明星<i></i></em>
						</a></li>
						<li><a href="#"> <em>China相关<i></i></em>
						</a></li>
					</ul></li>
				<li class="item"><a href="#" class="link">
						<div class="num">
							<i>916</i>
						</div> 影视
				</a>
					<ul class="nav-item__hover">
						<li><a href="#"> <em>电影<i></i></em>
						</a></li>
						<li><a href="#"> <em>电视剧<i></i></em>
						</a></li>
					</ul></li>
				<li class="item item-square"><a href="#" class="link">广场</a>
					<div class="nav-square__hover">
						<ul>
							<li><a href="#"><i class="icon-activity"></i>活动中心</a></li>
							<li><a href="#"><i class="icon-game"></i>游戏中心</a></li>
							<li><a href="#"><i class="icon-news"></i>新闻中心</a></li>
							<li><a href="#"><i class="icon-friend"></i>画友</a></li>
							<li><a href="#"><i class="icon-tv"></i>芒果TV</a></li>
						</ul>
						<!-- 
            <a href="#" class="activity"><img src="/bilibiliThree/fileProject/hp/images/image1/cont/nav-square__img.jpg" alt="#"></a> -->
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
				<img
					src="/bilibiliThree/fileProject/hp/images/image1/cont/nav_img.gif"
					alt="求领养">
			</div>
		</div>
	</nav>

	<div id="tophead">
		<div id="toptitle">
			<div id="topleft">
				<h1>【燃向/混剪/一人之下】 诸葛青x王也|冯宝宝x张楚岚.</h1>
				<br /> <span><a href="#">主页</a>&nbsp;&gt;&nbsp;<a href="#">动画</a>&nbsp;&gt;&nbsp;<a
					href="#">MAD·AMV</a></span> <span><i>2018-06-17 20:35:24</i></span> <span><i>稿件投诉</i></span>
				<br /> <br />
				<ul id="lefttopul">
					<li id="lileft"><img
						src="/bilibiliThree/fileProject/hp/images/image1/one.jpg"
						width="20" height="20"
						style="margin-top: 0px; margin-left: 20px; margin-right: 5px;">1.7万
						<img src="/bilibiliThree/fileProject/hp/images/image1/two.jpg"
						width="20" height="20"
						style="margin-top: 0px; margin-left: 35px; margin-right: 5px;">209
					</li>
					<li><img
						src="/bilibiliThree/fileProject/hp/images/image1/three.jpg"
						width="20" height="20"
						style="margin-top: 0px; margin-left: 20px; margin-right: 5px;">硬币
						126 <img
						src="/bilibiliThree/fileProject/hp/images/image1/four.jpg"
						width="20" height="20"
						style="margin-top: 0px; margin-left: 20px; margin-right: 5px;">收藏
						436</li>
				</ul>

			</div>
			<div id="topright">
				<div class="button">
					<a href="###"> <span>轮番中</span>
					</a>
				</div>
				<div onmousemove="xian(true)" onmouseout="mei(true)" class="head"
					style="background-image: url('/bilibiliThree/fileProject/hp/images/image1/head.jpg')"></div>
				<div class="user">
					<a href="###" onmousemove="xian(false)" onmouseout="mei(false)"
						class="name">Nero_闪灵</a> <a href="###" id="touxiang" class="xiao">
						<img src="images/five.jpg" width="25" height="16"
						style="margin-top: 0px; margin-left: 20px; margin-right: 5px;">发消息
					</a>
				</div>
				<div id="sign">
					<span>未明/侠客/蠢莹/MJ/漫威/欧美/小虫NC粉/龙珠/我英/混剪/爱好/兴趣使然 微博@Nero_闪灵</span>
					<button id="text-on" onclick="bian()">展开</button>
					<button id="text-only" onclick="bian2()">收起</button>
				</div>
				<div class="number">
					<span title="投稿数75">投稿：75</span> <span title="粉丝数22740">粉丝：2.3万</span>
				</div>
				<div class="btn">
					<button class="butn">+ 关注</button>
				</div>
				<div id="xx" onmousemove="hp(true)" onmouseout="hp(false)">
					<div id="xxtop">
						<img src="/bilibiliThree/fileProject/hp/images/image1/timg3.jpg"
							style="width: 370px; height: 110px;">
					</div>
					<div id="yuantop">
						<div class="head"
							style="background-image: url('/bilibiliThree/fileProject/hp/images/image1/head.jpg')"></div>
					</div>
					<div id="renxx">
						<div class="dj">
							<a href="###" class="name">Nero_闪灵</a><span>LV6</span>
						</div>
						<div id="guanzu">
							<a href="###">关注:341</a><a href="###">粉丝:2.3万</a>
						</div>
						<span id="span1">未明/侠客/蠢莹/MJ/漫威/欧美/小虫NC粉/龙珠</span> <span
							id="span2"> /我英/混剪/爱好/兴趣使然 微博@Nero_闪灵</span> <a href="###"
							class="butn">+ 关注</a> <a href="###" class="butn1">发消息</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div id="bigshiping">
		<div id="shiping">
			<div id="danmushiping">
				<section>
					<video width="100%" height="100%" id="video1"></video>
					<iframe frameborder="0"   scrolling="no" id="danmu" name="danmus" style=" position: absolute;top:0px;" src="http://localhost:8080/bilibiliThree/gaofa" height="390px" width="800px"></iframe>
				</section>
			</div>
			<div id="danmuNav">
			</div>
		</div>
	</div>


	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
	<br />
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
							src="/bilibiliThree/fileProject/hp/images/image1/app-qrcode.png"
							alt="#">
						</a> <a href="#" class="weibo"> <i></i> <em>新浪微博</em> <img
							src="/bilibiliThree/fileProject/hp/images/image1/weibo-qrcode.png"
							alt="#">
						</a> <a href="#" class="weixin"> <i></i> <em>官方微信</em> <img
							src="/bilibiliThree/fileProject/hp/images/image1/weixin-arcode.gif"
							alt="#">
						</a>
					</div>
				</li>
			</ul>
		</div>
	</footer>
	<script src="/bilibiliThree/fileProject/hp/js/script.js"></script>
</body>
</html>