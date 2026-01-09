<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Login</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">

</head>
<body>
    <h2>User Login</h2>
    <form action="verify-LoginDetails" method="post">
        <label>User ID:</label><br>
        <input type="text" name="uid" required><br><br>

        <label>Password:</label><br>
        <input type="password" name="password" required><br><br>

        <input type="submit" value="Login">
    </form>
    <br>
    <a href="/">Back to Home</a>
    <br><br>
    <p>${message}</p>
</body>
</html>
