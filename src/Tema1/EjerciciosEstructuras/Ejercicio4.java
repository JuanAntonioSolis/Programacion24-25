package Tema1.EjerciciosEstructuras;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        //Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.


        int gradosFahrenheit;
        int gradosCelsius;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la temperatura actual en grados Farenheit: ");

        gradosFahrenheit = sc.nextInt();

        gradosCelsius = (gradosFahrenheit - 32) * 5 / 9;

        System.out.println("La temperatura actual es: " + gradosFahrenheit + "ºF, o " + gradosCelsius + "ºC" );

    }
}
