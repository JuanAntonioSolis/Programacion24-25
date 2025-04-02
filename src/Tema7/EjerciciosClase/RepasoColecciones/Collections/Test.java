package Tema7.EjerciciosClase.RepasoColecciones.Collections;

public class Test {

    public static void main(String[] args) {


        System.out.println("Baraja francesa");
        Baraja b = new Baraja();
        System.out.println(b);

        System.out.println(b.sacarArriba());
        System.out.println(b.sacarAbajo());

        b.ordernarPorNumero();

        System.out.println(b);

        b.ordernarPorPalo();

        System.out.println(b);

    }
}
