<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>


<!DOCTYPE html>
<html>

  <head>
    <link href="assets/css/shift.css" rel="stylesheet">
    
    <link rel="stylesheet" href="assets/css/bootstrap.css">
    <link rel="stylesheet" href="assets/css/main.css">
    
  </head>

  <body>
    <div class="nav">
      <div class="container">
        <ul class="pull-left">
          <li><a href="home.html">Home</a></li>
          <li><a href="#">Browse</a></li>
        </ul>
        <ul class="pull-right">
          <li><a href="#">Sign Up</a></li>
          <li><a href="#">Log In</a></li>
          <li><a href="cam.html">Webcams</a></li>
        </ul>
      </div>
    </div>
 
    
    
    <div class="neighborhood-guides">
	    <div class="container">
	        <h2>Webcam</h2>
	        <p>The view from our desks looks out across Dublin Bay towards the capital city - its so incredible, we had to set up a live webcam to share it with you! The image will automatically refresh every few seconds:</p>
   		</div>
    </div>
       
     <div id="iframe-wrapper">  
    <iframe src="http://camworxlive.com/camera/63644/video/770?wmode=transparent" width="770" height="600" scrolling="no" frameborder="0" style="margin-top:0px;padding-top:0px;"></iframe>
	</div> 
  
            
            
 

    <div class="learn-more">
	  <div class="container">
		<div class="row">
		
	      <div class="col-md-4">
			<h3>Housing</h3>
			<p>From apartments and rooms to treehouses and boats: stay in unique spaces of Ireland.</p>
			<p><a href="rent.html">See how easy is to rent with Failte Ireland</a></p>
	      </div>
	      
		  <div class="col-md-4">
			<h3>Tours</h3>
			<p>To find your ideal holiday, browse our comprehensive selection of guided coach tours to Ireland that vary in length from 5 - 15 days.</p>
			<p><a href="#">Learn more about tours</a></p>
		  </div>
		  
		  <div class="col-md-4">
			<h3>Trust and Safety</h3>
			<p>From Verified ID to our worldwide customer support team, we've got your back.</p>
			<p><a href="trust.html">Learn about trust</a></p>
		  </div>
	    </div>
	  </div>
	</div>
  </body>
</html>
