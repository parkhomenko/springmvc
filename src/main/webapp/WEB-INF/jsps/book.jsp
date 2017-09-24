<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <title>Book Addition</title>
        <style>
            .errors-top {
                border: 1px crimson solid;
                color: red;
            }

            .error {
                color: red;
            }
        </style>
    </head>

    <body>
        <h1>Add a new book form</h1>

        <img src="<c:url value="/images/test.png"/>" />

        <form:form commandName="book">
            <form:errors path="*" cssClass="errors-top" element="div"/>
            <table>
                <tr>
                    <td>Book Name</td>
                    <td>
                        <form:input path="name"/>
                    </td>
                    <td>
                        <form:errors path="name" cssClass="error" />
                    </td>
                </tr>
                <tr>
                    <td>Book Author</td>
                    <td>
                        <form:input path="author"/>
                    </td>
                    <td>
                        <form:errors path="author"/>
                    </td>
                </tr>
                <tr>
                    <td>Book Price</td>
                    <td>
                        <form:input path="price"/>
                    </td>
                    <td>
                        <form:errors path="price"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Add Book"/>
                    </td>
                </tr>
            </table>
        </form:form>
    </body>
</html>