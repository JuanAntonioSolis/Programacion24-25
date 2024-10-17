package Tema1.EjerciciosEstructuras;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        //Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber
        //cuánto deberá pagar finalmente por su compra

        int precio;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el precio de tu compra: ");

        precio = sc.nextInt();

        System.out.println("El precio de tu compra con el descuento se queda en: " + (precio - (precio * 0.15)));
}
}