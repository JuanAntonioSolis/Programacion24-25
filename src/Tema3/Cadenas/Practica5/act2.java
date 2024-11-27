package Tema3.Cadenas.Practica5;

/*
Crea un programa que reciba una cadena de caracteres y la devuelva invertida con efecto espejo, este
es, se concatena a la palabra original su inversa, compartiendo la última letra, que hará de espejo, por
lo que la palabra obtenida se lee igual hacia adelante que hacia atrás. Por ejemplo, al introducir
“teclado” devolverá “tecladodalcet” y al introducir “hola” devolverá “holaloh”. Haz dos versiones, una
con String y otra con StringBuffer.
 */

import java.util.Scanner;

public class act2 {

    public static void main(String[] args) {

        String palabra;
        String reves = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una palabra");
        palabra = sc.nextLine();


        for (int i = palabra.length()-2; i >= 0; i--) {
            reves += palabra.charAt(i);
        }

        System.out.println(palabra.concat(reves));

        StringBuffer sb = new StringBuffer(palabra);


        sb.deleteCharAt(sb.length()-1);
        sb.reverse();

        System.out.println(palabra+sb);








    }
}
