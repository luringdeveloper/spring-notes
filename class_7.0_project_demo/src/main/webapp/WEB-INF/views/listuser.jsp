<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="head.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	
	
	<table>
		<tr> 
			<td>email</td>
			<td>password</td>
			<td>fullname</td>
		</tr>
		<jstl:forEach items="${user}" var="item">
		<tr>
			<td>${item.email}</td>
			<td>${item.pwd}</td>
			<td>${item.fullname}</td>
		</tr>
		</jstl:forEach>
	</table>
</body>
</html>