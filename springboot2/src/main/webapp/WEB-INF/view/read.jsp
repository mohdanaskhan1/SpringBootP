<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello</h1>
${deleteData}
<ul>
    <c:forEach var="data" items="${ReadData}">
        <li>${data}</li>
        <a href="delete?id=${data.id}">DELETE</a>

        <br>
    </c:forEach>
</ul>
</body>
</html>
