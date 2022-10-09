package semana4.aula1;

public class AulaDeMatriz {
    public static void main(String[] args) {
        String[][] matriz = new String[3][3];

        int[][] novaMatriz = new int[2][10];

        // double[][][] array3d = new double[3][4][5];

        String[][] copas = {
                {"2018", "França"},
                {"2014", "Alemanha"},
                {"2010", "Espanha"},
                {"2006", "Itália"},
                {"2002", "Brasil"}
        };

        System.out.printf("O vencedor da Copa de %s foi %s%n", copas[3][0], copas[3][1]);

        int[] anosDeCopaSec21 = {2018, 2014, 2010, 2006, 2002};
        String[] vencedoresCopasSec21 = {"França", "Alemanha", "Espanha", "Itália", "Brasil"};

        String[][] anosEVencedoresCopasSec21 = new String[anosDeCopaSec21.length][2];

        for (int i = 0; i < anosDeCopaSec21.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    anosEVencedoresCopasSec21[i][j] = String.valueOf(anosDeCopaSec21[i]);
                } else {
                    anosEVencedoresCopasSec21[i][j] = vencedoresCopasSec21[i];
                }
            }
        }

        for (int i = 0; i < anosEVencedoresCopasSec21.length; i++) {
            System.out.printf("O vencedor da Copa de %s foi %s.%n",
                    anosEVencedoresCopasSec21[i][0], anosEVencedoresCopasSec21[i][1]);
        }
    }
}
