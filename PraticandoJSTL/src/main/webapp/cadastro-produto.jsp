<%--
  Created by IntelliJ IDEA.
  User: leoru
  Date: 01/06/2022
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <%@ include file="header.jsp" %>
    <title>Cadastro de Produtos</title>
</head>
<body>
<%@ include file="menu.jsp"%>
<div class="container">
    <h1>Cadastro de Produto</h1>

<c:if test="${not empty msg}">
    <div class="alert alert-sucess">
        ${msg}
    </div>
</c:if>
    <form action="produto" method="post">
        <div class="form-group">
            <label for="id-nome">Nome</label>
            <input type="text" name="nome" id="id-nome" class="form-control">
        </div>
        <div class="form-group">
            <label for="id-qtd">Quantidade</label>
            <input type="text" name="quantidade" id="id-qtd" class="form-control">
        </div>
        <div class="form-group">
            <label for="id-valor">Valor</label>
            <input type="text" name="valor" id="id-valor" class="form-control">
        </div>
        <input type="submit" value="Salvar" class="btn btn-primary">
    </form>
</div>
<%@ include file="footer.jsp"%>
</body>
</html>
