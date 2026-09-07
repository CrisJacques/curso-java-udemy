package aulas.generics;

import java.util.Arrays;
import java.util.List;

public class AulaTiposCuringa {

    public static void main(String[] args){
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
        printList(myStrs);
    }

    // List<?> é o supertipo de qualquer tipo de lista (o ? é o tipo curinga)
    // Isso significa que o método abaixo pode receber uma lista de qualquer tipo de objeto
    public static void printList(List<?> list){
        //list.add(3); // Essa linha dá erro porque não é possível adicionar dados a uma coleção do tipo curinga, pois o compilador não sabe qual é o tipo
        //específico do qual a lista foi instanciada
        for (Object obj : list){
            System.out.println(obj);
        }
    }

}
