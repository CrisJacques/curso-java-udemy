package aulas.progFuncionalLambda;

import model.entities.Product;
import util.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AulaFunctionWithFunctionAsArgument {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD case", 80.90));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list,p -> p.getName().charAt(0) == 'T' );
        // Para uma função receber outra função como argumento, podemos usar as interfaces funcionais. No exemplo acima, a função filteredSum() recebe um Predicate<Product>
        //como argumento

        System.out.println("Sum = " + String.format("%.2f", sum));

    }

}
