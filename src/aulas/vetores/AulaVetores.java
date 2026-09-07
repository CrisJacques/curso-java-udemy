package aulas.vetores;

import java.util.Locale;
import java.util.Scanner;

public class AulaVetores {

    public static void main(String[] args){
        double sum = 0.0;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números: ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i=0; i<n; i++){
            System.out.printf("Digite o número que vai ficar na posição %d: ", i);
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        double avg = sum / n;

        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);

        sc.close();
    }

}
