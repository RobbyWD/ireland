<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
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
          <li><a href="#">Log In</a></li>
          <li><a href="cam">Webcams</a></li>
        </ul>
      </div>
    </div>
    <div class="container">
    	<img src="resources/img/tour.jpg" width="100%"></img>
    </div>
    
    <div class="neighborhood-guides">
    <div class="container">
        <h2>84 Years of Travel Excellence - We know Ireland better than anyone!</h2>
        <p>To find your ideal holiday, browse our comprehensive selection of guided coach tours to Ireland that vary in length from 5 - 24 days. Choose value-for-money first class programs, splurge with deluxe properties or find something in between.

All of our quality escorted coach tours to Ireland feature prepaid daily sightseeing, excellent hotels, full breakfasts, most dinners, including specialty dinners with entertainment and, most importantly, no hidden extras! Our tour guides do not sell any optional tours so that they can focus 100% on your holiday enjoyment!

Also consider one of our popular holidays combining Ireland with Scotland, England and Wales. If you need help in deciding which tour is right for you just call one of our friendly CIE Tours travel advisors at +353-1-703-1888 or contact us online.

Please browse our wide selection of Ireland tours from 5 to 9 days in length below.</p> 
     </div>
    </div>
    
<div class="container">
	
	<table>
		<tr>
			<th>Duration </th> <th>Tour name</th> <th> Description </th> <th> Price </th> <th>Order</th> 
		 </tr>
		 <c:forEach var="item" items="${featuredProducts}">
		 	<tr>
		 		<td>${item.duration}</td> <td>${item.name}</td> <td>${item.description}</td> <td>${item.price}</td> <td><a href="cart/add/${item.id}">Add to cart</a></td>
		 	</tr>
		 </c:forEach>
	</table>
	
	
<%-- 	<c:forEach var="item" items="${featuredProducts}"> --%>
<%-- 		<c:out value="${item.name}"/> &nbsp; <a href="cart/add/${item.id}">Add to cart</a> <br/> --%>
<%-- 	</c:forEach> --%>


<%-- 	<c:forEach var="category" items="${allCategories}"> --%>
<%-- 		<a href="categories/${category.id}"><c:out value="${category.name}"/></a> <br/> --%>
<%-- 	</c:forEach>	 --%>
		
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
