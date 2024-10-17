package Tema1.EjerciciosEstructuras;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        /*Escribir un algoritmo para calcular la nota final de un estudiante, considerando que: por cada respuesta
        correcta 5 puntos, por una incorrecta -1 y por respuestas en blanco 0.
        Imprime el resultado obtenido por el estudiante.
         */

        int respuestaCorrecta;
        int respuestaIncorrecta;
        int respuestaBlanco;
        int puntosCorrectos;
        int puntosFinales;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cuantas respuestas correctas tienes");
        respuestaCorrecta = sc.nextInt();
        System.out.println("Introduce cuantas respuestas incorrectas tienes");
        respuestaIncorrecta = sc.nextInt();
        System.out.println("Introduce cuantas respuestas blanco tienes");
        respuestaBlanco = sc.nextInt();

        puntosCorrectos = respuestaCorrecta * 5;
        puntosFinales = puntosCorrectos - respuestaIncorrecta;

        System.out.println("El resultado final del estudiante es: " + puntosFinales );






    }
}
