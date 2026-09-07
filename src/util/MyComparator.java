package util;

import model.entities.ProdutoComparator;

import java.util.Comparator;

public class MyComparator implements Comparator<ProdutoComparator> {
    @Override
    public int compare(ProdutoComparator p1, ProdutoComparator p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()); // Usando o nome dos produtos como critério de comparação, ignorando maiúsculas e minúsculas
        // Vai retornar um número positivo se p1 > p2
        // Vai retornar zero se p1 = p2
        // Vai retornar um número negativo se p1 < p2
    }
}
