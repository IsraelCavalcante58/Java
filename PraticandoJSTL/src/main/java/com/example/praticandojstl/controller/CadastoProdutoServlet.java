package com.example.praticandojstl.controller;

import com.example.praticandojstl.model.Produto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "produto", value = "/produto")
public class CadastoProdutoServlet extends HttpServlet {
    private static List<Produto> lista= new ArrayList<Produto>();
    private static final long serialVersionUID = 1L;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        int qtd = Integer.parseInt(request.getParameter("quantidade"));
        double valor = Double.parseDouble(request.getParameter("valor"));

        Produto produto = new Produto(nome, qtd, valor);

        lista.add(produto);

        request.setAttribute("msg", "Produto cadastrado!");
        request.getRequestDispatcher("cadastro-produto.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setAttribute("produtos", lista);
        request.getRequestDispatcher("lista-produtos.jsp").forward(request, response);
    }
}