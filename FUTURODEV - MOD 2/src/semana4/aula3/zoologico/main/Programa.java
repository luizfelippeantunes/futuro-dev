package semana4.aula3.zoologico.main;

import semana4.aula3.zoologico.models.*;

public class Programa {
    public static void main(String[] args) {
        Animal reiLeao = new Leao("Mufasa", "amarelo", 2, 150, true, 1);

        Animal tigor = new Tigre("Tigor T Tigre", "branco", 1.5, 100, true);

        Animal pintada = new Onca("Onça Pintada", "dourada", 1, 80, true);

        Animal papaleguas = new Avestruz("Papa-Léguas", "preto", 0.8, 30, true);

        Animal beijador = new BeijaFlor("Beijador", "colorido", 0.1, 0.2, true);

        System.out.println();

        System.out.printf("O Leão %s tem %.2f KG.%n", reiLeao.getNome(), reiLeao.getPeso());
        System.out.printf("O Tigre %s tem %.2f KG.%n", tigor.getNome(), tigor.getPeso());
        System.out.printf("A Onça %s tem %.2f KG.%n", pintada.getNome(), pintada.getPeso());
        System.out.printf("O Avestruz %s tem %.2f KG.%n", papaleguas.getNome(), papaleguas.getPeso());
        System.out.printf("O Beija-Flor %s tem %.2f KG.%n", beijador.getNome(), beijador.getPeso());

        System.out.println();

        reiLeao.comer();
        tigor.comer();
        pintada.comer();
        papaleguas.comer();
        beijador.comer();

        System.out.printf("Após comer o Leão %s ficou com %.2f KG.%n", reiLeao.getNome(), reiLeao.getPeso());
        System.out.printf("Após comer o Tigre %s ficou com %.2f KG.%n", tigor.getNome(), tigor.getPeso());
        System.out.printf("Após comer a Onça %s ficou com %.2f KG.%n", pintada.getNome(), pintada.getPeso());
        System.out.printf("Após comer o Avestruz %s ficou com %.2f KG.%n", papaleguas.getNome(), papaleguas.getPeso());
        System.out.printf("Após comer o Beija-Flor %s ficou com %.2f KG.%n", beijador.getNome(), beijador.getPeso());

        System.out.println();

        reiLeao.locomover(50);
        tigor.locomover(30);
        pintada.locomover(15);
        papaleguas.locomover(100);
        beijador.locomover(150);

        System.out.println();

        reiLeao.dormir();
        tigor.dormir();
        pintada.dormir();
        papaleguas.dormir();
        beijador.dormir();
    }
}
