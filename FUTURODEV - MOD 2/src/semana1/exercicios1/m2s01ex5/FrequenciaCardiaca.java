package semana1.exercicios1.m2s01ex5;

import java.time.LocalDate;

public class FrequenciaCardiaca {
    String nome;
    String sobrenome;
    int diaNasc;
    int mesNasc;
    int anoNasc;

    public int idade(int diaNasc, int mesNasc, int anoNasc) {
        LocalDate dataAtual = LocalDate.now();
        int diaAtual = dataAtual.getDayOfMonth();
        int mesAtual = dataAtual.getMonthValue();
        int anoAtual = dataAtual.getYear();

        if (mesAtual > mesNasc) {
            return anoAtual - anoNasc;
        }
        if (mesAtual == mesNasc && diaAtual >= diaNasc) {
            return anoAtual - anoNasc;
        }
        return anoAtual - anoNasc - 1;
    }

    public int freqMaxima() {
        return 220 - this.idade(diaNasc, mesNasc, anoNasc);
    }

    public String freqAlvo(int freqMaxima) {
        double alvoMin = freqMaxima * 0.5;
        double alvoMax = freqMaxima * 0.85;
        return Math.round(alvoMin) + " - " + Math.round(alvoMax);
    }
}
