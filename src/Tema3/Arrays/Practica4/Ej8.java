package Tema3.Arrays.Practica4;

/*
Genera aleatoriamente una tabla de 10 elementos numéricos enteros, guardalos en una array. Luego pide por
teclado una posición (entre 0 y 9). Eliminar el elemento situado en la posición dada sin dejar huecos.
 */

public class Ej8 {

    public static int aleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static void main(String[] args) {

        int tabla[] = new int[10];

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = aleatorio(10, 1);
        }

    }
}
