package Tema7.PracticaClaseFicherosStreams.services;

import Tema7.PracticaClaseFicherosStreams.Models.Material;

import java.util.HashSet;
import java.util.Set;

public class Inventario {

    private Set<Material> inventario;

    public Inventario() {
        this.inventario = new HashSet<>();
    }

    public Inventario(Set<Material> inventario) {
        this.inventario = inventario;
    }

    public Set<Material> getInventario() {
        return inventario;
    }

    public void addMaterial(Material mat){
        this.inventario.add(mat);
    }

    public void removeMaterial(Material mat){
        this.inventario.remove(mat);
    }


}
