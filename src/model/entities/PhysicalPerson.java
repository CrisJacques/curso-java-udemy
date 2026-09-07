package model.entities;

public class PhysicalPerson extends BasePerson {

    private Double healthExpenditures;

    public PhysicalPerson(){
        super();
    }

    public PhysicalPerson(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double calculateTax() {
        double taxToPay, discount;
        if (this.getAnualIncome() < 20000.00){
            taxToPay = this.getAnualIncome() * 0.15;
        }
        else{
            taxToPay = this.getAnualIncome() * 0.25;
        }

        if(healthExpenditures > 0.0){
            discount = healthExpenditures * 0.5;
        }
        else{
            discount = 0.0;
        }
        return taxToPay - discount;
    }
}
