package aulas.interfaces;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioInterfacesCarRental {
    
    public static void main(String[] args){
        DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do aluguel");

        System.out.print("Modelo do carro: ");
        String vehicle = sc.nextLine();

        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtFormatter);

        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime end = LocalDateTime.parse(sc.nextLine(), dtFormatter);

        CarRental cr = new CarRental(start, end, new Vehicle(vehicle));

        System.out.print("Entre com o preço por hora: ");
        Double pricePerHour = sc.nextDouble();
        sc.nextLine();

        System.out.print("Entre com o preço por dia: ");
        Double pricePerDay = sc.nextDouble();
        sc.nextLine();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay,  new BrazilTaxService());
        // Observações importantes sobre a linha acima:
        //     1. Ao passar new BrazilTaxService() como argumento na linha acima, estamos fazendo injeção de dependência (ou seja, não é a classe
        //RentalService que está instanciando a sua dependência, ela está recebendo a dependência como argumento).
        //     2. Uma classe ficar responsável por instanciar a sua dependência cria um forte acoplamento e cria dois pontos de alteração: quando algo mudar na
        //dependência, além das mudanças na dependência em si, teremos que mexer também na classe que depende dessa dependência.

        // INVERSÃO DE CONTROLE
        // Padrão de desenvolvimento que consiste em retirar da classe a responsabilidade de instanciar suas dependências.

        // INJEÇÃO DE DEPENDÊNCIA
        // É uma forma de realizar a inversão de controle: um componente externo instancia a dependência, que é então injetada no objeto "pai".
        // Pode ser implementada de várias formas:
        // - Construtor (como no exemplo acima)
        // - Classe de instanciação (builder / factory)
        // - Container / framework

        rentalService.processInvoice(cr);

        System.out.println("FATURA:");
        System.out.println("Pagamento basico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

        sc.close();

    }
    
}
