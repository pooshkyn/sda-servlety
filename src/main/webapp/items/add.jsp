<%--
  Created by IntelliJ IDEA.
  User: dariusz.abramczyk
  Date: 22/08/2020
  Time: 09:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sda training</title>
</head>
<body>
<div>
    <form action="${pageContext.request.contextPath}/items" method="post">
        <div>
            <label for="id">Id: </label>
            <input type="text" name="id" id="id"/>
        </div>
        <div>
            <label for="name">Name: </label>
            <input type="text" name="name" id="name"/>
        </div>
        <div>
            <input type="submit" value="Wyślij">
        </div>
    </form>
</div>

</body>
</html>
