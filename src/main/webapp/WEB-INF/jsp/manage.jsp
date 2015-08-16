<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

  <head>
    <link href="resources/css/shift.css" rel="stylesheet">
    <link rel="stylesheet" href="resources/css/bootstrap.css">
    <link rel="stylesheet" href="resources/css/main.css">
    <jsp:include page="/WEB-INF/jsp/menu.jsp" />
    
  </head>

  <body>
    
   
    <div class="container">
    	<img src="resources/img/admin.jpg" width="100%"></img>
    </div>
    
    <div class="neighborhood-guides">
    <div class="container">
        <h4>Management tab</h4>
      <div class="nav">
      	<div class="container">
        	<ul class="pull-left">
        		<li><a href="products?manage">Product Management</a></li>
        	</ul>
        	
        	<ul class="pull-right">
        		<li><a href="users?manage">User Management</a></li>
        	</ul>
        	 <ul class="pull-left">
        	    <li><a href="categories?manage">Category Management</a></li>
        	  </ul>
      	</div>
    </div>

   </div>
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
