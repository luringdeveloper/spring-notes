<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- <link rel="stylesheet" href="static/css/quoteslist.css"> -->
<link rel="stylesheet" href='<jstl:url value="css/quoteslist.css"></jstl:url>'>
</head>
<body>


	<jstl:choose>
<jstl:when test="${quotes.size()!=null}">
			<table border="1" >
				<tr >
					<td >ID</td>
					<td>Tittle</td>
					<td>Description</td>
				</tr>
				<jstl:forEach items="${quotes}" var="quotes">
					<tr>
						<td>${quotes.id}</td>
						<td>${quotes.tittle}</td>
						<td>${quotes.description}</td> 	
					</tr>
				</jstl:forEach>
			</table>
		

		</jstl:when>
		<jstl:otherwise>
			<h1>there is no such data found</h1>
		</jstl:otherwise>
	</jstl:choose>
</body>
</html>