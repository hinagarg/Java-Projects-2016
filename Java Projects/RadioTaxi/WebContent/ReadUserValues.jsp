<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" class="com.training.domain.TaxiUser" scope="request"/>

<jsp:setProperty property="*" name="user"/>
<h2>THANKS</h2>

<jsp:getProperty property="email" name="user"/>
<jsp:getProperty property="password" name="user"/>
<jsp:getProperty property="telephone" name="user"/>
<jsp:getProperty property="city" name="user"/>
<jsp:getProperty property="name" name="user"/>

 
<jsp:forward page="AddUserServlet"></jsp:forward>
</body>
</html>