<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(!session.isNew()  && session.getAttribute("isUserLoggedIn") != null){ %>
<article>
<h1>Your Cab is booked successfully!!</h1>
<a href="ErrorPage.jsp">Logout</a>
</article>

<%} else { 

out.println("You are not logged in, try again");
out.println("<a href = 'index.jsp'>Login</a>");    
} %>

</body>
</html>