package model.entities;

public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double sumGrades(){
        return this.grade1 + this.grade2 + this.grade3;
    }

    public String finalResult(){
        double totalNotas = sumGrades();
        if(totalNotas > 60.00){
            return "PASS";
        }
        else{
            return "FAILED";
        }
    }

    public double calculateMissingGrade(){
        double totalNotas = sumGrades();
        if (totalNotas < 60.0){
            return 60.0 - totalNotas;
        }
        else{
            return 0.0;
        }
    }

}
