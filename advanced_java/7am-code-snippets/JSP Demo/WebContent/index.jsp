
<html>

<head>

</head>

<body>
<!-- Scriptlet -->

 <% 
  out.print("<h1>Hello I am from JSP</h1>"); 
  session.setAttribute("username", "Rajesh");
  out.print("<a href='user.jsp'>User</a>");
 
 %>

</body>

</html>