package aulas.streams;

import model.entities.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.ClientInfoStatus;
import java.util.*;

public class AulaExercicioStream {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();
        // Arquivo deste exercício: C:\temp\products2.csv

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Product> products = new ArrayList<>();

            String line = br.readLine();

            while(line != null){
                String[] fields = line.split(",");

                String name = fields[0];
                double price = Double.parseDouble(fields[1]);

                products.add(new Product(name, price));

                line = br.readLine();
            }
             // Para calcular a média dos produtos, primeiro usamos o map para criar um novo stream só com os preços dos produtos, pra daí aplicar o reduce para fazer
            // o somatório
            double avg = products.stream().
                    map(p -> p.getPrice()).
                    reduce(0.0, (x, y) -> x + y)
                    / products.size();

            System.out.println("Average price: " + String.format("%.2f", avg));

            // Ordenando os nomes dos produtos em ordem alfabética
            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = products.stream().filter(x -> x.getPrice() < avg).map(x -> x.getName()).sorted(comp.reversed()).toList();
            // comp.reversed() significa que será feita a ordenação estipulada por comp na ordem inversa - no caso deste exemplo, será a ordem alfabética invertida

            names.forEach(System.out::println);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        sc.close();
    }

}
