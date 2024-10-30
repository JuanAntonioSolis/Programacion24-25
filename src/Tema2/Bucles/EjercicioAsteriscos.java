package Tema2.Bucles;

public class EjercicioAsteriscos {

    public static void main(String[] args) {

        //Fila1 **** *** 0e - 4* 3*
        //Fila2  *** **  1e - 3* 2*
        //Fila3   ** *   2e - 2* 1*
        //Fila4    *    3e - 1* 0*

        for (int i = 1 ; i <= 4; i++) {

            for (int j=1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j=1; j <= i; j++) {
                System.out.print("*");
            }









            System.out.println();


        }


    }
}
