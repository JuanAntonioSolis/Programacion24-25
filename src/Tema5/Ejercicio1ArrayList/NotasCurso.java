package Tema5.Ejercicio1ArrayList;

import java.util.Objects;

public class NotasCurso {

    private String materia;
    private Integer curso;
    private Double nota1Ev;
    private Double nota2Ev;
    private Double nota3Ev;
    private Double notaFinal;

    public NotasCurso(String materia, Integer curso, Double nota1Ev, Double nota2Ev, Double nota3Ev) {
        this.materia = materia;
        this.curso = curso;
        this.nota1Ev = nota1Ev;
        this.nota2Ev = nota2Ev;
        this.nota3Ev = nota3Ev;
        this.notaFinal = this.calcularNotaFinal();
    }

    public NotasCurso(String materia, Integer curso) {
        this.materia = materia;
        this.curso = curso;
        this.nota1Ev = 0.0;
        this.nota2Ev = 0.0;
        this.nota3Ev = 0.0;
        this.notaFinal = 0.0;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("NotasCurso{");
        sb.append("materia='").append(materia).append('\'');
        sb.append(", curso=").append(curso);
        sb.append(", notaFinal=").append(notaFinal);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotasCurso that = (NotasCurso) o;
        return Objects.equals(materia, that.materia) && Objects.equals(curso, that.curso) && Objects.equals(nota1Ev, that.nota1Ev) && Objects.equals(nota2Ev, that.nota2Ev) && Objects.equals(nota3Ev, that.nota3Ev);
    }

    @Override
    public int hashCode() {
        return Objects.hash(materia, curso, nota1Ev, nota2Ev, nota3Ev);
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Integer getCurso() {
        return curso;
    }

    public void setCurso(Integer curso) {
        this.curso = curso;
    }

    public Double getNota1Ev() {
        return nota1Ev;
    }

    public void setNota1Ev(Double nota1Ev) {
        this.nota1Ev = nota1Ev;
    }

    public Double getNota3Ev() {
        return nota3Ev;
    }

    public void setNota3Ev(Double nota3Ev) {
        this.nota3Ev = nota3Ev;
    }

    public Double getNota2Ev() {
        return nota2Ev;
    }

    public void setNota2Ev(Double nota2Ev) {
        this.nota2Ev = nota2Ev;
    }

    public Double calcularNotaFinal(){
        return ((this.nota2Ev + this.nota2Ev + this.nota3Ev) / 3);
    }

    public Double getNotaFinal(){
        return this.calcularNotaFinal();
    }
}
