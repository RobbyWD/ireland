<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
    <link href="resources/css/shift.css" rel="stylesheet">
    <jsp:include page="/WEB-INF/jsp/head-include.jsp" />
    <link rel="stylesheet" href="resources/css/bootstrap.css">
    <link rel="stylesheet" href="resources/css/main.css">
    
  </head>
<body>

 <div class="nav">
      <div class="container">
        <ul class="pull-left">
          <li><a href="">Home</a></li>
          <li><a href="#">Browse</a></li>
        </ul>
        <ul class="pull-right">
          <li><a href="register">Sign Up</a></li>
          <li><a href="login">Log In</a></li>
          <li><a href="cam">Webcams</a></li>
        </ul>
      </div>
    </div>

<div class="container">
${loginError}
<div class="form-group form">
	<form action='login' method="post">
		<div>
			<label>User name:</label>
			<input type="text" id="userId" name="userId" placeholder="user name" class="form-control"/>
		</div>
		<div>
			<label>Password:</label>
			<input type="password" id="password" name="password" placeholder="password" class="form-control"/>
		</div>
		<button id="loginButton" class="form-control">Login</button>
	</form>
</div>
</div>
</body>
</html>