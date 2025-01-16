package Tema4.EjerciciosPOO.Ex5;

public class TestSatelite {

    public static void main(String[] args) {

        Satelite starlink = new Satelite(670.50, 358.92, 382.0);

        Satelite juan = new Satelite();

        juan.setPosicion(1000.15,690.0,500.90);

        starlink.printPosicion();
        juan.printPosicion();

        juan.variaAltura(-60.0);

        if (starlink.enOrbita()){
            System.out.println("Se encuentra fuera de la órbita de la tierra");
        } else
            System.out.println("Se encuentra en la órbita de la tierra");

        juan.variaPosicion(40.0,-10);

        starlink.printPosicion();
        juan.printPosicion();



    }
}
