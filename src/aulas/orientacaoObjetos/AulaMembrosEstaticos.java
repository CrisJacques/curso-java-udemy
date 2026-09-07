package aulas.orientacaoObjetos;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class AulaMembrosEstaticos {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        System.out.printf("Circumference: %.2f%n", Calculator.circumference(radius));
        System.out.printf("Volume: %.2f%n", Calculator.volume(radius));
        System.out.printf("PI: %.2f%n", Calculator.pi());

        sc.close();
    }

}
