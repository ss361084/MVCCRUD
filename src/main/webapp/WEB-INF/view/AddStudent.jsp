<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="forms" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="tags" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Add Student Detail</title>
		<style type="text/css">
			.errClass {
				color: red;
			}
		</style>
	</head>
	<body>
		<div>
			<div>
				<forms:form method="post" action="${pageContext.request.contextPath}/savestudent" modelAttribute="student">
					<div>
						<forms:hidden path="studId"/>
						<label>Enter Name :: </label>
						<forms:input path="name" placeHolder="Enter Name" required="required"/>
						<forms:errors cssClass="errClass" path="name"></forms:errors>
					</div>
					<div>
						<label>Enter Age :: </label>
						<forms:input path="age" placeHolder="Enter Age" required="required"/>
						<forms:errors cssClass="errClass" path="age"></forms:errors>
					</div>
					<div>
						<label>Select Gender :: </label>
						<forms:radiobuttons path="gender"/>
						<forms:errors cssClass="errClass" path="gender"></forms:errors>
					</div>
					<div>
						<button class="btn btn-primary" type="submit">Submit</button>
					</div>
				</forms:form>
			</div>
		</div>
	</body>
</html>