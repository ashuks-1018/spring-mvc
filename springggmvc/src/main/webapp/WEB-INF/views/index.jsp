<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>This is home page</h1>
	<h1>Called by home controller</h1>
	<h1>url /home</h1>

	<%
	String name = (String) request.getAttribute("name");
	Integer year = (Integer) request.getAttribute("year");
	List<String> bros = (List<String>) request.getAttribute("b");
	%>

	<h1>
		Name is :
		<%=name%></h1>

	<h1>
		Year is :
		<%=year%></h1>

	<%
	for (String s : bros) {
		out.println(s);
	}
	%>

</body>
</html>