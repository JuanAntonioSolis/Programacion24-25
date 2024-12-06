package Tema3.Cadenas.Practica5;

public class act14 {

    public static String cifradoCesar(String text, int clave) {
        StringBuffer sb = new StringBuffer();
        char car;
        for (int i = 0; i < text.length(); i++) {
            car = text.charAt(i);
            sb.append((char) (car + clave));
        }
        return sb.toString();
    }

    public static String descifradoCesar(String text, int clave) {
        StringBuffer sb = new StringBuffer();
        char car;
        for (int i = 0; i < text.length(); i++) {
            car = text.charAt(i);
            sb.append((char) (car - clave));
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String texto = "Esto es un mensaje secreto";

        System.out.println(cifradoCesar(texto,3));
        String mensajeCifrado = cifradoCesar(texto,3);
        System.out.println(descifradoCesar(mensajeCifrado,3));



    }
}
