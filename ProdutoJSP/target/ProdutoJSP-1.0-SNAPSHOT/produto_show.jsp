<%@ page import="com.example.produtojsp.entities.Produto" %><%--
  Created by IntelliJ IDEA.
  User: leoru
  Date: 30/05/2022
  Time: 08:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Exibir Produto</title>
</head>
<body>
<%
    Produto p = (Produto) session.getAttribute("produto");
    out.println("Nome do Produto: " + p.getNome() + "<br>");
    out.println("Valor do Produto: " + p.getValor());
%>
</body>
</html>
