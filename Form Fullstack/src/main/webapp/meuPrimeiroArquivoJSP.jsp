<%--
  Created by IntelliJ IDEA.
  User: leoru
  Date: 30/05/2022
  Time: 07:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String x = request.getHeader("user-agent");
        out.println(x);

    %>
</body>
</html>
