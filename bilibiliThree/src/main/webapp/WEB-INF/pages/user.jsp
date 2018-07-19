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
<script src="/bilibiliThree/js/user.js"></script>
</head>
<body>
	<table id="users"></table>
	
	<form id="form_datagrid_users" autocomplete="off">
		<div id="toolbar_user" >
			<div>
				<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-ok',plain:false" onClick="userTool.add()">新增</a>
				<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-ok',plain:false" onClick="userTool.edit()">修改</a>
			</div>
			<div style="padding-left:7px;color:#333">
				用户名：<input type="text" class="textbox" name="adminName" id="adminName" style="width:110px"/>&nbsp;&nbsp;&nbsp;&nbsp;
	    		<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true" onClick="userTool.query()">查询</a>
			</div>
		</div>
	</form>
	
	<form id="form_add_user" autocomplete="off">
		<table>
			<tr style="height:50px;">
				<td>用户名：</td>
				<td><input type="text" name="adminName" style="width:200px;height:20px"></td>
			</tr>
			<tr style="height:50px;">
				<td>密&nbsp;码：</td>
				<td><input type="password" name="adminPsw" style="width:200px;height:20px"></td>
			</tr>
			<tr style="height:50px;">
				<td>就职状态：</td>
				<td>
					<select name="adminState" style="width:205px;height:25px">
						<option>在职</option>
						<option>停职</option>
						<option>离职</option>
					</select>
				</td>
			</tr>
			<tr style="height:50px;">
				<td>角&nbsp;色：</td>
				<td><input id="cc" name="role" style="width:205px;"></td>
			</tr>
		</table>
	</form>
	
	
	
	<form id="form_edit_user" autocomplete="off">
		<input type="hidden" name="adminId" id="adminId">
		<table>
			<tr style="height:50px;">
				<td width="25%">用户名:</td>
				<td><input id="userName" type="text" name="adminName" readonly="readonly" style="width:200px"></td>
			</tr>
			<tr style="height:50px;">
				<td>就职状态：</td>
				<td>
					<select id="adminState" name="adminState" style="width:205px;height:25px">
						<option value="0" >在职</option>
						<option value="1">停职</option>
						<option value="2">离职</option>
					</select>
				</td>
			</tr>
			<tr style="height:50px;">
				<td>角&nbsp;色：</td>
				<td><input id="dd" value="" name="role" style="width:205px;"></td>
			</tr>
		</table>
	</form>
	
</body>
</html>