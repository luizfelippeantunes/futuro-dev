package semana3.aula2;

import java.util.Scanner;

public class Tarefa1 {
    public static void main(String[] args) {
        //Exerc�cio feito pelo aluno Luiz Felippe - Turma Brava
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o n�mero do m�s desejado (Entre 1 e 12):");
        int diaDoMes = entrada.nextInt();
        switch (diaDoMes){
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Mar�o");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
                default:
                System.out.println("N�mero inv�lido!");
                break;
        }
        entrada.close();
    }
}
