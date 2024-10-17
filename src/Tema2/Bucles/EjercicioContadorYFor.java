package Tema2.Bucles;

public class EjercicioContadorYFor {

    public static void main(String[] args) {

        //Tira un dado de seis caras 100 veces
        //Y dime cuántas veces sale el 6

        /*

        int cuenta = 0;
        int tirada;

        for (int i = 0; i < 100; i++) {
            tirada = (int) (Math.random() * (6-1+1)+1);
            if (tirada == 6) {
                cuenta++;
            }
        }

        System.out.println("El 6 ha salido " + cuenta + " veces.");

         */

        //Igual, pero con el porcentaje de veces.

        int cuenta = 0;
        int tirada;

        for (int i = 0; i < 10000; i++) {
            tirada = (int) (Math.random() * (6-1+1)+1);
            if (tirada == 6) {
                cuenta++;
            }
        }

        System.out.println("El 6 ha salido un " + cuenta * 100 / 10000 + " % de veces.");


    }
}
