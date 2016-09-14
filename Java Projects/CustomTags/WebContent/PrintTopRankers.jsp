<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
</head>
<body>
<table>
<c:forEach items = "${requestScope.rankList}" var = "student">

<tr>
<td><c:out value = "${student.id}"></c:out>
<td><c:out value = "${student.name}"></c:out>
<td><c:out value = "${student.mark}"></c:out>

<td>
<c:choose>
  <c:when test = "${student.mark>80}">
  <c:out value = "Distinction"></c:out>
</c:when>
  <c:otherwise>
    <c:out value = "Grade A"></c:out>
  </c:otherwise>
</c:choose>
</c:forEach>
</td>
</tr>
</table>
</body>
</html>