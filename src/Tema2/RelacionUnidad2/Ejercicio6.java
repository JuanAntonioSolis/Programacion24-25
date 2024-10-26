package Tema2.RelacionUnidad2;

public class Ejercicio6 {

    public static void main(String[] args) {

        /*
        Programa que sume los 100 primeros números enteros impares.
         */

        int numero, cont, sumaImpar;
        numero = 0;
        cont = 0;
        sumaImpar = 0;


        do {
            numero++;
            if (numero % 2 != 0) {
                cont++;
                sumaImpar = sumaImpar + numero;
                System.out.println(numero);
            }

        } while (cont < 100);

        System.out.println("La suma de todos los números impares es = " + sumaImpar);



    }
}
