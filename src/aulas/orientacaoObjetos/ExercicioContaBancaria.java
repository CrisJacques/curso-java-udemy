package aulas.orientacaoObjetos;

import model.entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioContaBancaria {

    public static void main(String[] args){
        BankAccount bankAccount;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)?");
        String initialDeposit = sc.next();

        if ("y".equals(initialDeposit)){
            System.out.print("Enter initial deposit value: ");
            double depositValue = sc.nextDouble();
            bankAccount = new BankAccount(accountNumber, accountHolder, depositValue);
        }
        else{
            bankAccount = new BankAccount(accountNumber, accountHolder);
        }

        System.out.println("Account data: ");
        System.out.println(bankAccount);

        System.out.print("Enter a deposit value: ");
        double newDepositValue = sc.nextDouble();
        bankAccount.fazerDeposito(newDepositValue);

        System.out.println("Updated account data: ");
        System.out.println(bankAccount);

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        bankAccount.fazerSaque(withdrawValue);

        System.out.println("Updated account data: ");
        System.out.println(bankAccount);

        sc.close();
    }

}
