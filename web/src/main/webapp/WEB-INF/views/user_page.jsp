
<%@ taglib uri="http://www.springframework.org/tags" prefix="local"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<head>

    <title>Home</title>
</head>
<body>

<p><local:message code="nameUser"/>${user.login}!</p>
<p><local:message code="password"/> ${user.password}!</p>
<form:form method="GET" modelAttribute="user" action="show-catalog">
    <input type="submit" class="btnReg"  value="<local:message code="viewcatalog"/>">
</form:form>
<form:form method="GET" modelAttribute="user" action="/to-main">
    <input type="submit" class="btnReg" value="<local:message code="exit"/>">
</form:form>
<a href="j_spring_security_logout">Logout</a>

</body>
</html>
