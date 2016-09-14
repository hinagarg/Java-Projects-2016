<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href = "FormSelector.css" rel = "stylesheet" type = "text/css">
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<title>Insert title here</title>
</head>
<body>
<header id = "header">
<ul>
<li><a href = "Booking.jsp">Book Cab</a></li>
<li><a href = "#">My Trips</a></li>
<li><a href = "ReadCard.jsp">Read Card</a></li>
<li><a href = "ErrorPage.jsp">Logout</a></li>
<li><a href = "#">Customer Care</a></li>
</ul>
</header>
<table>
<tr>
<td><b>Cab Number</b></td>
<td><b>Cab Type</b></td>
<td><b>Driver Name</b></td>
<td><b>Current Location</b></td>
<td><b>Book</b></td>
</tr>
<c:forEach items = "${cab}" var = "item">
<tr>

<td><c:out value = "${item.cabNumber}" /></td>

<td><c:out value = "${item.cabType}" /></td>

<td><c:out value = "${item.driverName}" /></td>

<td><c:out value = "${item.location}" /></td>

<td><a href = "CabBooked.jsp">Book</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>