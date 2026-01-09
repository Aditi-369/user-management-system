<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Details</title>
</head>
<body>
    <h2>User Details</h2>

    <p>User ID: ${user.uid}</p>
    <p>Name: ${user.name}</p>
    <p>Age: ${user.age}</p>
    <p>Address: ${user.address}</p>
    <p>Contact: ${user.contact}</p>

    <br>
    <a href="view-alluser-details">View All Users</a>
</body>
</html>
