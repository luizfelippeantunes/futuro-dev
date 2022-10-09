package semana2.aula2;

public class Tarefa1 {
    public static void main(String[] args) {
        int temperatura = 15;
        double nota = 9.5;
        String nome = "Luiz Felippe Antunes";
        int idade = 35;
        char sexo = 'M';

        System.out.printf("%s tem %d anos, sexo %c, mora em Floripa que está com temperatura de %dºC, e tirou nota %.2f.",
                nome, idade, sexo, temperatura, nota);
    }
}
