<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link href="resources/css/shift.css" rel="stylesheet">   
    <link rel="stylesheet" href="resources/css/bootstrap.css">
    <link rel="stylesheet" href="resources/css/main.css">
	<jsp:include page="/WEB-INF/jsp/head-include.jsp" />
	<jsp:include page="/WEB-INF/jsp/menu.jsp" />
	<title>Cart</title>
</head>
<body>

<div class="neighborhood-guides">
	    <div class="container">
	    <h2>Your cart</h2>
	    </div>
 </div>

<div class="container">

<form action='cart/placeOrder' method="post">
${cartMessage}
<table class="table">
	<tr>
		<th> Item </th>
		<th> Quantity </th>
		<th> Price </th>
	</tr>
	<c:forEach var="item" items="${cart.contents}">
	<tr>
		<td><c:out value="${item.key.name}"/> </td>
		<td><c:out value="${item.value}"/> </td>
		<td>$<c:out value="${item.key.price * item.value}"/> </td>
	</tr>
	</c:forEach>
	
	<tr></tr>
	<tr>
		<td>Total</td>
		<td></td>
		<td>$${cart.totalCost}</td>
	</tr>
</table>
<input type="submit" value="Place Order"></input>
</form>

</div>

    <div class="learn-more">
	  <div class="container">
		<div class="row">
		
	      <div class="col-md-4">
			<h3>Housing</h3>
			<p>From apartments and rooms to treehouses and boats: stay in unique spaces of Ireland.</p>
			<p><a href="rent">See how easy is to rent with Failte Ireland</a></p>
	      </div>
	      
		  <div class="col-md-4">
			<h3>Tours</h3>
			<p>To find your ideal holiday, browse our comprehensive selection of guided coach tours to Ireland that vary in length from 5 - 15 days.</p>
			<p><a href="tour">Learn more about tours</a></p>
		  </div>
		  
		  <div class="col-md-4">
			<h3>Trust and Safety</h3>
			<p>From Verified ID to our worldwide customer support team, we've got your back.</p>
			<p><a href="trust">Learn about trust</a></p>
		  </div>
	    </div>
	  </div>
	</div>

</body>
</html>