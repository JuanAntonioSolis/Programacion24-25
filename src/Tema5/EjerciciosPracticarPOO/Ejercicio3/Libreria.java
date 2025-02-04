package Tema5.EjerciciosPracticarPOO.Ejercicio3;

import java.util.ArrayList;

public class Libreria {

    private ArrayList<Libro> libros;

    public Libreria() {
        this.libros = new ArrayList<>();
    }

    public void adquirir(Libro libro, Double precioCompra) {

        libros.add(libro);

        libro.setPrecioCompra(precioCompra);

    }

    public void vender(Libro libro, Double precioVenta) {
        libro.setPrecioVenta(precioVenta);

        libro.setVendido(true);
    }

    public Double ganancias(){
        Double ganancia = 0.0;
        Double costo = 0.0;
        Double ingreso = 0.0;

        for (Libro libro : libros) {
            costo = libro.getPrecioCompra() * 10;
            ingreso = libro.getPrecioVenta() * 10;
        }

        ganancia = ingreso - costo;

        return ganancia;
    }
}
