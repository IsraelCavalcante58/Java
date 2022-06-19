package com.example.fullstackform;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "operacao", value = "/operacao")
public class Operacao extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int result = 0;
        
        if(request.getParameter("operacao").equals("soma")){
            result = Integer.parseInt(request.getParameter("valor1")) + Integer.parseInt(request.getParameter("valor2"));

        }else if (request.getParameter("operacao").equals("subtracao")){
            result = Integer.parseInt(request.getParameter("valor1")) - Integer.parseInt(request.getParameter("valor2"));

        }else if (request.getParameter("operacao").equals("multipicacao")){
            result = Integer.parseInt(request.getParameter("valor1")) * Integer.parseInt(request.getParameter("valor2"));
        }else if (request.getParameter("operacao").equals("divisao")){
            result = Integer.parseInt(request.getParameter("valor1")) / Integer.parseInt(request.getParameter("valor2"));
        }

        request.setAttribute ("resultado", result);
        request.getRequestDispatcher("resposta.jsp").forward(request, response);

    }
}
