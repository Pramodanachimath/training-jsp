<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% application.setAttribute("username", "Joe"); %>
<% pageContext.setAttribute("username", "Root"); %>
<% request.setAttribute("username", "Pam"); %>
<% session.setAttribute("username", "Ram"); %>


<% session.setAttribute("message", "Have a great day"); %>
<% application.setAttribute("newmessage", "backend training is completed"); %>



${username}
${requestScope.username}
${sessionScope.username}
${message}
${newmessage}
${applicationScope.username}
</body>
</html>