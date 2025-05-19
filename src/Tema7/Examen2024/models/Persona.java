package Tema7.Examen2024.models;

import java.util.Objects;
import java.util.UUID;

public class Persona {

    protected Long id;
    protected String nombre;
    protected String apellidos;
    protected String mail;
    protected String movil;

    public Persona(Long id,String nombre, String apellidos, String mail, String movil) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.mail = mail;
        this.movil = movil;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Persona{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", mail='").append(mail).append('\'');
        sb.append(", movil=").append(movil);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(id, persona.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
