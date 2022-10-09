package semana3.aula2;

import java.util.Scanner;

public class Repeticoes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 1;
        while (contador <= 5){
            System.out.println(contador);
            contador++;
        }
        entrada.close();
    }
}
