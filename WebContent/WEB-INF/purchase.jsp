<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="layout/styles/layout.css" type="text/css" />
<title>Purchase Page</title>
</head>
<body id = "top">
<form action="Purchase" method="post">
		Enter First Name : <input type="text" name="firstName"> <BR>
		Enter Last Name :  <input type="text" name="lastName"> <BR>
		
	<select name="teams">
    <option value="dodgers">Los Angeles Dodgers</option>
    <option value="angels">Los Angeles Angels</option>
    <option value="mets">New York Mets</option>
    <option value="rays">Tampa Bay Rays</option>
  </select>
		<input type="submit" />
	</form>
</body>
</html>	