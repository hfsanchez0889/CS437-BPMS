<?xml version="1.0" encoding="US-ASCII" ?>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!--
Template Name: PhotoFolio
Author: <a href="http://www.os-templates.com/">OS Templates</a>
Author URI: http://www.os-templates.com/
Licence: Free to use under our free template licence terms
Licence URI: http://www.os-templates.com/template-terms
-->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>PhotoFolio</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/photofolio/layout/styles/layout.css" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/photofolio/layout/scripts/jquery.min.js"></script>
<!-- tabs -->
<script type="text/javascript" src="${pageContext.request.contextPath}/photofolio/layout/scripts/jquery.ui.min.js"></script>
<script type="text/javascript">
$(document).ready(function () {
    $("#tabcontainer").tabs({
        event: "click"
    });
});
</script>
<!-- / tabs -->
<script type="text/javascript" src="${pageContext.request.contextPath}/photofolio/layout/scripts/jquery-photostack.js"></script>
<!-- coinslider -->
<script type="text/javascript" src="${pageContext.request.contextPath}/photofolio/layout/scripts/jquery-coin-slider.min.js"></script>
<script type="text/javascript">
$(document).ready(function () {
    $('#portfolioslider').coinslider({
        width: 480,
        height: 280,
        navigation: false,
        links: false,
        hoverPause: true
    });
});
</script>
<!-- / coinslider -->
</head>
<body id="top">
<div class="wrapper col1">
  <div id="header" class="clear">
    <div class="fl_left">
      <h1><a href="index.html">Online Breaker Gambling Portal</a></h1>
      <p>CS 437 Software Development Project</p>
    </div>
  </div>
</div>
<div class="wrapper col1">
  <div id="featured_slide"> 
    <!-- ####################################################################################################### -->
    <div id="slider">
      <ul id="categories">
        <li class="category">
          <h2>National Treasures</h2>
          <form action="TeamSelection" method="get">
          	<img src="${pageContext.request.contextPath}/photofolio/images/breaker_boxes/breaker_1.jpg" alt="" />
          	<p>2015 PANINI NATIONAL TREASURES BASEBALL HOBBY 4 BOX CASE BREAK PICK YOUR TEAM #4</p>
          	<input type="hidden" value="1" name="sportId"/>
          	<p><input type="submit" value="Buy"/></p>
          </form>
        </li>
        <li class="category">
          <h2>Classics</h2>
          <form action="TeamSelection" method="get">
          	<img src="${pageContext.request.contextPath}/photofolio/images/breaker_boxes/breaker_2.jpg" alt="" />
          	<p>2014 Panini Classics Baseball 6 Box 1/2 Case Break #22</p>
          	<input type="hidden" value="2" name="sportId"/>
          	<p><input type="submit" value="Buy"/></p>
          </form>
        </li>
        <li class="category">
          <h2>Supreme</h2>
          <form action="TeamSelection" method="get">
          	<img src="${pageContext.request.contextPath}/photofolio/images/breaker_boxes/breaker_3.jpg" alt="" />
          	<p>2014 Topps Supreme Baseball 10 Box Half Case Break Random Teams #16</p>
          	<input type="hidden" value="3" name="sportId"/>
          	<p><input type="submit" value="Buy"/></p>
          </form>
        </li>
        <li class="category">
          <h2>Gold</h2>
          <form action="TeamSelection" method="get">
          	<img src="${pageContext.request.contextPath}/photofolio/images/breaker_boxes/breaker_4.jpg" alt="" />
          	<p>2014 Bobs Gold Baseball 20 Box Half Case Break Random Teams #10</p>
          	<input type="hidden" value="4" name="sportId"/>
          	<p><input type="submit" value="Buy"/></p>
        	</form>
        </li>
        <li class="category">
          <h2>National Treasures</h2>
          <form action="TeamSelection" method="get">
          	<img src="${pageContext.request.contextPath}/photofolio/images/breaker_boxes/breaker_5.jpg" alt="" />
          	<p>2015 National Treasures Baseball Single Box Break Pick Your Teams #9</p>
          	<input type="hidden" value="5" name="sportId"/>
          	<p><input type="submit" value="Buy"/></p>
        	</form>
        </li>
        <li class="category">
          <h2>Dynasty</h2>
          <form action="TeamSelection" method="get">
          	<img src="${pageContext.request.contextPath}/photofolio/images/breaker_boxes/breaker_6.jpg" alt="" />
          	<p>2015 Topps Dynasty Baseball Random Player Case Break #32</p>
          	<input type="hidden" value="6" name="sportId"/>
          	<p><input type="submit" value="Buy"/></p>
        	</form>
        </li>
        <li class="category">
          <h2>Elite</h2>
          <form action="TeamSelection" method="get">
          	<img src="${pageContext.request.contextPath}/photofolio/images/breaker_boxes/breaker_7.jpg" alt="" />
          	<p>2015 Elite Extra Edition Baseball 10 Box Half Case Break #3 Random Teams</p>
          	<input type="hidden" value="7" name="sportId"/>
          	<p><input type="submit" value="Buy"/></p>
          </form>
        </li>
        <li class="category">
          <h2>Platinum</h2>
          <form action="TeamSelection" method="get">
          	<img src="${pageContext.request.contextPath}/photofolio/images/breaker_boxes/breaker_8.jpg" alt="" />
          	<p>2015 Bowman Platinum Baseball Single Box Break Pick Your Teams #11</p>
          	<input type="hidden" value="8" name="sportId"/>
          	<p><input type="submit" value="Buy"/></p>
        	</form>
        </li>
      </ul>
      <a class="prev disabled"></a> <a class="next disabled"></a>
      <div style="clear:both"></div>
    </div>
    <!-- ####################################################################################################### --> 
  </div>
</div>
<div class="wrapper">
  <div id="copyright" class="clear">
    <p class="fl_left">Copyright &copy; 2014 - All Rights Reserved - <a href="#">Domain Name</a></p>
    <p class="fl_right">Template by <a target="_blank" href="http://www.os-templates.com/" title="Free Website Templates">OS Templates</a></p>
  </div>
</div>
</body>
</html>