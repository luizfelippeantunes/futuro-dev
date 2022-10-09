package semana3.exercicios3;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        /*
        Um professor de educação física quer montar um time de vôlei em uma escola.
        Para isso, o professor estabeleceu alguns pré requisitos:
            O time deve ser composto por estudantes com idade acima de 15 anos.
            O time deve ser composto por pessoas do sexo feminino.
            O time deve ser composto por 6 estudantes.
        Escreva um programa que capture o nome, a idade e o sexo de cada estudante da escola.
        O programa deve parar de capturar as entradas quando houver 6 pessoas no time.
        Para cada candidato aprovado, o programa deve mostrar o nome da estudante aprovada,
        bem como o número de pessoas aprovadas até o momento.
        */
        //Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);

        int aprovados = 0;

        do {
            System.out.println("Digite o nome do estudante:");
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
            if (sexoChar == 'F' && idade > 15) {
                aprovados++;
                System.out.printf("%nParabéns %s, você foi a %dª aprovada para o time!%n", nome, aprovados);
            } else {
                System.out.printf("%n%s, você foi reprovado(a) por não atender os requisitos.%n", nome);
            }
        } while (aprovados < 6);
        System.out.printf("%nO time chegou ao número máximo de integrantes, fique ligado para os próximos processos seletivos.%n");
        System.out.printf("%n### FIM DO PROGRAMA ###%n");
        entrada.close();
    }
}
