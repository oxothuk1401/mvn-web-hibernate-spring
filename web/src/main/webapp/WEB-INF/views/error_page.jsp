
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="local" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="GET" modelAttribute="user" action="/to-main">
    <input type="submit" class="btnReg" value="<local:message code="tomain"/>">
</form:form>
</body>
</html>
