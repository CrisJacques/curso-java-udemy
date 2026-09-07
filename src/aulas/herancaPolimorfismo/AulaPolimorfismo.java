package aulas.herancaPolimorfismo;

import model.entities.ContaBancaria;
import model.entities.ContaPoupanca;

public class AulaPolimorfismo {

    public static void main(String[] args){
        // Em POO, polimorfismo é recurso que permite que variáveis de um mesmo tipo mais genérico possam apontar para objetos de tipos específicos diferentes,
        //tendo assim comportamentos diferentes conforme cada tipo específico
        // Ou seja, o polimorfismo permite que variáveis de mesmo tipo de comportem de formas diferentes

        ContaBancaria x = new ContaBancaria(1020, "Alex", 1000.0);
        ContaBancaria y = new ContaPoupanca(1023, "Maria", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        // Como as regras de saque da conta padrão (superclasse) e da conta poupança (subclasse) são diferentes, o saldo resultante ficou diferente,
        //apesar de ambas as contas terem sido inicializadas com o mesmo saldo e o saque ter sido feito com o mesmo valor
        System.out.println("Novo saldo da conta x = " + String.format("%.2f", x.getBalance()));
        System.out.println("Novo saldo da conta y = " + String.format("%.2f", y.getBalance()));

    }

}
