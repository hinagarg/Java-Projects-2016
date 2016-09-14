<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<%@ taglib uri = "http://www.springframework.org/tags/form" prefix= "form" %>
<title>Add Food Items</title>
</head>
<body>
<form:form action = "#" method = "post">

<label>Food Item Code</label>
<form:input path = "foodCode" /><span style = "color:red;">
<form:errors path = "foodCode"></form:errors></span>
<label>Decription</label>
<form:input path = "description" /><span style = "color:red;">
<form:errors path = "description"></form:errors></span>
<label>Unit Price</label>
<form:input path = "unitPrice" />
<label>Cuisine</label>
<form:select items="${refData}" path = "cuisine"></form:select>
<input type = "submit" value = "Add" />
</form:form>
</body>
</html>