package semana4.aula2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class AulaDeFilaEPilha {
    public static void main(String[] args) {
        List<Integer> fila = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            fila.add(i);
        }

        System.out.println("minha fila �: " + fila);

        if (!fila.isEmpty()) {
            fila.remove(0);
        }

        System.out.println("minha fila �: " + fila);


        List<Integer> pilha = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            pilha.add(i);
        }

        System.out.println("Minha pilha �: " + pilha);

        if (!pilha.isEmpty()) {
            pilha.remove(pilha.size() - 1);
        }

        System.out.println("Minha pilha �: " + pilha);


        Queue<Integer> filaQueue = new LinkedList<>();

        filaQueue.add(1);
        filaQueue.add(2);
        filaQueue.add(3);
        filaQueue.add(4);
        filaQueue.add(5);

        System.out.println("filaQueue: " + filaQueue);

        int removido = filaQueue.remove();

        System.out.println("filaQueue depois da remo��o: " + filaQueue);

        int primeiroDaFila = filaQueue.peek();

        System.out.println("primeiro item da fila: " + primeiroDaFila);
        System.out.println("tamanho da fila: " + filaQueue.size());

        Stack<Integer> pilhaStack = new Stack<>();

        for (int i = 0; i < 5; i++) {
            pilhaStack.push(i);
        }

        System.out.println("minha stack �: " + pilhaStack);

        int removidoStack = pilhaStack.pop();

        System.out.printf("%d removido da Stack. Agora a Stack �: %s.%n", removidoStack, pilhaStack);

        int tamanhoStack = pilhaStack.size();

        int topoStack = pilhaStack.peek();

        System.out.printf("Minha pilha tem %d elementos, e o topo � %d.%n", tamanhoStack, topoStack);

        int posicao = pilhaStack.search(1);

        if (posicao >= 0) {
            System.out.printf("Elemento %d na posi��o %d.%n", 1, posicao);
        } else {
            System.out.printf("Elemento %d n�o existe na pilha.", 1);
        }
    }
}