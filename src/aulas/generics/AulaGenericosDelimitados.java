package aulas.generics;

import model.entities.ProductGenerics;
import model.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AulaGenericosDelimitados {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        List<ProductGenerics> produtos = new ArrayList<>();
        String filePath = "C:\\temp\\products.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line = br.readLine();

            while (line != null){
                String[] productInfo = line.split(",");

                String name = productInfo[0];
                Double price = Double.parseDouble(productInfo[1]);

                produtos.add(new ProductGenerics(name, price));

                line = br.readLine();
            }

            ProductGenerics x = CalculationService.max(produtos);

            System.out.println("Most expensive: ");
            System.out.println(x);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
