package Tema7.PracticaI.GestionBiblioteca;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

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
        this.prestamos = new TreeMap<>();
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
}
