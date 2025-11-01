<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul>
    <c:forEach var="message" items="${errorList}">
        <li>${message}</li>
    </c:forEach>
</ul>

<form action="insert" method="post">
    <label for="id">Employee ID:</label><br>
    <input type="number" id="id" name="id" required><br><br>

    <label for="name">Name:</label><br>
    <input type="text" id="name" name="name" required><br><br>

    <label for="address">Address:</label><br>
    <input type="text" id="address" name="address" required><br><br>

    <label for="salary">Salary:</label><br>
    <input type="number" id="salary" name="salary" step="0.01" required><br><br>

    <input type="submit" value="Submit">
</form>
</body>
</html>
