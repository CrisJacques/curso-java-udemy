package aulas.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AulaCovarianciaContravariancia {

    public static void main(String[] args){

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>();

        copy(myInts, myObjs);
        printList(myObjs);

        copy(myDoubles, myObjs);
        printList(myObjs);

    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny){
        // A lista de origem é um caso de covariância, onde estamos trabalhando com subtipos - então eu posso acessar os elementos
        // Já a lista de destino é um caso de contravariância, onde estamos trabalhando com os supertipos do tipo informado - então eu posso adicionar elementos
        for (Number number : source){
            destiny.add(number);
        }
    }

    public static void printList(List<?> list){
        for (Object item : list){
            System.out.print(item + " ");
        }
        System.out.println();
    }

}
