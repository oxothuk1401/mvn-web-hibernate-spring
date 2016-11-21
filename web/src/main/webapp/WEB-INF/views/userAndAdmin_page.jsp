<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="local" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title><local:message code="viewcatalog"/></title>
    <link href="<c:url value="/resources/css/home.css" />" rel="stylesheet">
</head>
<body>
<div align="center">
    <br>
    <br>
    <br>
    <sec:authorize access="hasRole('ROLE_ADMIN')">
        <p>
            <font size="6" color="#008b8b">
                <local:message code="nameAdmin"/>
            </font>
        </p>
    </sec:authorize>
    <sec:authorize access="hasRole('ROLE_USER')">
        <p>
            <font size="6" color="#008b8b">
                <local:message code="nameUser"/>
            </font>
        </p>
    </sec:authorize>
    <br>
    <form:form method="POST" modelAttribute="user" action="show-catalog">
        <input type="submit" class="btnReg" value="<local:message code="viewcatalog"/>">
    </form:form>
    <br>
    <sec:authorize access="hasRole('ROLE_ADMIN')">
        <form:form method="POST" modelAttribute="user" action="show-users">
            <input type="submit" class="btnReg" value="<local:message code="viewusers"/>">
        </form:form>
    </sec:authorize>

    <br>

    <c:if test="${not empty error}">
        <p style="color: #cc0000">
                ${error}
        </p>
    </c:if>

    <a href="j_spring_security_logout">
        <input name="submit" type="submit" class="btnReg" value="<local:message code="exit"/>"></a>
</div>
</body>
</html>
