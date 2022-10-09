package semana4.aula4;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[][] predio = new String[2][2];
        int linha;
        int coluna;
        for (linha = 0; linha < predio.length; linha++) {
            for (coluna = 0; coluna < predio[linha].length; coluna++) {
                System.out.println("Digite o nome do " + (coluna + 1) + "º morador do " + (linha + 1) + "º andar:");
                predio[linha][coluna] = leitor.nextLine();
            }
        }
    }
}