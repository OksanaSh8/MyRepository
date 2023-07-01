<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 04.09.2022
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Conference</title>
</head>
<body>
<font size="5">
    <p><strong>${conferenceAttr.getName()}</strong></p>
    <p></p>
    <p>Department: ${conferenceAttr.getCathedra()}</p>
    <p>Date: ${conferenceAttr.getData()}</p>
    <p><strong>Conference program</strong></p>
    <table border="1">
        <tr>

            <th>Id</th>
            <th>Event</th>
            <th>Time</th>
        </tr>
<c:forEach var="conference" items="${conferenceAttr1}">

            <tr>
                <td>${conference.getId()}</td>
                <td>${conference.getEvent()} </td>
                <td>${conference.getTime()}</td>
            </tr>
        </c:forEach>
    </table>
</font>
</body>
</html>
