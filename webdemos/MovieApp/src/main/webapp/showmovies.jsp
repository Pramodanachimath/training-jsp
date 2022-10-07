<!DOCTYPE html>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" %>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>HI ${username}</h1> 
<%= session.getId() %>

<%
List<String> movies=(List)request.getAttribute("movies");
out.print(movies);
%>
</body>  
</html>    