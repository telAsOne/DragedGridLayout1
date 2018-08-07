<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/fileProject/cr/css/xiu.css"/>
    <title>修改信息</title>
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
  <div id="bli"><img src="${pageContext.request.contextPath}/fileProject/cr/images/bili.png" id="bili"/></div>
  <ul id="six">
    <li>个人中心</li>
    <li><a href="goxinxi">首&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;页</a></li>
    <li>大&nbsp;&nbsp;会&nbsp;&nbsp;员</li>
    <li>会员积分</li>
    <li style="background-color: dodgerblue;color: white">我的信息</li>
    <li>我的头像</li>
    <li>我的勋章</li>
    <li>账号安全</li>
    <li>黑&nbsp;&nbsp;名&nbsp;&nbsp;单</li>
    <li>我的硬币</li>
    <li>我的记录</li>
    <li>实名认证</li>
    <li>邀请注册</li>
  </ul>
  <div id="sye">
    <div style="border-left: 3px solid dodgerblue;font-size: 14px;color: dodgerblue;
    margin-left: 20px;padding-left: 5px;margin-top: 10px">我的信息</div>
    <div id="cuk"></div>
    <ul id="rit">
      <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;昵称：&nbsp;
        <input type="text" placeholder="编辑修改的昵称" style="width:200px;height: 22px;border-radius: 5px;
        border: 1px solid gainsboro;outline:none;padding-left: 5px"/>
        <span style="color: darkgrey;font-size: 12px;margin-left: 20px">注：修改一次昵称需要6个硬币</span>
      </li>
      <li>&nbsp;&nbsp;用户名：&nbsp;&nbsp;
        <span style="color: grey;font-size: 12px">bili_392432574</span>
      </li>
      <li>我的签名：&nbsp;
        <input type="text" placeholder="设置您的签名(｀・ω・´)" style="width:500px;height: 90px;
        border-radius: 5px;border: 1px solid gainsboro;outline:none;padding-left: 5px"/>
      </li>
      <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;性别：&nbsp;
          <input type="radio" name="sex"/>男&nbsp;<input type="radio" name="sex"/>女
        <input type="radio" name="sex"/>保密
      </li>
      <li>出生日期：&nbsp;&nbsp;<input type="datetime"/></li>
    </ul>
    <div id="suk"></div>
    <button type="submit" id="but">保存</button>
  </div>
</div>
</body>
</html>
