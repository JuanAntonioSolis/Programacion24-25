package Tema3.Arrays.Practica4;

/*
Crea una función que reciba como parámetro un array de 10 enteros, debe devolver el mismo array donde se
hayan intercambiado el primer elemento y el último elemento
DUDA PROFESOR
HACER CON VOID EN LA FUNCION
 */

public class Ej2 {

    public static void intercambio(int num[]) {

        int cambio = num[0];
        num[0] = num[num.length-1];
        num[num.length-1] = cambio;

    }

    public static int aleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static void pintar(int numeros[]) {
        for(int i=0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        int numeros[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio(15, 1);
        }

        pintar(numeros);

        intercambio(numeros);

        pintar(numeros);











    }
}
