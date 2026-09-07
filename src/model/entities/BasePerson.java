package model.entities;

public abstract class BasePerson {

    private String name;
    private Double anualIncome;

    public BasePerson(){

    }

    public BasePerson(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

    public abstract Double calculateTax();

    @Override
    public String toString() {
        return this.name + ": $ " + String.format("%.2f", calculateTax());
    }
}
