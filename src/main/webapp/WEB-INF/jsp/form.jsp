<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
 <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
 
 
<html>
<head>
<meta name="viewport" content="width=devise-width, initial-scale=1.0">
<link rel="stylesheet" href="/webjars/bootstrap/3.3.5/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="padding: 50px">
		<h1>Customer creation</h1>
		<form:form method="POST"
		           action="/"
		           modelAttribute="Customer">
		<div class="form-group">
			<label>Name</label> 
			<form:input class="form-control" type="text" placeholder="Enter name" path="name"/>
			<form:errors path="name" cssClass="text-danger"></form:errors>
			
		</div>
		<div class="form-group">
			<label>Address</label> 
			<form:input class="form-control" type="text" placeholder="Enter address" path="address"/>
			<form:errors path="address" cssClass="text-danger"></form:errors>
		</div>
		<div class="form-group">
			<label>Customer type</label>
			<form:select class="form-control" path="customerType">
			    <c:forEach items="${CustTypes}" var="type">
			       <option value="${type.id}">${type.id} - ${type.description}</option>
			    </c:forEach>
		    </form:select>
		</div>
		<button type="submit" class="btn btn-primary">Create</button>
		</form:form>
	</div>
</body>
</html>