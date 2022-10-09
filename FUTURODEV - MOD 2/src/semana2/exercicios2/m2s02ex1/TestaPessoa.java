package semana2.exercicios2.m2s02ex1;

public class TestaPessoa {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("Luiz", 33, "Masculino", "31/10/1989");

        System.out.println(p.getAnoNascimento());

        System.out.println(p.getIdade());
    }
}