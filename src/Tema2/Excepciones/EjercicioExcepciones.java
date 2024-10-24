package Tema2.Excepciones;

import java.util.Scanner;

public class EjercicioExcepciones {

    public static void main(String[] args) {

        /*
        Pedir un precio por teclado y mostrar el precio con IVA (21%)
        - Controlar que el precio sea un doble y no escriba otra cosa
        - Controlar que si es un número negativo lanzamos una excepción (NO IMPORTANTE ->)
         */

        double precio=0;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Introduce precio del producto");
            precio = Double.parseDouble(sc.nextLine());

            //Si el precio es negativo
            if (precio < 0) {
                //Genero el error y salta la excepción
                throw new Exception("Precio menor que cero");
            }

            System.out.println("El precio con IVA es: " + precio * 1.21);
        } catch (NumberFormatException ex) {
            System.out.println("No has introducido un precio correcto");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Adiós");


    }
}
