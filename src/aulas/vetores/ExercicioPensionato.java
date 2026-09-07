package aulas.vetores;

import model.entities.Hospede;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioPensionato {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Hospede[] pensionato = new Hospede[10];

        System.out.print("How many rooms will be rented? ");
        int numHospedes = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numHospedes; i++){
            System.out.println();
            System.out.println("Rent # " + (i+1) + ":");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int room  = sc.nextInt();
            sc.nextLine();

            pensionato[room] = new Hospede(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < pensionato.length; i++){
            if(pensionato[i] != null){
                System.out.println(i + ": " + pensionato[i].toString());
            }
        }

        sc.close();

    }

}
