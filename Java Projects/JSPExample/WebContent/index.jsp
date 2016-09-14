<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file = "Header.html" %>
<datalist id = "numbers">
<option>944335627</option>
<option>97654356</option>
<option>93424365</option>
<option>95678943</option>
</datalist>
<form action = "PaymentHistory" method = "get">
<label>PhoneNumber</label>
<input type = "text" name = "phoneNumber" list = "numbers">
<input type = "submit" value = "Find">
</form>
<jsp:include page = "Footer.jsp"></jsp:include>
</body>
</html>