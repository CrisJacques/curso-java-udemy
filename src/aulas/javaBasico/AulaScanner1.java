package aulas.javaBasico;

import java.util.Scanner;

public class AulaScanner1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x;
        double y;
        String z;

        x = sc.nextInt();
        y = sc.nextDouble();
        z = sc.next();

        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }
}
