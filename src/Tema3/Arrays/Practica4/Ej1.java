package Tema3.Arrays.Practica4;

/*
Programa Java que guarda en un array 20 números enteros que se generen aleatoriamente entre -100 y 100. A
continuación, se recorre el array y calcula cuántos números son positivos y cuántos negativos
 */

public class Ej1 {

    public static int aleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static void main(String[] args) {

        int enteros[] = new int[20];
        int contPositivos = 0;
        int contNegativos = 0;

        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = aleatorio(100, -100);
            if (enteros[i] < 0) {
                contNegativos++;
            } else if (enteros[i] > 0) {
                contPositivos++;
            }
        }

        for (int i = 0; i < enteros.length; i++) {
            System.out.println(enteros[i]);
        }

        System.out.println("Tenemos " + contPositivos + " números positivos");
        System.out.println("Tenemos " + contNegativos + " números negativos");


    }
}
