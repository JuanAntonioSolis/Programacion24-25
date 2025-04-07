package Tema7.PracticaI.GestionBiblioteca;

import java.time.LocalDate;
import java.util.*;

public class Biblioteca {

    private HashMap<String,Libro> catalogo; //Almacena libros por ISBN
    private HashMap<String, Usuario> usuarios; //Almacena usuarios por DNI
    private TreeMap<Usuario, HashSet<Prestamo>> prestamos; //Asocia cada usuario con un conjunto de préstamos
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;

    public Biblioteca(String nombre, String direccion, String telefono, String email) {
        this.catalogo = new HashMap<>();
        this.usuarios = new HashMap<>();
        this.prestamos = new TreeMap<>(new Comparator<Usuario>() {
            @Override
            public int compare(Usuario o1, Usuario o2) {
                return o1.getDNI().compareTo(o2.getDNI());
            }
        });
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public HashMap<String, Libro> getCatalogo() {
        return catalogo;
    }

    public HashMap<String, Usuario> getUsuarios() {
        return usuarios;
    }

    public TreeMap<Usuario, HashSet<Prestamo>> getPrestamos() {
        return prestamos;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Biblioteca{");
        sb.append("catalogo=").append(catalogo);
        sb.append(", usuarios=").append(usuarios);
        sb.append(", prestamos=").append(prestamos);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Biblioteca that = (Biblioteca) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    /**
     * Añade un libro al catálogo
     * @param l
     */
    public void addLibro(Libro l){
        this.catalogo.put(l.getISBN(),l);

    }

    /**
     * Añade un usuario a la lista de usuarios
     * Además, se añade en el treemap de prestamos, con un nuevo préstamo
     * @param u
     */
    public boolean addUsuario(Usuario u){

        if (!this.usuarios.containsKey(u.getDNI())){
            this.usuarios.put(u.getDNI(),u);
            this.prestamos.put(u,new HashSet<>());
            return true;
        } else
            return false;

    }

    public Boolean esLibroDisponble(String isbn){

        /*
        for (HashSet<Prestamo> prestValores : this.prestamos.values()){
            for (Prestamo p : prestValores){
                if (p.estaActivo() && p.getLibro().getISBN().equals(isbn)){
                    System.out.println("El libro está disponible");
                    return true;
                }
            }
        }
        return false;
         */

        for (Usuario user : this.prestamos.keySet()){
            for (Prestamo prest : this.prestamos.get(user)){
                if (prest.estaActivo() && prest.getLibro().getISBN().equals(isbn)){
                    return false;
                }
            }
        }

        return true;

    }

    public void prestarLibro(String dni, String isbn){

        if (this.esLibroDisponble(isbn) && usuarios.containsKey(dni)){
            this.prestamos.get(usuarios.get(dni)).add(new Prestamo(this.usuarios.get(dni),
                    this.catalogo.get(isbn),LocalDate.now()));
            this.prestamos.put(this.usuarios.get(dni), this.prestamos.get(usuarios.get(dni)));
        }


    }

    public void devolverLibro(String dni, String isbn){

        for (Usuario user : this.prestamos.keySet()){
            if (user.getDNI().equals(dni)){
                for (Prestamo prest : this.prestamos.get(user)){
                    if (prest.getLibro().getISBN().equals(isbn)){
                        prest.devolverLibro();
                    }
                }
            }
        }

    }

    public HashSet<Prestamo> buscarPrestamosUsuario(String dni){
        return this.prestamos.get(usuarios.get(dni));
    }


    public void listarLibrosDisponibles(){

        for (String cod : this.catalogo.keySet()){
            for (Usuario user : this.prestamos.keySet()){
                for (Prestamo prest : this.prestamos.get(user)){

                    if (prest.getLibro().getISBN().equals(cod)){
                        System.out.println(this.catalogo.get(cod));
                    }

                }
            }
        }







    }










}
