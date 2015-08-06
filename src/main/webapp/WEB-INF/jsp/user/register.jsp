<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- <!DOCTYPE html> -->
<html>
<head>
    <link href="resources/css/shift.css" rel="stylesheet">   
    <link rel="stylesheet" href="resources/css/bootstrap.css">
    <link rel="stylesheet" href="resources/css/main.css">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<jsp:include page="/WEB-INF/jsp/head-include.jsp" />
	<title>Register</title>
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
	<div class="container">
    	<img src="resources/img/register.jpg" width="100%"></img>
    
<h3>
	Register
</h3>
</div>
  <div class="container">
	<form class="container" name="input" method="post" action="user">
	Login: <input type="text" name="name" /><br/>
	Password: <input type="text" name="password" /><br/>
	Email: <input type="text" name="email" /><br/>
	First Name: <input type="text" name="firstName" /><br/>
	Last Name: <input type="text" name="lastName" /><br/>

	<input type="submit" value="Submit">
	</form>
	</div>

</body>
</html>