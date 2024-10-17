package Tema1.EjerciciosEstructuras;

public class Ejercicio11 {
    public static void main(String[] args) {

        //Dado un numero de dos cifras, diseñe un logaritmo que permita obtener el número invertido.
        //Ejemplo, si se introduce 32, que muestre 23.

        int numero = 32;
        int decenas = numero / 10;
        int unidades = numero % 10;

        System.out.println("El número invertido es: " + (unidades * 10 + decenas));
    }
}
