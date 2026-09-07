package aulas.interfaces;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioInterfacesContrato {
    
    public static void main(String[] args){
        DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Entre os dados do contrato: ");

            System.out.print("Numero: ");
            int contractNumber = sc.nextInt();
            sc.nextLine();

            System.out.print("Data (dd/MM/yyyy): ");
            LocalDate contractDate = LocalDate.parse(sc.nextLine(), dtFormatter);

            System.out.print("Valor do contrato: ");
            Double contractValue = sc.nextDouble();
            sc.nextLine();

            Contract contract = new Contract(contractNumber, contractDate, contractValue);

            System.out.print("Entre com o numero de parcelas: ");
            int numParcelas = sc.nextInt();
            sc.nextLine();

            ContractService contractService = new ContractService(new PaypalService());
            contractService.processContract(contract, numParcelas);

            System.out.println("Parcelas: ");
            for (Installment installment : contract.getInstallments()){
                System.out.println(installment);
            }
        }
        catch(InputMismatchException e){
            System.out.println("Dado com tipo diferente do esperado. Verifique se o campo deve ser numérico ou textual e tente novamente.");
        }
        catch(DateTimeException e){
            System.out.println("Formato e/ou valor de data inválido. Formato aceito: dd/mm/yyyy");
        }
        finally {
            sc.close();
        }

    }
    
}
