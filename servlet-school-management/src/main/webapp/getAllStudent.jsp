<%@page import="com.jsp.service.TeacherService"%>
<%@page import="com.jsp.dto.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.service.StudentService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
TeacherService teacherService = new TeacherService();
	%>
	<%
	List<Student> students = teacherService.getAllStudents();
	%>
	<table  border="2px" >
		<tr>
			<th>S_ID</th>
			<th>S_NAME</th>
			<th>S_EMAIL</th>
			<th>UPDATE</th> 

		</tr>
		<%
		for (Student s : students) {
		%>

		<tr>
			<td><%=s.getId()%></td>
			<td><%=s.getStudent_name()%></td>
			<td><%=s.getStudent_email()%></td>
			<td> <a href="updatestudenttable.jsp?id=<%= s.getId()%>">UPDATE</a></td>

		</tr>
		<%
		}
		%>



	</table>

</body>
</html>