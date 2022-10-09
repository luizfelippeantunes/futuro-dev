package semana1.exercicios1.m2s01ex3;

public class TestaFatura {
    public static void main(String[] args) {
        Fatura f1 = new Fatura();

        f1.setNumero("1234");
        f1.setDescricao("Cabo HDMI");
        f1.getValorFatura(5, 50.50);

        System.out.printf("A fatura nº %s, referente a compra de %d unidade(s) do produto %s, com valor unitário de R$ %.2f,"
                        + "totalizou o valor de R$ %.2f.", f1.getNumero(), f1.quantidadeItem, f1.getDescricao(), f1.precoItem,
                        f1.getValorFatura(5, 50.50));
    }
}
