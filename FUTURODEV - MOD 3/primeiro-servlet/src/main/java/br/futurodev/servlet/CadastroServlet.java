package br.futurodev.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Cadastro Servlet", urlPatterns = "/cadastro.do")
public class CadastroServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.println("<h1>Cadastro efetuado com sucesso!</h1>");

        String nome = req.getParameter("nome");
        String email = req.getParameter("email");
        String login = req.getParameter("login");
        String senha = req.getParameter("senha");
        String data = req.getParameter("data");

        writer.println("<ul>");
        writer.println("<li><b>Nome</b>: " + nome + "</li>");
        writer.println("<li><b>Email</b>: " + email + "</li>");
        writer.println("<li><b>Login</b>: " + login + "</li>");
        writer.println("<li><b>Senha</b>: " + senha + "</li>");
        writer.println("<li><b>Data de cadastro</b>: " + data + "</li>");
        writer.println("</ul>");
    }
}
