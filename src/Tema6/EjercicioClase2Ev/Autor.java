package Tema6.EjercicioClase2Ev;


import java.time.LocalDate;
import java.util.ArrayList;

public class Autor {

    private String nombre;
    private String apellidos;
    private String email;
    private LocalDate fechaNacimiento;
    private Rol rol;
    private ArrayList<Comic> comics;

    public Autor(String nombre, String apellidos, String email, LocalDate fechaNacimiento, Rol rol) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.rol = rol;
        this.comics = new ArrayList<>();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public ArrayList<Comic> getComics() {
        return comics;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Autor{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", rol=").append(rol);
        //sb.append(", comics=").append(comics);
        sb.append('}');
        return sb.toString();
    }

    public void addComic(Comic c){

        if (!this.comics.contains(c)){
            c.addAutor(this);
            this.comics.add(c);
        }

    }

    public void removeComic(Comic c){
       this.comics.remove(c);
       c.removeAutor(this);
    }
}
