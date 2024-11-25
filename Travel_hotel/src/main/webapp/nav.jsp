<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
.mainContainer{
	/*background-color: red;*/
	display: flex;
}
.leftContainer{
	background-color: black;
	width: 30%;
	color:white;
}
.rightContainer{
	background-color: black;
	width:70%;
	color: white;
	display: flex;
	
}
.rightContainer a{
	color: white;
	text-decoration: none;
	margin: 20px auto;
	justify-content: space-evenly;
}</style>
</head>
<body>
<div class="mainContainer">
	
	<div class="leftContainer">
		<h2>Travel Hub</h2>
	</div>
	<div class="rightContainer">
		<a href="Findtour.jsp">FIND TOUR</a>
		<a href="Booking.jsp">BOOKING</a> 
		<a href="BookingDetails.jsp">BOOKING DETAILS</a>
		<a href="AdminNav.jsp">Business</a>
	</div>
</div>
</body>
</html>
<jsp:include page="footer.jsp"></jsp:include>