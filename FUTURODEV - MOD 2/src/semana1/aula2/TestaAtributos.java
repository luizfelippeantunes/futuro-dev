package semana1.aula2;

public class TestaAtributos {
    public static void main(String[] args) {
        Conta c1 = new Conta();

        System.out.println(c1.limite);
        System.out.println(c1.saldo);
        System.out.println(c1.titular.nome);
    }
}
