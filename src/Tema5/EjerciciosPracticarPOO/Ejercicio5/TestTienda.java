package Tema5.EjerciciosPracticarPOO.Ejercicio5;

import Tema5.EjerciciosPracticarPOO.Ejercicio4.Producto;

public class TestTienda {

    public static void main(String[] args) {

        Tienda cayuela = new Tienda();

        Producto p1 = new Producto(120, "Leche",0.99,
                42, 80, 0.10);
        Producto p2 = new Producto(45, "Capsulas cafe",1.99,
                60,100,0.15);
        Producto p3 = new Producto(42, "Cola-Cao",4.99,
                30,120,0.10);

        cayuela.adquirirProd(p1);
        cayuela.adquirirProd(p2);
        cayuela.adquirirProd(p3);

        cayuela.venderProd(45);

        System.out.println(p2);
        System.out.println(cayuela.getVentas());
        System.out.println(cayuela.getProductos());
    }
}
