
<html>

<H1>The details you entered :</H1>

<%
String user=(String)request.getAttribute("user");
String password=(String)request.getAttribute("pwd");
String email=(String)request.getAttribute("email");
%>

<h2>User name:<%= user%></h2>
<h2>Password :<%= password%></h2>
<h2>email :<%= email%></h2>

<a href="index.jsp">Click here to go to the Home Page</a>

</html>