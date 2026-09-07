package model.entities;

public class Aluno {

    private String nome;
    private double notaPrimeiroSemestre;
    private double notaSegundoSemestre;

    public Aluno(String nome, double notaPrimeiroSemestre, double notaSegundoSemestre){
        this.nome = nome;
        this.notaPrimeiroSemestre = notaPrimeiroSemestre;
        this.notaSegundoSemestre = notaSegundoSemestre;
    }

    public String getNome(){
        return this.nome;
    }

    public double getNotaPrimeiroSemestre(){
        return this.notaPrimeiroSemestre;
    }

    public double getNotaSegundoSemestre(){
        return this.notaSegundoSemestre;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNotaPrimeiroSemestre(double notaPrimeiroSemestre){
        this.notaPrimeiroSemestre = notaPrimeiroSemestre;
    }

    public void setNotaSegundoSemestre(double notaSegundoSemestre){
        this.notaSegundoSemestre = notaSegundoSemestre;
    }

}
