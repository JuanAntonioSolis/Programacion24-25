package OpenWebinars.EjerciciosStrings;

/*
Escribir un programa en Java que acepte dos cadenas de caracteres y verifique si son anagramas,
es decir, que tienen los mismos caracteres pero en otro orden.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        String cad1;
        String cad2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una cadena:");
        cad1 = sc.nextLine();
        System.out.println("Escribe otra cadena:");
        cad2 = sc.nextLine();

        char arr1[] = cad1.toCharArray();
        char arr2[] = cad2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(arr1);
        System.out.println(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Son anagramas");
        } else
            System.out.println("No son anagramas");



    }
}
