package Tema2.RelacionUnidad2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        //Programa que pida al usuario un número repetidamente hasta que esté entre 1 y 10.

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 10");
        num = sc.nextInt();

        while (num<1 || num>10) { //Entra en el bucle si el número es menor que 1 o mayor que 10, y sigue pidiendo números
            //hasta que introduzca uno mayor que 1 && menor que 10.
            System.out.println("Ingresa otro número:");
            num = sc.nextInt();

        }
        System.out.println("Has introducido el número correctamente");


    }
}
