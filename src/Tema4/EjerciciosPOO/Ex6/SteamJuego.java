package Tema4.EjerciciosPOO.Ex6;

public class SteamJuego {

    private String nombre;
    private String descripcion;
    private Integer mediaJugadoresDiarios;
    private Integer diasDesdeSalida;
    private Integer precio;
    private Integer puestoMasVendidos;

    public SteamJuego(String nombre, String descripcion, Integer mediaJugadoresDiarios, Integer diasDesdeSalida, Integer precio, Integer puestoMasVendidos) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.mediaJugadoresDiarios = mediaJugadoresDiarios;
        this.diasDesdeSalida = diasDesdeSalida;
        this.precio = precio;
        this.puestoMasVendidos = puestoMasVendidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getMediaJugadoresDiarios() {
        return mediaJugadoresDiarios;
    }

    public void setMediaJugadoresDiarios(Integer mediaJugadoresDiarios) {
        this.mediaJugadoresDiarios = mediaJugadoresDiarios;
    }

    public Integer getDiasDesdeSalida() {
        return diasDesdeSalida;
    }

    public void setDiasDesdeSalida(Integer diasDesdeSalida) {
        this.diasDesdeSalida = diasDesdeSalida;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getPuestoMasVendidos() {
        return puestoMasVendidos;
    }

    public void setPuestoMasVendidos(Integer puestoMasVendidos) {
        this.puestoMasVendidos = puestoMasVendidos;
    }

    public void jugadoresDia(Integer jugadoresHoy){
        this.mediaJugadoresDiarios = ((this.mediaJugadoresDiarios * this.diasDesdeSalida) + jugadoresHoy) / (diasDesdeSalida + 1);
    }
}
