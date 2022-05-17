<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        
        <title>Home</title>
    </head>
    <body>
    
    	<div>
    	
    		<jsp:include page="header.jsp"></jsp:include>
    	
    		<div class="row">
    			<div class="col-md-4">
    			
    			</div>
    			<div class="col-md-4">
			    	<form:form action="saveLocation" method="post" modelAttribute="newLocation">
			        	<form:hidden path="locationId"/>
			        		<div class="form-group">
							      <label for="usr">Location Name :</label>
							      <form:input type="text" path="name" class="form-control input-lg" />
					        			<form:errors path="name"></form:errors>
						    </div>
			        		<div class="form-group">
							      <label for="usr">Barcode :</label>
							      <td><form:input type="text" path="barcode" class="form-control input-lg"/>
						    </div>
			        		<div class="form-group">
							      <label for="usr">MaxUnits :</label>
							      <form:input type="text" path="maxUnits" class="form-control input-lg"/>
						    </div>
			        		
				        	<div class="form-group">
				        		
				        		<input type="submit" class="btn btn-primary" value="Submit"/>
				        	</div>
			        	
			        </form:form>
    			</div>
    			<div class="col-md-4">
    			
    			</div>
    		</div>
    		<br/><br/>
    		<div class="row">
    			<div class="col-1"></div>
    			<div class="col-10">
    			<table class="table">
		        	<thead class="thead-light">
		        		<tr>
		        			<th scope="col">Location Id</th>
		        			<th scope="col">Location Name</th>
		        			<th scope="col">Barcode</th>
		        			<th scope="col">MaxUnits</th>
		        			<th scope="col">Actions</th>
		        			
		        		</tr>
		        	</thead>
	        		<tbody>
		        		
		        		<c:forEach var="location" items="${locationList}">
		 					<tr>
		 						<td>${location.locationId }</td>
		 						<td>${location.name }</td>
		 						<td>${location.barcode}</td>
		 						<td>${location.maxUnits }</td>
		 						<td><a href="getLocations?locationId=${location.locationId }">Edit</a>
		 						<a href="deleteLocation?locationId=${location.locationId }">Delete</a></td>
		 					</tr>
						</c:forEach>
	        	</tbody>
        	</table>
    			</div>
    			<div class="col-1">
    			
    			</div>
    		</div>	
    	</div>
    	
    </body>
</html>
