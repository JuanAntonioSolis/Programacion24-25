package Tema7.PracticaI.Alumnos;

import java.util.HashSet;
import java.util.Objects;

public class Expediente {

    private Estudiante estudiante;
    private HashSet<NotasCurso> notas;
    private Boolean activo;

    public Expediente(Boolean activo, Estudiante estudiante) {
        this.activo = activo;
        this.estudiante = estudiante;
        notas = new HashSet<>();
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public HashSet<NotasCurso> getNotas() {
        return notas;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Expediente{");
        sb.append("estudiante=").append(estudiante);
        sb.append(", notas=").append(notas);
        sb.append(", activo=").append(activo);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expediente that = (Expediente) o;
        return Objects.equals(estudiante, that.estudiante);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(estudiante);
    }

    public void addNotas(NotasCurso nc){
        notas.add(nc);
    }

    public void mostrarNotas(Integer curso, String etapa){
        for (NotasCurso nc : notas) {
            if (nc.getCurso().equals(curso) && nc.getEtapa().equals(etapa)) {
                System.out.println(nc);
            }
        }
    }




}
