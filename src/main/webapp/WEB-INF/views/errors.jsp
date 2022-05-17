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

	<c:if test="${param.hasErrors}">
	Errors
		<c:forEach var="item" items="${param.errors}">
			<div class="m-4">
	 			<!-- Error Alert -->
			    <div class="alert alert-danger alert-dismissible fade show">
			        <strong>Error!</strong> ${item}
			        <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
			    </div>
	 		</div>
		</c:forEach>
	</c:if>
		


</body>
</html>