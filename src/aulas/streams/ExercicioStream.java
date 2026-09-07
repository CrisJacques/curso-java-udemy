package aulas.streams;

import model.entities.Employee1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioStream {

    public static void main(String[] args){
        List<Employee1> employees = new ArrayList<>();

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        // Arquivo deste exercício: C:\temp\employeesWithSalary.csv
        String filePath = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line = br.readLine();

            while(line != null){
                String[] fields = line.split(",");

                String name = fields[0];
                String email = fields[1];
                double salary = Double.parseDouble(fields[2]);

                employees.add(new Employee1(name, email, salary));

                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.print("Enter salary: ");
        double limitSalary = sc.nextDouble();

        System.out.println("Email of people whose salary is more than 2000.00: ");
        List<String> employeesEmailsAboveTwoThowsend = employees.stream()
                .filter(x -> x.getSalary() > limitSalary)
                .map(x -> x.getEmail())
                .sorted()
                .toList();
        employeesEmailsAboveTwoThowsend.forEach(System.out::println);

        double sumSalaryEmployeesM = employees.stream()
                .filter(x -> x.getName().charAt(0) == 'M')
                .map(x -> x.getSalary())
                .reduce(0.0, (x, y) -> x + y);
        System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sumSalaryEmployeesM));

        sc.close();
    }

}
