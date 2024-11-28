package Tema3.Cadenas.Practica5;

/*
Diseña un programa en Java que solicite al usuario una cadena de carácteres y muestre por pantalla
un conteo de cuántas vocales, consonantes y espacios en blanco contiene la cadena introducida.
 */

import java.util.Scanner;

public class act5 {

    public static int contadorEspacios(String palabra){
        int posicion=0;
        int cont = 0;

        while (posicion >= 0) {
            posicion = palabra.indexOf(" ",posicion);

            if (posicion == -1) {
                break;
            }
            posicion ++;
            cont++;
        }
        return cont;
    }

    /*
    public static int contadorVocales(String palabra){
        String vocales[] = {"a", "e","i", "o", "u"};
        int posicion=0;
        int cont = 0;

        while (posicion >= 0) {

            for (int i = 0; i < palabra.length(); i++) {
                posicion = palabra.indexOf(vocales[vocales.length-1],posicion);
            }

            if (posicion == -1) {
                break;
            }
            posicion ++;
            cont++;
        }
        return cont;
    }

     */



    public static void main(String[] args) {

        String cadena;
        String vocales = "a e i o u";


        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una cadena:");
        cadena = sc.nextLine();


        System.out.println("Hay " + contadorEspacios(cadena) + " espacios");

        int posicion = 0;
        int contVocal = 0;

        while (posicion >= 0) {

            posicion = cadena.indexOf(" ",posicion);

            if (posicion == -1) {
                break;
            }
            posicion ++;
            contVocal++;
        }

        //System.out.println("Hay " + contadorVocales(cadena) + " vocales");









    }
}
