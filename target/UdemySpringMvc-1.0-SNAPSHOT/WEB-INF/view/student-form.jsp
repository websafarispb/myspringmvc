<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Evgenii
  Date: 27.05.2020
  Time: 8:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Form</title>
</head>
<body>

    <form:form action="processForm" modelAttribute="student">

        First Name: <form:input path="firstName"></form:input>
        <br><br>
        Last Name: <form:input path="lastNAme"/>

        <input type="submit" value="Submit" />
    </form:form>

</body>
</html>
