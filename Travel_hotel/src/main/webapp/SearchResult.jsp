<%@page import="java.sql.ResultSet"%>
<%@page import="master.dao.Tourdao"%>
<%@page import="master.dto.Tourdto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:include page="Findtour.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div>
<table class="table-hover">
	<thead class="table-dark">
	<tr>
	<td>BOOKING ID</td>
	<td>TOUR NAME</td>
	<td>TOUR PRICE</td>
	</tr>
	</thead>
	<%
	Tourdto tdto=new Tourdto();
	Tourdao tdao=new Tourdao();
	ResultSet rs=tdao.searchData(tdto);
	while(rs.next())
	{%>
	<tbody>
	<tr>
	<td><%=rs.getString(1) %></td>
	<td><%=rs.getString(2) %></td>
	<td><%=rs.getString(3)  %></td>
	</tr>
	</tbody>
	<%
	}
	%>
</table>
</div>
</body>
</html>