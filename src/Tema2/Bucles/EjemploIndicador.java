package Tema2.Bucles;

public class EjemploIndicador {

    public static void main(String[] args) {

        /*
        Si tiramos un dado 10 veces y queremos saber si ha salido algun 6.
         */

        int tirada;
        boolean sale6 = false;

        for (int i = 0; i<10; i++) {
            tirada = (int) (Math.random() * (6-1+1) + 1);
            if (tirada == 6) {
                sale6 = true;
            }
            System.out.println(tirada);
        }

        System.out.println("Ha salido algun 6: " + sale6);
    }
}
