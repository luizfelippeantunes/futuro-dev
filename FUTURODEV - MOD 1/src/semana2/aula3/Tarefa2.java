package semana2.aula3;

import java.util.Scanner;

public class Tarefa2 {
    public static void main(String[] args) {
        /* Criar um programa para ler qual � o carro do usu�rio, qual a m�dia de consumo, e quantos kilometros ele viajou
        e fa�a a impress�o do consumo total de combust�vel nessa viagem
        # Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava # */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o seu carro:");
        String carro = entrada.nextLine();
        System.out.println("Qual � o consumo m�dio do seu carro (digite apenas o valor em KM gasto com 1 litro de combust�vel):");
        double mediaConsumo = entrada.nextDouble();
        System.out.println("Qual foi distancia total da sua viagem (digite apenas o valor em KM):");
        double distancia = entrada.nextDouble();
        double consumo = distancia / mediaConsumo;
        System.out.printf("O carro %s tem uma m�dia de consumo de %.1f KM/L, e ao realizar uma viagem de %.1f KM, " +
                "gastou %.2f litros de combust�vel.", carro, mediaConsumo, distancia, consumo);
    }
}
