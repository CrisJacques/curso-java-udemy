package model.entities;

public class JuridicalPerson extends BasePerson{

    private int numEmployees;

    public JuridicalPerson(){
        super();
    }

    public JuridicalPerson(String name, Double anualIncome, int numEmployees) {
        super(name, anualIncome);
        this.numEmployees = numEmployees;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    public void setNumEmployees(int numEmployees) {
        this.numEmployees = numEmployees;
    }

    @Override
    public Double calculateTax() {
        double taxToPay;
        if (numEmployees > 10){
            taxToPay = this.getAnualIncome() * 0.14;
        }
        else{
            taxToPay = this.getAnualIncome() * 0.16;
        }

        return taxToPay;
    }
}
