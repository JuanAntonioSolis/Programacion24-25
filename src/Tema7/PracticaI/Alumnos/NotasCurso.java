package Tema7.PracticaI.Alumnos;

import java.util.*;

public class NotasCurso {

    enum etapaEducativa{ESO,BACHILLERATO, FPBASICA, FPMEDIO, FPSUPERIOR}

    private String nombreCiclo;
    private etapaEducativa etapa;
    private Integer curso;
    private HashMap<String,Double> notas;
    private Integer year;

    public NotasCurso(String nombreCiclo, etapaEducativa etapa, Integer curso, Integer year) {
        this.nombreCiclo = nombreCiclo;
        this.etapa = etapa;
        this.curso = curso;
        this.year = year;
        notas = new HashMap<>();
    }

    public String getNombreCiclo() {
        return nombreCiclo;
    }

    public void setNombreCiclo(String nombreCiclo) {
        this.nombreCiclo = nombreCiclo;
    }

    public etapaEducativa getEtapa() {
        return etapa;
    }

    public void setEtapa(etapaEducativa etapa) {
        this.etapa = etapa;
    }

    public Integer getCurso() {
        return curso;
    }

    public void setCurso(Integer curso) {
        this.curso = curso;
    }

    public HashMap<String, Double> getNotas() {
        return notas;
    }

    public void setNotas(HashMap<String, Double> notas) {
        this.notas = notas;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("NotasCurso{");
        sb.append("nombreCiclo='").append(nombreCiclo).append('\'');
        sb.append(", etapa=").append(etapa);
        sb.append(", curso=").append(curso);
        sb.append(", notas=").append(notas);
        sb.append(", year=").append(year);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotasCurso that = (NotasCurso) o;
        return Objects.equals(nombreCiclo, that.nombreCiclo) && etapa == that.etapa && Objects.equals(curso, that.curso) && Objects.equals(year, that.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreCiclo, etapa, curso, year);
    }

    public void addNota(String asignatura, Double nota) {
        notas.put(asignatura, nota);
    }

    public void deleteNota(String asignatura) {
        notas.remove(asignatura);
    }


    /**
     * Metodo para buscar asignatura, dentro del HashMap
     * Se busca por nombre de asignatura, si el HashMap tiene esa key.
     * Si se encuentra la asignatura, devuelve su nota
     * @param asignatura
     * @return
     */
    public Double buscar(String asignatura) {
        for (String nota: notas.keySet()) {
            if (nota.equals(asignatura)) {
                return notas.get(nota);
            }
        }

        return 0.0;
    }


    /**
     * Pinta notas ordenadas por asignatura
     */
    public void pintar(){
        ArrayList<String> nomAsig = new ArrayList<>(notas.keySet());

        nomAsig.sort(Comparator.comparing(String::trim));
        for (String key : nomAsig) {
            System.out.println(key + ", " + notas.get(key));
        }
    }






}
