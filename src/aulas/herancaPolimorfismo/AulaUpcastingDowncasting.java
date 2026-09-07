package aulas.herancaPolimorfismo;

import model.entities.ContaBancaria;
import model.entities.ContaBancariaEmpresas;
import model.entities.ContaPoupanca;

public class AulaUpcastingDowncasting {

    public static void main(String[] args){

        ContaBancaria acc = new ContaBancaria(1001, "Alex", 0.0);
        ContaBancariaEmpresas bacc = new ContaBancariaEmpresas(1002, "Maria", 0.0, 500.0);

        // ============================================ UPCASTING ========================================================================
        // UPCASTING: atribuindo um objeto do tipo da subclasse para uma variável do tipo da superclasse
        ContaBancaria acc1 = bacc;
        ContaBancaria acc2 = new ContaBancariaEmpresas(1003, "Bob", 0.0, 200.0); // Como ContaBancariaEmpresas é uma ContaBancaria (pois herda dessa classe), essa ação é perfeitamente possível
        ContaBancaria acc3 = new ContaPoupanca(1004, "Anna", 0.0, 0.01);

        // ============================================ DOWNCASTING ========================================================================
        // DOWNCASTING: o inverso do Upcasting, ou seja, atribuindo um objeto da superclasse para uma variável do tipo da subclasse
        // ContaBancariaEmpresas acc4 = acc2; -> dá erro de "Type mismatch: cannot convert from ContaBancaria to ContaBancariaEmpresas"
        // Ou seja, essa conversão não é natural. Será necessário fazer um casting manual:
        ContaBancariaEmpresas acc4 = (ContaBancariaEmpresas) acc2;
        acc4.loan(100.0);

        // Atribuir um objeto de uma subclasse para uma variável de outra subclasse não é permitido, mas só vai dar erro em tempo de execução
        // A exceção lançada neste caso é a ClassCastException
        // Exemplo: ContaBancariaEmpresas acc5 = (ContaBancariaEmpresas)acc3; // não vai dar certo porque acc3 é uma ContaPoupanca, que é uma outra subclasse
        // Ou seja, nem sempre o Downcasting vai dar certo, e o compilador não sabe disso, só vai dar erro em tempo de execução
        // Cabe ao programador evitar que esse tipo de erro aconteça - ou seja, testando se o objeto que vai sofrer o downcasting realmente é do tipo que está entre parênteses
        // Ou seja, no exemplo acima é preciso verificar se acc3 realmente é do tipo ContaBancariaEmpresas

        if (acc3 instanceof ContaBancariaEmpresas){
            ContaBancariaEmpresas acc5 = (ContaBancariaEmpresas) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof ContaPoupanca){
            ContaPoupanca acc5 = (ContaPoupanca) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

    }

}
