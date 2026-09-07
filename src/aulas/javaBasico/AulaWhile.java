package aulas.javaBasico;

import java.util.Scanner;

public class AulaWhile {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        int soma = 0;

        while(numero != 0){
            soma += numero;
            System.out.println("Digite um número: ");
            numero = sc.nextInt();
        }
        System.out.printf("O resultado da soma foi: %d", soma);
        sc.close();
    }

}
