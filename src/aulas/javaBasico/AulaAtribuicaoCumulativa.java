package aulas.javaBasico;

import java.util.Locale;
import java.util.Scanner;

public class AulaAtribuicaoCumulativa {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos minutos você gastou esse mês: ");
        int minutos = sc.nextInt();

        double conta = 50.0;
        if(minutos > 100){
            conta += (minutos - 100) * 2.0;
        }

        System.out.printf("O valor da sua conta é R$ %.2f", conta);

        sc.close();

    }

}
