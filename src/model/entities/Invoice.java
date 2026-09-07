package model.entities;

public class Invoice {

    private Double basicPayment;
    private Double tax;

    public Invoice(){

    }

    public Invoice(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public Double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getTotalPayment(){
        return getBasicPayment() + getTax(); // usar o get dos atributos é melhor do que usar os atributos direto porque se um dia os get dos atributos
        // incluírem alguma lógica, não precisa alterar nada aqui
    }

}
