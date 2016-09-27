<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">
<html>
<head>
<style>
table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    text-align: left;
    padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
    background-color: #4CAF50;
    color: white;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href = "css/styles.css" type = "text/css" rel = "stylesheet">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<title>Insert title here</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.3/jquery.min.js"></script>
<script type = "text/javascript">
$(function(){
	
	$('.code').click(function(){  
	var selectedCode = $(this).attr('data-q_id');
	var link= '/PhilanthropyMVC/'+selectedCode;
	var options = {  
	    
	    type: 'GET',
	    url:link,
	    dataType: 'json',
	    error: function (xhr, textStatus, errorThrown) {
	        console.log('error');
	    },
	    success: function (resp, textStatus) {
	    	  
	    	  console.log(resp);
	    	  
	    	  donorData(resp);

	    }
	}
	$.ajax(options);

	});

	});

function donorData(resp){
	
	for(i = 0; i < resp.length; i++){
		console.log(resp[i]['email']);
    for (var j = 0; j < 1; j++) {
       
        var table = document.getElementById("myTable");
        var row = table.insertRow(j);
        var cell1 = row.insertCell(0);
        var cell2 = row.insertCell(1);
        var cell3 = row.insertCell(2);

        cell1.innerHTML = resp[i]['donorName'],
        cell2.innerHTML = resp[i]['handPhone'],
        cell3.innerHTML = resp[i]['email'];
    }
}
}
</script>
</head>
<body>
<article>
<table>
<tr>
<th>Project Name</th>
<th>Project Donors</th>
<th>Project Budget</th>
<th>Amount Collected</th>
</tr>
<c:forEach items="${projectList}" var="proj">
  <spring:url  value="getDonor/${proj.projectId}" var="url"/>
  <tr>
  <td><c:out value="${proj.projectName}"/></td>
  <td><a href = "#" class = "code" data-q_id="getDonor/${proj.projectId}">View Donors</a></td>
  <td><c:out value="${proj.projectBudget}"/></td>
  <td><c:out value="${proj.amountCollected}"/></td>
 </tr>
</c:forEach>
</table>
</article>
<div>
 <table id="myTable" cellpadding="2" cellspacing="2" border="1"></table>
</div>
</body>
</html>