package Tema2.Bucles;

public class EjerciciosWhile {

    public static void main(String[] args) {

        //Simula lanzar un dado hasta que te salga un seis.
        //Generar un número aleatorio del 1 al 6.

        /*

        int dado;

        do {
            dado = (int) (Math.random() * (6 - 1 + 1) + 1 );
            System.out.println(dado);
        } while (dado != 6);

         */

        //Simula lanzar un dado hasta que te salga un seis.
        //Generar un número aleatorio del 1 al 6.
        //Cuenta el número de tiradas que has necesitado hasta sacar un 6
        //Necesito una variable que se incremente cada vez que entro en el while

        int dado = 1;
        int cuenta = 0;

        while (dado != 6) { //El bucle funciona hasta que: dado == 6
            dado = (int) (Math.random() * (6 - 1 + 1) + 1 ); //Genera el número aleatorio entre 1 y 6.
            cuenta++; //Va sumando en la variable cuenta, cada vez que se entra al bucle.
            System.out.println(dado);
        }

        System.out.println("Has necesitado " + cuenta + " tiradas.");





    }
}
