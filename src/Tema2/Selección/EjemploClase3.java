package Tema2.Selección;

public class EjemploClase3 {
    public static void main(String[] args) {

          /* VidaPersonaje, MagiaPersonaje, escudoEspecial(boolean).
        Si la vida es menor que 50 y no tiene escrudo, pinta "Toma poción de vida".
        Sino si magia es menor que 50y no tiene escudo "Toma poción mágica".
        Sino si la vida es menor que 50 y la magia es menor que 50 "Tómate algo y corre.
         */


        int vidaPersonaje = 49;
        int magiaPersonaje = 35;
        boolean escudoEspecial = true;

        if (vidaPersonaje < 50 && escudoEspecial==false){
            System.out.println("Toma poción de vida");
        } else if (magiaPersonaje < 50 && escudoEspecial==false) {
            System.out.println("Toma poción mágica");
        } else if (vidaPersonaje < 50 && magiaPersonaje < 50) {
            System.out.println("Tómate algo y corre");
        }

        /*
        if (vidaPersonaje < 50 && escudoEspecial==false){
            System.out.println("Toma poción de vida");
        }
        if (magiaPersonaje < 50 && escudoEspecial==false) {
            System.out.println("Toma poción mágica");
        }
        if (vidaPersonaje < 50 && magiaPersonaje < 50) {
            System.out.println("Tómate algo y corre");
        }
         */
    }
}






