package model.entities;

import model.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    DateTimeFormatter dtFormatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDateTime moment;
    private OrderStatus status;
    private Cliente cliente;
    private List<ItemPedido> itensPedido = new ArrayList<>();

    public Pedido(){

    }

    public Pedido(LocalDateTime moment, OrderStatus status, Cliente cliente) {
        this.moment = moment;
        this.status = status;
        this.cliente = cliente;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItensPedido() {
        return itensPedido;
    }

    public void addItem(ItemPedido itemPedido){
        itensPedido.add(itemPedido);
    }

    public void removeItem(ItemPedido itemPedido){
        itensPedido.remove(itemPedido);
    }

    public Double total(){
        double sum = 0.0;
        for (ItemPedido item : itensPedido){
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Order moment: ");
        sb.append(dtFormatter.format(this.moment));
        sb.append("\n");
        sb.append("Order status: ");
        sb.append(this.status);
        sb.append("\n");
        sb.append("Client: ");
        sb.append(this.cliente.getName());
        sb.append(" (");
        sb.append(this.cliente.getBirthDate().format(dtFormatter2));
        sb.append(") - ");
        sb.append(this.cliente.getEmail());
        sb.append("\n");
        sb.append("Order items: ");
        sb.append("\n");
        for (ItemPedido itemPedido : itensPedido){
            sb.append(itemPedido);
            sb.append("\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));

        return sb.toString();
    }

}
