<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	 <link href="resources/css/shift.css" rel="stylesheet">   
    <link rel="stylesheet" href="resources/css/bootstrap.css">
    <link rel="stylesheet" href="resources/css/main.css">
	<jsp:include page="/WEB-INF/jsp/head-include.jsp" />
	 <jsp:include page="/WEB-INF/jsp/menu.jsp" />
<title>User Management</title>
</head>
<body>
	
<div class="neighborhood-guides">
	    <div class="container">
	    <h2>User Management</h2>
	    </div>
 </div>

	<div class="container">
	
	<table class="table">
		<tr>
			<th> ID </th ><th>User name </th> <th> View </th> <th>Edit</th> <th> Delete </th>   
		 </tr>
		 <c:forEach var="item" items="${users}">
		 	<tr>
		 		<td>${item.id}</td><td>${item.username}</td>
		 		<td><a href="users/${item.username}/view">View</a></td>
		 		<td> <a href="users/${item.username}/edit">Edit</a></td>
		 		<td><a href="users/${item.username}/delete">Delete</a></td>
		 	</tr>
		 </c:forEach>
	</table>
	
	<a href="users?register">Register new user</a>
	
	</div>
</body>
</html>