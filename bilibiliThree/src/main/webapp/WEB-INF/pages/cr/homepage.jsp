<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/fileProject/cr/css/index.css"/>
    <title>我的首页</title>
</head>
<body>
    <div id="kek">
      <ul id="one">
        <li><img src="${pageContext.request.contextPath}/fileProject/cr/images/a.png" id="a"/>主站</li>
        <li>画友</li>
        <li>游戏中心</li>
        <li>直播</li>
        <li>会员购</li>
        <li>BW</li>
        <li>萌战</li>
        <li><img src="${pageContext.request.contextPath}/fileProject/cr/images/aa.jpg" id="aa"/>下载App</li>
      </ul>
      <input type="text" id="sou"><img src="${pageContext.request.contextPath}/fileProject/cr/images/aaa.JPG" id="aaa"/></input>
      <div><img src="${pageContext.request.contextPath}/fileProject/cr/images/dog.gif" id="dog"/></div>
      <ul id="two">
        <li>大会员</li>
        <li>消息</li>
        <li>动态</li>
        <li>稍后再看</li>
        <li>收藏夹</li>
        <li>历史</li>
      </ul>
      <div id="tou">投稿</div>
      <!-- 这是显示当前登录人 的 昵称和签名 -->
      <div>
      	<img src="${pageContext.request.contextPath}/fileProject/cr/images/xip.png" id="xip"/>
      	<div id="name">${ sessionScope.userinfo.nickname }</div>
        <input type="text" placeholder="${ sessionScope.userinfo.comments }" id="txt"/>
      </div>
      <a href="goxinxi">
      <img src="${pageContext.request.contextPath}/fileProject/cr/images/dog.gif" id="dog2"/></a>
      <ul id="three">
        <li>
          <a href="goDoti" target="iframe_a">
          <img src="${pageContext.request.contextPath}/fileProject/cr/images/b.png" id="b"/>主页</a>
        </li>
        <li>
          <a href="godongtai" target="iframe_a">
          <img src="${pageContext.request.contextPath}/fileProject/cr/images/bb.png" id="bb"/>动态</a>
        </li>
        <li>
        <img src="${pageContext.request.contextPath}/fileProject/cr/images/bbb.png" id="bbb"/>投稿0
        </li>
        <li>
          <img src="${pageContext.request.contextPath}/fileProject/cr/images/bbbb.png" id="bbbb"/>频道0
        </li>
        <li>
          <img src="${pageContext.request.contextPath}/fileProject/cr/images/bbbbb.png" id="bbbbb"/>收藏夹1
        </li>
        <li>
         <img src="${pageContext.request.contextPath}/fileProject/cr/images/bbbbbb.png" id="bbbbbb"/>订阅
        </li>
        <li>
         <img src="${pageContext.request.contextPath}/fileProject/cr/images/bbbbbbb.png" id="bbbbbbb"/>设置
        </li>
      </ul>
      <input type="text" id="so" placeholder="搜索视频"><img src="${pageContext.request.contextPath}/fileProject/cr/images/aaa.JPG" id="aso"/></input>
      <ul id="four">
        <li style="color: #999999">关注数<span style="color: black">0</span></li>
        <li style="color: #999999">粉丝数<span style="color: black">0</span></li>
      </ul>
      <div id="bro"></div>
      <iframe width="1040" height="520" frameborder="no" scrolling="no"
              allowtransparency="yes" name="iframe_a" src="goDoti"></iframe>
    </div>
</body>
</html>
