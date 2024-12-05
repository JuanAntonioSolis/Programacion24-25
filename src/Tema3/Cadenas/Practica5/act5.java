package Tema3.Cadenas.Practica5;

/*
Diseña un programa en Java que solicite al usuario una cadena de carácteres y muestre por pantalla
un conteo de cuántas vocales, consonantes y espacios en blanco contiene la cadena introducida.
 */

import java.util.Scanner;

public class act5 {


    public static void main(String[] args) {

        String cadena;
        char vocales[] = {'a','e','i','o','u'};
        char consonantes[] = {'b','c','d','f','g','h','j','k','l','m','n','ñ','p','q','r','s'
                ,'t','v','w','x','y','z'};

        int contEspacio = 0;
        int contVocales = 0;
        int contConsonantes = 0;


        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una cadena:");
        cadena = sc.nextLine();

        cadena = cadena.toLowerCase();

        char caracter;

        for (int i = 0; i < cadena.length(); i++) {
            caracter = cadena.charAt(i);

            switch (caracter) {
                case 'a','e','i','o','u':
                    contVocales++;
                    break;
                case 'b','c','d','f','g','h','j','k','l','m','n','ñ','p','q','r','s'
                ,'t','v','w','x','y','z':
                    contConsonantes++;
                    break;
                case ' ':
                    contEspacio++;
                    break;
            }
        }

        System.out.println("La cadena tiene " + contVocales + " vocales");
        System.out.println("La cadena tiene " + contConsonantes + " consonantes");
        System.out.println("La cadena tiene " + contEspacio + " espacios" );







    }
}
