<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <title>Bookshop</title>
    </head>
    <body>
        <h1>${test}</h1>
        <c:forEach var="book" items="${books}">
            <c:out value="${book.name}"/>
            <c:out value="${book.author}"/>
        </c:forEach>
    </body>
</html>