package aulas.vetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMediaPares {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int tamanhoVetor = sc.nextInt();
        sc.nextLine();

        int[] vect = new int[tamanhoVetor];

        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
            sc.nextLine();
        }

        int somaPares = 0;
        int qtdPares = 0;

        for(int i = 0; i < vect.length; i++){
            if(vect[i]%2 == 0){
                somaPares += vect[i];
                qtdPares ++;
            }
        }

        if(qtdPares > 0){
            double avg = (double) somaPares / qtdPares;
            System.out.printf("MEDIA DOS PARES = %.1f%n", avg);
        }
        else{
            System.out.println("NENHUM NUMERO PAR");
        }

        sc.close();

    }

}
