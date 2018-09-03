<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<% 
   	String path=request.getContextPath(); 
   	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<title>用户注册</title>
		<meta charset="UTF-8"/>
		<link rel="stylesheet" href="<%=basePath %>fileProject/lyt/css/usersRegister.css"/>
		<link rel="stylesheet" href="<%=basePath %>fileProject/lyt/css/bootstrap.min.css"/>
		<script type="text/javascript" src="<%=basePath %>fileProject/lyt/js/jquery.min.js"></script>
		<script type="text/javascript" src="<%=basePath %>fileProject/lyt/js/bootstrap.min.js"></script>
		
		<script type="text/javascript">
			var countdown = 59;
			var intervalID;
			var phone_code;
			$(function(){
				$("#refresh").click(function(){
					//刷新验证码
					$("#authCode").attr("src", "checkCodeController?time=" + new Date());
				});
				/* 判断用户名是否为空 */
				$("#user-name").blur(function(){
					$.ajax({
						url:'userRegister',
						type:'post',
						dateType:'json',
						data:{
							userName:$("#user-name").val(),
						},
						success:function(data, status, jqXHR){
							//将错误信息显示到页面
							$("#nameErrorMess").html(data.userName);
						}
					});
				});
				/* 判断密码是否为空 */
				$("#password").blur(function(){
					$.ajax({
						url:'userRegister',
						type:'post',
						dateType:'json',
						data:{
							userPass:$("#password").val(),
						},
						success:function(data, status, jqXHR){
							//将错误信息显示到页面
							$("#passErrorMess").html(data.userPass);
						}
					});
				});
				/* 判断用户输入的手机号码是否正确 */
				$("#determine").click(function(){
					$.ajax({
						url:'verifyAuthCode',
						type:'post',
						dateType:'json',
						data:{
							importAuthCode:$("#inputAuthCode").val(),
							userPhone:$("#auth-code").val(),
						},
						success:function(data,status,jqXHR){
							if (data.userPhone == "z") {
								alert("您输入的验证码有误，请重新输入！");
								//清空验证码输入框的值并获得焦点
								$("#inputAuthCode").val("").focus();
							}else {
								//关闭模态框
								$("#myModal").modal('hide');
								//将错误信息显示到页面
								$("#phoneErrorMess").html(data.userPhone);
								//刷新验证码
								$("#authCode").attr("src", "checkCodeController?time=" + new Date());
								//清空验证码输入框的值并获得焦点
								$("#inputAuthCode").val("").focus();
							}
						}
					});
					var countdown=60; 
					var obj = $("#register");
					settime(obj);
					
					function settime(obj) {
					    if (countdown == 0) { 
					        obj.attr('disabled',false); 
					        obj.val("免费获取验证码");
					        countdown = 60; 
					        return;
					    } else { 
					        obj.attr('disabled',true);
					        obj.val("重新发送(" + countdown + ")");
					        countdown--; 
					    } 
					    setTimeout(function(){
					    	settime((obj), 180000);
					    });
					}
				});
				/*判断用户输入的短信验证码是否正确 */
				$("#note-verify").blur(function(){
					$.ajax({
						url:'messageVerify',
						type:'post',
						dateType:'json',
						data:{
							noteVerify:$("#note-verify").val(),
						},
						success:function(data,status,jqXHR){
							//将错误信息显示到页面
							$("#noteErrorMess").html(data.noteVerify);
						}
					});
				});
				$("#login").mouseover(function(){
					var userName = $("#user-name").val();
					var userPass = $("#password").val();
					var userPhone = $("#auth-code").val();
					var noteVerify =  $("#note-verify").val();
					//判断(用户名,密码,手机号,短信验证)输入框是否为空
					if (userName == null || userName == "" && userPass == null || userPass == "" && userPhone == null || userPhone == "" && noteVerify == null || noteVerify == "") {
						//如果为空将禁用注册按钮
						$("#login").attr('disabled', true);
					}else {
						var nameError = $("#nameErrorMess").html(data.userName);
						var passError = $("#passErrorMess").html(data.userPass);
						var phoneError = $("#phoneErrorMess").html(data.userPhone);
						var noteError = $("#noteErrorMess").html(data.noteVerify);
						//判断是否有错误信息在页面显示
						if (!(nameError != null || nameError != "" && passError!= null || passError != "" && phoneError!= null || phoneError != "" && noteError!= null || noteError != "")) {
							//如果没有将解除注册按钮的禁用效果
							$("#login").attr('disabled', false);
						}
					}
				});
			});
		</script>
		
	</head>
	<body>
		<%-- <header style="height:45px; border:none;">
			<c:import url="bilibiliheader.jsp"></c:import>
		</header> --%>
		
		<form action="additionUser" method="post">
			<center style="height:600px;">
				<div id="center-head-img">
					<img src="<%=basePath %>fileProject/lyt/images/rl_top.35edfde.png"/>
				</div>
				<div id="middle-part">
					<div id="title">
						<div id="striping"></div>
						<h1>注册</h1>
						<div id="line"></div>
					</div>
					<div id="middle-part-right" style="width: 37%; height:370px;">
						<input id="user-name" name="userName" type="text" placeholder="昵称" style="width:79%;"/>
						<p id="nameErrorMess" style="font-size: 10px; color: #F67BA4; width: 79%; height:20px; margin-top: -25px; text-align: left;"></p>
						<input id="password" name="userPsw" type="password" placeholder="密码（6-16个字符组成，区分大小写）" maxlength="16" style="width:79%;"/>
						<p id="passErrorMess" style="font-size: 10px; color: #F67BA4; width: 79%; height:20px; margin-top: -25px; text-align: left;"></p>
						<input id="auth-code" name="phone" type="text" placeholder="填写常用手机号" maxlength="11" style="width:79%;"/>
						<p id="phoneErrorMess" style="font-size: 10px; color: #F67BA4; width: 79%; height:20px; margin-top: -5px; margin-bottom: -20px; text-align: left;"></p>
						<br/>
						<div id="remember">
							<a href="#">用邮箱注册></a>
						</div>
						<div id="SMS-verification" style="width:79%;">
							<input id="note-verify" type="text" placeholder="请输入短信验证码"/>
							<input id="register" type="button" value="点击获取" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal" style="font-size:13px; height:33px; outline:none; margin-top:2px;"/>
							<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
								<div class="modal-dialog" style="width:25%;">
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal" aria-hidden="true" style="outline:none;">
												&times; 
											</button>
											<h4 class="modal-title" id="myModalLabel" style="font-size:13px; float:left;">
												请输入验证码
											</h4>
										</div>
										<div class="modal-body">
										<img id="authCode" align="top" alt="" src="checkCodeController" width="120" height="50" />
										<br/>
										<a id="refresh" href="#">换一张</a>
										<br/>
										<input id="inputAuthCode" name="importAuthCode" type="text" placeholder="请输入图片中的内容" maxlength="4" style="outline:none; border:none; text-align: center;"/>
										</div>
										<div class="modal-footer">
											<button id="determine" type="button" class="btn btn-primary" style="float:left; width:100px; margin-left:30px; outline:none;">确定</button>
											<button type="button" class="btn btn-default" data-dismiss="modal" style="width:100px; margin-right:30px; outline:none;">取消</button>
										</div>
									</div>
								</div>
							</div>
						</div>
						<p id="noteErrorMess" style="font-size: 10px; color: #F67BA4; width: 79%; height:20px; margin-top: 5px; text-align: left;"></p>
						<div style="width:80%; margin-left:8%;" id="consent">
							<input id="agreeDeal" type="checkbox" checked="checked" style="font-size:8px;"/>
							我已同意
							<a href="#">《哔哩哔哩用户使用协议》</a>和<a href="#">《哔哩哔哩账号中心规范》</a>
						</div>
						<button type="submit" style="width:80%; margin-right:10%;" id="login">注册</button>
						<div id="already-have">
							<a href="login">已有账号，直接登录></a>
							<a href="#" style="float: left; margin-left: 3%;">返回主页</a>
						</div>
						<br/>
					</div>
				</div>
			</center>
		</form>
		<%-- <footer style="height:220px;">
			<c:import url="bilibiliheader.jsp"></c:import>
		</footer> --%>
	</body>
</html>