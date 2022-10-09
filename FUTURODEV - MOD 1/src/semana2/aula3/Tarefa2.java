package semana2.aula3;

import java.util.Scanner;

public class Tarefa2 {
    public static void main(String[] args) {
        /* Criar um programa para ler qual é o carro do usuário, qual a média de consumo, e quantos kilometros ele viajou
        e faça a impressão do consumo total de combustível nessa viagem
        # Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava # */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o seu carro:");
        String carro = entrada.nextLine();
        System.out.println("Qual é o consumo médio do seu carro (digite apenas o valor em KM gasto com 1 litro de combustível):");
        double mediaConsumo = entrada.nextDouble();
        System.out.println("Qual foi distancia total da sua viagem (digite apenas o valor em KM):");
        double distancia = entrada.nextDouble();
        double consumo = distancia / mediaConsumo;
        System.out.printf("O carro %s tem uma média de consumo de %.1f KM/L, e ao realizar uma viagem de %.1f KM, " +
                "gastou %.2f litros de combustível.", carro, mediaConsumo, distancia, consumo);
    }
}
