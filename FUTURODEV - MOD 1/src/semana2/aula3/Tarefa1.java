package semana2.aula3;

import java.util.Scanner;

public class Tarefa1 {
    public static void main(String[] args) {
        /* Criar um programa para ler o nome do usuário, e imprimir tudo em maiúsculo
        # Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava # */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = entrada.nextLine();
        String nomeMaiusculo = nome.toUpperCase();
        System.out.println(nomeMaiusculo);
    }
}
