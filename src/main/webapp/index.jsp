<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><% String greeting = "HELLO ADVANTAGE TEAM"; %>
    <%=greeting%>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<a href="Greeting">Greeting</a>

<hr>
<hr>


<form method="POST" action="getCredentials">
    <input type="text" name="userName" placeholder="userName"><br>
    <input type="submit">
</form>
</body>
</html>