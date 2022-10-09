package br.com.futurodev.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class ServletExercicios2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();

        String nome = req.getParameter("nome");
        String cidade = req.getParameter("cidade");
        String idade = req.getParameter("idade");

        writer.println("<h1>Módulo 3 - Semana 2 - Exercícios</h1>");
        writer.println("<h3>Olá " + nome + ", você tem " + idade + " anos e mora na cidade de " + cidade + ".</h3>");
    }
}
