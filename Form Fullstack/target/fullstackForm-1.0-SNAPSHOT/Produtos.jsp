<%--
  Created by IntelliJ IDEA.
  User: leoru
  Date: 27/05/2022
  Time: 23:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registro de Produtos</title>
</head>
<body>

    <h1>Cadastro de Produtos</h1>
    <form action="produto" method="post">
        <div>
            <label for="id-nome">Nome</label>
            <input type="text" name="nome" id="id-nome">
        </div>
        <div>
            <label for="id-qtd">Quantidade</label>
            <input type="text" name="quantidade" id="id-qtd">
        </div>
        <div>
            <label for="id-valor">Valor</label>
            <input type="text" name="valor" id="id-valor">
        </div>
        <div>
            <label for="codigo">Codigo do Produto</label>
            <input type="text" name="codigo" id="codigo">
        </div>
        <input type="submit" value="Salvar">
    </form>
    <a href="produto?codigo=1">Buscar</a>

</body>
</html>
