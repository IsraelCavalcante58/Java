package com.example.fullstackform;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "login", value = "/login")
public class Exemplo extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");

        if (login.equals("user") && senha.equals("admin")){
            response.sendRedirect("sucesso.jsp");

        }else if (!login.equals("user") || !senha.equals("admin")){
            response.sendRedirect("acesso_negado.jsp");
        }

    }


    public void destroy() {
    }
}