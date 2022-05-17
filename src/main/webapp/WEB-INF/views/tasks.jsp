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
    			<h2 align="center">Tasks</h2>
    			<table class="table">
		        	<thead class="thead-light">
		        		<tr>
		        			<th scope="col">Task ID</th>
		        			<th scope="col">Order Number</th>
		        			<th scope="col">Location Barcode</th>
		        			<th scope="col">Item Name</th>
		        			<th scope="col">Qty</th>
		        			<th scope="col">OLPN Number</th>
		        			<th scope="col">Status</th>
		        		</tr>
		        	</thead>
	        		<tbody>
		        		<c:forEach var="task" items="${tasksList}">
		 					<tr>
		 						<td>${task.taskId }</td>
		 						<td>${task.orderNumber }</td>
		 						<td>${task.locationBarcode}</td>
		 						<td>${task.itemName}</td>
		 						<td>${task.qty}</td>
		 						<td>${task.olpnNumber}</td>
		 						<td>${task.status}</td>
		 						
		 					</tr>
						</c:forEach>
	        	</tbody>
        	</table>
    			</div>
    			
    		</div>	
    	
    	
    </body>
</html>
