package model.entities;

public class ContaBancaria {

    private Integer number;
    private String holder;
    protected Double balance; // para que este atributo possa ser acessado pelas subclasses

    public ContaBancaria(){

    }

    public ContaBancaria(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(double amount){
        this.balance -= amount + 5.0; // Taxa de saque é cobrada
    }

    public void deposit(double amount){
        this.balance += amount;
    }

}
