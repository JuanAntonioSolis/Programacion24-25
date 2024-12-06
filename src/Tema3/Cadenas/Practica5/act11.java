package Tema3.Cadenas.Practica5;

/*
Elimina los espacios(intermedios también) de una cadena de texto.
 */

import java.util.Scanner;

public class act11 {

    public static void main(String[] args) {

        String texto;
        Scanner sc = new Scanner(System.in);
        texto = sc.nextLine();

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == ' ') {
                texto.trim();
            }
        }








    }
}
