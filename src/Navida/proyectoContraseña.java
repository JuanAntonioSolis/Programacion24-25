package Navida;


public class proyectoContraseña {

    public static int numero_aleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }




    public static void main(String[] args) {

        int clave;
        char caracter;

        StringBuffer sb = new StringBuffer();

        while (sb.length() < 8) {

            clave = numero_aleatorio(48, 122);
            caracter = (char) clave;
            if ((caracter >= 0 && caracter <= 9) ||
                    (caracter >= 'a' && caracter <= 'z') ||
                    (caracter >= 'A' && caracter <= 'Z')) {
                sb.append(caracter);
            }

        }

        System.out.println(sb);








    }
}
