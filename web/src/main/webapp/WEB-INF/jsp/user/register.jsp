<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- <!DOCTYPE html> -->
<html>
<head>
    <link href="resources/css/shift.css" rel="stylesheet">   
    <link rel="stylesheet" href="resources/css/bootstrap.css">
    <link rel="stylesheet" href="resources/css/main.css">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<jsp:include page="/WEB-INF/jsp/head-include.jsp" />
	<jsp:include page="/WEB-INF/jsp/menu.jsp" />
	<title>Register</title>
</head>
<body>
	

	<div class="container">
    	<img src="resources/img/register.jpg" width="100%"></img>
   
	</div>

<div class="neighborhood-guides">
	    <div class="container">
	    <h2>Register</h2>
	    </div>
 </div>
  <div class="container">
	<form:form class="form-group form" name="input" method="post" action="users" modelAttribute="user">
	<form:errors path="username" />
	Login: <input type="text" name="username" /><br/>
	Password: <input type="text" name="password" /><br/>
	Email: <input type="text" name="email" /><br/>
	Phone: <input type="text" name="phone" /><br/>
	First Name: <input type="text" name="firstName" /><br/>
	Last Name: <input type="text" name="lastName" /><br/>

	<input type="submit" value="Submit">
	</form:form>
	</div>

</body>
</html>