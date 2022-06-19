package com.example.fullstackform;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "produto", value = "/produto")
public class Produto extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        System.out.println("Código: " + codigo);
        request.setAttribute("cod", codigo);
        request.setAttribute("nome", "Caneta Vermelha");
        request.getRequestDispatcher("busca-produto.jsp").forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        int qtd = Integer.parseInt(request.getParameter("quantidade"));
        double valor = Double.parseDouble(request.getParameter("valor"));
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        System.out.println(nome + " quantidade: " + qtd + "Valor R$" + valor);


        request.setAttribute("nomeProduto", nome);
        request.setAttribute("quantidade", qtd);
        request.setAttribute("valorProduto", valor);
        request.setAttribute("codigo", codigo);
        request.getRequestDispatcher("sucessoProduto.jsp").forward(request, response);
    }
}
