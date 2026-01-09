<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>All User Details</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">

</head>
<body>
    <h2>All Registered Users</h2>

    <table border="1" cellpadding="10">
        <tr>
            <th>User ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Address</th>
            <th>Contact</th>
        </tr>
        <c:forEach var="user" items="${userList}">
			<tr>
			    <td>${user.uid}</td>
			    <td>${user.name}</td>
			    <td>${user.age}</td>
			    <td>${user.address}</td>
			    <td>${user.contact}</td>
			    <td>
			        <a href="edit-user/${user.uid}">Edit</a> |
			        <a href="delete-user/${user.uid}" onclick="return confirm('Are you sure?')">Delete</a>
			    </td>
			</tr>

        </c:forEach>
		
		
    </table>

    <br>
    <a href="logout">Logout</a>
</body>
</html>
