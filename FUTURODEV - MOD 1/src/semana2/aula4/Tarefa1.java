package semana2.aula4;

import java.util.Scanner;

public class Tarefa1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = entrada.nextLine();
        System.out.println("Qual sua nota na prova?");
        double nota = entrada.nextDouble();
        //double nota = Double.parseDouble(entrada.nextLine()); //Op��o de receber como string e j� converter pra Double
        //String notaEntrada = entrada.nextLine(); //Op��o para receber uma String, e depois converter no tipo desejado
        //double nota = Double.parseDouble(notaEntrada); //Para converter de String para Double
        if (nota < 0 || nota > 10){ //IF para validar se a nota � v�lida
            System.out.println("Nota inv�lida, digite um valor entre 0 e 10:");
            nota = entrada.nextDouble();
        }
        if (nota >= 7){
                System.out.println(nome + " voc� tirou a nota " + nota + " e portanto est� APROVADO!");
            } else {
                System.out.println(nome + " voc� tirou a nota " + nota + " e portanto est� REPROVADO!");
            }
        entrada.close();
    }
}
