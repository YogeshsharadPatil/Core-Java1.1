<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Good morning</h1>
	<%
	int no1 = Integer.parseInt(request.getParameter("no1"));
	int no2 = Integer.parseInt(request.getParameter("no2"));
	int sum = no1 + no2;
	%>
	<h2>Sum of <%= no1 %> and <%= no2 %> is <%= sum %></h2>
</body>
</html>