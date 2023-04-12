
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<style type="text/css">
#b
{
width:200px;
height:300px;
border-width: 3px;
border-style: solid;
border-color: red;
background-color:yellow;
}
#c
{
font-size:30px;
}
#n
{
color:red;
}
</style>
</head>
<body>
<fieldset id="b" >
<center id="c"><h6>HOME</h6></center>
<ol>
<li><a href="loadhospital">SAVE HOSPITAL</a></li><br><br>
<li><a href="displayhospital">DISPLAY HOSPITAL</a></li>
</ol>
<center id="n">${msg}</center>
</fieldset>
</body>
</html>