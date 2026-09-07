package aulas.tratamentoExcecoes;

import model.entities.Account;
import model.exceptions.AccountException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioTratamentoExcecoes {
    
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Enter account data");

            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();

            System.out.print("Holder: ");
            String name = sc.nextLine();

            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();
            sc.nextLine();

            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();
            sc.nextLine();

            Account account = new Account(number, name, initialBalance, withdrawLimit);

            System.out.println();

            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            sc.nextLine();

            account.withdraw(amount);

            System.out.print("New balance: " + String.format("%.2f", account.getBalance()));
        }
        catch(AccountException e){
            System.out.print("Withdraw error: " + e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println("Tipo do valor inserido diferente do esperado. Tente novamente!");
        }
        catch(RuntimeException e){
            System.out.print("Um erro inesperado ocorreu");
        }
        finally{
            sc.close();
        }
        
    }
    
}
