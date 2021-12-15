<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h3 style="color: red">${error}</h3>
<form method="post" id="lg" action="${pageContext.request.contextPath}/login"></form>
<h1>Login:</h1>
<table border="1">
    <tr>
        <th>Your login</th>
        <th>Your password</th>
        <th>Continue</th>
    </tr>
    <tr>
        <td>
            <input type="text" name="login" form="lg" required>
        </td>
        <td>
            <input type="password" name="password" form="lg" required>
        </td>
        <td>
            <input type="submit" name="Continue" form="lg">
        </td>
    </tr>
</table>
<h4><a href="${pageContext.request.contextPath}/drivers/add">Register</a></h4>
</body>
</html>
