package model.entities;

public class BankAccount {

    private String numeroConta;
    private String nomeTitular;
    private double saldo;

    private static final double TAXA_SAQUE = 5.00;

    public BankAccount(String numeroConta, String nomeTitular, double initialDeposit){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        fazerDeposito(initialDeposit);
    }

    public BankAccount(String numeroConta, String nomeTitular){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void fazerDeposito(double valor){
        this.saldo += valor;
    }

    public void fazerSaque(double valor){
        double retirada = valor + TAXA_SAQUE;
        this.saldo -= retirada;
    }

    public String toString(){
        return "Account " + this.numeroConta + ", Holder: " + this.nomeTitular + ", Balance: $ " + String.format("%.2f", this.saldo);
    }

}
