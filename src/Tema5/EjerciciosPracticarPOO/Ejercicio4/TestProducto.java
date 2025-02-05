package Tema5.EjerciciosPracticarPOO.Ejercicio4;

public class TestProducto {
    public static void main(String[] args) {

        Producto p1 = new Producto(120, "Leche",0.99,
                42, 80, 0.10);
        Producto p2 = new Producto(45, "Capsulas cafe",1.99,
                60,100,0.15);
        Producto p3 = new Producto(42, "Cola-Cao",4.99,
                30,120,0.10);

        p1.vender(30);
        System.out.println(p1);

        p1.reponer();
        System.out.println(p1);

    }
}
