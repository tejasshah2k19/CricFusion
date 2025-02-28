<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>League Details Form</title>
<style>
body {
	font-family: Arial, sans-serif;
	margin: 20px;
}

form {
	max-width: 600px;
	margin: auto;
	padding: 20px;
	border: 1px solid #ccc;
	border-radius: 10px;
	box-shadow: 2px 2px 12px rgba(0, 0, 0, 0.1);
}

label {
	display: block;
	margin-bottom: 8px;
	font-weight: bold;
}

input, select, button {
	width: 100%;
	padding: 10px;
	margin-bottom: 15px;
	border: 1px solid #ccc;
	border-radius: 5px;
	box-sizing: border-box;
}
</style>
</head>
<body>
	<h1>League Details Form</h1>
	<form action="saveleague" method="post" enctype="multipart/form-data">

		<label for="leagueTitle">League Title:</label> <input type="text"
			id="leagueTitle" name="leaugeTitle" required /> <label
			for="location">Location:</label> <input type="text" id="location"
			name="location" required /> 
			

		<label
			for="location">State:</label>
			<select name="stateId">
				<option>Select State</option>
				<c:forEach items="${allState}" var="s">
					<option value="${s.stateId}">${s.stateName}</option>
				</c:forEach>
				
				
				
			</select>			
			
			<label for="overs">Overs:</label> <input
			type="number" id="overs" name="overs" required min="1" /> <label
			for="maxParticipantTeam">Max Participant Team:</label> <input
			type="number" id="maxParticipantTeam" name="maxParticipantTeam"
			required min="1" /> <label for="startDate">Start Date:</label> <input
			type="date" id="startDate" name="startDate" required /> <label
			for="endDate">End Date:</label> <input type="date" id="endDate"
			name="endDate" required /> <label for="logoPath">League
			Logo:</label> <input type="file" id="logoPath" name="logo"
			accept="image/*" /> <label for="ballType">Ball Type:</label> <select
			id="ballType" name="ballType" required>
			<option value="Tennis">Tennis</option>
			<option value="Leather">Leather</option>
			<option value="Rubber">Rubber</option>
			<option value="Plastic">Plastic</option>
		</select> <label for="active">Allow Team to Join:</label> <input
			type="checkbox" id="active" name="active" />

		<button type="submit">Submit</button>
	</form>
</body>
</html>
