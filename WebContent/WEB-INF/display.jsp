<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />

<title>Online Breaker Gambling Portal</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/photofolio/layout/styles/layout.css" type="text/css" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"/>
</head>

<body id="top">
<div class="wrapper col1">
  <div id="header" class="clear">
    <div class="fl_left">
      <h1><a href="../index.html">Online Breaker Gambling Portal</a></h1>
      <p>CS 437 Software Development Project</p>
    </div>
</div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col1">
  <div id="topbar" class="clear">
    <h1 align="center"><b>Break Results Page</b></h1>
  </div>
</div>
<!-- ####################################################################################################### -->
<div class="wrapper col2">
  <div id="container" class="clear"> 
    <!-- ####################################################################################################### -->
   <table width="100%"style="border:5px double black;">

  <tr><th style="text-align:center" bgcolor="#000000">Card </th>
  <th style="text-align:center" bgcolor="#000000">Player</th><th style="text-align:center" bgcolor="#000000">Team</th>
  <th style="text-align:center" bgcolor="#000000">Product</th><th style="text-align:center" bgcolor="#000000">Sport</th>
  <th style="text-align:center" bgcolor="#000000">Value</th></tr>
  <tr bgcolor="#bababa">
    <td width="20%"align="center" style="width:150px; height:100px;">
   <img src="photofolio/images/cardimages/losangelesangels/miketrout.png" align="middle" style="max-height:150%; max-width:150% "/>
    <br /><a href="photofolio/images/cardimages/losangelesangels/miketrout.png" target="_blank"><p style="color:black; text-align:center"><b>View</b></p></a>
    </td>
     <td width="16%"><p style="font-size:125%; color:black;" align="center"><b> Mike Trout </b></p></td>
     <td width="16%"><p style="font-size:125%; color:black;" align="center"><b>Los Angeles Angels</b></p></td>
     <td width="16%"><p style="font-size:125%; color:black;" align="center"><b>2014 National Treasures</b></p></td>
     <td width="16%"><p style="font-size:125%; color:black;" align="center"><b>Sport</b></p></td>
     <td width="8%"><p style="font-size:125%; color:black;" align="center"><b>150$</b></p></td>
     
  </tr>
</table>
<br />
<p>Cash out to sell your cards!!</p>
      <a href="#" class="btn btn-md btn-primary"><b>Cash Out</b></a> &nbsp;&nbsp;
    <p><b>OR</b></p>
    <p>Enter your email to claim your cards!</p>
    <form action="EmailCardsToUser" method="post">
Email <input type="text" name="emai" /> <br />
<input type="submit" name="email" value="Submit" />
</form>
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