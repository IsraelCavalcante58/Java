<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Tratamento da Pesquisa</title>
</head>
<body>
Participação na pesquisa: ${param.pesquisa}
<br>
Nome: ${param.nome} <br>
Idade: ${param.idade} <br>
Maior de idade? ${(param.idade >= 18) ? "Sim" : "Não"} <br>
Salário : ${param.salario*12} <br>

<%
        session.setAttribute("nome", request.getParameter("nome"));
%>

Nome na sessão: ${sessionScope.nome}

</body>
</html>