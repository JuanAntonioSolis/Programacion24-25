package Tema2.Bucles;

public class TablaMultiplicar9 {

    public static void main(String[] args) {

        //Tabla de multiplicar del 9
        /*
        for (int i = 1; i<=10; i++) {
            System.out.println(i + " x 9 = " + (i*9));
        }

         */

        //Tablas de multiplicar del 1 al 10.

        for (int j = 1; j<=10; j++) {
            for (int i = 1; i<=10; i++) {
                System.out.println(i + " x " + j + " = " + (i*j));
            }
        }



    }
}
