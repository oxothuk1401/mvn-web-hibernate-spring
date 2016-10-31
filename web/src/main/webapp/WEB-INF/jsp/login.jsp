<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="local" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link href="<c:url value="/resources/css/home.css" />" rel="stylesheet">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>

<body>

<form:form method="POST" modelAttribute="user" action="check-user"
           class="box login">


    <fieldset class="boxBody">

        <span style="float: right">
				<a href="?lang=en"><img src="/resources/icon/en.jpg" alt="english"></a>
				<a href="?lang=ru"><img src="/resources/icon/rus1.jpg" alt="russan"></a>
        </span>
        <form:label path="login"><local:message code="login"/></form:label>
        <form:input path="login"/>
        <form:errors path="login" cssClass="error"/>

        <form:label path="password"><local:message code="password"/></form:label>
        <form:password path="password"/>
        <form:errors path="password" cssClass="error"/>

    </fieldset>
    <footer>
        <input type="submit" class="btnLogin" value="<local:message code="locbutton.name.login"/>" tabindex="4">

    </footer>

</form:form>
<form:form method="POST" modelAttribute="user" action="check-register">
    <footer>
        <input type="submit" class="btnLogin" value="<local:message code="registration"/>" tabindex="4">
    </footer>
</form:form>


</body>
</html>