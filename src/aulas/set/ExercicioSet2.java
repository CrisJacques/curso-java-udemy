package aulas.set;

import model.entities.AlunoUsuario;
import model.entities.Curso;
import model.entities.Instrutor;

import java.util.*;

public class ExercicioSet2 {

    public static void main(String[] args){

        Curso cursoA = new Curso("A");
        Curso cursoB = new Curso("B");
        Curso cursoC = new Curso("C");

        Set<AlunoUsuario> alunosAlex = new HashSet<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("How many students for course A? ");
        int numStudentsCourseA = sc.nextInt();

        for(int i = 0; i< numStudentsCourseA; i++){
            cursoA.addAluno(new AlunoUsuario(sc.nextInt()));
        }

        System.out.print("How many students for course B? ");
        int numStudentsCourseB = sc.nextInt();

        for(int i = 0; i< numStudentsCourseB; i++){
            cursoB.addAluno(new AlunoUsuario(sc.nextInt()));
        }

        System.out.print("How many students for course C? ");
        int numStudentsCourseC = sc.nextInt();

        for(int i = 0; i< numStudentsCourseC; i++){
            cursoC.addAluno(new AlunoUsuario(sc.nextInt()));
        }

        Instrutor alex = new Instrutor("Alex");
        alex.addCurso(cursoA);
        alex.addCurso(cursoB);
        alex.addCurso(cursoC);

        for(Curso curso : alex.getCursos()){
            alunosAlex.addAll(curso.getAlunos());
        }

        System.out.println("Total students: " + alunosAlex.size());

        sc.close();

    }

}
