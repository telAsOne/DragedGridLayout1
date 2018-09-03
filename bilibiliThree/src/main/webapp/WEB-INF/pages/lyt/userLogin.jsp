<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<% 
   	String path=request.getContextPath(); 
   	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<title>用户登录</title>
		<meta charset="UTF-8"/>
		<link rel="stylesheet" href="<%=basePath %>fileProject/lyt/css/usersLogin.css">
		<link rel="stylesheet" href="<%=basePath %>fileProject/lyt/css/verify.css">
		<script type="text/javascript" src="<%=basePath %>fileProject/lyt/js/jquery.min.js"></script>
		<script type="text/javascript" src="<%=basePath %>fileProject/lyt/js/verify.js"></script>
		
		<script type="text/javascript">
			$(function(){
				$("#auth-code").slideVerify({
					type: 2,
					vOffset : 5,
					vSpace : 5,
					imgName : ['http://localhost:8080/bilibiliThree/fileProject/lyt/images/2018-07-09_104216.png', 'http://localhost:8080/bilibiliThree/fileProject/lyt/images/2018-07-09_104304.png', 'http://localhost:8080/bilibiliThree/fileProject/lyt/images/2018-07-09_105619.png'],
					/* 背景图片大小 */
					imgSize : {
						width: '300px',
						height: '150px',
					},
					/* 拼图的宽高 */
					blockSize : {
						width: '40px',
						height: '40px',
					},
					/* 滑动条的宽高 */
					barSize : {
						width : '300px',
						height : '35px',
					},
					ready : function() {
						
					},
					success : function() {
						/* 通过异步将账号和密码发送到用户登录 */
						$.ajax({
							url:'userLogin',
							type:'post',
							dateType:'json',
							data:{
								userPhone:$("#user-name").val(),
								userPass:$("#password").val(),
							},
							success:function(data, status, jqXHR){
								/* 将返回的错误提示信息显示在页面(手机号,密码,手机号和密码是否都为空的) */
								$("#phoneError").html(data.userPhone);
								$("#passError").html(data.userPass);
								$("#codeError").html(data.phoneAndPass);
								if (data.skip == 1) {
									alert("登录成功");
								}
							}
						});
					},
					error : function() {
						alert('验证失败：拖动滑块将悬浮图像正确拼合');
					}
				});
				$("#register").click(function(){
					$.ajax({
						url:'userLogin',
						type:'post',
						dateType:'json',
						data:{
							userPhone:$("#user-name").val(),
							userPass:$("#password").val(),
						},
						success:function(data, status, jqXHR){
							$("#phoneError").html(data.userPhone);
							$("#passError").html(data.userPass);
							$("#codeError").html(data.phoneAndPass);
							if (data.skip == 1) {
								alert("登录成功");
							}
						}
					});
				});
				$("#QR-code").mouseover(function(){
					$(this).css("background-image", "url(http://localhost:8080/bilibiliThree/fileProject/lyt/images/2018-07-05_153434.png)");
				});
				$("#QR-code").mouseout(function(){
					$(this).css("background-image", "url(http://localhost:8080/bilibiliThree/fileProject/lyt/images/2018-07-05_153331.png)");
				});
			});
		</script>
	</head>
	<body>
		<header style="border:none; height: 0px;">
		
		</header>
		<center>
			<div id="center-head-img">
				<img src="<%=basePath %>fileProject/lyt/images/rl_top.35edfde.png"/>
			</div>
			<div id="middle-part">
				<div id="title">
					<div id="striping"></div>
					<h1>登录</h1>
					<div id="line"></div>
				</div>
				<div id="middle-part-left" style="height:500px;">
					<div id="QR-code" style="margin-top: 60px; background-image: url(<%=basePath %>fileProject/lyt/images/2018-07-05_153331.png)"></div>
					<div id="hint">
						<div id="hint-left">
							<img src="<%=basePath %>fileProject/lyt/images/2018-07-05_153503.png"/>
						</div>
						<div id="hint-center">
							<h3>扫描二维码登录</h3>
							<p>
								请使用
								<a href="#">哔哩哔哩客户端</a>
							</p>
							<p>扫码登录</p>
							<p>或扫码下载APP</p>
						</div>
						<div id="hint-right">
							<img src="<%=basePath %>fileProject/lyt/images/2018-07-05_153524.png"/>
						</div>
					</div>
				</div>
				<div id="middle-part-right">
					<input id="user-name" type="text" placeholder="你的手机号/邮箱" maxlength="11"/>
					<p id="phoneError" style="font-size: 10px; color: #F67BA4; width: 79%; height:20px; margin-top: -25px; text-align: left;"></p>
					<input id="password" type="password" placeholder="密码" maxlength="16"/>
					<p id="passError" style="font-size: 10px; color: #F67BA4; width: 79%; height:20px; margin-top: -25px; text-align: left;"></p>
					<div id="auth-code" style="position:relative; height:195px; border:none; right:50px;"></div>
					<p id="codeError" style="font-size: 10px; color: #F67BA4; width: 79%; height:20px; margin-top: -10px; margin-bottom: -10px; text-align: left;"></p>
					<br/>
					<div id="remember">
						<input type="checkbox" checked="checked" style="font-size:8px;"/>
						记住我&nbsp;&nbsp;
						<a id="no-select" href="#">不是自己的电脑上不要勾选此项</a>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="#">无法验证？</a>
						<a href="#">忘记密码？</a>
					</div>
					<button id="register">登录</button>
					<a href="register"><button id="login">注册</button></a>
					<br/>
					<div id="third-party-login-weibo">
						<a href="#">
							<img src="<%=basePath %>fileProject/lyt/images/2018-07-05_171127.png"/>
							微博账号登录
						</a>
					</div>
					<div id="third-party-login-qq">
						<a href="#">
							<img src="<%=basePath %>fileProject/lyt/images/2018-07-05_171141.png"/>
							QQ账号登录
						</a>
					</div>
				</div>
			</div>
		</center>
		<footer style="border:none; height: 50px;">
			
		</footer>
	</body>
</html>