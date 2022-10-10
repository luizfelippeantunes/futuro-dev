package br.com.futurodev.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class M3S02E02 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();

        String usuario = req.getParameter("usuario");
        String senha = req.getParameter("senha");

        if (usuario.equals("admin") && senha.equals("password")) {
            writer.println("<h1>Módulo 3 - Semana 2 - Exercício 2</h1>");
            writer.println("<h3>Bem vindo usuário admin</h3>");
        } else {
            writer.println("<h1>Módulo 3 - Semana 2 - Exercício 2</h1>");
            writer.println("<h3>Login e/ou senha inválidos!</h3>");
        }
    }
}
