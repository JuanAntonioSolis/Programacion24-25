package Tema3.Arrays.Practica4;

/*
Crea una función que reciba como parámetro un array de 10 enteros, debe devolver el mismo array donde se
hayan intercambiado el primer elemento y el último elemento
 */

public class Ej2 {

    public static int intercambio(int num[]) {
        int cambio;

        int numero[] = new int[10];

        for (int i = 0; i < numero.length; i++) {

            cambio = numero[0];
            numero[0] = numero[9];
            numero[9] = cambio;
            return numero[i];
        }

        return numero[0];
    }

    public static int aleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }


    public static void main(String[] args) {

        int numeros[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio(15, 1);
            System.out.println(numeros[i]);
        }


        System.out.println("Ese vector con el primer y el último valor intercambiados es: " + intercambio(numeros));






    }
}
