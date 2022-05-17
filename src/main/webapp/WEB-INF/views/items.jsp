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
    			<div class="col-md-3">
    			
    			</div>
    			<div class="col-md-6 shadow-lg p-5 bg-light">
			    	<form:form action="saveItem" method="post" modelAttribute="newItem">
			        	<form:hidden path="itemId"/>
			        		<div class="form-group">
							      <label for="usr">Item Name :</label>
							      <form:input type="text" path="itemName" class="form-control input-lg" />
					        			<form:errors path="itemName"></form:errors>
						    </div>
			        		<div class="form-group">
							      <label for="usr">Item Description :</label>
							      <td><form:input type="text" path="itemDescription" class="form-control input-lg"/>
						    </div>
			        		<div class="form-group">
							      <label for="usr">Item Category :</label>
							      <form:input type="text" path="itemCategory" class="form-control input-lg"/>
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
    			
    			<div class="col-12">
    			<table class="table">
		        	<thead class="thead-light">
		        		<tr>
		        			<th scope="col">Item Id</th>
		        			<th scope="col">Item Name</th>
		        			<th scope="col">Item Description</th>
		        			<th scope="col">Item Category</th>
		        			<th scope="col">Actions</th>
		        		</tr>
		        	</thead>
	        		<tbody>
		        		<c:forEach var="item" items="${itemList}">
		 					<tr>
		 						<td>${item.itemId }</td>
		 						<td>${item.itemName }</td>
		 						<td>${item.itemDescription}</td>
		 						<td>${item.itemCategory }</td>
		 						<td><a href="getItemList?itemId=${item.itemId }">Edit</a>
		 						<a href="deleteItem?itemId=${item.itemId }">Delete</a></td>
		 					</tr>
						</c:forEach>
	        		</tbody>
        		</table>
    			</div>
    			
    		</div>	
    	
    	
    </body>
</html>
