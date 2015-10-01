<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link href="resources/css/shift.css" rel="stylesheet">   
    <link rel="stylesheet" href="resources/css/bootstrap.css">
    <link rel="stylesheet" href="resources/css/main.css">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<jsp:include page="/WEB-INF/jsp/head-include.jsp" />
	<jsp:include page="/WEB-INF/jsp/menu.jsp" />
	<title>Upload CSV</title>
</head>
<body>
	

<div class="neighborhood-guides">
	    <div class="container">
	    <h2>Upload CSV file</h2>
	    </div>
 </div>
  <div class="container">
	<form:form class="form-group form" name="input" method="post" action="" modelAttribute="csv">
	File: <input type="text" name="csvFile" /><br/>

	<input type="submit" value="Submit">
	</form:form>
	</div>

</body>
</html>