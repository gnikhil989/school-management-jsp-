<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="delete" method="post">

Student ID : <input type="number" name="studentId"  value="<%= request.getParameter("id")%>"> <br> <br>

<input type="submit">
</body>
</html>