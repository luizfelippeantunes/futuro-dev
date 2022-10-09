package semana4.aula1;

import java.util.Arrays;
import java.util.Scanner;

public class AulaDeArray {
    public static void main(String[] args) {
        int[] anosDeCopaNoSeculo21;
        int tamanhoArrayAnosDeCopa = 6;
        String[] carrosDaEmpresa = {"unoDeFirma", "gol", "sandero", "vectra", "golf", "c3"};

        //carrosDaEmpresa[0] = "gol";

        //anosDeCopaNoSeculo21 = new int[Integer.parseInt(args[0])];
        anosDeCopaNoSeculo21 = new int[tamanhoArrayAnosDeCopa];
        anosDeCopaNoSeculo21[0] = 2022;
        anosDeCopaNoSeculo21[1] = 2018;
        anosDeCopaNoSeculo21[2] = 2014;
        anosDeCopaNoSeculo21[3] = 2010;
        // anosDeCopaNoSeculo21[4] = "2006";
        anosDeCopaNoSeculo21[4] = 2006;
        anosDeCopaNoSeculo21[5] = 2002;

        String nome = "João";
        int tamanhoString = nome.length();

        if (carrosDaEmpresa.length > 0) {
            System.out.printf("a empresa possui %d carros.", carrosDaEmpresa.length);
        }

        System.out.println();

        System.out.println("Primeira posição do array anosDeCopaNoSeculo21: " + anosDeCopaNoSeculo21[0]);
        System.out.println("Última posição do array anosDeCopaNoSeculo21: " + anosDeCopaNoSeculo21[anosDeCopaNoSeculo21.length - 1]);

        System.out.println(anosDeCopaNoSeculo21);

        for (int i = 0; i < anosDeCopaNoSeculo21.length; i++) {
            if (i != anosDeCopaNoSeculo21.length - 1) {
                System.out.print(anosDeCopaNoSeculo21[i] + ", ");
            } else {
                System.out.println(anosDeCopaNoSeculo21[i] + ".");
            }
        }

        for (int ano : anosDeCopaNoSeculo21) {
            System.out.println(ano);
        }

        for (int i = 0; i < anosDeCopaNoSeculo21.length; i++) {
            if (anosDeCopaNoSeculo21[i] == 2014) {
                System.out.println("2014 existe no array, na posição " + i);
                break;
            }

            System.out.printf("O elemento da posição %d é %d.%n", i, anosDeCopaNoSeculo21[i]);
        }

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um ano (entre 2000 e 2022) para checar se foi ano de copa:");
        int anoDoUsuario = Integer.parseInt(input.nextLine());

        Arrays.sort(anosDeCopaNoSeculo21);

        for (int ano : anosDeCopaNoSeculo21) {
            System.out.println(ano);
        }

        int posicao = Arrays.binarySearch(anosDeCopaNoSeculo21, anoDoUsuario);

        if (posicao >= 0) {
            System.out.printf("O ano %d foi um ano de copa.%n", anoDoUsuario);
        } else {
            System.out.printf("O ano %d não foi um ano de copa.%n", anoDoUsuario);
        }

        System.out.println("O ano está na posição " + posicao + ".");

        System.out.println("Digite um carro para verificar se existe na frota da empresa:");
        String carroDoUsuario = input.nextLine();

        System.out.println("Carros sem ordenar");
        for (String carro : carrosDaEmpresa) {
            System.out.println(carro);
        }

        Arrays.sort(carrosDaEmpresa);

        System.out.println("Carros ordenados");
        for (String carro : carrosDaEmpresa) {
            System.out.println(carro);
        }

        posicao = Arrays.binarySearch(carrosDaEmpresa, carroDoUsuario);

        if (posicao >= 0) {
            System.out.printf("O carro %s existe na frota da empresa.%n", carroDoUsuario);
        } else {
            System.out.printf("O carro %s não existe na frota da empresa.%n", carroDoUsuario);
        }

        System.out.printf("O carro está na posição %d.%n", posicao);

        System.out.println();


        int[] anosDeCopaNoSeculo20 = new int[16];

        int ano = 1930;
        //int j = 0;

        for (int i = 0; i < anosDeCopaNoSeculo20.length; i++) {
            if (ano == 1942 || ano == 1946) {
                ano += 4;
                i--;
                continue;
            }

            anosDeCopaNoSeculo20[i] = ano;
            ano += 4;
            //j++;
        }

        System.out.println("Anos de copa no séc. XX: ");
        for (int anoDeCopaSec20 : anosDeCopaNoSeculo20) {
            System.out.println(anoDeCopaSec20);
        }

        int[] arrayGigante = new int[2000];

        Arrays.fill(arrayGigante, 5);

        for (int i = 1550; i < 1575; i++) {
            System.out.print(arrayGigante[i] + ", ");
        }
    }
}