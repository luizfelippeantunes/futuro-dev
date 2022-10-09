package semana2.exercicios2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        /*
        Crie um programa em Java que, utilizando a classe Scanner, pergunte ao usu�rio sua data de nascimento
        e calcule a sua idade. Se o usu�rio tiver 18 anos ou mais, escreva na tela ?voc� � maior de idade?,
        mas caso tenha menos de 18 anos, escreva ?voc� � menor de idade?.
         */
        //Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = entrada.nextLine();
        nome = nome.trim();

        System.out.println("Digite o dia do seu nascimento:");
        int diaNasc = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite o m�s do seu nascimento:");
        int mesNasc = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite o ano do seu nascimento:");
        int anoNasc = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite o dia atual:");
        int diaAtual = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite o m�s atual:");
        int mesAtual = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite o ano atual:");
        int anoAtual = Integer.parseInt(entrada.nextLine());

        if(((anoAtual - anoNasc) >= 18) && (mesAtual <= mesNasc) && (diaAtual <= diaNasc)){
            if(mesNasc < 10){
                String mes = "0"+mesNasc;
            System.out.printf("%s, voc� nasceu no dia %d/%s/%d e portanto � maior de idade.", nome, diaNasc, mes, anoNasc);
            }else{
                System.out.printf("%s, voc� nasceu no dia %d/%d/%d e portanto � maior de idade.", nome, diaNasc, mesNasc, anoNasc);
            }
        } else{
            if(mesNasc < 10){
                String mes = "0"+mesNasc;
                System.out.printf("%s, voc� nasceu no dia %d/%s/%d e portanto � menor de idade.", nome, diaNasc, mes, anoNasc);
            }else{
                System.out.printf("%s, voc� nasceu no dia %d/%d/%d e portanto � menor de idade.", nome, diaNasc, mesNasc, anoNasc);
            }
        }
        entrada.close();
    }
}
