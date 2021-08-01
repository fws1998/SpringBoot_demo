
<%@ page contentType="text/html; charset=UTF-8"  language="java" %>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>
    Index
</h1>
<table>
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${list}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>
                <a href="/user/deletebyid/${user.id}">删除</a>
                <a href="/user/findbyid/${user.id}">修改</a>
            </td>
        </tr>
    </c:forEach>
</table>
${mess}
</body>
</html>