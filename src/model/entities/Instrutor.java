package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Instrutor {

    private String name;

    private List<Curso> cursos = new ArrayList<>();

    public Instrutor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void addCurso(Curso curso){
        cursos.add(curso);
    }

    public void removeCurso(Curso curso){
        cursos.remove(curso);
    }
}
