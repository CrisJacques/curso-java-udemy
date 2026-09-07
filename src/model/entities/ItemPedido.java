package model.entities;

public class ItemPedido {

    private Integer quantity;
    private Double price;
    private Produto produto;

    public ItemPedido(){

    }

    public ItemPedido(Integer quantity, Double price, Produto produto) {
        this.quantity = quantity;
        this.price = price;
        this.produto = produto;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double subTotal(){
        return this.quantity * this.price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.produto.getName());
        sb.append(", $");
        sb.append(String.format("%.2f", this.produto.getPrice()));
        sb.append(", Quantity: ");
        sb.append(this.quantity);
        sb.append(", Subtotal: $");
        sb.append(String.format("%.2f", subTotal()));

        return sb.toString();
    }
}
