package semana4.aula1.empresa.main;

import semana4.aula1.empresa.models.*;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        FuncionarioComissionado pedro = new FuncionarioComissionado();
        FuncionarioMensalista roberta = new FuncionarioMensalista();
        FuncionarioHorista joao = new FuncionarioHorista();

        pedro.setNome("Pedro");
        pedro.setCpf("0000000000");
        pedro.setPercentualComissao(10);
        pedro.setValorVendas(1000);
        roberta.setNome("Roberta");
        roberta.setCpf("1111111111");
        roberta.setSalario(500);
        joao.setNome("João");
        joao.setCpf("222222222");
        joao.setCustoHora(100);
        joao.setHorasTrabalhadas(200);

        List<Funcionario> listaDeFuncionarios = new ArrayList<>();
        listaDeFuncionarios.add(pedro);
        listaDeFuncionarios.add(roberta);
        listaDeFuncionarios.add(joao);

        FolhaPagamento folhaAgosto = new FolhaPagamento();

        folhaAgosto.calculaTotal(listaDeFuncionarios);

        System.out.println(pedro.getInfo());
        System.out.println("Salário Pedro: " + pedro.calculaSalario());
        System.out.println();
        System.out.println(joao.getInfo());
        System.out.println("Salário João: " + joao.calculaSalario());
        System.out.println();
        System.out.println(roberta.getInfo());
        System.out.println();
        System.out.println("Folha de pagamento de Agosto: " + folhaAgosto.getTotal());
    }
}
