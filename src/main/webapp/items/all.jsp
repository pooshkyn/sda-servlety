<%--
  Created by IntelliJ IDEA.
  User: dariusz.abramczyk
  Date: 22/08/2020
  Time: 09:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Sda training</title>
</head>
<body>
<h1>Przedmioty</h1>
<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>Nazwa</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${items}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
        </tr>
    </c:forEach>

    </tbody>
</table>

</body>
</html>
