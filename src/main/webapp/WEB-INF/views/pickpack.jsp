<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Bootstrap Common Alert Messages</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
    
    
    	
    		<jsp:include page="header.jsp"></jsp:include>
    		<c:if test="${newTaskDto.hasErrors}">
				<c:forEach var="item" items="${newTaskDto.errors}">
					<div class="m-4">
						<!-- Error Alert -->
						<div class="alert alert-danger alert-dismissible fade show">
							<strong>Error!</strong> ${item}
							<button type="button" class="btn-close" data-bs-dismiss="alert"></button>
						</div>
					</div>
				</c:forEach>
			</c:if>
			<c:if test="${newTaskDto.hasInformations}">
				<c:forEach var="item" items="${newTaskDto.informations}">
					<div class="m-4">
						<!-- Error Alert -->
						<div class="alert alert-success alert-dismissible fade show">
							<strong>Success!</strong> ${item}
							<button type="button" class="btn-close" data-bs-dismiss="alert"></button>
						</div>
					</div>
				</c:forEach>
			</c:if>
    		
    		<div class="row">
    			<div class="col-md-3">
    			
    			</div>
    			
    			<div class="col-md-6 shadow-lg p-5 bg-light">
			    	<form:form action="packoLPN" method="post" modelAttribute="newTaskDto">
			    		
			        		<div class="form-group">
							      <h2 align="center"><i><label >Pack oLPN</label></i></h2>
							      
					        			
						    </div>
						    <br>
			        		<div class="form-group">
							      <label for="usr">Task ID :</label>
							      <form:input type="text" path="taskId" class="form-control input-lg"  />
					        			
						    </div>
			        		<div class="form-group">
							      <label for="usr">Order Number :</label>
							      <td><form:input type="text" path="orderNumber" class="form-control input-lg" /></td>
						    </div>
			        		<div class="form-group">
							      <label for="usr">Location :</label>
							      <td><form:input type="text" path="locationBarcode" class="form-control input-lg"/></td>
						    </div>
						    <div class="form-group">
							      <label for="usr">Item Name:</label>
							      <td><form:input type="text" path="itemName" class="form-control input-lg" /></td>
						    </div>
						    <div class="form-group">
							      <label for="usr">Quantity :</label>
							      <td><form:input type="text" path="qty" class="form-control input-lg"/></td>
						    </div>
			        		<br>
				        	<div class="form-group">
				        		
				        		<input type="submit" class="btn btn-primary" value="Pack oLPN"/>
				        		<input type="submit" class="btn btn-primary" value="Clear Fields"/>
				        		<input type="submit" class="btn btn-primary" value="Cancel"/>
				        		
				        	</div>
			        	
			        </form:form>
    			</div>
    		
    			<div class="col-md-3">
    			
    			</div>
    		</div>
    		
    		
    	
    </body>
</html>
