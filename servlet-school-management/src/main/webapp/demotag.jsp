<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! String name[]= new String[3];  %>
<% name[0]="abc";  %>
<% name[1]="efg";  %>
<% name[2]="xyz";  %>
<% for(int i=0;i<name.length;i++) { %>
<%=name[i] %>
<%} %>

</body>
</html>