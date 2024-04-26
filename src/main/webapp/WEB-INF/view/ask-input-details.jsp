<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: igorwaraxe
  Date: 4/25/24
  Time: 7:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Dear Employee. Please enter your details</h2>

<br>
<br>

<form:form action = "showInputDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br>
    Department <form:select path="department">
    <form:options items="${employee.departments}"/>
    </form:select>
    <br>
    Which car do you want?
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br>
    Foreign Language(s)
    <form:checkboxes path="languages" items="${employee.languageList}"/>
    <br>
    Phone Number: <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br>
    Email: <form:input path="email"/>
    <form:errors path="email"/>
    <br>
    <input type="submit" value="OK">


</form:form>


</body>
</html>
