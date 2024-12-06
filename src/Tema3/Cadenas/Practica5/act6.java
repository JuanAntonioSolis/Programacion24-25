package Tema3.Cadenas.Practica5;

/*
Crea un metodo que determine si una cadena es un palíndromo,
o sea, se lee igual en los dos sentidos.
 */

import java.util.Scanner;

public class act6 {

    public static void main(String[] args) {

        String cadena;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una cadena:");
        cadena = sc.nextLine();

        String minuscula = cadena.toLowerCase();

        String noEspacio = minuscula.trim();
        String sinEspacio = "";

        for (int i = 0; i < noEspacio.length(); i++) {
            String sub = noEspacio.substring(i, i+1);

            if (!sub.isBlank()){
                switch (sub) {
                    case "á":
                        sub = "a";
                        break;
                    case "é":
                        sub = "e";
                        break;
                    case "í":
                        sub = "i";
                        break;
                    case "ó":
                        sub = "o";
                        break;
                    case "ú":
                        sub = "u";
                        break;
                }
                sinEspacio += sub;
            }
        }

        System.out.println(sinEspacio);

        StringBuffer sb = new StringBuffer(sinEspacio);

        String inversa = sb.reverse().toString();

        System.out.println(inversa);

        if (sinEspacio.equals(inversa)){
            System.out.println("Es un palíndromo");
        } else
            System.out.println("No es un palíndromo");









    }
}
