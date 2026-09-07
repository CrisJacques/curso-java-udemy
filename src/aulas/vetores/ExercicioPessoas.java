package aulas.vetores;

import model.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioPessoas {

    public static void main(String[] args){
        double somaAltura = 0.0;
        int pessoasMenos16Anos = 0;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int numPessoas = sc.nextInt();
        sc.nextLine();

        Pessoa[] pessoas = new Pessoa[numPessoas];

        for (int i = 0; i < pessoas.length; i++){
            System.out.printf("Dados da %da pessoa: %n", i+1);

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();

            pessoas[i] = new Pessoa(nome, idade, altura);

            somaAltura += pessoas[i].getAltura();

            if(pessoas[i].getIdade() < 16){
                pessoasMenos16Anos ++;
            }
        }

        System.out.println();
        System.out.printf("Altura média: %.2f%n", somaAltura / pessoas.length);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", (double) pessoasMenos16Anos / pessoas.length * 100);

        for(int j = 0; j < pessoas.length; j++){
            if(pessoas[j].getIdade() < 16){
                System.out.println(pessoas[j].getNome());
            }
        }

        sc.close();
    }

}
