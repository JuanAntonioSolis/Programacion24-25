package Tema4.EjerciciosPOO.Ex2;

public class TestCoche {

    public static void main(String[] args) {
        Coche citroen = new Coche();

        citroen.acelera(50);

        System.out.println("El coche al acelerar va a " + citroen.getVelocidad());

        citroen.frena(39);

        System.out.println("El coche al frenar va a " + citroen.getVelocidad());

        citroen.acelera(100);

        System.out.println("El coche acelera de nuevo a " + citroen.getVelocidad());
    }
}
