<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style = "text-align:center;">Spring MVC with Annotations</h1>

<section>
<ul>
<li><a href = "addFood">Add Food</a></li>
<li><a href = "addCustomer">Add Customer</a></li>
<li><a href = "studentDetails">Find Student</a></li>
<li><a href = "login">Login</a></li>
</ul>
</section>

<form action = "addCustomer/findCustomer" method = "post">
<label>CustomerId</label>
<input type = "text" name = "key">
<input type = "submit" value = "Find">
</form>

<a href = "addCustomer/showAll">FindAll</a>

</body>
</html>