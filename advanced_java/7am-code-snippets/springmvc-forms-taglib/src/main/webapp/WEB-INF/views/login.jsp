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

<h1>I am in Login Page!</h1>

<form:form action="./authenticate" method="post" modelAttribute="user">

<form:input type="text" path="username" placeholder="username here"/>

<form:input type="text" path="password" placeholder="password here"/>

<button>Login</button>

</form:form>

</body>
</html>