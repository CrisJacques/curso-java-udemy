package aulas.herancaPolimorfismo;

import model.entities.Empregado;
import model.entities.EmpregadoTerceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioPolimorfismo {

    public static void main(String[] args){
        List<Empregado> empregados = new ArrayList<>();

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numEmployees = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= numEmployees; i++){
            System.out.println("Employee #" + i + " data: ");

            System.out.print("Outsourced (y/n)? ");
            String isOutsourced = sc.next();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();
            sc.nextLine();

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            sc.nextLine();

            if ("y".equals(isOutsourced)){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                sc.nextLine();

                Empregado empTer = new EmpregadoTerceirizado(name, hours, valuePerHour, additionalCharge);
                empregados.add(empTer);
            }
            else{
                Empregado emp = new Empregado(name, hours, valuePerHour);
                empregados.add(emp);
            }

        }

        System.out.println();

        System.out.println("PAYMENTS:");
        for(Empregado empregado : empregados){
            System.out.println(empregado);
        }

        sc.close();

    }


}
