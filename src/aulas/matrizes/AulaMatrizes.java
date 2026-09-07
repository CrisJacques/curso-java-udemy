package aulas.matrizes;

import java.util.Scanner;

public class AulaMatrizes {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //Instanciando a matriz (tem [][] porque é bidimensional, se fosse tridimensional seria [][][] )
        int [][] mat = new int[n][n];

        // mat.length dá a quantidade de linhas da matriz
        // mat[i].length dá a quantidade de colunaa da linha i da matriz
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for (int i = 0; i < mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }

        System.out.println();

        int count = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j] < 0){
                    count ++;
                }
            }
        }

        System.out.println("Negative numbers = " + count);


        sc.close();

    }

}
