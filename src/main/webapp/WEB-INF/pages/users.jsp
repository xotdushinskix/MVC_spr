<%--
  Created by IntelliJ IDEA.
  User: FromxSoul
  Date: 16.07.2016
  Time: 0:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<h3>All users list:</h3>
<table border="2">
  <thead>
  <tr>
    <th>Id</th>
    <th>First Name</th>
    <th>Last Name</th>
    <th>Age</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${listUser}" var="user">
    <tr>
      <td>${user.id}</td>
      <td>${user.firstName}</td>
      <td>${user.lastName}</td>
      <td>${user.age}</td>
      <td><a href="users/action?update_user&id=<c:out value="${user1.userId}"/>">Update</a></td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>
