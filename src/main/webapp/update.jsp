<%@ page contentType="text/html; charset=UTF-8"  language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>
        Title
    </title>
</head>
<body>
<form action="/user/update" method="post">
    <input type="text" name="id" value="${user.id}" readonly/><br/>
    <input type="text" name="name" value="${user.name}"/><br/>
    <input type="submit"/>
</form>
</body>
</html>