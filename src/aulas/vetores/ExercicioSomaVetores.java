package aulas.vetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSomaVetores {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int tamanhoVetor = sc.nextInt();
        sc.nextLine();

        int[] vectA = new int[tamanhoVetor];
        int[] vectB = new int[tamanhoVetor];

        System.out.println("Digite os valores do vetor A: ");
        for(int i = 0; i < tamanhoVetor; i++){
            vectA[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Digite os valores do vetor B: ");
        for(int i = 0; i < tamanhoVetor; i++){
            vectB[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("VETOR RESULTANTE: ");
        for(int i = 0; i < tamanhoVetor; i++){
            System.out.println(vectA[i] + vectB[i]);
        }

        sc.close();

    }

}
