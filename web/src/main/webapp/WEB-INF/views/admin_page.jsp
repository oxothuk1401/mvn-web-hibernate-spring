<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="local" %>
<html>
<head>
    <title>ADMIN</title>
</head>
<body>
    ADMIN
    <form:form method="GET" modelAttribute="user" action="/to-main">
        <input type="submit" class="btnReg" value="<local:message code="exit"/>">
    </form:form>
</body>
</html>
