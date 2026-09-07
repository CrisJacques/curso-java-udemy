package aulas.vetores;

import model.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMaisVelho {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int qtdPessoas = sc.nextInt();
        sc.nextLine();

        Person[] pessoas = new Person[qtdPessoas];

        for (int i = 0; i < pessoas.length; i++){
            System.out.printf("Dados da %da pessoa: %n", i + 1);

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            pessoas[i] = new Person(nome, idade);
        }

        String pessoaMaisVelha = pessoas[0].getNome();
        int maiorIdade = pessoas[0].getIdade();
        for (int i = 1; i < pessoas.length; i++){
            if(pessoas[i].getIdade() > maiorIdade){
                maiorIdade = pessoas[i].getIdade();
                pessoaMaisVelha = pessoas[i].getNome();
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s", pessoaMaisVelha);

        sc.close();

    }

}
