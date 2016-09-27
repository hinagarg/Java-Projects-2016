<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../resources/css/styles.css">
<title>Philanthropy Projects</title>
</head>
<body>
<h1 style = "text-align:center;">Philanthropy Projects</h1>

<section>

<h1>Project Added</h1>
<table>
  <tr>
    <th>Project Id</th>
    <th>Project Name</th>
    <th>Project Budget</th>
    <th>Project Collected</th>
  </tr>
  <tr>
    <td>${projectAdded.projectId}</td>
    <td>${projectAdded.projectBudget}</td>
    <td>${projectAdded.projectName}</td>
    <td>${projectAdded.amountCollected}</td>
  </tr>

</table>
</section>
</body>
</html>