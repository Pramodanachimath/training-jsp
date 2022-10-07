<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  -->
<%

String title=(String) request.getAttribute("mytitle");
out.print("Title is "+title+"<br>");
out.print("category is "+request.getAttribute("Category")+"<br>");
out.print("Author is "+request.getAttribute("Author")+"<br>");
Integer BookId=(Integer)request.getAttribute("BookId");
out.print("BookId is "+BookId+"<br>");
double Price=(Double)request.getAttribute("Price");
out.print("Price is "+Price+"<br>");

%>
</body>
</html>