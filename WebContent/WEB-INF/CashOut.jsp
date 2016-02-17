<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Online Breaker Gambling Portal</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/photofolio/layout/styles/layout.css" type="text/css" />

</head>
<body id="top" background = "#00ff00">
<div class="wrapper col1">
  <div id="header" class="clear">
    <div class="fl_left">
      <h1><a href="../index.html">Online Breaker Gambling Portal</a></h1>
      <p>CS 437 Software Development Project</p>
    </div>
</div>
</div>
<!-- ####################################################################################################### -->

<!-- ####################################################################################################### -->
<div class="wrapper col2">
  <div id="container" class="clear"> 

    <!-- ####################################################################################################### -->
    <div style="text-align:center"> 

     <h1 style="color:black; ">cash out and sell you cards!!!!</h1> 
    </div>
    <div style="text-align:center"> 



<c:forEach items="${winingCards}" var="entry">
<form action="demo_form.asp" method="get">
<input type="checkbox" name="player" value="${entry.price}"> ${entry.name}${entry.price}<br>
<input type="submit" value="Submit">
</form>

 </c:forEach>
 
 

   </div>
    <!-- ####################################################################################################### --> 
  </div>
</div>

<!-- ####################################################################################################### -->
<div class="wrapper">
  <div id="copyright" class="clear">
  <p class="fl_left">Copyright &copy; 2016 - All Rights Reserved -</p>
  </div>
</div>
</body>
</html>