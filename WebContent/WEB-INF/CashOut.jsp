<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

     <h1 style="color:black; ">Check the cards you would like to sell</h1> 
    </div>
    <div style="text-align:center"> 




  <form name="CashOut.jsp" method="post">
<table>   
    <c:forEach var="entry" items="${winingCards}">
    	<tr>  
    	  	<td>
    	  		<input type="checkbox" name="cardvalue" value="${entry.price}"><h1>PRICE<h1>${entry.price}$</h1><br><img src="photofolio/images/cardimages/clevelandindians/${entry.name}.png" align="middle" style="max-height:25%; max-width:25% "/>
    	  	</td>	
    		</tr>		
    </c:forEach>     
</table>
<table>
	<tr>
		<td>
			<input type="submit" value="Sell your cards"/>
		</td>
	</tr>
</table>
</form>
 &nbsp;
 &nbsp;
    <form method="LINK" action="Homepage">
    
<input type="submit" value="End your break">
</form>
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