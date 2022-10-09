package semana4.aula1.faculdade.main;

import semana4.aula1.faculdade.models.Funcionario;
import semana4.aula1.faculdade.models.Professor;
import semana4.aula1.faculdade.models.Reitor;
import semana4.aula1.faculdade.relatorio.GeradorDeRelatorio;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setNome("Lucas");
        professor.setHorasDeAula(40);
        professor.setSalario(50);

        Reitor reitor = new Reitor();
        reitor.setNome("Luna");
        reitor.setSalario(200);

        GeradorDeRelatorio.adiciona(professor);
        GeradorDeRelatorio.adiciona(reitor);
    }
}
