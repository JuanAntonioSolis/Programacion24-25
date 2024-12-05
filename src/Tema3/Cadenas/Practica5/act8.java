package Tema3.Cadenas.Practica5;

/*
Divide la cadena “http://www.iesjaroso.es/noticias” en “http”, “www.iesjaroso.es”, “noticias”.
 */

public class act8 {

    public static void main(String[] args) {

         String cadena = "http://www.iesjaroso.es/noticias";

         StringBuffer sb = new StringBuffer(cadena);
         sb.deleteCharAt(4);
         sb.deleteCharAt(5);

         cadena = sb.toString();

         String partido[] = cadena.split("/");
         for (int i = 0; i < partido.length; i++) {
             System.out.println(partido[i]);
         }

    }
}
