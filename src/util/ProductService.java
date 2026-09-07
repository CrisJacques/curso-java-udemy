package util;

import model.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    // Na versão original desta função, dentro do if era testado se o nome do produto começava com 'T'. Isso do ponto de vista de manutenção é ruim, pois se um dia mudar
    //o critério de soma, vou ter que abrir esta classe para alterar isso. Ou seja, esta classe não está fechada para alterações, o que é ruim.
    // Para deixá-la fechada para alterações, a melhor alternativa é receber esse critério via parâmetro.
    // Como a soma está sujeita a uma determinada condição estar verdadeira, podemos receber um predicado como argumento, pois ele recebe um objeto e retorna true ou false.
    // Por isso essa função passou a receber um Predicate<Product> como argumento.
    public double filteredSum(List<Product> list, Predicate<Product> criteria){
        double sum = 0.0;
        for (Product p : list){
            if (criteria.test(p)){
                sum += p.getPrice();
            }
        }
        return sum;
    }

}
