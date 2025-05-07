package Tema7.PracticaIII;

import java.util.HashSet;
import java.util.Set;

public class DAOLectura {

    private Set<Lectura> lecturas;

    public DAOLectura() {
        this.lecturas = new HashSet<>();
        //this.cargarDatos();
    }

    public DAOLectura(Set<Lectura> lecturas) {
        this.lecturas = lecturas;
    }

    public Set<Lectura> getLecturas() {
        return lecturas;
    }

    public void addLectura(Lectura lectura) {
        this.lecturas.add(lectura);
    }

    public void deleteLectura(Lectura lectura) {
        this.lecturas.remove(lectura);
    }


}
