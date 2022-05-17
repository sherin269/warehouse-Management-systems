<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 		<meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Bootstrap 5 Login Form Example</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
        <style>
			        	.navbar{
			    background-color: rgb(0, 0, 50);
			    color: white;
			    height: auto;
			    width: 100%;
			    padding-left: 60px;
			    padding-right: 60px;
			    display: block;
			}
			header img{
			    float:left
			}
			
			.navbar-nav1{
			    flex-direction: row;
			}
			
			.btn{
			    color: white;
			}
			
			.btn:hover{
			    color: white;
			    border-bottom: 2px solid white;    
			}
			
			.btn1{
			    border: 2px solid white;
			}
			
			.btn1:hover{
			    color:black;
			    background-color: white;
			}
			
			@media screen and (max-width:700px){
			    .navbar .container-fluid{
			       flex-direction: column;
			    }
			}
			@media screen and (max-width:525px){
			    .container-fluid div a{
			        float: none;
			        width: 100%;
			    }
			}
        </style>
</head>
<body>


		<nav class="navbar">
            <div class="container-fluid">
                <div>
                    <a href="home">
                        <img src="/wms/resources/images/home1.jpg" width="50" height="50"> 
                    </a>
                </div>
                <div class="nav navbar-nav1">
                   
                    <a href="/" class="btn">Log Out</a>
                    <a href="#" class="btn btn1"><b><c:out value="${sessionScope.userSession.firstName}"/></b></a>
                </div>
            </div>
        </nav>


</body>
</html>