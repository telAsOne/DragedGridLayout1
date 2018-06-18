<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$(".delete").click(function(){
			var href=$(this).attr("href");
			$("#form1").attr("action",href).submit();
			return false;
		});
	});
</script>
</head>
	<body>
	<form id="form1" method="POST">
		<input type="hidden" name="_method" value="DELETE"/>
	</form>
	<c:if test="${empty emp}">
		<h1>没找到数据</h1>
	</c:if>
	<c:if test="${!empty emp}">
		<h1>所有用户</h1>
		<table border="1" cellpadding="5" cellsapcing="0">
			<tr align="center">
				<td>员工编号</td>
				<td>姓名</td>
				<td>性别</td>
				<td>年龄</td>
				<td>部门</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${emp}" var="emp">
				<tr align="center">
				<td>${emp.empId}</td>
				<td>${emp.name}</td>
				<td>${emp.sex=='M'?'男':'女'}</td>
				<td>${emp.age}</td>
				<td>${emp.dept.deptName}</td>
				<td><a class="delete" href="${pageContext.request.contextPath}/emp/${emp.empId}">删除</a>
				|<a href="${pageContext.request.contextPath}/emp/${emp.empId}">修改</a></td>
			</tr>
			</c:forEach>
		</table>
	</c:if>
	<p><a href="getAllEmp/view">新增员工</a></p>
	</body>
</html>