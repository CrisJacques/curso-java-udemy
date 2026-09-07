package aulas.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AulaPipeline {

    public static void main(String[] args){

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        int sum = list.stream().reduce(0, (x, y) -> x + y); // Fazendo o somatório da lista
                                                                                  // Zero é o elemento neutro da soma, por isso vai no primeiro argumento
                                                                                  // Se fosse multiplicação, seria 1 o elemento neutro

        int prod = list.stream().reduce(1, (x, y) -> x * y); // Fazendo o produtório da lista
        System.out.println("Sum = " + sum);
        System.out.println("Prod = " + prod);

        // Fazendo uma pipeline maior (ou seja, sequência de processamentos de streams)
        // Aqui estamos filtrando os elementos pares e na sequência multiplicando cada um deles por 10
        // No final, estamos convertendo o stream de volta para lista
        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 10)
                .toList();
        System.out.println(Arrays.toString(newList.toArray()));

    }


}
