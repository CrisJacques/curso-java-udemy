package model.entities;

public class ContaBancariaEmpresas extends ContaBancaria{

    private Double loanLimit;

    public ContaBancariaEmpresas(){
        super();
    }

    public ContaBancariaEmpresas(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if(amount <= loanLimit){
            balance += amount - 10.0; // Descontando a taxa de empréstimo
        }
    }

    @Override
    public final void withdraw(double amount){
        // A palavra "final" vai impedir que o método withdraw() da classe ContaBancariaEmpresas seja sobreposto por eventuais subclassses
        // Geralmente convém acrescentar "final" em métodos sobrepostos, pois sobreposições múltiplas podem ser uma porta de entrada para inconsistências
        super.withdraw(amount);
        balance -= 2.0;
    }

}
