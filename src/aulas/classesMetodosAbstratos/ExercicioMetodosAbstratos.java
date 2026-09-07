package aulas.classesMetodosAbstratos;

import model.entities.BasePerson;
import model.entities.JuridicalPerson;
import model.entities.PhysicalPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioMetodosAbstratos {

    public static void main(String[] args){
        List<BasePerson> taxPayers = new ArrayList<>();

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int numPayers = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i<= numPayers; i++){
            System.out.println("Tax payer #" + i + " data: ");

            System.out.print("Individual or company (i/c)? ");
            String indOrCom = sc.next();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();
            sc.nextLine();

            if ("i".equals(indOrCom)){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                sc.nextLine();

                taxPayers.add(new PhysicalPerson(name, annualIncome, healthExpenditures));
            }
            else{
                System.out.print("Number of employees: ");
                int numEmployees = sc.nextInt();
                sc.nextLine();

                taxPayers.add(new JuridicalPerson(name, annualIncome, numEmployees));
            }
        }

        System.out.println();

        System.out.println("TAXES PAID: ");
        double sumTaxes = 0.0;
        for(BasePerson taxPayer : taxPayers){
            System.out.println(taxPayer);
            sumTaxes += taxPayer.calculateTax();
        }

        System.out.println();

        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sumTaxes));

        sc.close();

    }

}
