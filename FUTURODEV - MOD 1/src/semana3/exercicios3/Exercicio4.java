package semana3.exercicios3;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        /*
        Uma empresa precisa criar um relatório com o perfil dos seus colaboradores. Escreva um programa que capture
        do usuário o perfil de 30 colaboradores. O programa deve capturar o nome, a idade, o sexo e o tempo de casa
        de cada colaborador. Após capturar os dados dos 30 colaboradores, o programa deve imprimir na tela:
            A quantidade de colaboradores do sexo feminino.
            A quantidade de colaboradores do sexo masculino.
            O colaborador com maior tempo de casa.
        */
        //Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        int feminino = 0;
        int masculino = 0;
        int tempo = 0;
        int maisTempo = 0;
        String nomeMaisTempo = "O dono";

        while (contador <= 30) {
            System.out.printf("Digite o nome do %dº funcionário(a):%n", contador);
            String nome = entrada.nextLine();
            nome = nome.trim();

            System.out.printf("Digite a idade de %s:%n", nome);
            int idade = Integer.parseInt(entrada.nextLine());

            System.out.printf("Digite o sexo de %s: (Masculino ou Feminino)%n", nome);
            String sexo = entrada.nextLine();
            sexo = sexo.trim();
            sexo = sexo.toUpperCase();
            char sexoChar = sexo.charAt(0);
            while (sexoChar != 'F' && sexoChar != 'M') {
                System.out.println("Sexo inválido! Digite novamente (Feminino ou Masculino):");
                sexo = entrada.nextLine();
                sexo = sexo.trim();
                sexo = sexo.toUpperCase();
                sexoChar = sexo.charAt(0);
            }
                if (sexoChar == 'F') {
                    feminino++;
                } else {
                    masculino++;
                }
            System.out.printf("Digite o tempo que %s está na empresa: (em anos)%n", nome);
            tempo = Integer.parseInt(entrada.nextLine());
            if (tempo > maisTempo){
                maisTempo = tempo;
                nomeMaisTempo = nome;
            }
            contador++;
        }
        System.out.println();
        System.out.printf("A empresa possui %d funcionária(s) do sexo feminino, e %d do sexo masculino.%n", feminino, masculino);
        System.out.println(nomeMaisTempo + " é quem tem mais tempo de empresa, com " + maisTempo + " anos no total.");
        entrada.close();
    }
}