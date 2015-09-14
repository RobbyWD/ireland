<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/shift.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css">
	<title>View Profile</title>
	<jsp:include page="/WEB-INF/jsp/head-include.jsp" />
	 <jsp:include page="/WEB-INF/jsp/menu.jsp" />
</head>
<body>
<div class="neighborhood-guides">
	    <div class="container">
	    <h2>Edit Profile:</h2>
	    </div>
 </div>

	<div class="container">
	<form:form class="form-group form" name="input" method="post" modelAttribute="user"
		action="users/${user.username}">
		<form:input type="hidden" path="id" />
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