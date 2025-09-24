<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit User</title>
</head>
<body>

<h2>Edit User</h2>

<form action="update" method="post">
    <input type="hidden" name="id" value="${user.id}" />
    <table>
        <tr>
            <td>Name:</td>
            <td><input type="text" name="name" value="${user.name}" /></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><input type="email" name="email" value="${user.email}" /></td>
        </tr>
        <tr>
            <td>Phone:</td>
            <td><input type="number" name="phno" value="${user.phno}" /></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Update" /></td>
        </tr>
    </table>
</form>

</body>
</html>
