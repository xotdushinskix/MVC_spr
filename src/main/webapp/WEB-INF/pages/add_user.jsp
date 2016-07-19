<%--
  Created by IntelliJ IDEA.
  User: FromxSoul
  Date: 20.07.2016
  Time: 0:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title></title>
</head>
<body>
  <form:form action="${pageContext.request.contextPath}/users/add" commandName="user" method="post">
    <table>
      <tr>
        <td>User first name:</td>
        <td><form:input path="firstName"/></td>
      </tr>
      <tr>
        <td>User last name:</td>
        <td><form:input path="lastName"/></td>
      </tr>
      <tr>
        <td>User age:</td>
        <td><form:input path="age"/></td>
      </tr>
    </table>
    <input type="submit" value="Add" />
  </form:form>
</body>
</html>
