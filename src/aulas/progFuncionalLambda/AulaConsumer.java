package aulas.progFuncionalLambda;

import model.entities.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class AulaConsumer {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD case", 80.90));

        // ============ Aumentando o preço de cada um dos produtos em 10% ========================
        // Nos exemplos abaixo, usaremos o list.forEach(), que aceita um Consumer<T> como argumento

        // FORMA 1: Usando uma classe separada que implementa a interface funcional Consumer<T>
        // list.forEach(new PriceUpdate());

        // FORMA 2: Usando reference method com método estático
        // list.forEach(Product::staticProductConsumer);

        // FORMA 3: Usando reference method com método não estático
        // list.forEach(Product::nonStaticProductConsumer);

        // FORMA 4: Usando expressão lambda declarada
        // Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);
        // list.forEach(cons);

        // FORMA 5: Usando expressão lambda inline
        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

        // ========================================================================================

        // Usando o list.forEach() também para imprimir os elementos da lista
        list.forEach(System.out::println); // É o equivalente a fazer um for e pra cada elemento chamar o System.out.println()
    }
}
