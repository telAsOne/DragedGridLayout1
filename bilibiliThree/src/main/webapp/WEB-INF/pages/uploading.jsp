<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>bilibili</title>
	<link rel="stylesheet" href="css/uploading.css">
	<link rel="stylesheet" href="font-awesome-4.7.0/css/font-awesome.min.css">
	<link rel='stylesheet' href='js/nprogress/nprogress.css'/>
	
	<script src="js/jquery.js"></script>
	<script src='js/nprogress/nprogress.js'></script>
		
	<script>
		$(function(){
			
			$("ul").delegate('.li-blue-button', 'click', function () {
				var c = $(this);
				c.removeClass("li-blue-button");
				c.addClass("li-black");
				c.children(".interactManager").toggle();
			});
			$("ul").delegate('.li-black', 'click', function () {
				var c = $(this);
				c.removeClass("li-black");
				c.addClass("li-blue-button");
				c.children(".interactManager").toggle();
			});
			
		});
	</script>
	
</head>
<body>

	<div id="bigDiv">
	
		<aside id="uploadingMenu">
			<img src="img/logo.png" alt="logo">
			<button id="contributeButton">
				<a href="bi?iframeSrc=loadingHead&src=uploading" style="color:white;font-size:15px;">投稿</a>
			</button>
			
			<div id="menuDiv">
				<ul class="menu">
					<li class="li-blue"><i class="fa fa-home fa-fw"></i> &nbsp;&nbsp;首页管理</li>
					<li class="li-blue"><i class="fa fa-clipboard fa-fw"></i> &nbsp;&nbsp;
						<a href="bi?iframeSrc=manageVideo&src=uploading">内容管理</a>
					</li>
					<li class="li-blue-button">&nbsp;&nbsp;&nbsp;&nbsp;
						<i class="fa fa-area-chart fa-fw"></i> &nbsp;&nbsp;数据中心
						<i class="fa fa-angle-down fa-fw"></i>
						<p class="interactManager li-blue">数据总览</p>
						<p class="interactManager li-blue">观众分析</p>
					</li>
					<li class="li-blue"><i class="fa fa-user-circle fa-fw"></i> &nbsp;&nbsp;粉丝管理</li>
					<li class="li-blue-button">&nbsp;&nbsp;&nbsp;&nbsp;
						<i class="fa fa-commenting-o fa-fw "></i> &nbsp;&nbsp;互动管理
						<i class="fa fa-angle-down fa-fw"></i>
							<p class="interactManager li-blue">评论管理</p>
							<p class="interactManager li-blue">弹幕管理</p>
						
					</li>
					<li class="li-blue-button">&nbsp;&nbsp;&nbsp;&nbsp;
						<i class="fa fa-money fa-fw"></i> &nbsp;&nbsp;收益管理
						<i class="fa fa-angle-down fa-fw"></i>
						<p class="interactManager li-blue">创作激励</p>
						<p class="interactManager li-blue">充电计划</p>
					</li>
					<li class="li-blue"><i class="fa fa-cog fa-fw"></i> &nbsp;&nbsp;水印设置</li>
					<li class="li-blue"><i class="fa fa-warning fa-fw"></i> &nbsp;&nbsp;申诉管理</li>
				</ul>
				
				<hr style="width:100px;border:none;height:1px;background-color:#E7E7E7;margin-top:10px;"/>
				
				<div id="upSetting">
					<div class="util">
						<img src="img/smallTv.png" alt="" style="width:50px;">
						<div class="rightDiv">
							<h5>投稿工具</h5>
							<a style="color:#ABABAB;font-size:14px;">1.6.0.1006</a>
						</div>
					</div>
					<div class="util">
						<img src="img/smallTv.png" alt="" style="width:50px;">
						<div class="rightDiv">
							<h5>投稿工具</h5>
							<a style="color:#ABABAB;font-size:14px;">2.0.0.1054</a>
						</div>
					</div>
					<div class="util">
						<img src="img/sis.png" alt="" style="width:50px;">
						<div class="rightDiv">
							<h5>直播姬</h5>
							<a style="color:#ABABAB;font-size:14px;">2.0.0.1149</a>
						</div>
					</div>
					<div class="util">
						<img src="img/robot.png" alt="" style="width:45px;">
						<div class="rightDiv">
							<h5>点我维权</h5>
							<a style="color:#ABABAB;font-size:14px;">v1.0</a>
						</div>
					</div>
				</div>
				
				<hr style="width:100px;border:none;height:1px;background-color:#E7E7E7;margin-top:10px;"/>
				
				<p class="help">帮助中心</p>
				<p class="help">在线客服</p>
				<p class="help">bilibili认证</p>
			</div>
		</aside>
		<div id="uploadingDiv">
			<section id="section">
				<iframe id="iframe" scrolling="no" src="${pageContext.request.contextPath}/${iframeSrc}" frameborder="0" height="900px" width="1030px"></iframe>
			</section>
		</div>
		
	</div>
		
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
		NProgress.configure({ showSpinner: false });
		$('#section').bind('pjax.start', function(){
	   		NProgress.start();
	   		
	    });
	    $('#section').bind('pjax.end', function(){
	        NProgress.done();
	    });
	</script>
</body>
</html>