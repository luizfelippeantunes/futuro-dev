package semana2.aula4;

import java.util.Scanner;

public class CondicionalComposta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        String nome = entrada.nextLine();
        System.out.println("Digite a sua idade:");
        int idade = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite o seu sexo:");
        char sexo = entrada.next().charAt(0); //se usar CHAR usa-se o == para comparar
        //String sexo = entrada.nextLine(); //se usar String usa-se o String.equals para comparar
        if (sexo == 'F' || sexo == 'f' && idade > 15){
            System.out.println(nome + ", você pode fazer parte do time.");
        } else if (sexo == 'F' || sexo == 'f' && idade <= 15){
            System.out.println(nome + ", você não tem a idade mínima para entrar no time, que é 15 anos.");
        } else if (sexo == 'M' || sexo == 'm' ) {
            System.out.println(nome + ", você não poderá participar, pois o time é exclusivo para o sexo feminino.");
        } else {
            System.out.println("Você digitou um valor inválido!");
        }
        entrada.close();
    }
}
