<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
	<div class="row">
		<div class="col-md-6 col-md-offset-3 ">
			<div class="panel panel-primary">

				<div class="panel-heading">View Employee</div>
				<div class="panel-body">


					<form:form method="post" modelAttribute="clover">
						<form:hidden path="id" />
						<fieldset class="form-group">
							<form:label path="id">Id</form:label>
							<form:input path="id" type="text" class="form-control"
								required="required" />
							<form:errors path="id" cssClass="text-warning" />
						</fieldset>
							<%-- <form:label path="name">Name</form:label>
							<form:input path="name" type="text" class="form-control"
								required="required" />
							<form:errors path="name" cssClass="text-warning" />
						</fieldset> --%>
						
						<fieldset class="form-group">
							<form:label path="username">Username</form:label>
							<form:input path="username" type="text" class="form-control"
								required="required" />
							<form:errors path="username" cssClass="text-warning" />
						</fieldset>

						<fieldset class="form-group">
							<form:label path="address1">Address1</form:label>
							<form:input path="address1" type="text" class="form-control"
								required="required" />
							<form:errors path="address1" cssClass="text-warning" />
						</fieldset>


						<fieldset class="form-group">
							<form:label path="city">City</form:label>
							<form:input path="city" type="text" class="form-control"
								required="required" />

							<form:errors path="city" cssClass="text-warning" />
						</fieldset>

						<fieldset class="form-group">
							<form:label path="hobbies">Hobbies</form:label>
							<form:input path="hobbies" type="text" class="form-control"
								required="required" />

							<form:errors path="hobbies" cssClass="text-warning" />
						</fieldset>

						<fieldset class="form-group">
							<form:label path="state">State</form:label>
							<form:input path="state" type="text" class="form-control"
								required="required" />
							<form:errors path="state" cssClass="text-warning" />
						</fieldset>

						<fieldset class="form-group">
							<form:label path="pannumber">PanNumber</form:label>
							<form:input path="pannumber" type="text" class="form-control"
								required="required" />
							<form:errors path="pannumber" cssClass="text-warning" />
						</fieldset>

						<fieldset class="form-group">
							<form:label path="pin">Pin</form:label>
							<form:input path="pin" type="text" class="form-control"
								required="required" />
							<form:errors path="pin" cssClass="text-warning" />
						</fieldset>

						<fieldset class="form-group">
							<form:label path="birthdate">BirthDate</form:label>
							<form:input path="birthdate" type="text" class="form-control"
								required="required" />
							<form:errors path="birthdate" cssClass="text-warning" />
						</fieldset>






					<%-- 	<fieldset class="form-group">

							<form:label path="targetDate">Target Date</form:label>
							<form:input path="targetDate" type="text" class="form-control"
								required="required" />
							<form:errors path="targetDate" cssClass="text-warning" />
						</fieldset>
 --%>

					</form:form>
				</div>
			</div>
		</div>
	</div>
</div>

<%-- <%@ include file="common/footer.jspf"%> --%>