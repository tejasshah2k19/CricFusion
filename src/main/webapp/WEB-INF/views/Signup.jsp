<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Sign Up</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>


	<div class="container mt-5">
		<h2 class="text-center mb-4">Sign Up</h2>


		<form action="saveuser" method="POST">
			<!-- First Name -->
			<div class="mb-3">
				<label for="firstName" class="form-label">First Name</label> <input
					type="text" class="form-control" id="firstName" name="firstName"
					placeholder="Enter your first name" required>
			</div>

			<!-- Last Name -->
			<div class="mb-3">
				<label for="lastName" class="form-label">Last Name</label> <input
					type="text" class="form-control" id="lastName" name="lastName"
					placeholder="Enter your last name" required>
			</div>

			<!-- Gender -->
			<div class="mb-3">
				<label for="gender" class="form-label">Gender</label> <select
					class="form-select" id="gender" name="gender" required>
					<option value="">Select Gender</option>
					<option value="male">Male</option>
					<option value="female">Female</option>
					<option value="other">Other</option>
				</select>
			</div>

			<!-- Born Year -->
			<div class="mb-3">
				<label for="bornYear" class="form-label">Year of Birth</label> <input
					type="number" class="form-control" id="bornYear" name="bornYear"
					placeholder="Enter your birth year" min="1900" max="2025" required>
			</div>

			<!-- Email -->
			<div class="mb-3">
				<label for="email" class="form-label">Email</label> <input
					type="email" class="form-control" id="email" name="email"
					placeholder="Enter your email" required>
			</div>

			<!-- Password -->
			<div class="mb-3">
				<label for="password" class="form-label">Password</label> <input
					type="password" class="form-control" id="password" name="password"
					placeholder="Enter your password" required>
			</div>

			<!-- Contact Number -->
			<div class="mb-3">
				<label for="contactNum" class="form-label">Contact Number</label> <input
					type="text" class="form-control" id="contactNum" name="contactNum"
					placeholder="Enter your contact number" required>
			</div>

			<!-- Submit Button -->
			<div class="d-grid">
				<button type="submit" class="btn btn-primary">Sign Up</button>
			</div>
		</form>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
