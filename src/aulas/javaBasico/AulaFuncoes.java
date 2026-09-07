package aulas.javaBasico;

import java.util.Scanner;

public class AulaFuncoes {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);

        showResult(higher);

        sc.close();

    }

    /*
        Retorna o máximo dentre os números informados
     */
    public static int max(int x1, int x2, int x3 ){
        if(x1 > x2 && x1> x3){
            return x1;
        }
        else if(x2 > x3){
            return x2;
        }
        else{
            return x3;
        }
    }

    /*
        Imprime o resultado na tela
     */
    public static void showResult(int value){
        System.out.println("Higher: " + value);
    }

}
