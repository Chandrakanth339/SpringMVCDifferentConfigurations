<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 MVC - Hello World Example | BORAJI.COM</title>
<link rel="stylesheet" type="text/css"
	href='<spring:url value="/css/Sample.css"></spring:url>'></link>
</head>
<body>
	<script
		src='<spring:url value="/js/JavaScript.js"></spring:url>'></script>

	<h2 class="mesg">${message}</h2>

	<p id="rand" onclick="loaderFunction()">PARA1</p>
	<p id="sample"></p>

	<img src='<c:url value="/images/Image1.jpg"></c:url>'
		alt="Funny"></img>
</body>
</html>