package semana3.exercicios3;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        /*
        Uma empresa está fazendo um processo seletivo para contratar colaboradores nos seguintes cargos:
        Desenvolvedor, Analista de Sistemas, Testador e Analista de RH.
        Escreva um programa que capture o nome, o cargo e o status do candidato, ou seja, se foi aprovado ou não.
        O programa deve capturar os dados de 50 candidatos.
        Ao final, o programa deve imprimir:
            A quantidade de candidatos aprovados por cargo de forma individual.
            O número de candidatos aprovados no total, de forma geral.
            O número de candidatos reprovados.
        */
        //Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        int aprovados1 = 0;
        int aprovados2 = 0;
        int aprovados3 = 0;
        int aprovados4 = 0;

        while (contador <= 50) {
            System.out.printf("Digite o nome do %dº candidato:%n", contador);
            String nome = entrada.nextLine();

            System.out.printf("Digite o cargo que o candidato %s se inscreveu:%n" +
                    "Digite 1 - Desenvolvedor%n" +
                    "Digite 2 - Analista de Sistemas%n" +
                    "Digite 3 - Testador%n" +
                    "Digite 4 - Analista de RH%n", nome);
            int cargo = Integer.parseInt(entrada.nextLine());
            while (cargo < 1 || cargo > 4) {
                System.out.println("Opção inválida, digite novamente a opção correta:");
                cargo = Integer.parseInt(entrada.nextLine());
            }

            System.out.printf("%s foi aprovado?%n" +
                    "Digite 1 - Aprovado%n" +
                    "Digite 2 - Reprovado%n", nome);
            int aprovado = Integer.parseInt(entrada.nextLine());
            while (aprovado < 1 || aprovado > 2) {
                System.out.println("Opção inválida, digite novamente a opção correta:");
                aprovado = Integer.parseInt(entrada.nextLine());
            }
            if (aprovado == 1) {
                switch (cargo) {
                    case 1:
                        aprovados1++;
                        break;
                    case 2:
                        aprovados2++;
                        break;
                    case 3:
                        aprovados3++;
                        break;
                    default:
                        aprovados4++;
                }
            }
            contador++;
        }
        int totalAprovados = aprovados1 + aprovados2 + aprovados3 + aprovados4;
        System.out.printf("Houveram %d candidatos aprovados para o cargo de Desenvolvedor.%n", aprovados1);
        System.out.printf("Houveram %d candidatos aprovados para o cargo de Analista de Sistemas.%n", aprovados2);
        System.out.printf("Houveram %d candidatos aprovados para o cargo de Testador.%n", aprovados3);
        System.out.printf("Houveram %d candidatos aprovados para o cargo de Analista de RH.%n", aprovados4);
        System.out.printf("Totalizando %d candidatos aprovados no processo seletivo.%n", totalAprovados);
        System.out.printf("E tivemos %d candidatos reprovados no processo seletivo.%n", ((contador - 1) - totalAprovados));
        entrada.close();
    }
}
