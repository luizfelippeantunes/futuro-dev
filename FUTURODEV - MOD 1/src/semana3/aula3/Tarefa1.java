package semana3.aula3;

import java.util.Scanner;

public class Tarefa1 {
    public static void main(String[] args) {
        /*Um time de futebol participou de um campeonato regional. O campeonato teve 10 jogos.
        Ecreva um programa que capture o número de pontos que o time fez por jogo.
        O programa deve mostrar o total de pontos obtidos pelo time ao final dos 10 jogos.*/

        //Exercício realizado pelo aluno Luiz Felippe - Turma Brava

        Scanner entrada = new Scanner(System.in);
        int contador = 1;
        String resultado = "";
        int somaPontos = 0;
        int vitorias = 0;
        int empates = 0;
        int derrotas = 0;
        System.out.println("Qual o nome da sua equipe?");
        String equipe = entrada.nextLine();
        while (contador <= 10) {
            System.out.println("Jogo " + contador + " - Qual foi o resultado?\n" +
                    "Digite V para Vitória\n" +
                    "Digite E para Empate\n" +
                    "Digite D para Derrota\n");
            resultado = entrada.nextLine();
            resultado = resultado.toUpperCase();
            switch (resultado) {
                case "V":
                    somaPontos = somaPontos + 3;
                    vitorias++;
                    break;
                case "E":
                    somaPontos = somaPontos + 1;
                    empates++;
                    break;
                case "D":
                    derrotas++;
                    break;
                default:
                    System.out.println("### RESULTADO INVÁLIDO! ###\n");
                    contador--;
            }
            contador++;
        }
        entrada.close();
        //System.out.println("A equipe " + equipe + " fez um total de " + somaPontos + " pontos na competição.");
        System.out.printf("A equipe %s teve um total de %d vitórias, %d empates e %d derrotas, totalizando %d pontos na" +
                " competição.", equipe, vitorias, empates, derrotas, somaPontos);
    }
}
