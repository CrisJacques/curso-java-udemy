package model.entities;

import java.util.Objects;

public class AlunoUsuario {

    private int studentCode;

    public AlunoUsuario(int studentCode) {
        this.studentCode = studentCode;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AlunoUsuario that = (AlunoUsuario) o;
        return studentCode == that.studentCode;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(studentCode);
    }
}
