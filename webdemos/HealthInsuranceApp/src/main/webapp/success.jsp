<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="com.vfislk.model.Plan"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <%   Plan plan=(Plan) request.getAttribute("plan"); %>
PlanName :<%= plan.getPlanName() %> <br>
Category :<%= plan.getCategory()  %><br>
Brand :<%=  plan.getBrand()  %><br>
SumInsured :<%= plan.getSumInsured() %><br>
Coverage :<%=  plan.getCoverage()  %><br> --%>

<h1>Using expression language</h1>
PlanName ${plan.planName} <br>
coverage ${plan.coverage} <br>
category ${plan.category} <br>
brand ${plan.brand} <br>
sumInsured ${plan.sumInsured} <br>
</body>
</html>