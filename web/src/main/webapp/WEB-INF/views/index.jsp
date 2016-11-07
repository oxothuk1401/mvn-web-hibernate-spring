
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="local" %>

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

<form:form method="POST" modelAttribute="user" action="check-user"
           class="box login">


    <fieldset class="boxBody">

        <span style="float: right">
				<a href="?lang=en"><img src="/resources/icon/en.jpg" alt="en"></a>
				<a href="?lang=ru"><img src="/resources/icon/rus1.jpg" alt="rus"></a>
        </span>
        <form:label path="login"><local:message code="login"/></form:label>
        <form:input path="login"/>
        <form:errors path="login" cssClass="error"/>

        <form:label path="password"><local:message code="password"/></form:label>
        <form:password path="password" onkeyup="doAjax()"/>
        <form:errors path="password" cssClass="error"/>
        <span style="float: right" id="strengthValue"/>

    </fieldset>
    <footer>
        <input type="submit" class="btnLogin" value="<local:message code="locbutton.name.login"/>" tabindex="4">

    </footer>

</form:form>

</body>
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
<body>

</body>
</html>