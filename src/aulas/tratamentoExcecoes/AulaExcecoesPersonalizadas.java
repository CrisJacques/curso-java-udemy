package aulas.tratamentoExcecoes;

import model.entities.Reservation;
import model.exceptions.DomainException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AulaExcecoesPersonalizadas {

    public static void main(String[] args){
        DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Room number: ");
            int number = sc.nextInt();

            System.out.print("Check-in date (dd/MM/yyyy): ");
            LocalDate checkIn = LocalDate.parse(sc.next(), dtFormatter);

            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate checkOut = LocalDate.parse(sc.next(), dtFormatter);

            Reservation reservation = new Reservation(number, checkIn, checkOut);

            System.out.println(reservation);

            System.out.println();

            System.out.println("Enter data to update the reservation: ");

            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = LocalDate.parse(sc.next(), dtFormatter);

            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = LocalDate.parse(sc.next(), dtFormatter);

            reservation.updateDates(checkIn, checkOut);

            System.out.println(reservation);
        }
        catch(DomainException e){
            System.out.println("Error in reservation: " + e.getMessage());
        }
        catch(RuntimeException e){
            // Este catch vai capturar todas as demais exceções que não forem DomainException
            // Aqui será feito o upcasting da exceção para o tipo genérico RuntimeException
            // Ou seja, exceções também tem herança e upcasting
            System.out.println("Unexpected error");
        }
        finally {
            sc.close();
        }

    }

}
