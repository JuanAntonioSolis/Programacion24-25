package Tema5.EjerciciosPracticarPOO.Ejercicio5;

import Tema5.EjerciciosPracticarPOO.Ejercicio4.Producto;

import java.util.ArrayList;

public class Tienda {

    private ArrayList<Producto> productos;
    private Double ventas;


    public Tienda() {
        this.productos = new ArrayList<>();
        this.ventas = 0.0;
    }

    public Double getVentas() {
        return ventas;
    }

    public void setVentas(Double ventas) {
        this.ventas = ventas;
    }


    public void adquirirProd(Producto unProducto) {
        this.productos.add(unProducto);
    }

    /**
     * Recorre la lista de productos, para ver si está.
     * Si está, y hay suficiente stock, llama a this.producto.vender;
     *
     * @param id
     */
    public void venderProd(int id){

        for (Producto producto : productos){
            if (producto.getId().equals(id) && producto.getStockMaximo() > 0){

            }
        }


    }


}
