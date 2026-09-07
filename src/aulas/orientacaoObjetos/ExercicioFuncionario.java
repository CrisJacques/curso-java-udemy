package aulas.orientacaoObjetos;

import model.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFuncionario {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Employee funcionario = new Employee();

        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        funcionario.name = sc.nextLine();

        System.out.print("Gross salary: ");
        funcionario.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        funcionario.tax = sc.nextDouble();

        System.out.printf("Employee: %s, $ %.2f%n", funcionario.name, funcionario.netSalary());

        System.out.print("Which percentage to increase salary? ");
        double increasePercentage = sc.nextDouble();
        funcionario.increaseSalary(increasePercentage);

        System.out.printf("Updated data: %s, $ %.2f%n", funcionario.name, funcionario.netSalary());

        sc.close();
    }

}
