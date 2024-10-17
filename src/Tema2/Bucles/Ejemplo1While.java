package Tema2.Bucles;

import java.util.Scanner;

public class Ejemplo1While {

    public static void main(String[] args) {

        /*int numero = 1;
        while (numero <= 50){
            System.out.println(numero);
            numero = numero + 1;

        }

        //Pinta los numeros pares del 1 al 20:

        int par = 2;

        while (par <= 20){
            System.out.println(par);
            par+=2;
        }

        //Cuenta atrás del 10 al 1:

        int cuenta = 10;

        while (cuenta>=1) {
            System.out.println(cuenta);
            cuenta-=1;
        }


        //Muestra los números que son decenas del 1 al 100:

        int decena = 10;

        while (decena <= 100) {
            System.out.println(decena);
            decena+=10;
        }

        int decena = 1;

        while (decena <= 100) {
            if (numero % 10 == 0) { //Se comprueba si el número es o no es multiplo de 10
                System.out.println(decena);
            }
            decena++;
        }


        //Del 1 al 200 muestra los números impares que no sean múltiplos de 7

        int numero = 1;

        while (numero <= 200) {
            if ((numero %2 != 0) && (numero % 7 !=0)) {
                System.out.println(numero);
            }
            numero++;
        }


        //Que pida por teclado una contraseña mientas que la longitud sea menor de 8 caracteres
        //password.length() --> Devuelve la longitud del String password

        String contraseña = "1234567";

        Scanner sc = new Scanner(System.in);

        while (contraseña.length()<8) {
            System.out.println("Escribe una contraseña menor de 8 caracteres");

            contraseña = sc.nextLine();

        }

         */

        //Que pida por teclado una contraseña mientras que la longitud sea menor de 10 caracteres
        //Que tenga al menos una letra mayúscula
        //password.toUpperCase() --> Passa la cadena a mayúsculas
        //password.toLowerCase() --> Pasa la cadena a minúscula

        String contraseña = "1";

        Scanner sc = new Scanner(System.in);

        while ((contraseña.equals(contraseña.toLowerCase())) || (contraseña.length()<10)) {

                System.out.println("Escribe una contraseña que tenga menos de 10 digitos y al menos una mayúscula");
                contraseña = sc.nextLine();
        }

        System.out.println(contraseña + " es una contraseña válida.");


    }
}
