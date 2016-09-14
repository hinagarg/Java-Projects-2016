<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="donor" class="com.training.entity.Donor" scope="session"/>

<jsp:setProperty property="*" name="donor"/>
<h2>THANKS BAIII</h2>

<jsp:getProperty property="donorName" name="donor"/>
<jsp:getProperty property="email" name="donor"/>
<jsp:getProperty property="handphone" name="donor"/>

<jsp:forward page = "AddDonorServlet"><jsp:forward>

</body>
</html> 

