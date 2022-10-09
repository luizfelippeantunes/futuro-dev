package semana4.aula2.empresa.main;

import semana4.aula2.empresa.models.*;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        FuncionarioComissionado f1 = new FuncionarioComissionado();
        FuncionarioMensalista f2 = new FuncionarioMensalista();
        FuncionarioHorista f3 = new FuncionarioHorista();

        f1.setNome("Pedro");
        f1.setCpf("0000000000");
        f1.setPercentualComissao(10);
        f1.setValorVendas(1000);
        f2.setNome("Roberta");
        f2.setCpf("1111111111");
        f2.setSalario(500);
        f3.setNome("João");
        f3.setCpf("222222222");
        f3.setCustoHora(100);
        f3.setHorasTrabalhadas(200);

        List<Funcionario> listaDeFuncionarios = new ArrayList<>();
        listaDeFuncionarios.add(f1);
        listaDeFuncionarios.add(f2);
        listaDeFuncionarios.add(f3);

        FolhaPagamento folhaAgosto = new FolhaPagamento();

        Fornecedor fornec1 = new Fornecedor("Deltacon", "000000000/0001-00", "Floripa");
        Fatura nf1 = new Fatura();
        nf1.setFornecedor(fornec1);
        nf1.setValorNotaFiscal(1000);

        folhaAgosto.calculaTotal(listaDeFuncionarios);

        List<ContaAPagar> contasAPagar = new ArrayList<>();
        contasAPagar.add(nf1);
        for (Funcionario f : listaDeFuncionarios){
            contasAPagar.add(f);
        }

        folhaAgosto.calculaTotalGastos(contasAPagar);

        System.out.println(f1.getInfo() + " Salário Pedro: R$ " + f1.calculaSalario());
        System.out.println();
        System.out.println(f2.getInfo());
        System.out.println();
        System.out.println(f3.getInfo() + " Salário João: R$ " + f3.calculaSalario());
        System.out.println();
        System.out.println("Valor total de Contas a Pagar: R$ " + folhaAgosto.getTotal());
    }
}