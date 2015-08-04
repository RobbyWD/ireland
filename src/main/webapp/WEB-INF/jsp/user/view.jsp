<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link href="resources/css/shift.css" rel="stylesheet">
    <link rel="stylesheet" href="resources/css/bootstrap.css">
    <link rel="stylesheet" href="resources/css/main.css">
	<title>View Profile</title>
	<jsp:include page="/WEB-INF/jsp/head-include.jsp" />
</head>
<body>
<div class="nav">
      <div class="container">
        <ul class="pull-left">
          <li><a href="">Home</a></li>
          <li><a href="#">Browse</a></li>
        </ul>
        <ul class="pull-right">
          <li><a href="user/register">Sign Up</a></li>
          <li><a href="#">Log In</a></li>
          <li><a href="cam">Webcams</a></li>
        </ul>
      </div>
    </div>

<h3>View Profile</h3>

<div class="thumbnail">
 	<img src="resources/img/user.jpg"></img>
</div>

<div class="neighborhood-guides">
	<div> Name: ${user.firstName} ${user.lastName} </div>
	<div> Email: ${user.email}</div>
</div>

</body>
</html>