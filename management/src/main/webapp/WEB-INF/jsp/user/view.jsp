<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" href="resources/css/shift.css">
    <link rel="stylesheet" href="resources/css/bootstrap.css">
    <link rel="stylesheet" href="resources/css/main.css">
	<title>View Profile</title>
	<jsp:include page="/WEB-INF/jsp/head-include.jsp" />
	<jsp:include page="/WEB-INF/jsp/menu.jsp" />
</head>
<body>

<div class="neighborhood-guides">
	    <div class="container">
	    <h2>View Profile</h2>
	    </div>
 </div>

<div class="thumbnail">
 	<img src="resources/img/user.jpg"></img>
</div>

<div class="neighborhood-guides">
	<div> Name: ${user.firstName} ${user.lastName} </div>
	<div> Email: ${user.email}</div>
</div>

<%-- <a href="users/${user.name}/edit">Edit Profile</a> --%>

</body>
</html>