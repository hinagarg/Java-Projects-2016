<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href = "FormSelector.css" rel = "stylesheet" type = "text/css">
<title>Insert title here</title>
</head>
<body>
<header id = "header">
<ul>
<li><a href = "#">Home</a></li>
<li><a href = "#">About Us</a></li>
<li><a href = "#">Our Prices</a></li>
<li><a href = "#">Image Gallery</a></li>
<li><a href = "#">Contact</a></li>
</ul>
</header>

<nav id = "nav">
<div id = "#new-user">
<form action = "ValidateUserServlet">
<fieldset>
<label>Email</label>
<input type = "email" name = "email" id = "email"><br>
</fieldset>
<fieldset>
<label>Password</label>
<input type = "password" name = "password" id = "password"><br>
</fieldset>
<fieldset>
<label>City</label>
<select name = "city" id = "city">
  <option value="Chicago">Chicago</option>
  <option value="Mumbai">Mumbai</option>
  <option value="Delhi">Delhi</option>
  <option value="Noida">Noida</option>
</select><br>
<input type = "submit" value = "Login">
</fieldset>
</form>
</div>
<a href = "NewUser.jsp">New User</a>
</nav>
<div id = "page-content">
<article id = "article">
<p>
<b>Welcome to Ramesh Taxi Company.</b><br><br>
<b>Taxicabs arrived in 1911 to complement horse wagons.</b><br><br>
<b>The black and yellow Fiat taxis in Mumbai, are integral part of the city's heritage and have been depicted in numerous Bollywood movies. </b><br><br>
<b>These metered taxis ply throughout Mumbai and have monopoly from Bandra to Churchgate on the Western line and Sion to Chatrapati Shivaji Terminus on the Central line. </b><br><br>
<b>Beyond Sion and Bandra auto rickshaws are not allowed and one has to hire a taxi. </b><br><br>
<b>However, between Sion to Thane and Bandra to Bhayandar, Taxis and autorickshaws ply. </b><br><br>
<b>A mechanical meter decides the fare and is proportional to the distance traveled.</b><br><br>
</p>
</article>
</div>
</body>
</html>