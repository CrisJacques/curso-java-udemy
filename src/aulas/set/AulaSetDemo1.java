package aulas.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AulaSetDemo1 {

    public static void main(String[] args){
        //Set é uma interface que representa um conjunto de elementos. Suas principais características são:
        //    -- Não admite repetições
        //    -- Elementos não possuem posição (não dá para pegar o elemento da posição x do Set)
        //    -- Acesso, inserção e remoção de elementos são rápidos
        //    -- Oferece operações eficientes de conjunto: interseção, união e diferença
        //Existem 3 principais implementações desta interface: HashSet, TreeSet e LinkedHashSet

        Set<String> hashSet = new HashSet<>(); //HashSet() é a implementação mais rápida da interface Set, porém ele não garante a ordem. Ou seja, se a ordem não importa,
        //o HashSet é o mais indicado por ser o mais rápido

        Set<String> treeSet = new TreeSet<>(); // TreeSet é a implementação mais lenta da interface Set, porém ele sempre mantém os dados ordenados, usando o compareTo
        // dos objetos ou o Comparator. A forma como o TreeSet vai ordenar os objetos deriva diretamente de como foi implementado o método compareTo() da classe

        Set<String> linkedHashSet = new LinkedHashSet<>(); // LinkedHashSet é uma implementação de velocidade intermediária da interface Set, em que os elementos são
        // mantidos na ordem em que foram adicionados

        // As classes que implementam Set testam igualdade usando os métodos hashCode() e equals() das classes dos objetos analisados. Caso tais métodos não tenham sido
        //implementados, será feita comparação de ponteiros.

        hashSet.add("TV");
        treeSet.add("TV");
        linkedHashSet.add("TV");

        hashSet.add("Notebook");
        treeSet.add("Notebook");
        linkedHashSet.add("Notebook");

        hashSet.add("Tablet");
        treeSet.add("Tablet");
        linkedHashSet.add("Tablet");

        System.out.println("HashSet contains Notebook: ");
        System.out.println(hashSet.contains("Notebook"));

        System.out.println();

        System.out.println("Imprimindo o HashSet: ");
        for (String p : hashSet){
            System.out.println(p);
        }

        System.out.println();

        System.out.println("Imprimindo o TreeSet: ");
        for (String p : treeSet){
            System.out.println(p);
        }

        System.out.println();

        System.out.println("Imprimindo o LinkedHashSet: ");
        for (String p : linkedHashSet){
            System.out.println(p);
        }

        System.out.println();

        hashSet.removeIf(x -> x.length() >= 3); // removendo todas as strings com 3 caracteres ou mais

        System.out.println("HashSet após o removeIf:");
        for (String p : hashSet){
            System.out.println(p);
        }

    }

}
