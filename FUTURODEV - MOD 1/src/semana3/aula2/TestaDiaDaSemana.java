package semana3.aula2;

import java.util.Scanner;

public class TestaDiaDaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o dia da semana, usando os números de 1 a 7 (onde 1 é Domingo, e 7 é Sábado)");
        int diaDaSemana = entrada.nextInt();
        if (diaDaSemana <= 0 || diaDaSemana > 7){
            System.out.println("Número inválido, digite o número correto (entre 1 e 7)");
            diaDaSemana = entrada.nextInt();
        }
        if (diaDaSemana == 1) {
            System.out.println("Domingo");
        } else if (diaDaSemana == 2) {
            System.out.println("Segunda-feira");
        } else if (diaDaSemana == 3) {
            System.out.println("Terça-feira");
        } else if (diaDaSemana == 4) {
            System.out.println("Quarta-feira");
        } else if (diaDaSemana == 5) {
            System.out.println("Quinta-feira");
        } else if (diaDaSemana == 6) {
            System.out.println("Sexta-Feira");
        } else {
            System.out.println("Sábado");
        }
        entrada.close();
    }
}