package aulas.vetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSomaVetor {

    public static void main(String[] args){
        double soma = 0.0;
        String textoValores = "";

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int qtdNumeros = sc.nextInt();
        sc.nextLine();

        double[] numeros = new double[qtdNumeros];

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextDouble();
            sc.nextLine();

            soma += numeros[i];
            textoValores += numeros[i] + " ";
        }

        System.out.println("VALORES: " + textoValores);
        System.out.printf("SOMA: %.2f%n", soma);
        System.out.printf("MÉDIA: %.2f%n", soma / qtdNumeros);

        sc.close();

    }

}
