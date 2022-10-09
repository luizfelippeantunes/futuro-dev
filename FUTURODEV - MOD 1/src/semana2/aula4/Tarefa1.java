package semana2.aula4;

import java.util.Scanner;

public class Tarefa1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = entrada.nextLine();
        System.out.println("Qual sua nota na prova?");
        double nota = entrada.nextDouble();
        //double nota = Double.parseDouble(entrada.nextLine()); //Opção de receber como string e já converter pra Double
        //String notaEntrada = entrada.nextLine(); //Opção para receber uma String, e depois converter no tipo desejado
        //double nota = Double.parseDouble(notaEntrada); //Para converter de String para Double
        if (nota < 0 || nota > 10){ //IF para validar se a nota é válida
            System.out.println("Nota inválida, digite um valor entre 0 e 10:");
            nota = entrada.nextDouble();
        }
        if (nota >= 7){
                System.out.println(nome + " você tirou a nota " + nota + " e portanto está APROVADO!");
            } else {
                System.out.println(nome + " você tirou a nota " + nota + " e portanto está REPROVADO!");
            }
        entrada.close();
    }
}
