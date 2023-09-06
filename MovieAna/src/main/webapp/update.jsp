<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="blue">
<div style="width: 400px; height: 360px; background-color: grey; margin: 80px auto">
		
		
	<form action="change" ModelAttribute="movie" style="margin: auto 30px">
	<h3 style="text-align: center;">Update Movie details</h3>
		 <input type="text" placeholder="Enter your Mid" name="id"
			style="width: 300px; height: 40px; margin-top: 20px;"> 
		<input type="text" placeholder="Update your Movie Name" name="name"
			style="width: 300px; height: 40px; margin-top: 20px;">
		 <input type="text" placeholder="update  cost"
			name="cost" style="width: 300px; height: 40px; margin-top: 20px;">
		<input type="submit" value="update"
			style="background-color: black; color: white; width: 100px; height: 30px; border-radius: 7px">

	</form>
	</div>
</body>
</html>