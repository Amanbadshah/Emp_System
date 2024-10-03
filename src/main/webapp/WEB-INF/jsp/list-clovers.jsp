<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
	<div>
		<a type="button" class="btn btn-primary btn-md" href="/add-clover">Add
			Employee</a>
	</div>
	<br>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<h3>List of Clover</h3>
		</div>
		<div class="panel-body">
			<table class="table table-striped">
				<thead>
					<tr>

						<th width="20%">Id</th>
						<!-- <th width="20%">Name</th> -->
						<th width="20%">Username</th>
						<th width="10%">Address1</th>
						<th width="10%">Hobbies</th>
						<th width="10%">City</th>
						<th width="10%">State</th>
						<th width="10%">Pin</th>
						<th width="20%">PanNumber</th>
						<th width="20%">BirthDate</th>
						<th width="20%"></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${clovers}" var="clover">
						<tr>
							<td>${clover.id}</td>
							<%-- <td>${clover.name}</td> --%>
							<td>${clover.username}</td>
							<td>${clover.address1}</td>
							<td>${clover.hobbies}</td>
							<td>${clover.city}</td>
							<td>${clover.state}</td>
							<td>${clover.pin}</td>
							<td>${clover.pannumber}</td>
							<td>${clover.birthdate}</td>



							 <td><a type="button" class="btn btn-success"
								href="/update-clover?id=${clover.id}">Update</a> <a
								type="button" class="btn btn-warning"
								
								href="/delete-clover?id=${clover.id}">Delete</a> <a
								type="button" class="btn btn-success"
								
								href="/view?id=${clover.id}"><i class="fa fa-eye"></i>View</a></td>
								
								
					</c:forEach>

				</tbody>
			</table>
		</div>
	</div>
</div>

<%@ include file="common/footer.jspf"%>
