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

        texto.trim();

        StringBuffer sb = new StringBuffer(texto);
        while (sb.indexOf(" ") != -1) {
            sb.deleteCharAt(sb.indexOf(" "));
        }

        System.out.println(sb);










    }
}
