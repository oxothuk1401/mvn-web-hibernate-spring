<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="local" %>
<%@ taglib prefix="float" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link href="<c:url value="/resources/css/home.css" />" rel="stylesheet">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title><local:message code="library"/></title>

    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="/resources/javascript/strengthPassword.js"></script>
</head>
<body background="1">

<form:form name='form_login' method="POST" action="j_spring_security_check"
           class="box login">

    <fieldset class="boxBody">
        <span style="float: right">
				<a href="?lang=en"><img src="/resources/icon/en.jpg" alt="en"></a>
				<a href="?lang=ru"><img src="/resources/icon/rus1.jpg" alt="rus"></a>
        </span>
        <local:message code="login"/>
        <input type='text' name='user_login'>

        <local:message code="password"/>
        <input type='password' name='password_login'/>
        <c:if test="${not empty error}">
            <p style="color: #cc0000">
                    ${error}
            </p>
        </c:if>
        <footer>
            <input name="submit" type="submit" class="btnLogin" value="<local:message code="locbutton.name.login"/>">
        </footer>
        </form>
    </fieldset>
</form:form>
<br>
<br>
<br>
<div align="center">
    <p>
        <font size="20" color="#008b8b">
            <local:message code="library"/>
        </font>
    </p>
    <br>
    <form:form method="POST" modelAttribute="user" action="check-register">
        <input type="submit" class="btnReg" value="<local:message code="registration"/>">
    </form:form>
</div>
</body>
</html>