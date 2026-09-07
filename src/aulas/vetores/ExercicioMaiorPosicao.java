package aulas.vetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMaiorPosicao {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int qtdNumeros = sc.nextInt();
        sc.nextLine();

        double[] vect = new double[qtdNumeros];

        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
            sc.nextLine();
        }

        double max = vect[0];
        int posMaiorValor = 0;
        for(int i = 1; i < vect.length; i ++){
            if(vect[i] > max){
                max = vect[i];
                posMaiorValor = i;
            }
        }

        System.out.printf("\nMAIOR VALOR = %.2f%n", max);
        System.out.printf("POSICAO DO MAIOR VALOR = %d%n", posMaiorValor);

        sc.close();
    }

}
