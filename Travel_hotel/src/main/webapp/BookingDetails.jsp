<%@page import="java.sql.ResultSet"%>
<%@page import="master.dao.Bookingdao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:include page="nav.jsp"></jsp:include>
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
		<h2>BOOKING DETAILS</h2>
		<table class="table table-hover">				
	<thead class="table-dark">
	<tr>
	<td>BOOKING ID </td>
	<td>TOUR ID </td>
	<td>TOUR NAME </td>
	<td>TOUR DATE </td>
	<td>TOUR PRICE </td>
	
	</tr>
	</thead>
	<%
	Bookingdao bdao=new Bookingdao();
	ResultSet rs=bdao.getData();
	while(rs.next())
	{%>
	<tbody>
	<tr>
	<td><%=rs.getString(1) %></td>
	<td><%=rs.getString(2) %></td>
	<td><%=rs.getString(5) %></td>
	<td><%=rs.getDate(3) %></td>
	<td><%=rs.getDouble(4)  %></td>	
	</tr>
	</tbody>
	<%
	}
	%>
</table>
</div>
</body>
</html>
