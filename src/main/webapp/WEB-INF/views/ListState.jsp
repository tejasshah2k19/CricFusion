<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>
	<h2>List State</h2>

	<table border="1">
		<tr>
			<th>StateId</th>
			<th>StateName</th>
		</tr>
		
		<c:forEach items="${states}" var="s">
			<tr>
				<td>${s.stateId }</td>
				<td>${s.stateName }</td>
			</tr>
		</c:forEach>
	
	</table>

</body>
</html>