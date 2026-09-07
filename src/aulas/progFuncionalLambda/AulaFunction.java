package aulas.progFuncionalLambda;

import model.entities.Product;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AulaFunction {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD case", 80.90));

        // ============ Gerando uma nova lista contendo os nomes dos produtos em caixa alta ========================

        // FORMA 1: Usando uma classe separada que implementa a interface funcional Function<T,R>
        // List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList()); // Formato sugerido originalmente na aula
        // List<String> names = list.stream().map(new UpperCaseName()).toList(); // Formato sugerido pelo IntelliJ (substituindo collect(Collectors.toList()) por toList()
        // A função map() aplica uma função a cada elemento de uma stream, ou seja, ela não atua sobre listas: é preciso converter a list em stream antes de aplicar map(), usando .stream()
        // Stream é uma sequência de dados
        // A função map gera uma nova stream com os elementos transformados. Feita a transformação, é preciso converter o stream de volta para list,
        // usando .collect(Collectors.toList()) ou .toList() direto
        // O map() recebe um Function<T, R> como argumento

        // FORMA 2: Usando reference method com método estático
        // List<String> names = list.stream().map(Product::staticUpperCaseName).toList();

        // FORMA 3: Usando reference method com método não estático
        // List<String> names = list.stream().map(Product::nonStaticUpperCaseName).toList();

        // FORMA 4: Usando expressão lambda declarada
        // Function<Product, String> func = p -> p.getName().toUpperCase();
        // List<String> names = list.stream().map(func).toList();

        // FORMA 5: Usando expressão lambda inline
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).toList();

        // ========================================================================================
        System.out.println("Nomes dos produtos em caixa alta: ");
        names.forEach(System.out::println); // É o equivalente a fazer um for e pra cada elemento chamar o System.out.println()

    }

}
