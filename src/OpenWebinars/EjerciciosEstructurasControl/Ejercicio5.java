package OpenWebinars.EjerciciosEstructurasControl;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        /*
        Escribe un programa en Java que acepte por teclado dos números enteros
         y calcule su máximo común divisor usando el algoritmo de Euclides. Dicho algoritmo tiene los siguientes pasos:

        a) Se divide el número mayor (`a`) entre el menor (`b`).

        b) Si la división es exacta (resto igual a 0), el divisor es el m.c.d.

        c) Si la división no es exacta, dividimos el divisor entre el resto obtenido y continuamos de esta
        forma hasta obtener una división exacta. El m.c.d. es el último divisor.
         */

        int num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el primer número:");
        num1 = Integer.parseInt(sc.nextLine());
        System.out.println("Escribe el segundo número:");
        num2 = Integer.parseInt(sc.nextLine());

        if (num1 % num2 == 0) {
            System.out.println("El máximo común divisor es el " + num2);
        } else if (num1 % num2 != 0) {
                num2 = (num1 % num2) / num2;
            System.out.println("El máximo común divisor es : " + num2);
        }



    }
}
