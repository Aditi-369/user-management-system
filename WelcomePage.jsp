<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">

</head>
<body>
    <h2>${msg}</h2>

    <a href="view-user-details">View Sample User</a><br>
    <a href="view-alluser-details">View All Users</a><br>
    <a href="logout">Logout</a>
</body>
</html>
