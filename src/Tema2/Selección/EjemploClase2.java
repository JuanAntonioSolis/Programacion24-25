package Tema2.Selección;

public class EjemploClase2 {
    public static void main(String[] args) {

        /*Un personaje de juego tiene vida y tiene maná
        Si la vida es menor de 50 pinto que tiene que tomar poción de vida
        Si el maná es menor de 50 pinto que tiene que tomar poción de magia
        Si la vida es menor de 50 y el maná es menor que 50 que pinte "CORRE"

         */

        int vidaPersonaje = 49;
        int manaPersonaje = 33;

        if (vidaPersonaje <= 50){
            System.out.println("Toma poción de vida.");
        }
        if (manaPersonaje <=50 ){
            System.out.println("Toma poción de magia.");
        }

        if (vidaPersonaje < 50 && manaPersonaje < 50){
            System.out.println("CORRE");
        }
    }
}
