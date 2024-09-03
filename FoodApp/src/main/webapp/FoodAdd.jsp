<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:include page="Nav.jsp"></jsp:include>
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
	<form action="FoodAddServe" method="post" >
		<h2> ADD FOOD</h2>
		<input type="text" class="form-control" placeholder="ENTER THE FOOD ID" name="fname">
		<input type="text" class="form-control" placeholder="ENTER THE FOOD NAME" name="fname">
		<input type="text" class="form-control" placeholder="ENTER THE FOOD PRICE" name="fprice">
	
		
		<input type="submit" class="btn btn-outline-dark" value="ADD">
	</form>
</div>
</body>
</html>