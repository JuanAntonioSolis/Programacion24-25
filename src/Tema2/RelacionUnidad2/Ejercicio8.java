package Tema2.RelacionUnidad2;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        /*
        Programa que imprima la tabla de multiplicar de cualquier número entre el 1 y el 10 introducido por teclado.
         */

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();

        for (int i = 1; i <= 10; i++) { //Para i que empieza en 1; hasta que llega a 10; i + 1
            if (num >= 1 && num <= 10) { //Si el número está entre 1 y 10 como pide el enunciado:
                System.out.println(num + " x " + i + " = " + (num * i)) ;//num * i > ex. 4*1,4*2,4*3...4*10
            } else {
                System.out.println("Introduce un número entre 1 y 10 porfavor");//Si la condicion anterior no se cumple
                // Se pide un nuevo número a comprobar

                num = sc.nextInt();
            }
        }


    }
}
