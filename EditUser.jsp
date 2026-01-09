<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit User</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">

</head>
<body>
    <h2>Edit User</h2>
    <form action="/update-user" method="post">
        <input type="hidden" name="uid" value="${user.uid}" />

        <label>Name:</label><br>
        <input type="text" name="name" value="${user.name}" required><br><br>

        <label>Age:</label><br>
        <input type="number" name="age" value="${user.age}" required><br><br>

        <label>Address:</label><br>
        <input type="text" name="address" value="${user.address}" required><br><br>

        <label>Contact:</label><br>
        <input type="text" name="contact" value="${user.contact}" required><br><br>

        <input type="submit" value="Update">
    </form>
    <br>
    <a href="/view-alluser-details">Back to All Users</a>
</body>
</html>
