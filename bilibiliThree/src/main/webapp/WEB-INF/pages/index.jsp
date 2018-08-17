<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>后台首页</title>
<link href="/bilibiliThree/easyui/insdep.easyui.min.css" rel="stylesheet"
	type="text/css">
	<link href="/bilibiliThree/easyui/insdep.theme_default.css" rel="stylesheet"
	type="text/css">
<link href="/bilibiliThree/easyui/icon.css" rel="stylesheet"
	type="text/css">
<
<script src="/bilibiliThree/easyui/jquery.min.js"></script>
<script src="/bilibiliThree/easyui/jquery.easyui.min.js"></script>
<script src="/bilibiliThree/easyui/insdep.extend.min.js"></script>

<script type="text/javascript" src="/bilibiliThree/js/index.js"></script>
</head>

<body class="easyui-layout">

	<div data-options="region:'north'" style="height: 80px;"></div>
	<div data-options="region:'west',title:'菜单栏'" style="width: 205px;">
		<div id="big" class="easyui-accordion"
			style="width: 190px; height: 200px;">
			<c:forEach items="${menuList}" var="menu" varStatus="statu">
				<div title="${menu.text}" data-options="iconCls:'${menu.iconCls}'"
					style="overflow: auto; padding: 10px;">
					<input id="pid${statu.index}" type="hidden" value="${menu.menuId}" />
					<div id="nav${statu.index}"></div>
				</div>
			</c:forEach>
		</div>
	</div>
	<div data-options="region:'center'"
		style="padding: 5px; background: #eee;">
		<div id="tabs" class="easyui-tabs" fit="true" border="false">
			
		</div>
	</div>
</body>
</html>