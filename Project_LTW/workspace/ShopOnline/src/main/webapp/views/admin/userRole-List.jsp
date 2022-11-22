<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">

<title>User Roles</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-12">
				<a href="<c:url value="/addRole" />"> <button class="btn-primary">Add Role</button>	</a> 
			</div>
		</div>
		
		
		<div class="row">
			<div class="col-sm-12">
				<table class="table">
					<thead>
						<tr>
							<th scope="col">Role ID</th>
							<th scope="col">Role Name</th>
							<th scope="col">Action </th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="i" items="${roleList}" varStatus="stt">
							<tr>
								<th scope="row">${i.roleId}</th>
								<td>${i.roleName}</td>
								<td>
									<a href="<c:url value="/editRole?id=${i.roleId}"/>">Edit</a> |
									<a href="<c:url value="/deleteRole?id=${i.roleId}"/>">Delete</a>
									
								</td>
								
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>

		</div>

	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
		crossorigin="anonymous"></script>


</body>
</html>