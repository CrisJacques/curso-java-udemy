package aulas.herancaPolimorfismo;

import model.entities.BaseProduct;
import model.entities.ImportedProduct;
import model.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioPolimorfismo2 {

    public static void main(String[] args){
        DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<BaseProduct> products = new ArrayList<>();

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numProducts = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i<= numProducts; i++){
            System.out.println("Product #" + i + " data:");

            System.out.print("Common, used or imported (c/u/i)? ");
            String productType = sc.next();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            switch (productType){
                case "u":
                    System.out.print("Manufacture date: ");
                    LocalDate manufactureDate = LocalDate.parse(sc.nextLine(), dtFormatter);

                    products.add(new UsedProduct(name, price, manufactureDate));

                    break;
                case "i":
                    System.out.print("Customs fee: ");
                    double customsFee = sc.nextDouble();
                    sc.nextLine();

                    products.add(new ImportedProduct(name, price, customsFee));

                    break;
                default:
                    products.add(new BaseProduct(name, price));
            }
        }

        System.out.println();

        System.out.println("PRICE TAGS:");
        for (BaseProduct product : products){
            System.out.println(product.priceTag());
        }

        sc.close();

    }

}
