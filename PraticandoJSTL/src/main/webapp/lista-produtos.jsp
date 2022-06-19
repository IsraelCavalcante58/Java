<%--
  Created by IntelliJ IDEA.
  User: leoru
  Date: 01/06/2022
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <%@ include file="header.jsp"%>
    <title>Listagem de Produtos</title>
</head>
<body>
<%@ include file="menu.jsp"%>
<div class="container">
    <h1>Produtos</h1>
    <table class="table table-striped">
        <tr>
            <th>Nome</th>
            <th>Quantidade</th>
            <th>Valor</th>
        </tr>
        <c:forEach items="${produtos}" var="p">
            <tr>
                <td>${p.nome}</td>
                <td>${p.quantidade}</td>
                <td>${p.valor}</td>
            </tr>
        </c:forEach>

    </table>
</div>
<%@ include file="footer.jsp"%>
</body>
</html>
