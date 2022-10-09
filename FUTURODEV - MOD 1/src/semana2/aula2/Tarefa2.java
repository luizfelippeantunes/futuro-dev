package semana2.aula2;

public class Tarefa2 {
    public static void main(String[] args) {
        /* Um carro faz 10 KM/L, e viajou 300 KM de uma cidade até a outra, calcule o consumo de combustível
        Exercício realizado pelo aluno Luiz Felippe Antunes - Turma Brava */

        int mediaConsumo = 10;
        int distancia = 300;

        int consumo = distancia / mediaConsumo;

        System.out.printf("O carro que tem uma média de consumo de %d KM/L, ao realizar uma viagem de %d KM, " +
                "gastou %d litros de combustível.", mediaConsumo, distancia, consumo);
    }
}