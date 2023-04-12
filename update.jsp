<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UPDATE USER</title>
<style type="text/css">
#a 
{
width:300px;
height:500px;
border-width: 3px;
border-style: solid;
border-color: red;
background-color:yellow; 
}
</style>
</head>
<body>
<fieldset id="a">
<center><h4>Chaitra Hospital<br><sub>(Smt.Dr Sunitha)</sub></h4><br></center>
<center><h4>UPDATE FORM</h4><br></center>
<form:form action="updatehospital" modelAttribute="hospitalupdate"><br><br>
<ol>
<li><label>Id</label><form:input path="id" readonly="true"/><br><br></li>
<li><label>Name</label><form:input path="name"/><br><br></li>
<li><label>Website</label><form:input path="website"/><br><br></li>
<li><label>Rating</label><form:input path="rating"/><br><br></li>
<li><label>Phone</label><form:input path="phone"/><br><br></li>
</ol>
<center><form:button>Update</form:button></center>
</form:form>
</fieldset>
</body>
</html>