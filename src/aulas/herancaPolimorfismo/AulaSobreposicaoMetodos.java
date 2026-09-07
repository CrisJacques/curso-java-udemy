package aulas.herancaPolimorfismo;

import model.entities.ContaBancaria;
import model.entities.ContaBancariaEmpresas;
import model.entities.ContaPoupanca;

public class AulaSobreposicaoMetodos {

    public static void main(String[] args){

        ContaBancaria acc1 = new ContaBancaria(1001,"Alex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance()); // Vai ser 795.00, pois foi cobrada taxa de 5 reais pelo saque

        ContaBancaria acc2 = new ContaPoupanca(1002, "Maria", 1000.0, 0.01); // Fazendo upcasting
        acc2.withdraw(200.0); // O método withdraw() da classe ContaPoupanca sobrescreve o método withdraw() da classe base (ContaBancaria)
        System.out.println(acc2.getBalance()); // Vai ser 800.00 pois para contas poupança não deve ser cobrada taxa de 5 reais

        ContaBancaria acc3 = new ContaBancariaEmpresas(1003, "Bob", 1000.0, 500.0);
        acc3.withdraw(200.0); // O método withdraw() da classe ContaBancariaEmpresas sobrescreve o método withdraw() da classe base (ContaBancaria)
        System.out.println(acc3.getBalance()); // Vai dar 793.00 pois para contas de empresas deve ser descontada uma taxa adicional de 2 reais pelo saque (além da taxa de 5 reais já cobrada)

    }

}
