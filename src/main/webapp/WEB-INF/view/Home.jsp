<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sForm" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sTag" uri="http://www.springframework.org/tags"%>
<html>
	<head>
		<title>Home</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-3.5.1.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
	</head>
	<body>
		<div>
			<div>
				<a class="btn btn-primary" href="${pageContext.request.contextPath}/addstudentdetail">Add Student</a>
			</div>
			<div>
				<c:choose>
					<c:when test="${not empty listStudent}">
						<table border="1">
							<tr>
								<th><sTag:message code="student.name"/></th>
								<th><sTag:message code="student.gender"/></th>
								<th><sTag:message code="student.age"/></th>
								<th><sTag:message code="student.action"/></th>
							</tr>
							<c:forEach items="${listStudent}" var="stud">
								<tr>
									<td>${stud.name}</td>
									<td>${stud.gender}</td>
									<td>${stud.age}</td>
									<td>
										<a href="${pageContext.request.contextPath}/update/${stud.studId}">Update</a>
										<a href="${pageContext.request.contextPath}/delete/${stud.studId}">Delete</a>
									</td>
								</tr>							
							</c:forEach>
						</table>			
					</c:when>
					<c:otherwise>
						<h3><sTag:message code="data_not_found"/></h3>					
					</c:otherwise>
				</c:choose> 
			</div>
		</div>
	</body>
</html>
