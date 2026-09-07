package aulas.javaBasico;

import java.util.Locale;
import java.util.Scanner;

public class AulaDoWhile {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double temperaturaCelsius = 0.0;
        double temperaturaFahrenheit = 0.0;
        String repetir = "n";

        do{
            System.out.println("Digite uma temperatura em graus Celsius (use ponto como separador decimal: ");

            temperaturaCelsius = sc.nextDouble();
            temperaturaFahrenheit = (9.0 * temperaturaCelsius)/5.0 + 32.0;

            System.out.printf("A temperatura em graus Fahrenheit é: %.2f%n", temperaturaFahrenheit);

            System.out.println("Deseja repetir? Digite s ou n");
            repetir = sc.next();
        }while("s".equals(repetir));

        sc.close();
    }

}
