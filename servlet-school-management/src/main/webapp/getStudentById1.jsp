<%@page import="com.jsp.dto.Teacher"%>
<%@page import="com.jsp.service.TeacherService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="getStudentById1" method="post">
Enter Id : <input type="number" name="id" placeholder="Enter the Students ID" > <br> <br>
<input type="submit"> 
<% TeacherService teacherService= new TeacherService(); %>
<% Teacher teacher= new Teacher();%>
<%  %>
</form>

</body>
</html>