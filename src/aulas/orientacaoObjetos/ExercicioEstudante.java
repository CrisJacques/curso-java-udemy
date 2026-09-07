package aulas.orientacaoObjetos;

import model.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEstudante {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Student estudante = new Student();

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        estudante.name = sc.nextLine();

        System.out.print("Digite a nota 1: ");
        estudante.grade1 = sc.nextDouble();

        System.out.print("Digite a nota 2: ");
        estudante.grade2 = sc.nextDouble();

        System.out.print("Digite a nota 3: ");
        estudante.grade3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", estudante.sumGrades());
        System.out.println(estudante.finalResult());
        if (estudante.finalResult().equals("FAILED")){
            System.out.printf("MISSING %.2f POINTS", estudante.calculateMissingGrade());
        }

        sc.close();
    }

}
