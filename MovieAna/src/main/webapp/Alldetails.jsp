<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
  
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
		<tr>
			<th>Movie Id</th>
			<th>Movie Name</th>
			<th>Movie Cost</th>

		</tr>
		
		<c:forEach var="movie" items="movies">
			<tr>
			<td>	input status:<%=request.getAttribute("movies") %></td>
			 
		

			</tr>

		</c:forEach>

	</table>
</body>
</html>