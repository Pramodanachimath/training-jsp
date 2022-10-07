<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! String name="Ram";%>
<%= "Welcome "+name%>
<%int x=10,y=20;%>
<%="sum "+(x+y)%>
<%= "Have a great day" %>

<%! int count=0 ;%>
you are visitor number<%=count++ %><br>
<%! String greet(){

	return "Welcome back";
}%>
	<%= greet() %>
}
</body>
</html>