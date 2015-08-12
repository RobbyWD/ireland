<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>

  <head>
    <link href="http://s3.amazonaws.com/codecademy-content/courses/ltp/css/shift.css" rel="stylesheet">
    
    <link rel="stylesheet" href="http://s3.amazonaws.com/codecademy-content/courses/ltp/css/bootstrap.css">
    <link rel="stylesheet" href="assets/css/main.css">
    
  </head>

  <body>
    <div class="nav">
      <div class="container">
        <ul class="pull-left">
          <li><a href="#">Name</a></li>
          <li><a href="#">Browse</a></li>
        </ul>
        <ul class="pull-right">
          <li><a href="#">Sign Up</a></li>
          <li><a href="#">Log In</a></li>
          <li><a href="#">Help</a></li>
        </ul>
      </div>
    </div>

    <div class="jumbotron">
      <div class="container">
        <h1>Failte Ireland</h1>
        <p>The roots of tourism in Ireland run deep, back to the beginning of the 20th century...</p>
        <a href="#">Learn More</a>
      </div>
    </div> 
    
    
    <div class="neighborhood-guides">
    <div class="container">
        <h2>Neighborhood Guides</h2>
        <p>Not sure where to stay? We've created neighborhood guides for cities all around the world.</p>
        <div class="row">
            <div class="col-md-4">
            
                <div class="thumbnail">
                <img src="http://images.nationalgeographic.com/wpf/media-live/photos/000/750/overrides/knowth-boyne-valley-ireland_75020_600x450.jpg">
                </div>
                
                <div class="thumbnail">
                <img src="http://images.nationalgeographic.com/wpf/media-live/photos/000/750/overrides/ring-fort-inishmurray-ireland_75023_600x450.jpg">
                </div>
            </div>
            
            <div class="col-md-4">
                <div class="thumbnail">
                <img src="http://images.nationalgeographic.com/wpf/media-live/photos/000/662/overrides/skelli-islands-ireland_66213_600x450.jpg">
                </div>
                
                <div class="thumbnail">
                <img src="http://images.nationalgeographic.com/wpf/media-live/photos/000/750/overrides/dunlace-castle-ireland_75017_600x450.jpg">
                </div>
            
            </div>
            
            <div class="col-md-4">
                <div class="thumbnail">
                <img src="http://images.nationalgeographic.com/wpf/media-live/photos/000/750/overrides/city-wall-derry-ireland_75016_600x450.jpg">
                </div>
            </div>
        </div>
    </div> 
    </div> 

    <div class="learn-more">
	  <div class="container">
		<div class="row">
		
	      <div class="col-md-4">
			<h3>Travel</h3>
			<p>From apartments and rooms to treehouses and boats: stay in unique spaces in 192 countries.</p>
			<p><a href="#">See how to travel on Airbnb</a></p>
	      </div>
	      
		  <div class="col-md-4">
			<h3>Host</h3>
			<p>Renting out your unused space could pay your bills or fund your next vacation.</p>
			<p><a href="#">Learn more about hosting</a></p>
		  </div>
		  
		  <div class="col-md-4">
			<h3>Trust and Safety</h3>
			<p>From Verified ID to our worldwide customer support team, we've got your back.</p>
			<p><a href="#">Learn about trust at Airbnb</a></p>
		  </div>
	    </div>
	  </div>
	</div>
  </body>
</html>