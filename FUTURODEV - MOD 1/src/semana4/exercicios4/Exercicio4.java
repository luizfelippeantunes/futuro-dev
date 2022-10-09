package semana4.exercicios4;

import java.util.*;

public class Exercicio4 {
    public static void main(String[] args) {
        /*
        Um banco está atendendo 15 clientes. Escreva um programa em java que capture os clientes que estão
        sendo atendidos. Os clientes devem ser armazenados em um array list. Utilize o conceito de fila para
        adicionar os clientes na lista. Quando todos os clientes forem adicionados, imprima a lista de clientes.
        Depois, utilize o conceito de fila para remover os clientes já atendidos. Para cada cliente removido,
        imprima novamente a lista de clientes.
        */
        //Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);

        Queue<String> fila = new LinkedList<>();

        for (int i = 1; i <= 15; i++) {
            System.out.println("Digite o nome do " + i + "º cliente:");
            fila.add(entrada.nextLine());
        }
        System.out.println();
        System.out.println("Fila de clientes à espera: " + fila);
        System.out.println();
        System.out.println("Quantos clientes já foram atendidos?");
        int atendidos = Integer.parseInt(entrada.nextLine());
        if (atendidos > fila.size()) {
            atendidos = fila.size();
        }

        for (int i = 1; i <= atendidos; i++) {
            System.out.println();
            System.out.println(fila.peek() + " foi atendido(a)!");
            System.out.println();
            fila.remove();
            if (fila.isEmpty()) {
                System.out.println("Todos os clientes foram atendidos!");
            } else {
                System.out.println("Fila de clientes à espera: " + fila);
            }
        }
        entrada.close();
    }
}
