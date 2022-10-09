package semana4.aula2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AulaDeArrayList {
    public static void main(String[] args) {
    /*String[] nomes = new String[5]; // [0, 1, 2, 3, 4]

    nomes[0] = "Carlos";
    nomes[1] = "Ricardo";
    nomes[2] = "Mônica";
    nomes[3] = "Luna";
    nomes[4] = "Marina";

    nomes[1] = null;
    String str1 = "";
    String str2 = null;

    System.out.println("Teste".equals(str2));

    // System.out.println(str2.equals("")); // NPE

    System.out.println(str1.equals(nomes[1]));

    nomes[1] = "João";

    System.out.println(nomes[1]);

    for (String nome : nomes) {
      System.out.println(nome);
    }*/

        // ArrayList listaDeNomes = new ArrayList();

        List<String> listaNomes = new ArrayList<>();

        listaNomes.add("Venilson");
        listaNomes.add("José Yuri");
        listaNomes.add("Jacson");
        listaNomes.add("Leonardo");
        System.out.println(listaNomes);

        listaNomes.add(0, "Marina");
        // listaNomes.add(123);
        System.out.println(listaNomes);

        List<Integer> idades = new ArrayList<>(); //int ~= Integer

        idades.add(31);
        idades.add(25);
        idades.add(28);
        // idades.add("teste");

        System.out.println("Maior elemento em idades: " + Collections.max(idades));
        System.out.println("Menor elemento em idades: " + Collections.min(idades));

        Collections.reverse(idades);
        System.out.println(idades);

        System.out.println("tamanho lista idades: " + idades.size());
        System.out.println("último elemento listaNomes: " + listaNomes.get(listaNomes.size() - 1));


        listaNomes.remove("Jacson");
        for (int i = 0; i < listaNomes.size(); i++) {
            System.out.print(listaNomes.get(i) + ",");
        }

        listaNomes.remove(3);

        System.out.println();

        for (String nome : listaNomes) {
            System.out.print(nome + ",");
        }

        System.out.println();
        for (int i = 0; i < idades.size(); i++) {
            System.out.println(idades.get(i));
        }

        if (idades.contains(30)) {
            System.out.println("Na turma existe alguém com 30 anos.");
        } else {
            System.out.println("Na turma não existe ninguém com 30 anos.");
        }

        Collections.sort(idades);

        System.out.println(idades);

        listaNomes.add("João");
        System.out.println(listaNomes);
        System.out.println("posição do João na lista: " + Collections.binarySearch(listaNomes, "João"));

        Collections.sort(listaNomes);
        System.out.println(listaNomes);
        System.out.println("posição do João na lista: " + Collections.binarySearch(listaNomes, "João"));

        System.out.printf("%s é o primeiro elemento da listaNomes.", listaNomes.get(0));
    }
}