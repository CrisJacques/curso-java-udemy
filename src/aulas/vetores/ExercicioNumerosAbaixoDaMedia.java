package aulas.vetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioNumerosAbaixoDaMedia {

    public static void main(String[] args){
        double somaVetor = 0.0;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int tamanhoVetor = sc.nextInt();
        sc.nextLine();

        double [] vect = new double[tamanhoVetor];

        for(int i = 0; i < tamanhoVetor; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            sc.nextLine();

            somaVetor += vect[i];
        }

        double avg = somaVetor / tamanhoVetor;
        System.out.printf("\nMEDIA DO VETOR = %.3f%n", avg);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for(int i = 0; i < tamanhoVetor; i++){
            if(vect[i] < avg){
                System.out.println(vect[i]);
            }
        }

        sc.close();

    }

}
