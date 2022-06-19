<%@ page import="com.example.produtojsp.entities.Produto" %><%--
  Created by IntelliJ IDEA.
  User: leoru
  Date: 30/05/2022
  Time: 07:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Produto ADD JSP</title>
</head>
<body>
<%
String nome = "";
if (request.getParameter("nome") != null){
    nome = request.getParameter("nome");
}
float valor = 0;
if (request.getParameter("valor") != null){
    valor = Float.parseFloat(request.getParameter("valor"));
}
if ((nome != "") && (valor != 0 )){
    Produto p = new Produto(nome, valor);
    session.setAttribute("produto", p);
}
%>
<jsp:forward page="produto_show.jsp"/>
</body>
</html>
