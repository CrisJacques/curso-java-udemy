package aulas.vetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetoresValoresNegativos {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar?");
        int qtdNumeros = sc.nextInt();
        sc.nextLine();

        if (qtdNumeros > 0 && qtdNumeros <= 10){
            int[] vect = new int[qtdNumeros];
            for (int i = 0; i < vect.length; i++ ){
                System.out.print("Digite um número: ");
                vect[i] = sc.nextInt();
                sc.nextLine();
            }

            System.out.println("NÚMEROS NEGATIVOS: ");
            for (int i = 0; i < vect.length; i++){
                if(vect[i] < 0){
                    System.out.println(vect[i]);
                }
            }

        }
        else{
            System.out.println("Apenas são aceitos números de 0 a 10. Tente novamente!");
        }

        sc.close();
    }

}
