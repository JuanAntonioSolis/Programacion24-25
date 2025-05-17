package Tema7.Examen2024.models;

import java.time.LocalDate;

public class Usuario extends Persona {

    private LocalDate fechaAlta;


    public Usuario(String nombre, String apellidos, String mail, Long movil, LocalDate fechaAlta) {
        super(nombre, apellidos, mail, movil);
        this.fechaAlta = fechaAlta;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Usuario{");
        sb.append("fechaAlta=").append(fechaAlta);
        sb.append(", id='").append(id).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", mail='").append(mail).append('\'');
        sb.append(", movil=").append(movil);
        sb.append('}');
        return sb.toString();
    }
}
