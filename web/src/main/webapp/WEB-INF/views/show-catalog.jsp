
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="local"%>
<html>
<head>
    <title><local:message code="viewcatalog"/></title>
</head>
<body>

    <table border="1" align="center">
        <thead>
        <tr>
            <th><local:message code="id"/></th>
            <th><local:message code="access"/></th>
            <th><local:message code="author"/></th>
            <th><local:message code="title"/></th>
            <th><local:message code="date"/></th>
            <th><local:message code="location"/></th>
            <th><local:message code="amount"/></th>
        </tr>
        </thead>
        <tbody>
            <c:forEach items="${viewBooks}" var="view">
                <tr>
                    <td>${view.id}</td>
                    <td>${view.access}</td>
                    <td>${view.author}</td>
                    <td>${view.title}</td>
                    <td>${view.date}</td>
                    <td>${view.location}</td>
                    <td>${view.amount}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
