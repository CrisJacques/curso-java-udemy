package aulas.composicao;

import model.entities.Department;
import model.entities.HourContract;
import model.entities.Worker;
import model.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class AulaComposicao1 {

    public static void main (String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtFormattter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        Department department = new Department(sc.nextLine());

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Level: ");
        WorkerLevel level = WorkerLevel.valueOf(sc.nextLine());

        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        sc.nextLine();

        Worker worker = new Worker(name, level, baseSalary, department);

        System.out.print("How many contracts to this worker? ");
        double numContracts = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numContracts; i++){
            System.out.println("Enter contract #" + (i+1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            LocalDate dateContract = LocalDate.parse(sc.nextLine(), dtFormattter);

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            sc.nextLine();

            System.out.print("Duration (hours): ");
            int contractDuration = sc.nextInt();
            sc.nextLine();

            HourContract hourContract = new HourContract(dateContract, valuePerHour, contractDuration);

            worker.addContract(hourContract);
        }

        System.out.println();

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthYearToCalculateIncome = sc.nextLine();

        String[] vect = monthYearToCalculateIncome.split("/");

        // Outra forma de extrair o mês e o ano do que o usuário digitou:
        // int month = Integer.parseInt((monthYearToCalculateIncome.substring(0, 2))); // Cria uma substring com os elementos 0 e 1 da String que o usuário digitou
        // int year = Integer.parseInt((monthYearToCalculateIncome.substring(3))); // Cria uma substring do elemento 3 em diante da String que o usuário digitou

        double workerIncome = worker.income(Integer.parseInt(vect[1]), Integer.parseInt(vect[0]));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment());
        // Outra forma de fazer: System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthYearToCalculateIncome + ": " + String.format("%.2f", workerIncome));

        sc.close();

    }

}
