<%--
  Created by IntelliJ IDEA.
  User: FromxSoul
  Date: 17.07.2016
  Time: 0:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title></title>
</head>
<body>
    <h4>User's edit page</h4>
    <form:form action="${pageContext.request.contextPath}/edit/${user.id}" commandName="user">
        <table>
            <tr>
                <td><form:label path="id">User id:</form:label></td>
                <td><form:input path="id" readonly="true"/></td>



                <%--<td>User id:</td>--%>
                <%--<td><form:input path="id" readonly="true"/></td>--%>
            </tr>
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
        <input type="submit" value="Edit">
    </form:form>
</body>
</html>