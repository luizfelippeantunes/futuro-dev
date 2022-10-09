package br.futurodev.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class PrimeiroServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        String nome = req.getParameter("nome");
        String idade = req.getParameter("idade");

        writer.println("<h2>Nosso primeiro servlet</h2>");
        writer.println("<h3>Olá " + nome + " você tem " + idade + " anos de idade.</h3>");

        Integer intIdade = Integer.parseInt(idade);

        if (intIdade < 14) {
            // criança
            writer.println("<h4>Você é uma criança!</h4>");
        } else if (intIdade < 18) {
            //adolescente
            writer.println("<h4>Você é um adolescente!</h4>");
        } else if (intIdade < 60) {
            //adulto
            writer.println("<h4>Você é um adulto!</h4>");
        } else {
            //idoso
            writer.println("<h4>Você é um idoso!</h4>");
        }
    }
}
