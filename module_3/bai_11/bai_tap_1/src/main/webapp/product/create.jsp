<%--
  Created by IntelliJ IDEA.
  User: nghia
  Date: 4/17/2023
  Time: 8:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new customer</title>
    <style>
        .message{
            color:green;
        }
    </style>
</head>
<body>
<h1>Create new customer</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/customers">Back to customer list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Customer information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="id" id="id"></td>
            </tr>
            <tr>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="ten" id="ten"></td>
            </tr>
            <tr>
                <td>Email: </td>
                <td><input type="text" name="gia" id="gia"></td>
            </tr>
            <tr>
                <td>Address: </td>
                <td><input type="text" name="nhasx" id="nhasx"></td>
            </tr>
            <tr>
            <tr>
                <td>Address: </td>
                <td><input type="text" name="thongtin" id="thongtin"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Create customer"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
