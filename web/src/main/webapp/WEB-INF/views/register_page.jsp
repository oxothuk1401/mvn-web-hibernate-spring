<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="local" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link href="<c:url value="/resources/css/home.css" />" rel="stylesheet">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="/resources/javascript/strengthPassword.js"></script>
</head>

<body>

<form:form method="POST" modelAttribute="user" action="registration"
           class="box login">


    <fieldset class="boxBody">
        <form:label path="login"><local:message code="login"/></form:label>
        <form:input path="login"/>
        <form:errors path="login" cssClass="error"/>

        <form:label path="password"><local:message code="password"/></form:label>
        <form:password path="password" onkeyup="doAjax()"/>
        <form:errors path="password" cssClass="error"/>
        <span style="float: right" id="strengthValue"/>

    </fieldset>
    <footer>
        <input type="submit" class="btnLogin" value="<local:message code="registration"/>" tabindex="4">

    </footer>

</form:form>
<a href="j_spring_security_logout">
    <input name="submit" type="submit" class="btnReg" value="<local:message code="tomain"/>"></a>
</body>
</html>