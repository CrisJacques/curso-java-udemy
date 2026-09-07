package aulas.matrizes;

import java.util.Scanner;

public class ExercicioMatrizes {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz: ");
        int numLinhas = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o número de colunas da matriz: ");
        int numColunas = sc.nextInt();
        sc.nextLine();

        int [][] mat = new int[numLinhas][numColunas];

        for (int i = 0; i < numLinhas; i++){
            for (int j = 0; j < numColunas; j++){
                System.out.print("Insira o valor do elemento [" + i + "][" + j + "] da matriz: ");
                mat[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }

        System.out.println();
        System.out.println("Matriz criada: ");
        for (int i = 0; i < numLinhas; i++){
            for (int j = 0; j < numColunas; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.print("Insira um elemento a ser buscado na matriz: ");
        int elementoBusca = sc.nextInt();
        sc.nextLine();

        System.out.println();
        System.out.println("Resultados da busca: ");
        for (int i = 0; i < numLinhas; i++){
            for (int j = 0; j < numColunas; j++){
                if (mat[i][j] == elementoBusca){
                    System.out.println("Position " + i + "," + j + ":");
                    if( j - 1 >= 0){
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if( j + 1 <= numColunas - 1){
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if( i - 1 >= 0){
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if( i + 1 <= numLinhas - 1){
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                    System.out.println();
                }
            }
        }

        sc.close();

    }

}
