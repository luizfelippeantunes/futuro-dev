package semana1.exercicios1.m2s01ex6;

import java.time.LocalDate;

public class PerfilDeSaude {
    String nome;
    String sobrenome;
    String sexo;
    int diaNasc;
    int mesNasc;
    int anoNasc;
    double altura;
    double peso;

    public int idade(int diaNasc, int mesNasc, int anoNasc) {
        LocalDate dataAtual = LocalDate.now();
        int diaAtual = dataAtual.getDayOfMonth();
        int mesAtual = dataAtual.getMonthValue();
        int anoAtual = dataAtual.getYear();

        if (mesAtual >= mesNasc && diaAtual >= diaNasc) {
            return anoAtual - anoNasc;
        } else {
            return anoAtual - anoNasc - 1;
        }
    }

    public int freqMaxima() {
        return 220 - idade(diaNasc, mesNasc, anoNasc);
    }

    public String freqAlvo(int freqMaxima) {
        double alvoMin = freqMaxima * 0.5;
        double alvoMax = freqMaxima * 0.85;
        return Math.round(alvoMin) + " - " + Math.round(alvoMax);
    }

    public double IMC(double altura, double peso) {
        return peso / (altura * altura);
    }
}
