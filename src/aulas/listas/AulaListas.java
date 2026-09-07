package aulas.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AulaListas {

    public static void main(String[] args){

        /*
        Pontos importantes sobre aulas.listas:
        - List é uma interface, logo não é possível instanciá-la. Será preciso utilizar alguma das classas que implementa
        essa interface (por exemplo, ArrayList);
        - A interface List não aceita tipos primitivos. Então por exemplo se for desejado criar uma lista de números inteiros,
        não podemos escrever List<int>, devemos usar a Wrapper Class do tipo inteiro, que é a Integer;
        - As maiores vantagens da lista em relação aos aulas.vetores (arrays unidimensionais) é que ela é criada vazia e vai sendo
        preenchida conforme necessidade, ao contrário dos aulas.vetores, em que precisamos estabelecer o tamanho dele já na criação;
        - Além disso, outra grande vantagem da lista em relação aos aulas.vetores é que é super fácil de adicionar (método add()) e
        remover (método remove()) elementos em tempo de execução.];
        - Porém, uma desvantagem da lista em relação ao vetor é que o acesso aos elementos deve ser feito de forma sequencial,
        o que acaba sendo menos performático do que o acesso em aulas.vetores, que é direto. Porém, a classe ArrayList implementa
        esse acesso de forma mais otimizada, que seria mais próximo ao formato de acesso de um vetor, melhorando a performance.
        - A classe ArrayList pega as melhores características dos aulas.vetores e das aulas.listas, por isso é tão utilizada;
         */

        // List<Integer> list; // nesse ponto, eu ainda não posso usar a lista. Preciso instanciá-la primeiro;
        // Instanciando uma lista:
        List<String> list = new ArrayList<>(); // Colocar new ArrayList<String>(); também funciona, mas se tornou opcional de umas versões do Java pra cá

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco"); // inserindo o Marco na posição 2 da lista;

        System.out.println("Tamanho da lista original: " + list.size());
        System.out.println("Lista original: ");
        for (String nome : list){
            System.out.println(nome);
        }

        System.out.println("-------------------------");

        //list.remove("Anna"); // Esse método é capaz de comparar o argumento fornecido com os elementos da lista e remover o correspondente;
        //list.remove(1); // Remove o item de posição 1 da lista (Alex);
        list.removeIf(x -> x.charAt(0) == 'M'); // Remove os itens que começam com a letra M (o nome do filtro fornecido como argumento
        // é predicado, que vai retornar verdadeiro ou falso. Predicado é um tipo de função lambda)

        System.out.println("Lista após remoções por predicado: ");
        for (String nome : list){
            System.out.println(nome);
        }

        System.out.println("-------------------------");

        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));// Quando o elemento não é encontrado, é retornado -1;

        System.out.println("-------------------------");

        // ======== Colocando dentro de result o resultado de um filtro que retorna todos os elementos que começam com 'A' ========
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        // O stream() permite operações com funções lambda em aulas.listas
        // É preciso fazer .collect(Collectors.toList()) no final porque o stream não é compatível com list (ou seja, a gente faz o
        // stream voltar a ser lista
        System.out.println("Nova lista com elementos que começam com a letra A");
        for (String nome : result){
            System.out.println(nome);
        }

        System.out.println("-------------------------");
        // Buscando pelo primeiro nome que começa com a letra A (e retornando null se não achar)
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println("Primeiro nome que começa com a letra A: " + name);

    }

}

