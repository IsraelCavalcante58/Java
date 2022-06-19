<%--
  Created by IntelliJ IDEA.
  User: leoru
  Date: 27/05/2022
  Time: 10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculadora</title>
</head>
<body>
    <form action="operacao" method="post">
        <fieldset>
            <legend>Calcular</legend>
            <label>Valor - 1</label>
            <input type="text" name="valor1">
            <hr />
            <label>Operação</label>
            <select name="operacao">
                <option value="soma">+</option>
                <option value="subtracao">-</option>
                <option value="multiplicacao">*</option>
                <option value="divisao">/</option>
            </select>
            <hr />
            <label>Valor - 2</label>
            <input type="text" name="valor2">
        </fieldset>
        <input type="submit" value="Enviar">
    </form>
</body>
</html>
