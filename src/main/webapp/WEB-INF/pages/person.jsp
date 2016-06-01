<%--
  Created by IntelliJ IDEA.
  User: taratser
  Date: 24.05.2016
  Time: 18:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Person Form</title>
</head>
<body>
    <h1>Create person</h1>
    <form action="" method="post">
        <div id="loan">
            <table>
                <tr>
                    <td>Person code:</td>
                    <td><input type="text" name = "personCode" required /></td>
                </tr>
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name = "name" required/></td>
                </tr>
                <tr>
                    <td>Surname:</td>
                    <td><input type="text" name = "surname" required/></td>
                </tr>

            </table>
        </div>
        <div id="button">
            <input type="submit" value="Submit"/>
        </div>
    </form>
</body>
</html>
