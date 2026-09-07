package aulas.progFuncionalLambda;

import model.entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class AulaPredicate {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD case", 80.90));

        // Predicates retornam booleano e são muito usados em filtros

        // ================== Removendo produtos cujo valor é acima de 100.00 ================================
        // FORMA 1: Usando uma classe separada que implementa a interface funcional Predicate<T>
        // list.removeIf(new ProductPredicate());

        // FORMA 2: Usando reference method com método estático
        // list.removeIf(Product::staticProductPredicate);

        // FORMA 3: Usando reference method com método não estático
        // list.removeIf(Product::nonStaticProductPredicate);

        // FORMA 4: Usando expressão lambda declarada
        // Predicate<Product> pred = x -> x.getPrice() >= 100.00;
        // list.removeIf(pred);

        // FORMA 5: Usando expressão lambda inline
        list.removeIf(x -> x.getPrice() >= 100.00);
        // ===================================================================================================
        System.out.println("Lista após remover produtos cujo valor é igual ou acima de 100.00: ");
        for (Product p: list){
            System.out.println(p);
        }
    }

}
