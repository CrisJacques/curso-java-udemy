package aulas.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AulaStreams {

    public static void main(String[] args){
        // ========================= Criando stream a partir de uma lista ======================================================
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        // ========================= Criando uma stream a partir de um conjunto de valores =====================================
        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));

        // ========================= Criando uma stream a partir de uma função de iteração =====================================
        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2); // O primeiro argumento indica quem é o primeiro elemento da stream a ser criada
                                                                          // O segundo argumento é qual função será usada para gerar os próximos elementos
        System.out.println(Arrays.toString(st3.limit(10).toArray())); // Pega só os 10 primeiros elementos da stream criada

        // ========================= Criando uma stream a partir de uma função de iteração (sequência de Fibonacci) ============
        Stream<Long> st4 = Stream.iterate(new Long[]{0L, 1L}, p -> new Long[]{ p[1], p[0]+p[1] }).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(10).toArray()));

    }


}
