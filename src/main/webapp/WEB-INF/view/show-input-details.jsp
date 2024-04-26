<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: igorwaraxe
  Date: 4/25/24
  Time: 7:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<body>
<h2>Dear Employee, you are WELCOME!!!</h2>
<br>
<br>
<br>
<p>Your name: ${employee.name} </p>
<br>
<p>Your surname: ${employee.surname} </p>
<br>
<p>Your salary: ${employee.salary} </p>
<br>
<p>Your department: ${employee.department}</p>
<br>
<p>Your car: ${employee.carBrand}</p>
<br>
<p>Language(s):</p>
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>${lang}</li>
    </c:forEach>
</ul>
<br>
<p>Phone number: ${employee.phoneNumber}</p>
<br>
<p>Email: ${employee.email}</p>
</body>

</body>
</html>
