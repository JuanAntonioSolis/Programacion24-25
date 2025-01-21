package Tema4.EjerciciosPOO.Ex7;

public class Incidencia {

    enum Estado {ABIERTA, ENPROCESO, RESUELTA};

    private Integer codigo;
    private Estado estado;
    private String problema;
    private String solucion;

    private static Integer pendientes = 0;

    public Incidencia(Integer codigo, String problema) {
        this.codigo = codigo;
        this.estado = Estado.ABIERTA;
        this.problema = problema;
        this.solucion = "";
        Incidencia.pendientes++;
    }

    public Integer getCodigo() {
        return codigo;
    }


    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    @Override
    public String toString() {
        return "Incidencia{" +
                "codigo=" + codigo +
                ", estado=" + estado +
                ", problema='" + problema + '\'' +
                ", solucion='" + solucion + '\'' +
                '}';
    }

    public static Integer getPendientes() {
        return pendientes;
    }

    public void resuelve() {
        this.estado = Estado.RESUELTA;
        Incidencia.pendientes--;

    }
}
