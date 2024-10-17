package Tema2.Bucles;

public class EjercicioDado20 {

    public static void main(String[] args) {

        //Simula tirar un dado de 20 caras hasta que te salga el 1 o el 20.


        int tirada = 6;

        while ((tirada != 1) && (tirada != 20)) {

            tirada = (int) (Math.random() * (20 - 1 + 1) + 1 );
            System.out.println(tirada);

        }



        //Quiero que el bucle se repita hasta que tenga:
        // tirada == 1 || tirada ==20

        /*

        int tirada; // Con Do While, no hace falta inicializar esta variable
        int intento = 0; //

        do {
            tirada = (int) (Math.random() * (20 - 1 + 1) +1);
            intento++;
            System.out.println("Tirada: " + tirada + ", intento: " + intento);

        } while ((tirada != 1) && (tirada != 20));

        System.out.println("En total has necesitado " + intento + " intentos.");

         */

    }
}
