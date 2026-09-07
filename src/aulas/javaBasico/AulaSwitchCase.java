package aulas.javaBasico;

import java.util.Scanner;

public class AulaSwitchCase {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7: ");

        int numero = sc.nextInt();
        String dia;

        switch (numero){
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terça";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sábado";
                break;
            default:
                dia = "valor inválido";
                break;
        }

// VERSÃO MAIS COMPACTA SUGERIDA PELO INTELLIJ
//        String dia = switch (numero) {
//            case 1 -> "domingo";
//            case 2 -> "segunda";
//            case 3 -> "terça";
//            case 4 -> "quarta";
//            case 5 -> "quinta";
//            case 6 -> "sexta";
//            case 7 -> "sábado";
//            default -> "valor inválido";
//        };

        System.out.println("Dia da semana: " + dia);
        sc.close();
    }

}
