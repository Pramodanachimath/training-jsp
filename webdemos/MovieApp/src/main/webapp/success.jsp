<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

 String name=(String) session.getAttribute("myusername");
out.print("<strong>Welcome "+name+"</strong><br>");
%>
<%= session.getId() %>
<% session.invalidate(); %>
<form action="showmovies">
Select MovieType <select name="type">
<option value="select">--select---</option>
<option  value="comedy">Comedy</option>
<option  value="drama">Drama</option>
<option  value="action">Action</option>
<option  value="love">Love</option>
<option  value="thriller">Thriller</option>
</select> <br>
  <input type="submit" value="add"> 
</form>
</body>
</html>   