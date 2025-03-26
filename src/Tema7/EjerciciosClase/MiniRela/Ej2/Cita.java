package Tema7.EjerciciosClase.MiniRela.Ej2;

import Tema5.EjerciciosPracticarPOO.Ejercicio1.Persona;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cita {

    enum Tipo {PRIMERA, REVISION, CONSULTA}

    private Paciente persona;
    private LocalDate fecha;
    private LocalTime hora;
    private Tipo tipo;

    public Cita(Paciente persona, LocalDate fecha, LocalTime hora, Tipo tipo) {
        this.persona = persona;
        this.fecha = fecha;
        this.hora = hora;
        this.tipo = tipo;
    }

    public Paciente getPersona() {
        return persona;
    }

    public void setPersona(Paciente persona) {
        this.persona = persona;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cita{");
        sb.append("Nombre paciente=").append(persona.getNombre());
        sb.append(", apellido paciente=").append(persona.getApellidos());
        sb.append(", fecha=").append(fecha);
        sb.append(", hora=").append(hora);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }
}
