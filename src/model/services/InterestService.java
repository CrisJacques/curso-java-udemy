package model.services;

import java.security.InvalidParameterException;

public interface InterestService {

    double getInterestRate(); // Este método não pode receber implementação padrão porque ele depende do valor de uma variável que está armazenada no serviço e interfaces não podem armazenar estado!

    default double payment(double amount, int months){
        if (months < 1){
            throw new InvalidParameterException("Months must be greater then zero");
        }
        return amount * Math.pow( 1.0 + getInterestRate() / 100.0, months);
    }

    // ========================= Observações importantes sobre default methods (ou defender methods) ====================================
    // - Default methods entrou em vigor a partir do Java 8
    // - Sim, agora as interfaces podem prover reuso de código
    // - Sim, agora temos uma forma de herança múltipla
    //      -- Mas o compilador reclama se houver mais de um método com a mesma assinatura, obrigando a sobrescrevê-lo
    // - Interfaces ainda são bem diferentes de classes abstratas
    //      -- Interfaces não possuem recursos tais como construtores e atributos

}
