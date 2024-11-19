package Tema3.Arrays.Practica4;

/*
Crea un array de números de un tamaño pasado por teclado, el array contendrá números aleatorios entre 1 y 300
y mostrar aquellos números que acaben en un dígito que nosotros le indiquemos por teclado (debes controlar
que se introduce un numero correcto), estos deben guardarse en un nuevo array. Por ejemplo, en un array de 10
posiciones e indicamos mostrar los números acabados en 5, podría salir 155, 25, etc. Cuando llene el segundo
array finalizamos.
DUDA PROFESOR
 */

import java.util.Scanner;

public class Ej3 {

    public static int aleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static void main(String[] args) {

        int size;

        int digito = -1;
        int digitosMostrados[] = new int[5]; // segundo array
        int j = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el tamaño del que quieres el array: ");
        size = Integer.parseInt(sc.nextLine());

        int numeros[] = new int[size]; //Primer array

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio(300, 1);
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        try {
            System.out.println("Indica un dígito y se mostrarán los 5 primeros valores que acaben en ese dígito: ");
            digito = Integer.parseInt(sc.nextLine());
        }catch (Exception e) {
            System.out.println("Introduce un valor válido:");
        }

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 10 == digito) {
                while (j < 5) {
                    j++;
                    digitosMostrados[j] = numeros[i];
                    System.out.println(digitosMostrados[i]);
                }

            }

        }





    }
}
