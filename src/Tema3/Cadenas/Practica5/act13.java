package Tema3.Cadenas.Practica5;

/*
Encontrar la palabra de mayor longitud de este texto: "No se me ocurre ninguna frase larga".
 */

public class act13 {

    public static void main(String[] args) {

        String texto = "No se me ocurre ninguna frase larga";

        String partido[] = texto.split(" ");

        int max = 0;
        int posicion = -1;

        for (int i = 0; i < partido.length; i++) {
            System.out.println(partido[i]);
            if (partido[i].length() > max) {
                max = partido[i].length();
                posicion = i;
            }
        }

        System.out.println("La cadena más larga es " + partido[posicion]);

    }
}
