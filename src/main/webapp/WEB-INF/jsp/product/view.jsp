<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>View product</title>
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
	<h2>View Product</h2>
	<div><strong> Name: </strong></div>
	<div> ${product.name} </div>
	<div><strong> Description: </strong> </div>
	<div> ${product.description}</div>
	<div><strong> Price: </strong></div>
	<div> ${product.price} </div>
	<div><strong> Duration: </strong></div>
	<div> ${product.duration} </div>
	
	<a href="products/${product.id}/edit">Edit product</a>
	</div>

<%-- <h3>Products</h3>

<c:forEach var="item" items="${category.products}">
	<c:out value="${item.name}"/> <br/>
</c:forEach>
 --%>

</body>
</html>