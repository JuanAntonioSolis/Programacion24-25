package Tema1.EjerciciosEstructuras;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        //Escribir un programa que pregunte al usuario el nombre, y luego lo salude.

        String nombre;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu nombre: ");

        nombre = sc.nextLine();

        System.out.println("Hola " + nombre);

    }
}
