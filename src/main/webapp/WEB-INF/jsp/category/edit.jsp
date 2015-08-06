<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Edit Category</title>
    <link href="resources/css/shift.css" rel="stylesheet">   
    <link rel="stylesheet" href="resources/css/bootstrap.css">
    <link rel="stylesheet" href="resources/css/main.css">
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

	<div class="container">
	<h2>Edit Category</h2>
	<div class="form-group form">
	<form:form name="input" method="post" modelAttribute="category"
		action="categories/${category.id}">
		<div>
			<label>Name: </label>
			<form:input class="form-control" type="text" path="name" />
			<form:errors path="name" />
		</div>
		<div>
			<label>Description: </label>
			<form:textarea class="form-control" path="description" />
			<form:errors path="description" />
		</div>
		<div>
			<input class="form-control submit" type="submit" value="Submit">
		</div>
	</form:form>
	</div>
	</div>
</body>
</html>