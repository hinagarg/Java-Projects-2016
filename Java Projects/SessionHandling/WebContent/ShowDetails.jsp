<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Details</title>
</head>
<body>

<%if(!session.isNew()){ %>
<p> Is New Session</p><%=session.isNew() %>
<p> Session ID</p><%=session.getId() %>

<div style = "float: right;">
<p>Currently Logged in as :</p>${currUser}
</div>

<div>

<form action = "SessionManager">
<input type = "submit" value = "Logout">
</form>

</div>

<%} else { 

out.println("You are not logged in, try again");
out.println("<a href = 'index.html'>Login</a>");    
} %>



</body>
</html>