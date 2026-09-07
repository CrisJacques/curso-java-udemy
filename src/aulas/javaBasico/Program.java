package aulas.javaBasico;

import java.util.Locale;

public class Program {

    public static void main(String[] args){

        System.out.println("Olá mundo!!");

        Locale.setDefault(Locale.US);
        double x = 10.35784;

        System.out.println("Sem formatação: Resultado = " + x + " metros");

        System.out.printf("Com formatação: Resultado =  %.2f metros\n", x);

        System.out.printf("%.4f%n", x);

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);


    }

}
