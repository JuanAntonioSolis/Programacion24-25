package OpenWebinars;

public class Ejercicio6 {

    public static void main(String[] args) {

        /*
        Escribe un programa que determine si un número es par o impar usando el operador ternario
         */

        int numero = 7; // Número a evaluar

        // Evaluamos si el número es par o impar utilizando el operador ternario
        String resultado = (numero % 2 == 0) ? "par" : "impar";

        // Mostramos el resultado por consola
        System.out.println("El número " + numero + " es " + resultado);

    }
}
