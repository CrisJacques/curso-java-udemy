package model.entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Fazendo sobrecarga do construtor (ou seja, criando outro construtor com um conjunto diferente de parâmetros)
    public Product(String name, double price){
        this.name = name;
        this.price = price;
        this.quantity = 0; // Como o valor padrão já é zero, essa linha é opcional
    }

    // Mais uma sobrecarga: declarando o construtor padrão manualmente - é necessário quando temos outros construtores declarados
    public Product(){

    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    /*
    O setQuantity não faz sentido neste contexto, porque a quantidade só deve ser alterada através de entradas
    e saídas do estoque, que possuem métodos específicos para isso.

    Isso se trata de uma regra de negócio que visa proteger a integridade do objeto Produto.

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    */

    public double totalValueInStock(){
        return this.quantity * this.price;
    }

    public void addProducts(int qtd){
        this.quantity += qtd;
    }

    public void removeProducts(int qtd){
        this.quantity -= qtd;
    }

    public static boolean staticProductPredicate(Product p){
        return p.getPrice() >= 100.0;
    }

    public boolean nonStaticProductPredicate(){
        return price >= 100.0;
    }

    public static void staticProductConsumer(Product p){
        p.setPrice(p.getPrice() * 1.1);
    }

    public void nonStaticProductConsumer(){
        setPrice(price * 1.1);
    }

    public static String staticUpperCaseName(Product p){
        return  p.getName().toUpperCase();
    }

    public String nonStaticUpperCaseName(){
        return name.toUpperCase();
    }

    public String toString(){
        return "Nome: " + this.name + ", Quantidade: " + this.quantity + ", Preço: R$" + String.format("%.2f", this.price);
    }

}
