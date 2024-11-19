package Tema3.Arrays.Practica4;

/*
Generar 10 números enteros aleatorios. Debemos mostrarlos en el siguiente orden: el primero, el último, el
segundo, el penúltimo, el tercero, etc… Pista: primero los guardas en un array y luego lo recorres como indica.
DUDA PROFESOR
 */

public class Ej6 {

    public static int aleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static void main(String[] args) {

        int numeros[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio(20,1);
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println();

        for (int i = 0; i < numeros.length / 2; i++) {
            System.out.println(numeros[i]);
            System.out.println(numeros[numeros.length - 1 - i]);
        }







    }
}
