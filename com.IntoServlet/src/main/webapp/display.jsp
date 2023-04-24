<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="orange"> 
<h1>Jsp page java server page</h1>

<% System.out.println("hello"); %>

<%= out.println(session.getAttribute("id")); %><br>
${id}<br>
<%=session.getAttribute("name") %><br>
${name}<br>
<%=session.getAttribute("email") %><br>
${email}<br>

<%
	List<Integer>list=(List<Integer>)session.getAttribute("list");
	int count=1;
	for(Integer i:list)
	{
		out.println("The "+count+" position data is = "+ i);
		%>
		<br>
		<%
		count++;
	}
%>

<% System.out.println(a);
int temp=25;
System.out.println(list);
%>
<h1><%="QWERTY"%></h1>
<%! int a=10;  %>
<%! static List<Integer>list=new ArrayList<>(); %>
</body>
</html>