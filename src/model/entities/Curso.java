package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String courseName;

    private List<AlunoUsuario> alunos = new ArrayList<>();

    public Curso(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<AlunoUsuario> getAlunos() {
        return alunos;
    }

    public void addAluno(AlunoUsuario aluno){
        alunos.add(aluno);
    }

    public void removeAluno(AlunoUsuario aluno){
        alunos.remove(aluno);
    }
}
