package aulas.vetores;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDadosPessoas {

    public static void main (String[] args){
        int qtdHomens = 0;
        int qtdMulheres = 0;
        double somaAlturasMulheres = 0.0;
        double menorAltura = 0.0;
        double maiorAltura = 0.0;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int numPessoas = sc.nextInt();
        sc.nextLine();

        double[] alturas = new double[numPessoas];
        String[] generos = new String[numPessoas];

        for (int i = 0; i < alturas.length; i++){
            System.out.printf("Altura da %da pessoa: ", i + 1);
            alturas[i] = sc.nextDouble();
            sc.nextLine();

            System.out.printf("Genero da %da pessoa: ", i + 1);
            generos[i] = sc.next();
            sc.nextLine();
        }

        menorAltura = alturas[0];
        for(int i = 1; i < alturas.length; i++){
            if(alturas[i] < menorAltura){
                menorAltura = alturas[i];
            }
        }
        System.out.printf("Menor altura = %.2f%n", menorAltura);

        maiorAltura = alturas[0];
        for(int i = 1; i < alturas.length; i++){
            if(alturas[i] > maiorAltura){
                maiorAltura = alturas[i];
            }
        }
        System.out.printf("Maior altura = %.2f%n", maiorAltura);

        for(int i = 0; i < alturas.length; i++){
            if("F".equals(generos[i])){
                somaAlturasMulheres += alturas[i];
                qtdMulheres ++;
            }
            else if("M".equals(generos[i])){
                qtdHomens ++;
            }
        }

        System.out.printf("Media das alturas das mulheres = %.2f%n", somaAlturasMulheres / qtdMulheres);
        System.out.printf("Numero de homens = %d%n", qtdHomens);

        sc.close();

    }

}
