package aulas.vetores;

import java.util.Locale;
import java.util.Scanner;
import model.entities.Product;

public class AulaVetores2 {

    public static void main(String[] args){
        double sumPrices = 0.0;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de produtos: ");
        int numProdutos = sc.nextInt();
        sc.nextLine(); // consome o Enter pendente da linha anterior

        Product[] listaProdutos = new Product[numProdutos];

        for (int i = 0; i < listaProdutos.length; i++){
            System.out.printf("Informe o nome do produto %d%n", i);
            String nomeProduto = sc.nextLine();

            System.out.printf("Informe o valor do produto %d%n", i);
            double valorProduto = sc.nextDouble();
            sc.nextLine(); // consome o Enter pendente da linha anterior

            listaProdutos[i] = new Product(nomeProduto, valorProduto);

            sumPrices += listaProdutos[i].getPrice();
        }

        double avgPrice = sumPrices / listaProdutos.length;
        System.out.printf("AVERAGE PRICE = %.2f%n", avgPrice);

        sc.close();

    }

}
