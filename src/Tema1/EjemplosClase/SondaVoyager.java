package Tema1.EjemplosClase;

public class SondaVoyager {
    public static void main(String[] args) {

        //La sonda voyager salio de la tierra salio en 1977.
        //Viaja a una velocidad de 58000kms/h.  -- v = e / t
        //A cuántos kilómetros de la tierra está la sonda.

        double velocidad = 58000;
        double años = 2024 - 1977;
        double horas = años * 365 * 24;
        double distancia = velocidad * horas;

        System.out.println("La sonda está a " + distancia + "kms de la Tierra");






    }
}
