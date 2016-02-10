<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="layout/styles/layout.css" type="text/css" />
<title>Team Selection Page</title>
</head>
<body id = "top">
<form action="Purchase" method="post">
	Team Selection
	<select name="teamID">
		<c:forEach var="team" items = "${teams}">
   			<option> <c:out value = "${team.name}"/></option>
		</c:forEach>
	</select>
		<input type="submit" />
	</form>
</body>
</html>	