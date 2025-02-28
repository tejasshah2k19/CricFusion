<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">

</head>
<body>

	<div class="container-fluid">

		<div class="row">

			<div class="col-md-4"></div>
			<div class="col-md-4">
				<table border="1" class="table table-hover">
					<tr>
						<th>LeaugeTitle</th>
						<th>Location</th>
						<th>MaxParticipantTeam</th>
						<th>State</th>
					</tr>

					<c:forEach items="${allLeauge}" var="l">
						<tr>
							<td>${l.leaugeTitle }</td>
							<td>${l.location }</td>
							<td>${l.maxParticipantTeam }</td>
							<td>${l.stateId }</td>
						</tr>
					</c:forEach>

				</table>

			</div>
			<div class="col-md-4"></div>
		</div>

	</div>


</body>
</html>