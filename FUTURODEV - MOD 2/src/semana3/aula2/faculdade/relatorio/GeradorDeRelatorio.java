package semana3.aula2.faculdade.relatorio;

import semana4.aula1.faculdade.models.Funcionario;

public class GeradorDeRelatorio {
    public void adiciona(Funcionario f) {
        System.out.println(f.getInfo());
        System.out.println(f.getGastos());
    }
}
