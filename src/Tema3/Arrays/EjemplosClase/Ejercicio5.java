package Tema3.Arrays.EjemplosClase;

        /*
        Vamos a simular que tenemos un sensor de temperatura en una plantacion de tomates
        El dispositivo toma la temperatura 120 veces al día
        (5º - 50º)
        Simula el comportamiento del sensor con un array de double
        Que represente la temperatura tomada por el sensor.

        Si la temperatura media actual es superior a un umbral (35 grados)
        Debe saltar una alarma (Throw exception)
         */

public class Ejercicio5 {




    public static int aleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static void main(String[] args) {

        double media = 0;
        double umbral = 35;
        boolean alarma = false;


        double temperatura[] = new double[120];


        try {
            for (int i = 0; i < temperatura.length; i++) {
                temperatura[i] = aleatorio(50,5);
                media = (media + temperatura[i]) / (i+1);

                if (media > umbral) throw new Exception("Alarma, ha subido la temperatura!!!");

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }





    }
}
