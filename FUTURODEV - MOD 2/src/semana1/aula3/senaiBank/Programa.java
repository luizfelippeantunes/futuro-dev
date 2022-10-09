package semana1.aula3.senaiBank;

public class Programa {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.setAgencia(1234);
        c1.setConta(5678);
        c1.setDigito('9');

        c1.getTitular().nome = "Luiz";
        c1.getTitular().sobrenome = "Antunes";
        c1.getTitular().idade = 32;
        c1.getTitular().estadoCivil = "Solteiro";

    }
}
