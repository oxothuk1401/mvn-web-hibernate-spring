<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/javascript/strengthPassword.js"></script>
</head>
<body>

<div class="container">
    <h2 class="text-center">Lets Study Chat</h2>
    <p><a href="/payment">Payment</a></p>

    <div class="row">
        <div class="col-md-4" style="height: 250px;  border: solid #0d6db6; overflow: auto">
            <p>После загрузки сайта на хостинг </p>
            <p>не групируются сообщения я над этим работаю!</p>
            <c:forEach items="${res}" var="res">
                <form action="show_this_chat" method="post">
                    <input type="hidden" name="img" value="${res.img}">
                    <div class="figure-img">
                        <img src="/resources/image/${res.img}" width="50" height="50">
                        <input class="btn-sm btn-warning" type="submit" value="Show chat with ${res.username}">
                    </div>

                </form>
            </c:forEach>
        </div>
        <div id="mssg" class="col-md-8" style="height: 250px; border: solid #0d6db6; overflow: auto">
            <p>После загрузки сайта на хостинг </p>
            <p>не отправляются сообщения так же работаю!</p>
            <c:forEach items="${showThisChat}" var="showThisChat">
                <div class="bg-success">
                    <p>${showThisChat.message}</p>
                    <p>${showThisChat.date}</p>
                </div>
            </c:forEach>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4">
            <form action="show_my_chats" method="post">
                <input type="submit" class="btn-sm btn-primary col-md-12" value="Show my chats">
            </form>
        </div>
        <div class="col-md-8">
            <form method="POST" modelAttribute="chat" action="send_mssg">
                <input class="col-md-8" id="password" name="password" type="text" placeholder="message"
                       onclick="doAjax()"/>
                <input class="col-md-2 btn-primary" type="submit" value="Send">
                <span style="float: right" id="strengthValue"/>
            </form>
        </div>
    </div>
</div>
</body>
