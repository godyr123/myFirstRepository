<%--
  Created by IntelliJ IDEA.
  User: taratser
  Date: 24.05.2016
  Time: 18:26
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LOAN Form</title>
</head>
<body>
    <h1>New loan</h1>
    <form action="" method="post">
        <div id="loan">
            <table>
                <tr>
                    <td>Persons:</td>
                    <td>
                        <select name="personId">
                            <c:forEach items="${persons}" var="person">
                                <option value="${person.id}">${person.personCode} ${person.name} ${preson.surname}</option>
                            </c:forEach>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Amount:</td>
                    <td><input type="text" name = "amount" required /></td>
                </tr>
                <tr>
                    <td>Term:</td>
                    <td><input type="text" name = "term" required/></td>
                </tr>
            </table>
        </div>
        <div id="button">
            <input type="submit" value="Submit"/>
        </div>
    </form>
</body>
</html>
