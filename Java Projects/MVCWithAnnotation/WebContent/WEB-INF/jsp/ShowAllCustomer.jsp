<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href = "../webapp/resources/css/styles.css" type = "text/css" rel = "stylesheet">
<script src="../resources/js/test.js"></script>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<title>Insert title here</title>
</head>
<body>
<article>
<table>
<c:forEach items="${customerList}" var="cust">
  <spring:url value="/customer/${cust.customerNumber}" var="url"/>
  <tr>
  <td><a href="${url}" onclick = "details()">${cust.customerNumber}</a></td>
  <td><c:out value="${cust.customerName}"/></td>
  <td><c:out value="${cust.phoneNumber}"/></td>
 </tr>
</c:forEach>
</table>
</article>
</body>
</html>