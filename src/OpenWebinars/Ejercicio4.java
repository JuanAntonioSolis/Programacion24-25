package OpenWebinars;

public class Ejercicio4 {

    public static void main(String[] args) {

        /*
        Escribir un programa que calcule el perímetro y el área de un círculo y la muestre por consola. El radio del
        mismo lo puedes proporcionar como un valor inicial de la variable correspondiente.
         */

        int radioCirculo = 7;

        System.out.println("El perímetro del círculo es = " + (radioCirculo * 2) * Math.PI);

        System.out.println("El área de un círculo es = " + Math.PI * Math.pow(radioCirculo, 2));

    }
}
