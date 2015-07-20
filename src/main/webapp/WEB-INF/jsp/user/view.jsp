<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link href="assets/css/shift.css" rel="stylesheet">
    <link rel="stylesheet" href="assets/css/bootstrap.css">
    <link rel="stylesheet" href="assets/css/main.css">
	<title>View Profile</title>
	<jsp:include page="/WEB-INF/jsp/head-include.jsp" />
</head>
<body>
	<h2>View Profile</h2>
	<div> Name:${user.firstName} ${user.lastName} </div>
	<div> Email:${user.email}</div>
</body>
</html>