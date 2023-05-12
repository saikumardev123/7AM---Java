<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>I am in Home Page!</h1>

<form:form action="./addProduct" method="post" modelAttribute="product">

<form:input type="text" path="name" placeholder="name here"/>

<form:input type="text" path="imageURL" placeholder="imageURL here"/>

<form:input type="text" path="seller" placeholder="seller here"/>

<form:input type="number" path="price" placeholder="price here"/>

<button>Add Product</button>

</form:form>

</body>
</html>

