<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<c:set var="base" value="<%=basePath%>"></c:set>

<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>创作中心 - 哔哩哔哩弹幕视频网 - ( ゜- ゜)つロ 乾杯~</title>
<link rel='stylesheet' href='${pageContext.request.contextPath}/fileProject/hj/css/uploading.css'>
<link rel='stylesheet'
	href='${pageContext.request.contextPath}/fileProject/hj/font-awesome-4.7.0/css/font-awesome.min.css'>
<link rel='stylesheet' href='${pageContext.request.contextPath}/fileProject/hj/js/nprogress/nprogress.css' />
<link href="${pageContext.request.contextPath}/fileProject/hj/css/zhuanlanindex.css" type="text/css" rel="stylesheet" />
<script src="${pageContext.request.contextPath}/fileProject/hj/js/jquery.min.js"></script>
<script src='${pageContext.request.contextPath}/fileProject/hj/js/nprogress/nprogress.js'></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/fileProject/hj/js/contribute.js"></script>
<script src="${pageContext.request.contextPath}/fileProject/hj/js/imgUp.js"></script>
<!-- 引入ckeditor.js和ckfinder.js -->
<script type="text/javascript" src="${pageContext.request.contextPath}/fileProject/hj/assets/ckeditor/ckeditor.js"></script>
<!-- 相簿样式 -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/fileProject/hj/css/upType.css"/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/fileProject/hj/font-awesome-4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="http://apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.css">

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
	<section>
		<div id="section_video" class="tougao">
			<div class='fileButton'>
				<i class='fa fa-share-square-o fa-fw'></i> 上传视频
			</div>
			<div id='backImg'>
				<img src='${pageContext.request.contextPath}/fileProject/hj/img/background.png' alt='loading'>
			</div>
			<div id='peopleImg'>
				<img src='${pageContext.request.contextPath}/fileProject/hj/img/people.png' alt='loading'>
			</div>
			<p class='loadingFont'>点击此处选择文件上传</p>
			<p class='loadingFont'>
				<span id='span_one'>当前审核队列</span> <a id='span_two'>流畅</a>
			</p>
			<div id='placeholderDiv'>
				<div class='warning'>
					<a href='#'>禁止发布的视频内容</a> <a href='#'>视频大小</a> <a href='#'>视频格式</a>
					<a href='#'>视频码率</a>
				</div>
				<br />
				<p style='text-align: center; color: #ABABAB; font-size: 13px;'>
					上传视频，即表示您已同意 <span style='color: #00A1D6;'>哔哩哔哩使用协议</span>
					，请勿上传色情，反动等违法视频。
				</p>
				<br />
				<div class='settingUl'>
					<a href='#'>第三方工具</a> <a href='#'><i class='fa fa-sign-in'
						style='color: #ABABAB;'></i> 小丸压制工具原版</a> <a href='#'><i
						class='fa fa-tv' style='color: #ABABAB;'></i> 小丸压制工具Bilibili定制版</a>
				</div>
			</div>
			<img id='soccerImg' src='${pageContext.request.contextPath}/fileProject/hj/img/soccer.png' alt='广告'>
		</div>

		<!-- 专栏投稿图片上传 -->
		<div  id="section_column"  class="tougao" >
			<div id="head">
			<a class="headA" onclick="zhuanlan_tougao(this); "href="javascript:void(0);" id="headA">专栏投稿</a>
			 <a class="headA" onclick="zhuanlan_tougao(this);" href="javascript:void(0);">草稿箱</a>
			</div>
		<!-- 专栏投稿 -->
			<div id="section_column_one" class="tougao">
					<!-- 专栏表单 -->
					<!-- columnContent -->
				<form action="columnContent" method="POST" id="form1" >
					<div id="content">
						<input id="content_title" name="title"  type="text"  placeholder="请输入标题（建议20字以内）"
							 />
					 <div class="container"  id="container">   
					     	  <img src="${pageContext.request.contextPath}/fileProject/hj/img/a11.png" id="uploadImg"/>
					     	  <input type="file" id="file_input" name="titleImg" class="file_input" enctype="multipart/form-data" /> 
					 </div>   
					 <textarea rows="10" hidden="hidden" cols="10" name="titlImgContent" id="titlImgContent" ></textarea>
						<!-- 专栏内容 -->
						<div
							style="margin-top: 20px;margin-left:12px; width: 800px; height: 600px; word-wrap: break-word; word-break: break-all;">
							<textarea name="columnContent" id="editor1" rows="10" cols="80"></textarea>
						<input type="file"   style="display: none;" id="a" />
						</div>
						<div id="content_info">
							<h4 class="content_info_h4">请选择转载权限</h4>
							<div id="content_info_radiobutton">
								<span>禁止转载</span><input type="radio" name="radiobutton"
									value="2" checked> <span>可转载</span><input type="radio"
									name="radiobutton" value="1">
							</div>
							<!-- 专栏分类 -->
							<h4 class="content_info_h4">请选择专栏分类</h4>
							<ul id="content_info_ul1">
								<li class="content_info_ul1_li"><span
									onclick="dianji(this);">动画</span>
									<ul id="content_info_ul1_li_anime">
										<li name="named">动漫杂谈</li>
										<li>动漫咨询</li>
										<li>动漫技术</li>
									</ul></li>
								<li class="content_info_ul1_li"><span
									onclick="dianji(this);">游戏</span>
									<ul id="content_info_ul1_li_game">
										<li>单机游戏</li>
										<li>电子竞技</li>
										<li>手机游戏</li>
										<li>网络游戏</li>
										<li>桌游棋盘</li>
									</ul></li>
								<li class="content_info_ul1_li"><span
									onclick="dianji(this);">影视</span>
									<ul id="content_info_ul1_li_movie">
										<li>电影</li>
										<li>电视剧</li>
										<li>纪录片</li>
										<li>综艺</li>
									</ul></li>
								<li class="content_info_ul1_li"><span
									onclick="dianji(this);">生活</span>
									<ul id="content_info_ul1_li_life">
										<li>美食</li>
										<li>萌宠</li>
										<li>时尚</li>
										<li>运动</li>
										<li>日常</li>
									</ul></li>
								<li class="content_info_ul1_li"><span
									onclick="dianji(this);">兴趣</span>
									<ul id="content_info_ul1_li_interest">
										<li>绘画</li>
										<li>手工</li>
										<li>摄影</li>
										<li>音乐舞蹈</li>
										<li>模拟手办</li>
									</ul></li>
								<li class="content_info_ul1_li"><span
									onclick="dianji(this);">轻小说</span>
									<ul id="content_info_ul1_li_novel">
										<li>原创连载</li>
										<li>同人连载</li>
										<li>短片小说</li>
										<li>日小说杂志</li>
									</ul></li>
								<li class="content_info_ul1_li"><span
									onclick="dianji(this);">科技</span>
									<ul id="content_info_ul1_li_science">
										<li>人文历史</li>
										<li>自然</li>
										<li>数码</li>
										<li>汽车</li>
										<li>学习</li>
									</ul></li>
							</ul>
							<p id="content_info_p">
							<span id="content_info_p_span1">当前选择分类:</span> 
							<input type="text"  readonly="readonly" name="column_type" value="">
							<input type="text"  readonly="readonly" name="column_classification" value="">
							</p>
							<p id="content_info_p2">
								<span id="content_info_p2_span1" class="span_family1">请选择标签</span>
								<span id="content_info_p2_span2" class="span_family2">(还可以添加10个标签)</span>
							</p>
							<div id="content_info_input">
								<span id="width_caculator" hidden="hidden"></span>
							</div>

							<input id="txt_search" onclick="return search();" type="text"
								maxlength="20" />
							<p id="content_info_p_Enter">
								<span id="content_info_Enter" class="span_family2">按回车Enter创建标签</span>
							</p>
							<span id="column_cover_textarea_span">0/233</span>
							<p id="column_cover_recommended">
								<span class="span_family1">专栏推荐语&nbsp;(&nbsp;必填&nbsp;)</span>
							</p>
							<textarea name="columnLanguage" placeholder="推荐语会在动态中展示，有趣的描述跟容易被小编推荐为热门动态哦~" rows="10"
								cols="10" onChange="count();" id="column_cover_textarea"
								maxlength="233"></textarea>
							<div id="content_info_div">
								<input type="checkbox" id="content_info_div_input" /> <span>我已阅读并接受</span>
								<a href="###">哔哩哔哩专栏内容上传协议</a> &nbsp;<span>和</span>&nbsp; <a
									href="###">哔哩哔哩专栏规范</a>
							</div>
							<ul id="content_info_ul">
								<li id="content_info_ul2_li"><span>提交文章</span></li>
								<li class="content_info_ul2_li"><button
										class="content_info_ul2_li_button" onClick="return false;">&nbsp;&nbsp;&nbsp;存&nbsp;草&nbsp;稿&nbsp;&nbsp;&nbsp;</button></li>
								<li class="content_info_ul2_li"><button
										class="content_info_ul2_li_button"onClick="return false;">手机端预览</button></li>
								<li class="content_info_ul2_li"><button
										class="content_info_ul2_li_button" onClick="return false;">网页端预览</button></li>
							</ul>
						</div>
					</div>
				</form>
				<div class="hr" ></div>
				<ul id="content_ul">
					<li><a href="###">bilibili</a><span>|</span></li>
					<li><a href="###">帮助中心</a><span>|</span></li>
					<li><a href="###">问题反馈</a><span>|</span></li>
					<li><a href="###">关于我们</a><span>|</span></li>
					<li><a href="###">活动专题</a></li>
				</ul>
			</div>
			<div id="section_column_tow"   >
				<div id="section_column_tow_div">
					<p id="section_column_tow_p">
					<span id="section_column_tow_h4">草稿箱</span>
					<span>(</span>
					<span id="section_column_tow_count">3</span>
					<span>)</span>
				</p>
				<ul id="box">
					<li>
						<a href="javascript:void(0)"><img alt="" src="${pageContext.request.contextPath}/fileProject/hj/img/a11.png"></a>
						<a href="javascript:void(0)"><span  class="title">aaaaaaa</span></a>
						<span class="content">489561895648954</span>
						<span class="time">最后修改时间:2018-07-26 13:03:19</span>
						<p>
							<span class="editor">
								<a href="javascript:void(0)">编辑</a>
							</span>
							<span class="delete">
								<a href="javascript:void(0)">删除</a>
							</span>
						</p>
					</li>
					<li>
						<a href="javascript:void(0)"><img alt="" src="${pageContext.request.contextPath}/fileProject/hj/img/a11.png"></a>
						<a href="javascript:void(0)"><span  class="title">aaaaaaa</span></a>
						<span class="content">489561895648954</span>
						<span class="time">最后修改时间:2018-07-26 13:03:19</span>
						<p>
							<span class="editor">
								<a href="javascript:void(0)">编辑</a>
							</span>
							<span class="delete">
								<a href="javascript:void(0)">删除</a>
							</span>
						</p>
					</li>
				</ul>
				</div>
				<div class="hr"></div>
				<ul id="content_ul">
					<li><a href="###">bilibili</a><span>|</span></li>
					<li><a href="###">帮助中心</a><span>|</span></li>
					<li><a href="###">问题反馈</a><span>|</span></li>
					<li><a href="###">关于我们</a><span>|</span></li>
					<li><a href="###">活动专题</a></li>
				</ul>
			</div>
		</div>
		<div id="section_photo" class="tougao" >
			<h2>选择你要投稿的类型</h2>
			<p class="p1">点击下方按钮，即可前去发布相簿作品~</p>
			<ul id="section_photo_ul">
				<li>
					<a href="paintingJump" target="_blank">
						<div class="selType">
							<img src="${pageContext.request.contextPath}/fileProject/hj/img/album-draw.png"/>
							<div style="background-color:#FF6D87;">
								<h3 style="line-height:30px;">绘画<h3>
								<p style="font-size:12px; margin-top:-15px;">原创/同人/插画/漫画</p>
							</div>
						</div>
					</a>
				</li>
				<li>
					<a href="javascript:void(0)">
						<div class="selType">
							<img src="${pageContext.request.contextPath}/fileProject/hj/img/album-photography.png"/>
							<div style="background-color:#FFAB5B;">
								<h3 style="line-height:30px;">摄影<h3>
								<p style="font-size:12px; margin-top:-15px;">cosplay/JK/Lolita/汉服</p>
							</div>
						</div>
					</a>
				</li>
				<li>
					<a href="photoJump" target="_blank">
						<div class="selType">
							<img src="${pageContext.request.contextPath}/fileProject/hj/img/album-daily.png"/>
							<div style="background-color:#86B1FF;">
								<h3 style="line-height:30px;">日常<h3>
								<p style="font-size:12px; margin-top:-15px;">分享你此刻的心情</p>
							</div>
						</div>
					</a>
				</li>
			</ul>
		</div>
	</section>
	<script src='${pageContext.request.contextPath}/fileProject/hj/js/jquery.pjax.js'></script>
	<script>
		$.pjax({
			selector: 'a[target!=_blank]',
			container: 'section',
			show: 'fade',
			cache: false,
			storage: false,
			timeout : 0
		});
		NProgress.configure({ showSpinner: false });
		$('section').bind('pjax.start', function(){
	   		NProgress.start();
	    });
	    $('section').bind('pjax.end', function(){
	        NProgress.done();
	    });
	 
	</script>
	<script type="text/javascript">
			  var editor = CKEDITOR.replace( 'editor1');
		      CKFinder.setupCKEditor(editor, 'fileProject/hj/assets/ckfinder');
		      
		 /*      
		   	//显示剩余字数
		  	  editor.on('key',function(evt){
	  	  			count=editor.getData().length;
	  	  		editor.setReadOnly(true); 
	  	  		var count=0;
	  	  	if($("#editor1").val().length<10){
  	  			return true;
  	  		}else{
  	  			return false;
		  	}); */
	</script>
</body>
</html>
