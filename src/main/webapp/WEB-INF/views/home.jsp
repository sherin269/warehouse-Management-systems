<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
 

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
    
 
 			<table align="center">
 			
 				<tr>
 					<td>
 						    <div  style="width: 8rem; cursor: pointer;" onclick="navigate('getItemList')">
							  	<img src="/wms/resources/images/bt1.jpg" width="140" height="140" />
							 	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Items
							</div>
 					</td>
 					<td>
 						    <div  style="width: 8rem; cursor: pointer;" onclick="navigate('getLocations')">
							  	<img src="/wms/resources/images/bt1.jpg" width="140" height="140" />
							 	&nbsp;&nbsp;&nbsp;&nbsp;Locations
							</div>
 					</td>
 					<td>
 							<div  style="width: 8rem; cursor: pointer;" onclick="navigate('receiving')">
							  	<img src="/wms/resources/images/bt1.jpg" width="140" height="140" />
							 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Receiving
							</div>
 					</td>
 					<td>
 							<div  style="width: 8rem; cursor: pointer;" onclick="navigate('putaway')">
							  	<img src="/wms/resources/images/bt1.jpg" width="140" height="140" />
							 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Putaway
							</div>
 					</td>
 					 			 					<td>
 							<div  style="width: 8rem; cursor: pointer;" onclick="navigate('getInventories')">
							  	<img src="/wms/resources/images/bt1.jpg" width="140" height="140" />
							 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Inventory
							</div>
 					</td>
 					<td>
 							<div  style="width: 8rem; cursor: pointer;" onclick="navigate('getTasks')">
							  	<img src="/wms/resources/images/bt1.jpg" width="140" height="140" />
							 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Tasks
							</div>
 					</td>
 					<td>
 							<div  style="width: 8rem; cursor: pointer;" onclick="navigate('pickpack')">
							  	<img src="/wms/resources/images/bt1.jpg" width="140" height="140" />
							 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Pick Pack
							</div>
 					</td>
 				</tr>
 			</table>
    	</body>
    </html>
    -