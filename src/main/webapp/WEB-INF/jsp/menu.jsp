<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>



<div class="nav">
      <div class="container">
        <ul class="pull-left">
          <li><a href="">Home</a></li>
          <li><a href="manage">Management</a></li>
        </ul>
        <ul class="pull-right">
	        <c:choose>
				<c:when test="${empty loggedInUser.name}">
					<li><a href="login">Log In</a></li>
					<li><a href="users?register">Sign Up</a></li>
				</c:when>
				<c:otherwise>
					Hello ${loggedInUser.firstName}! &nbsp;
					<li><a href="cart">My Cart</a></li>
					<li><a href="logout">Log Out</a></li>
				</c:otherwise>
			</c:choose>   
          <li><a href="cam">Webcams</a></li>
        </ul>
      </div>
    </div>
