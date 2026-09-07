package aulas.composicao;

import model.entities.Cliente;
import model.entities.ItemPedido;
import model.entities.Pedido;
import model.entities.Produto;
import model.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioComposicao {

    public static void main(String[] args){
        DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate birthDate = LocalDate.parse(sc.nextLine(), dtFormatter);

        Cliente cliente = new Cliente(name, email, birthDate);

        System.out.println("Enter order data:");

        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());

        System.out.print("How many items to this order? ");
        int numItems = sc.nextInt();
        sc.nextLine();

        Pedido pedido = new Pedido(LocalDateTime.now(), status, cliente);

        for (int i = 1; i <= numItems; i++){
            System.out.println("Enter #" + i + " item data: ");
            System.out.print("Product name: ");
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            sc.nextLine();

            Produto produto = new Produto(productName, productPrice);

            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();
            sc.nextLine();

            ItemPedido itemPedido = new ItemPedido(productQuantity, productPrice, produto);

            pedido.addItem(itemPedido);

        }

        System.out.println();

        System.out.println("ORDER SUMMARY: ");
        System.out.println(pedido);

        sc.close();

    }

}
