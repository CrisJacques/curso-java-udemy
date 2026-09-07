package aulas.vetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioNumerosPares {

    public static void main(String[] args){
        int qtdPares = 0;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int qtdNumeros = sc.nextInt();
        sc.nextLine();

        int[] vect = new int[qtdNumeros];

        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("\nNUMEROS PARES: ");
        for(int i = 0; i< vect.length; i++){
            if(vect[i]%2 == 0) {
                System.out.print(vect[i] + " ");
                qtdPares ++;
            }
        }

        System.out.printf("\n\nQUANTIDADE DE PARES = %d%n", qtdPares);

        sc.close();

    }

}
