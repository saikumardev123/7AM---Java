

<%
   String username = (String)session.getAttribute("username");
    out.print("<h1>Welcome "+username + "</h1>");
%>
