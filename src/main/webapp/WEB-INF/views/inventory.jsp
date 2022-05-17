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
    
    	
    	
    		<jsp:include page="header.jsp"></jsp:include>
    	
    		
    		<div class="shadow-lg p-5 bg-light">
    			
    			<div class="col-11">
    			<h2 align="center">Inventory</h2>
    			<table class="table">
		        	<thead class="thead-light">
		        		<tr>
		        			<th scope="col">Item Name</th>
		        			<th scope="col">Location Barcode</th>
		        			<th scope="col">On Hand Qty</th>
		        			<th scope="col">Allocated Qty</th>
		        			<th scope="col">Available Qty</th>
		        		</tr>
		        	</thead>
	        		<tbody>
		        		<c:forEach var="item" items="${inventoryList}">
		 					<tr>
		 						<td>${item.itemName }</td>
		 						<td>${item.locationBarcode }</td>
		 						<td>${item.onHandQty}</td>
		 						<td>${item.allocatedQty}</td>
		 						<td>${item.onHandQty-item.allocatedQty}</td>
		 						
		 					</tr>
						</c:forEach>
	        	</tbody>
        	</table>
    			</div>
    			
    		</div>	
    	
    	
    </body>
</html>
