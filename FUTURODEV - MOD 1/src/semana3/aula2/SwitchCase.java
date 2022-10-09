package semana3.aula2;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite o dia da semana, usando os números de 1 a 7 (onde 1 é Domingo, e 7 é Sábado)");
    int diaDaSemana = entrada.nextInt();
    if (diaDaSemana <= 0 || diaDaSemana > 7){
        System.out.println("Número inválido, digite o número correto (entre 1 e 7)");
        diaDaSemana = entrada.nextInt();
    }
    switch (diaDaSemana){
        case 1:
            System.out.println("Domingo");
            break;
        case 2:
            System.out.println("Segunda");
            break;
        case 3:
            System.out.println("Terça");
            break;
        case 4:
            System.out.println("Quarta");
            break;
        case 5:
            System.out.println("Quinta");
            break;
        case 6:
            System.out.println("Sexta");
            break;
        case 7:
            System.out.println("Sábado");
            break;
        default:
            System.out.println("Número inválido!");
            break;
    }
    entrada.close();
}
}