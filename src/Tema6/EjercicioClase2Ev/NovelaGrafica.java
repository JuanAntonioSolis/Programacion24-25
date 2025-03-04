package Tema6.EjercicioClase2Ev;

import java.time.LocalDate;

public class NovelaGrafica extends Comic {

    private String resumen;


    public NovelaGrafica(String titulo, LocalDate fecha, Integer numPaginas, String resumen) {
        super(titulo, fecha, numPaginas);
        this.resumen = resumen;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("NovelaGrafica{");
        sb.append("resumen='").append(resumen).append('\'');
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", numPaginas=").append(numPaginas);
        sb.append(", autores=").append(autores); //OJO
        sb.append('}');
        return sb.toString();
    }
}
