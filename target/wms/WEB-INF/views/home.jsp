<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
    	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    	<script type="text/javascript">
    		function navigate(url) {
    			 window.location.href=url; 
    		}
    	
    	</script>
    
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
    
    <jsp:include page="header.jsp"></jsp:include>
     <img src="shopping.png" >
    <div class="card" style="width: 18rem; cursor: pointer;" onclick="navigate('getItemList')">
	 
	  <div class="card-body">
	    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
	  </div>
	</div>
	
	
        <a href="getItemList" >Get Item List</a>
        
        <jsp:include page="footer.jsp"></jsp:include>
        
    </body>
</html>
