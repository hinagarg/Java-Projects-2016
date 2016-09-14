<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL Example</title>
<%@ taglib uri="http://sapient.com/training/example" prefix = "mt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
</head>
<body>
<mt:greet/>
<c:set value="Happy Diwali" var = "message" scope = "page"></c:set>
<mt:greet message = "${message}" />

<p style = "font-family: Arial"><c:out value = "${message}"></c:out></p>

<c:url value = "PrintRankers" var = "link" />

<a href = "${link}">Using JSTL</a>
</body>
</html>