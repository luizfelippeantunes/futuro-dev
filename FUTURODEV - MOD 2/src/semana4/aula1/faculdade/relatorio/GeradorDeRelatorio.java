package semana4.aula1.faculdade.relatorio;

import semana4.aula1.faculdade.models.Funcionario;
import semana4.aula1.faculdade.models.Professor;

public class GeradorDeRelatorio {
    public static void adiciona(Funcionario f) {
        System.out.println(f.getInfo());
        System.out.println(f.getGastos());
        if (f instanceof Professor) {
            Professor prof = (Professor) f;
            System.out.println(prof.getQuantidadeDisciplinas());
        }
    }
}
