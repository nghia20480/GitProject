<%--
  Created by IntelliJ IDEA.
  User: nghia
  Date: 4/19/2023
  Time: 6:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User Management Application</title>
</head>
<body>
<center>
    <h1>User Management</h1>
    <h2>
        <a href="/users?action=create">Add New User</a>
    </h2>
</center>
<div align="center">
    <table border="1" cellpadding="5" id="tableuser">
        <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Country</th>
            <th>Actions</th>
        </tr>
        </thead>
        <caption><h2>List of Users</h2></caption>
        <a href="/users?action=shortname">Sap sep theo ten</a>
       <tbody>
       <c:forEach var="user" items="${listUser}">
           <tr>
               <td><c:out value="${user.id}"/></td>
               <td><c:out value="${user.name}"/></td>
               <td><c:out value="${user.email}"/></td>
               <td><c:out value="${user.country}"/></td>
               <td>
                   <a href="/users?action=edit&id=${user.id}">Edit</a>

                   <button
                           onclick="showModelDelete('${user.id}','${user.name}')"
                           type="button" class="btn btn-danger" data-toggle="modal" data-target="#usertable">Delete</button>
               </td>
           </tr>
       </c:forEach>
       </tbody>

    </table>
</div>
<div class="modal fade" id="modelDelete" tabindex="-1" role="dialog" aria-labelledby="modelTitleId" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Modal title</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <p>Ban muon xoa: <span id="username" style="color: red">no name</span> ?</p>
            </div>
            <form action="/users">
                <input type="hidden" name="action" value="delete">
                <input type="hidden" name="id" value="" id="id">
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-danger">Delete</button>
                </div>
            </form>
        </div>
    </div>
</div>


</body>
</html>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>

<script src="../static/datatables/js/jquery.dataTables.js"></script>
<script src="../static/datatables/js/dataTables.bootstrap4.js"></script>

<script>
    $(document).ready(function () {
        $('#tableuser').dataTable({
            'pageLength' : 3,
            'searching' : false
        })
    })

    function showModelDelete(id, name) {
        console.log(id, name);
        document.getElementById("username").innerText = name;
        document.getElementById("userid").value = id;
    }

</script>

