package aulas.orientacaoObjetos;

import model.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProduct {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String name = sc.nextLine();

        System.out.print("Digite o preço: ");
        double price = sc.nextDouble();

        System.out.print("Digite a quantidade no estoque: ");
        int quantity = sc.nextInt();

        Product produto = new Product(name, price, quantity);
        // Product produto = new Product(name, price); chamando o construtor com 2 argumentos
        // Product produto = new Product(); chamando o construtor padrão

        double valorEstoque = produto.totalValueInStock();

        System.out.printf("Produto %s com %d unidades e valor em estoque de R$ %.2f%n", produto.getName(), produto.getQuantity(), valorEstoque);
        System.out.println("Imprimindo o product.toString()");
        System.out.println(produto.toString());
        // Por ser um println, não precisa colocar o toString(), fazendo assim também funciona: System.out.println(produto);

        System.out.print("Digite 1 para fazer uma entrada no estoque, 2 para realizar uma saída no estoque ou qualquer número para sair: ");
        int opcao = sc.nextInt();

        if(opcao == 1){
            System.out.print("Digite a quantidade de produtos a adicionar no estoque: ");
            int qtdAdd = sc.nextInt();
            produto.addProducts(qtdAdd);
            double novoValor = produto.totalValueInStock();

            System.out.printf("Produto %s agora com %d unidades em estoque, no valor de R$ %.2f%n", produto.getName(), produto.getQuantity(), novoValor);
        }
        else if(opcao == 2){
            System.out.print("Digite a quantidade de produtos a remover do estoque: ");
            int qtdRem = sc.nextInt();
            produto.removeProducts(qtdRem);
            double novoValor = produto.totalValueInStock();

            System.out.printf("Produto %s agora com %d unidades em estoque, no valor de R$ %.2f%n", produto.getName(), produto.getQuantity(), novoValor);
        }

        System.out.println("Entrada de dados finalizada. Até mais!");


        sc.close();
    }

}
