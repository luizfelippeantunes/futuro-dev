package br.com.futurodev.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Cadastro Notas", urlPatterns = "/M3S02E04")
public class M3S02E04 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        String nomeAluno = req.getParameter("aluno");
        String nomeDisciplina = req.getParameter("disciplina");
        String nota1 = req.getParameter("nota1");
        String nota2 = req.getParameter("nota2");
        String nota3 = req.getParameter("nota3");
        String nota4 = req.getParameter("nota4");

        Double media = (Double.parseDouble(nota1) + Double.parseDouble(nota2) + Double.parseDouble(nota3) + Double.parseDouble(nota4)) / 4;

        writer.println("<h1>Formulário enviado com sucesso!</h1>");
        writer.println("<h3>Olá aluno(a) " + nomeAluno + " suas notas são:</h3>");
        writer.println("<ul><li>Nota 1: <b>" + nota1 + "</b></li>");
        writer.print("<li>Nota 2: <b>" + nota2 + "</b></li>");
        writer.print("<li>Nota 3: <b>" + nota3 + "</b></li>");
        writer.print("<li>Nota 4: <b>" + nota4 + "</b></li></ul>");
        writer.println("<h3>Sua média na disciplina " + nomeDisciplina + " foi " + media + ".</h3>");
        if (media >= 7) {
            writer.println("<h3>E portanto está APROVADO!</h3>");
        } else if (media >= 6) {
            writer.println("<h3>E portanto está em RECUPERAÇÃO!</h3>");
        } else {
            writer.println("<h3>E portanto está REPROVADO!</h3>");
        }
    }
}
