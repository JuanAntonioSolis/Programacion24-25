package Tema3.Cadenas.Practica5;

/*
Compara estos dos Strings sin tener en cuenta mayúsculas "Esta tarde no voy", "esta tarde no VOY".
 */

public class act10 {

    public static void main(String[] args) {

        String cadena1 = "Esta tarde no voy";
        String cadena2 = "esta tarde no VOY";

        if (cadena1.equalsIgnoreCase(cadena2)) {
            System.out.println("Las cadenas son iguales");
        } else {
            System.out.println("Las cadenas no son iguales");
        }


    }
}
