<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>View product</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/shift.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css">
	<jsp:include page="/WEB-INF/jsp/head-include.jsp" />
	<jsp:include page="/WEB-INF/jsp/menu.jsp" />
</head>
<body>

<div class="neighborhood-guides">
	    <div class="container">
	    <h2>View Product</h2>
	    </div>
 </div>

<div class="container">
	
	<table class="table">
		<tr>
			<th>Name</th><th>Provider</th> <th>Start time</th> <th>End time</th> <th>Description</th> <th>Status</th> 
		 </tr>
		 <c:forEach var="item" items="${reports}">
		 	<tr>
		 			
		 		<td>${item.name}</td> <td>${item.provider}</td> <td>${item.startTime}</td> <td>${item.exitTime}</td> <td>${item.description}</td><td>${item.status}</td>
		 	</tr>
		 </c:forEach>
	</table>
	
		
</div>


</body>
</html>