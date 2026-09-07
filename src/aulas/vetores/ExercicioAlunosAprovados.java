package aulas.vetores;

import model.entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAlunosAprovados {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int qtdAlunos = sc.nextInt();
        sc.nextLine();

        Aluno[] alunos = new Aluno[qtdAlunos];

        for (int i = 0; i < alunos.length; i++){
            System.out.printf("Digite nome, primeira e segunda nota do %d aluno: %n", i + 1);
            String nome = sc.nextLine();

            double primeiraNota = sc.nextDouble();
            sc.nextLine();

            double segundaNota = sc.nextDouble();
            sc.nextLine();

            alunos[i] = new Aluno(nome, primeiraNota, segundaNota);

        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < alunos.length; i++){
            double somaNotas = alunos[i].getNotaPrimeiroSemestre() + alunos[i].getNotaSegundoSemestre();
            double media = somaNotas / 2.0;
            if (media >= 6.0){
                System.out.println(alunos[i].getNome());
            }
        }

        sc.close();

    }

}
