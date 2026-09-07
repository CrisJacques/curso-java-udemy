package aulas.listas;

import model.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioFuncionario {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int numFuncionarios = sc.nextInt();
        sc.nextLine();

        List<Funcionario> listFuncionarios = new ArrayList<>();

        for (int i = 0; i < numFuncionarios; i++){
            System.out.println("Employee #" + (i + 1));

            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.println();

            listFuncionarios.add(new Funcionario(id, name, salary));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idSalaryIncrease = sc.nextInt();
        sc.nextLine();

        Funcionario chosenFunc = listFuncionarios.stream().filter(x -> x.getId() == idSalaryIncrease).findFirst().orElse(null);
        if(chosenFunc != null){
            System.out.print("Enter the percentage: ");
            double percSalaryIncrease = sc.nextDouble();
            sc.nextLine();
            chosenFunc.increaseSalary(percSalaryIncrease);
        }
        else{
            System.out.println("This id does not exist!");
        }

        System.out.println();

        System.out.println("List of employees: ");
        for (Funcionario func : listFuncionarios){
            System.out.println(func);
        }

        sc.close();

    }

}
