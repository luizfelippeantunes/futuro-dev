package semana4.exercicios4.m2s04ex1;

import semana4.exercicios4.m2s04ex2.Time;

public class TestaTime {
    public static void main(String[] args) {

        Time psg = new Time("PSG", 1000);

        Jogador romario = new Jogador("Rom�rio", 1, "111.111.111-11", "Atacante", 150);
        Jogador marquinhos = new Jogador("Marquinhos Santos", 2, "444.444.444-44", "Meia", 100);
        Jogador ronaldinho = new Jogador("Ronaldinho Ga�cho", 3, "333.333.333-33", "Meia", 200);
        Tecnico lisca = new Tecnico("Lisca Doido", 4, "222.222.222-22", "12/09/2022");
        psg.elenco.add(lisca);
        System.out.println();
        System.out.println("Saldo Inicial " + psg.getNome() + " : " + psg.getSaldo());
        System.out.println();
        psg.comprarJogador(romario);
        psg.comprarJogador(marquinhos);
        psg.comprarJogador(ronaldinho);
        System.out.println("Lista jogadores " + psg.getNome() + " : " + psg.jogadores);
        System.out.println("Elenco " + psg.getNome() + " : " + psg.elenco);
        System.out.println("Saldo Final " + psg.getNome() + " : " + psg.getSaldo());
        System.out.println();
        romario.fazerGol();
        romario.fazerGol();
        romario.fazerGol();
        System.out.println("Jogador: " + romario.getNome());
        System.out.println("Posi��o: " + romario.getPosicao());
        System.out.println("Gols: " + romario.getQtdGols());
        System.out.println();
        System.out.println("T�cnico: " + lisca.getNome());
        System.out.println("Data contrata��o: " + lisca.getDataInicio());
        System.out.println("Escala��o: " + lisca.escalarJogador(romario));
        System.out.println("Escala��o: " + lisca.escalarJogador(marquinhos));
        System.out.println("Escala��o: " + lisca.escalarJogador(ronaldinho));
    }
}
