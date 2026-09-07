package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService paymentService;

    public ContractService(OnlinePaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, Integer months){

        double baseInstallmentValue = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++){
            double interest = paymentService.interest(baseInstallmentValue, i);
            double paymentFee = paymentService.paymentFee(baseInstallmentValue + interest);

            double installmentValue = baseInstallmentValue + paymentFee + interest;
            LocalDate installmentDueDate = contract.getDate().plusMonths(i);

            contract.addInstallment(new Installment(installmentDueDate, installmentValue));
        }

    }

}
