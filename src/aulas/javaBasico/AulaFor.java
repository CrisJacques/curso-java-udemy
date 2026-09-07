package aulas.javaBasico;

import java.util.Scanner;

public class AulaFor {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números que devem ser somados: ");

        int quantidadeNumeros = sc.nextInt();
        int numero = 0;
        int soma = 0;

        for(int i = 0; i < quantidadeNumeros; i++){
            System.out.println("Digite um número: ");
            numero = sc.nextInt();
            soma += numero;
        }

        System.out.printf("A soma dos números digitados foi: %d", soma);

        sc.close();
    }

}
