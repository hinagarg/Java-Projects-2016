<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix= "form" %>
<title>Add Project</title>
</head>
<body>
<form:form action = "#" method = "post">

<label>Donor Name</label>
<form:input path = "donorName" />
<label>Email</label>
<form:input path = "email" />
<label>Address</label>
<form:input path = "address" />
<label>Hand Phone</label>
<ul>  
<form:select path="handPhone" items="${phonesMap}">  
</form:select></ul> 
<input type = "submit" value = "Add" />
</form:form>
</body>
</html>