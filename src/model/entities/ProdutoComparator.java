package model.entities;

public class ProdutoComparator {

    private String name;
    private Double price;

    public ProdutoComparator(){

    }

    public ProdutoComparator(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

//    @Override
//    public int compareTo(ProdutoComparator o) {
//        return name.toUpperCase().compareTo(o.getName().toUpperCase()); // Comparação por nome em ordem alfabética ignorando maiúsculas e minúsculas
//    }
//    // Porém, utilizando o compareTo(), essa classe não fica fechada para alteração: se o critério de comparação mudar, precisaremos alterar esta classe
//    // O ideal é que não seja necessário alterar essa classe cada vez que mude o critério de compararação

    @Override
    public String toString() {
        return "ProdutoComparator{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
