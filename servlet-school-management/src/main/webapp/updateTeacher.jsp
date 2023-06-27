<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter the Data to be updated</h1>
<form action="updateTeacher" method="post">
Enter id : <input type="number" name="id" placeholder="enter id"> <br> <br>
Name :<input type="text" name="teacher_name" placeholder="Enter the  name"><br> <br>
Email :<input type="email" name="teacher_email" placeholder="Enter the  email"><br> <br>
Password :<input type="password" name="password" placeholder="Enter the  password"><br> <br>
<input type="submit" placeholder="click here to update">
</body>
</html>