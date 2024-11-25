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
<div style="width:30%; margin:100px auto;">
	<form action="TourServe" method="post" >
		<h2>FIND THE TOUR</h2>
		<div class="col-auto">
		<input type="text" class="form-control" placeholder="ENTER TOUR NAME" name="tname">		
		<input type="submit" class="btn btn-outline-dark" value="SEARCH">
		</div>
	</form>
	<div class="d-grid gap-2 justify-content-md-end d-md-flex ">
	<form action="TourList.jsp">
	<button type="submit" class="btn btn-info">See all</button>
	</form>
	</div>
</div>
</body>
</html>