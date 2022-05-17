<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>Home</title>
        
    </head>
    <body background="/wms/resources/images/wh2.jpg">
    
    	<div>
    	
    		<jsp:include page="header.jsp"></jsp:include>
    		<img src="<c:url value="/wms/resources/images/wh2.jpg"/>"/>
    		<div class="row">
    			<div class="col-md-4">
    			
    			</div>
    			<div class="col-md-4">
			    	<form:form action="validateCredentials" method="post" modelAttribute="userDto">
			        	<div class="shadow-lg p-3 mb-5 bg-body rounded">
			        		<div class="form-group">
							      <label for="userName">User Name :</label>
							      <form:input type="text" path="userName" class="form-control input-lg" />
					        			
						    </div>
			        		<div class="form-group">
							      <label for="password">Password :</label>
							      <form:input type="text" path="password" class="form-control input-lg"/>
						    </div>
			        		
			        		
				        	<div class="form-group">
				        		
				        		<input type="submit" class="btn btn-primary" value="Submit"/>
				        	</div>
			        	</div>
			        </form:form>
    			</div>
    			<div class="col-md-4">
    			
    			</div>
    		</div>
    		<br/><br/>
    		
    	</div>
    	
    </body>
</html>
