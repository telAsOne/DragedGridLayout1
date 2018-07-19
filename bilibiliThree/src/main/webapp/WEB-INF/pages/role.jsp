<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="/bilibiliThree/easyui/easyui_full.css" rel="stylesheet"
	type="text/css">
<link href="/bilibiliThree/easyui/theme.default/master.css" rel="stylesheet"
	type="text/css">
<script src="/bilibiliThree/js/jquery-3.1.1.min.js"></script>
<script src="/bilibiliThree/easyui/jquery.easyui-1.5.2.min.js"></script>
<script src="/bilibiliThree/easyui/insdep-extend.min.js"></script>
<script src="/bilibiliThree/easyui/theme.default/master.js"></script>
<script src="/bilibiliThree/easyui/theme.default/master.js"></script>
<script src="/bilibiliThree/easyuis/locale/easyui-lang-zh_CN.js"></script>
<script src="/bilibiliThree/js/role.js"></script>
</head>
<body>
	<table id="roles"></table>
	
	<form id="form_datagrid_users" autocomplete="off">
		<div id="toolbar_role" >
			<div>
				<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-ok',plain:false" onClick="roleTool.add()">新增</a>
				<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-ok',plain:false" onClick="roleTool.edit()">修改</a>
				<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-ok',plain:false" onClick="roleTool.del()">删除</a>
			</div>
			<div style="padding-left:7px;color:#333">
				角色名：<input type="text" class="textbox" name="adminName" id="adminName" style="width:110px"/>&nbsp;&nbsp;&nbsp;&nbsp;
	    		<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true" onClick="roleTool.query()">查询</a>
			</div>
		</div>
	</form>
	
</body>
</html>