package aulas.progFuncionalLambda;

import model.entities.ProdutoComparator;

import java.util.ArrayList;
import java.util.List;

public class AulaComparator {
    public static void main(String[] args){

        List<ProdutoComparator> list = new ArrayList<>();

        list.add(new ProdutoComparator("TV", 900.00));
        list.add(new ProdutoComparator("Notebook", 1200.00));
        list.add(new ProdutoComparator("Tablet", 450.00));
        // =================== Seguem abaixo diversas formas de ordenar esta lista ===========================================
        // FORMA 1: Collections.sort(list); - NÃO SEGUE O PRINCIPIO OPEN-CLOSED DO SOLID
        // Collections.sort(list);
        //
        // Este método exige que a classe dos objetos da lista implemente a interface Comparable<T>. Porém, quando a classe implementa essa interface
        //ela não fica fechada para alteração, pois cada vez que o critério de comparação mudar, eu preciso abrir a classe e mexer no método compareTo(). Para evitar isso,
        //o ideal é utilizar o método default sort() da interface List<T>, que recebe um Comparator<T> como argumento. Com isso, a definição do critério de comparação
        // fica flexível, pois não vai implicar em mudanças na classe dos objetos da lista.
//--------------------------------------------------------------------------------------------------------------------------------------------------
        // FORMA 2: Utilizando um Comparator<T> objeto de uma classe separada que implementa essa interface funcional - RESPEITA O PRINCIPIO OPEN-CLOSED DO SOLID
        // list.sort(new MyComparator());
        //
        // O Comparator<T> é uma interface funcional do Java 8.
        // Interfaces funcionais têm apenas um método abstrato (elas podem ter métodos default e estáticos também, mas abstratos só tem 1)
        // Suas implementações serão tratadas como expressões lambda. Ou seja, sempre que mexermos com expressões lambda, no fundo estamos mexendo com interfaces funcionais.
        // Algumas outras interfaces funcionais comuns em Java:
        // - Predicate (função que recebe um objeto e retorna verdadeiro ou falso)
        // - Function (função que recebe um objeto e retorna algo cujo tipo é especificado em R: Function<T, R> (exemplo: Function<Product, String>)
        // - Consumer (função que recebe um objetoa aplica alguma transformação nele, sem retornar nada (void))
        //     Nota: ao contrário das outras interfaces funcionais, no caso do Consumer, é esperado que ele possa gerar efeitos colaterais (mas é uma exceção)
        //     Isso ocorre porque o método abstrato dessa interface é void, ou seja, ele vai simplesmente fazer uma operação, sem retornar nada
        //
        // Aqui estamos respeitando o princípio Open-Closed do SOLID porque permitimos que a classe dos objetos da lista fique fechada para alterações, pois cada vez que
        //mudar o critério de comparação, não precisaremos mais mexer nela, pois removemos a implementação do compareTo() de dentro da classe dos objetos da lista.
        // Neste caso, estamos usando um Comparator criado a partir de uma classe que implementa a interface Comparator<T>, implementando o método compare()
        // Esta é apenas uma das formas de definir um Comparator, existem várias outras
//--------------------------------------------------------------------------------------------------------------------------------------------------
        // FORMA 3: Utilizando um Comparator<T> objeto de uma classe anônima - TAMBÉM RESPEITA O PRINCIPIO OPEN-CLOSED DO SOLID
        // Comparator<ProdutoComparator> comp = new Comparator<ProdutoComparator>() {
        //    //Implementação da classe anônima
        //    @Override
        //    public int compare(ProdutoComparator p1, ProdutoComparator p2) {
        //        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        //    }
        // };
        // list.sort(comp);
        // Da forma especificada acima funciona perfeitamente, porém essa forma é muito verbosa. Para resolver isso, será usada função lambda
//--------------------------------------------------------------------------------------------------------------------------------------------------
        // FORMA 4: Utilizando Comparator<T> com função lambda (que é uma função anônima)
        //Comparator<ProdutoComparator> comp = (p1, p2) -> {
        //    return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        // };
        //list.sort(comp);
        //
        // No caso de funções lambda, o compilador faz uma inferência de tipos, ou seja, é opcional colocar tipo nos parâmetros: não precisa colocar
        // (ProdutoComparator p1, ProdutoComparator p2), só (p1, p2) basta
        //
        // A implementação acima também é conhecida como arrow function
        //
        // No caso do exemplo acima, como a arrow function só tem uma linha, as {} e o return são opcionais, ou seja, o formato abaixo também é aceito:
        // Comparator<ProdutoComparator> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        // list.sort(comp);
        //
        // Para ser mais sucinto ainda, dá para colocar o Comparator<T> como uma expressão lambda dentro do argumento do sort():
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
        //
        // Obs.: em programação funcional, expressão lambda corresponde a uma função anônima de primeira classe:
        // - Função anônima: não possui nome, não foi declarada
        // - Função de primeira classe: pode ser passada por parâmetro para outra função ou pode ser retornada por uma função

        for (ProdutoComparator p : list){
            System.out.println(p);
        }
    }
}
