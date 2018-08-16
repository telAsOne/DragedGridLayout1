<%@ page language="java" pageEncoding="UTF-8"%>
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
<!DOCTYPE>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="/bilibiliThree/fileProject/hp/js/GaoFa/jquerymin.js"></script>
<script type="text/javascript"
	src="/bilibiliThree/fileProject/hp/js/GaoFa/jquery.barrager.js"></script>
<script type="text/javascript">



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
    </script>
</head>
<body style="background-color: rgba(255, 255, 255, 0);">
	<input type="hidden" id="values" value="" />
	<canvas
		style="width: 1280px; height: 720px; background-color: rgba(255, 255, 255, 0)">你的浏览器不支持canvas</canvas>

</body>
</html>