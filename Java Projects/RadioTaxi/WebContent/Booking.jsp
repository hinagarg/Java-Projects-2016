<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href = "FormSelector.css" rel = "stylesheet" type = "text/css">
<title>Book Cabs</title>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
</head>
<body>
<%if(!session.isNew()  && session.getAttribute("isUserLoggedIn") != null){ %>
<% String error = (String) session.getAttribute("Error"); %>
<h4 style = "float:right">You are currently logged in as: <c:out value = "${name}" />!</h4>
<header id = "header">
<ul>
<li><a href = "#">Book Cab</a></li>
<li><a href = "#">My Trips</a></li>
<li><a href = "ReadCard.jsp">Read Card</a></li>
<li><a href = "ErrorPage.jsp">Logout</a></li>
<li><a href = "#">Customer Care</a></li>
</ul>
</header>

<article>
<form action = "BookCabServlet">
<table>
<tr>
<td>Name</td>
<td><input type = text name = "name" id = "name" value = <c:out value = "${name}" />></td>
</tr>

<tr>
<td>Telephone</td>
<td><input type = text name = "telephone" id = "telephone" value = <c:out value = "${telephone}" />></td>
</tr>


<tr>
<td>Booking Type</td>
<td><select name = "meter" id = "meter">
  <option value="Meter">Meter</option>
  <option value="Test">test</option>
</select><br></td>
</tr>


<tr>
<td>PickUp Place</td>

<td><select name = "pickUpLocation">
  <option value="Sector-24">Sector-24</option>
</select>
</tr>


<tr>
<td>Drop Place</td>

<td>
<select name = "dropLocation" >
 <option value="Sector-20">Sector-20</option>
 </select>
</td>
</tr>


<tr>
<td><input type = "submit" value = "BookNow"></td>
<td><input type = "submit" value = "BookLater"></td>
</tr>

</table>

</form>
</article>

<%} else { 

out.println("You are not logged in, try again");
out.println("<a href = 'index.jsp'>Login</a>");    
} %>

</body>
</html>