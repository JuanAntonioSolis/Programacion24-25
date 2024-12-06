package Tema3.Cadenas.Practica5;

/*
Escribe un metodo que te devuelva la mitad de una cadena.
 */

public class act12 {

    public static void main(String[] args) {

        String texto = "Las cadenas de oro!";

        StringBuffer sb = new StringBuffer();


        for (int i = 0; i < texto.length() / 2; i++) {
            String mitad = texto.substring(i, i+1);

            System.out.print(mitad);

        }





    }
}
