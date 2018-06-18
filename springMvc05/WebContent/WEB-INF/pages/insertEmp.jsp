<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<title>新怎员工</title>
</head>
	<body>
		<form:form action="${pageContext.request.contextPath}/addEmp"  method="POST" modelAttribute="emps">
			<c:if test="${empty emps.empId}">
				姓名:<form:input path="name"/><br/>
			</c:if>
			<c:if test="${! empty emps.empId}">
				姓名:<form:input path="name" readonly="true"/><br/>
				<form:hidden path="empId"/> 
				<input type="hidden" name="_method" value="PUT">
			</c:if>
			性别:<form:radiobuttons path="sex" items="${sexs}"/><br/>
			年龄:<form:input path="age"/><br/>
			部门:<form:select path="deptId" items="${depts}" itemValue="deptId" itemLabel="deptName"></form:select>
			<br/><br/><br/>
			<button>${empty emps.empId ?'新增':'修改'}</button>
		</form:form>
	</body>
</html>