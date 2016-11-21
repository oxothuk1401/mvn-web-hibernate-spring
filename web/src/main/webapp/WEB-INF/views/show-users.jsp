<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="local" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title><local:message code="viewcatalog"/></title>
</head>
<body>

<table border="1" align="center">
    <thead>
    <tr>
        <th><local:message code="id"/></th>
        <th><local:message code="login"/></th>
        <th><local:message code="password"/></th>
        <th><local:message code="role"/></th>
        <th><local:message code="blacklist"/></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${viewUsers}" var="view">
        <tr>
            <td>${view.id}</td>
            <td>${view.login}</td>
            <td>${view.password}</td>
            <td>${view.role}</td>
            <td>${view.blacklist}</td>
        </tr>
    </c:forEach>
    </tbody>
    <div align="center">
        <form:form method="GET" modelAttribute="user" action="userOperation">
            <input type="text" name="login" size="20" value=""><br>
            <input type="radio" name="command" value="delete" checked><local:message code="Deleteuser"/><br>
            <input type="radio" name="command" value="block"><local:message code="Blockuser"/><br>
            <input type="radio" name="command" value="unlock"><local:message code="UnLock"/><br>
            <input type="submit" class="btnReg" value="<local:message code="apply"/>">
        </form:form>
        <c:if test="${not empty error}">
            <p style="color: #cc0000">
                    ${error}
            </p>
        </c:if>
    </div>
</table>
</body>
</html>
