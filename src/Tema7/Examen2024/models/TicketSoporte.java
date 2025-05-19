package Tema7.Examen2024.models;

import java.time.LocalDate;
import java.util.Objects;

public class TicketSoporte implements Comparable<TicketSoporte> {

    private Long id;
    private LocalDate fechaCreacion;
    private LocalDate fechaFinalizacion;
    private Estado estado;
    private Integer prioridad;
    private Usuario solicitante;
    private Tecnico asignado;
    private String comentarios;

    public TicketSoporte(Long id, LocalDate fechaCreacion, LocalDate fechaFinalizacion, Estado estado,
                         Integer prioridad, Usuario solicitante, Tecnico asignado, String comentarios) {
        this.id = id;
        this.fechaCreacion = fechaCreacion;
        this.fechaFinalizacion = fechaFinalizacion;
        this.estado = estado;
        this.prioridad = prioridad;
        this.solicitante = solicitante;
        this.asignado = asignado;
        this.comentarios = comentarios;
    }

    public TicketSoporte(LocalDate fechaCreacion, LocalDate fechaFinalizacion,
                         Estado estado, Integer prioridad, Usuario solicitante, Tecnico asignado, String comentarios) {
        this.fechaCreacion = fechaCreacion;
        this.fechaFinalizacion = fechaFinalizacion;
        this.estado = estado;
        this.prioridad = prioridad;
        this.solicitante = solicitante;
        this.asignado = asignado;
        this.comentarios = comentarios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(LocalDate fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Integer getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }

    public Usuario getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Usuario solicitante) {
        this.solicitante = solicitante;
    }

    public Tecnico getAsignado() {
        return asignado;
    }

    public void setAsignado(Tecnico asignado) {
        this.asignado = asignado;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TicketSoporte{");
        sb.append("id=").append(id);
        sb.append(", fechaCreacion=").append(fechaCreacion);
        sb.append(", fechaFinalizacion=").append(fechaFinalizacion);
        sb.append(", estado=").append(estado);
        sb.append(", prioridad=").append(prioridad);
        sb.append(", solicitante=").append(solicitante.getNombre());
        sb.append(", asignado=").append(asignado.getNombre());
        sb.append(", comentarios='").append(comentarios).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TicketSoporte that = (TicketSoporte) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    /**
     * Comparable por fechaCreacion
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(TicketSoporte o) {
        return this.getFechaCreacion().compareTo(o.getFechaCreacion());
    }

}
