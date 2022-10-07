<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="register">
 Enter Studentname <input type="text" name="studentname"> <br>
 Enter StudentId <input type="text" name="studentid"> <br>
  Enter City <input type="text" name="city"> <br>
Choose Language<select name="language">
<option value="select">--select---</option>
<option value="java">Java</option>
<option value="JSP">JSP</option>
<option value="springs">Springs</option>
<option value="hibernate">Hibernate</option>
</select>   <br>
 Select Hobbies   <br>
  <input type="checkbox" value="music" name="hobby">Music<br>
  <input type="checkbox" value="dance" name="hobby">Dance<br>
  <input type="checkbox" value="sports" name="hobby">Sports<br>
   <input type="checkbox" value="reading" name="hobby">Reading<br>
   
   <input type="submit" value="add"> 
</form>
</body>
</html>