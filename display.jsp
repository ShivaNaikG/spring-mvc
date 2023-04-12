<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DisplayAll</title>
<style type="text/css">
table
{
border-collapse: collapse;
}
th
{
background-color: yellow;
}

</style>
</head>
<body>

<table border="2px">
<tr>
<th>Id</th>
<th>Name</th>
<th>Website</th>
<th>Rating</th>
<th>Phone</th>
<th>Edit</th>
<th>Delete</th>
</tr>
<c:forEach  var="var" items="${list}">


<tr>
<td>${var.getId()}</td>
<td>${var.getName()}</td>
<td>${var.getWebsite()}</td>
<td>${var.getRating()}</td>
<td>${var.getPhone()}</td>
<td><a href="gethospitalbyid?id=${var.getId()}">Edit</a></td>
<td><a href="deletehospital?id=${var.getId()}">Delete</a></td>
</tr>

</c:forEach>







</table>
</body>
</html>