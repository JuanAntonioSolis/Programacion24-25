package Tema6.PruebaEscrita2023;

import Tema6.PruebaEscrita2023.Enums.Categoria;
import Tema6.PruebaEscrita2023.Enums.Numero;
import Tema6.PruebaEscrita2023.Enums.Talla;
import Tema6.PruebaEscrita2023.Enums.TipoRopa;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Tienda base = new Tienda();

        Producto p1 = new Ropa("Calabasas","Pantalones adidasxcalabasas",110,
                8, Talla.L,"Azul oscuro", TipoRopa.PANTALON);
        Producto p2 = new Ropa("Fleece","Chaqueta fleece",120,
                15,Talla.XL,"Color marron",TipoRopa.CHAQUETA);
        Producto p3 = new Ropa("CamInterior","Camiseta tecnica interior",35,
                20,Talla.XS,"Negro",TipoRopa.CAMISETAINTERIOR);
        Producto p4 = new Zapatillas("Mercurial","Los tenis de mesi",90,
                15, Numero.CUARENTAYTRES, Categoria.FUTBOL);
        Producto p5 = new Zapatillas("Reebok","Tenis de andar peques",40,
                60,Numero.TREINTAYCINCO,Categoria.WALKING);
        Producto p6 = new Zapatillas("LeBron","Lebron shoes",140,
                10,Numero.CUARENTAYSEIS,Categoria.BALONCESTO);

        base.addProducto(p1);
        base.addProducto(p2);
        base.addProducto(p3);
        base.addProducto(p4);
        base.addProducto(p5);
        base.addProducto(p6);


        int opcion = -1;

        while (opcion != 6){
            System.out.println("MENU");
            System.out.println("------------------------");
            System.out.println("1. Mostrar inventario");
            System.out.println("2. Buscar producto");
            System.out.println("3. Mostrar compras");
            System.out.println("4. Mostrar compras por mes");
            System.out.println("5. Hacer compra");
            System.out.println("6. Salir");
            System.out.println("Elige una de las opciones");

            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opción inválida");
            }

            switch (opcion) {
                case 1:
                    System.out.println(base.mostrarInventario());
                    break;
                case 2:
                    String nombre;
                    System.out.println("Ingresa el nombre del producto a buscar: ");
                    nombre = sc.nextLine();
                    System.out.println(base.buscarProducto(nombre));
                    break;
                case 3:
                    System.out.println(base.mostrarCompras());
                    break;
                case 4:
                    Month mes;
                    System.out.println("Introduce el mes del que quieres imprimir las compras:");
                    mes = Month.valueOf(sc.nextLine());

                    System.out.println(base.mostrarCompras(mes));

                    break;
                case 5:
                    String id;
                    int cantidad;

                    Compra cp = new Compra(LocalDate.now());

                    System.out.println("Introduce el id del producto a comprar: ");
                    id = sc.nextLine();
                    System.out.println("Introduce la cantidad deseada: ");
                    cantidad = Integer.parseInt(sc.nextLine());


                   // LineaCompra lc = new LineaCompra()



                    break;
                case 6:
                    System.out.println("¡Gracias por comprar en Base, hasta pronto!");
                    break;
                default:
                    System.out.println("Error, opción incorrecta");
            }

            System.out.println("Pulse intro para continuar");
            sc.nextLine();

        }



    }
}
