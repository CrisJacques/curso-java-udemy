package model.entities;

// A palavra "final" vai impedir que a classe ContaPoupanca possa ser herdada
public final class ContaPoupanca extends ContaBancaria{

    private Double interestRate;

    public ContaPoupanca(){
        super();
    }

    public ContaPoupanca(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    @Override
    public void withdraw(double amount){
        balance -= amount; // Ou seja, na conta poupança não deve ser cobrada taxa de saque, diferentemente do definido na classe base
    }
}
