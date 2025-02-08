package Tema5.EjerciciosPracticarPOO.Ejercicio5;

import Tema5.EjerciciosPracticarPOO.Ejercicio4.Producto;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {

    private ArrayList<Producto> productos;
    private Double ventas;

    public ArrayList<Producto> getProductos() {
        return productos;
    }

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
     * El metodo recibe un entero ID, necesitamos recorrer la lista para ver si algun
     * elemento de la lista tiene un ID igual, sino, el elemento no se encuentra en la lista.
     *
     * Si está, y hay stock suficiente, se llama al metodo vender del producto.
     *
     * Ventas+=precioproducto-descuento*precioproducto
     *
     * Si productoStock = 0, set producto a null
     *
     * @param id
     */
    public void venderProd(int id){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese cuántas unidades del producto quiere vender");
        int cant = Integer.parseInt(sc.nextLine());

        for (Producto producto : productos) {
            if (producto.getId() == id) {
                if (cant <= producto.getUnidadesDisponibles()){
                    producto.vender(cant);
                    this.ventas += (producto.getPrecioUnitario() -
                            (producto.getPrecioUnitario() * producto.getDescuento())) * cant;
                    if (producto.getUnidadesDisponibles() <= 0){
                        this.productos.remove(producto);
                    }
                }
            }
        }
    }
}
