<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Registration</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">

</head>
<body>
    <h2>Register New User</h2>
    <form action="register-user" method="post">
        <label>User ID:</label><br>
        <input type="text" name="uid" required><br><br>

        <label>Name:</label><br>
        <input type="text" name="name" required><br><br>

        <label>Age:</label><br>
        <input type="number" name="age" required><br><br>

        <label>Address:</label><br>
        <input type="text" name="address" required><br><br>

        <label>Contact:</label><br>
        <input type="text" name="contact" required><br><br>

        <label>Password:</label><br>
        <input type="password" name="password" required><br><br>

        <input type="submit" value="Register">
    </form>
    <br>
    <a href="/">Back to Home</a>
</body>
</html>
