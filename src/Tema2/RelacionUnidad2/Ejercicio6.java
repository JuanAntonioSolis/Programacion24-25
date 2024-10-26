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
            numero++; //Vamos sumandole 1 al número
            if (numero % 2 != 0) {  //Vamos comprobando qué numeros son impares
                cont++;//Va sumando al contador, y termina cuando al final del do while contador es 100
                sumaImpar = sumaImpar + numero; //Si es impar, en la variable de suma vamos sumando sus valores
                System.out.println(numero);
            }

        } while (cont < 100); //Termina el bucle cuando llega el contador a 100

        System.out.println("La suma de todos los números impares es = " + sumaImpar);



    }
}
