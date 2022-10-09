package semana3.aula3;

import java.util.Scanner;

public class UsandoFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String resultado = "";
        int somaPontos = 0;
        int vitorias = 0;
        int empates = 0;
        int derrotas = 0;
        System.out.println("Qual o nome da sua equipe?");
        String equipe = entrada.nextLine();
        for (int contador = 1; contador <= 10; contador++) {
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
        }
        entrada.close();
        //System.out.println("A equipe " + equipe + " fez um total de " + somaPontos + " pontos na competição.");
        System.out.printf("A equipe %s teve um total de %d vitória(s), %d empate(s) e %d derrota(s), totalizando %d ponto(s) na" +
                " competição.", equipe, vitorias, empates, derrotas, somaPontos);
    }
}
