package aulas.set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class AulaSetDemo2 {

    public static void main(String[] args){

        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //union
        Set<Integer> c = new TreeSet<>(a); // estou criando c como uma cópia do conjunto a
        c.addAll(b); // o novo conjunto terá todos os elementos de a e b, mas eliminando as repetições
        System.out.println("Resultado do union entre a e b (addAll())");
        System.out.println(c);

        System.out.println();

        //intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b); // vai manter apenas os elementos em comum entre os 2 conjuntos
        System.out.println("Resultado do intersection entre a e b (retainAll())");
        System.out.println(d);

        System.out.println();

        //difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b); // vou remover do conjunto "e" tudo o que está no conjunto "b"
        System.out.println("Resultado do difference entre a e b (removeAll())");
        System.out.println(e);


    }

}
