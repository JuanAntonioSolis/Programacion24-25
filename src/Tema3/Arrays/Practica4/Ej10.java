package Tema3.Arrays.Practica4;

/*
Realiza una función que devuelva un array con una combinación de la Lotería Primitiva (6 números entre 1 y 49).
La particularidad es que los números no deben estar repetidos.

 */

public class Ej10 {

    public static int aleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static boolean buscar(int arr[],int valor){

        for (int i = 0; i < arr.length;i++){
            if (arr[i] == valor){
                return true;
            }
        }

        return false;
    }

    public static void pintar(int numeros[]) {
        for(int i=0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {



        int nums[] = new int[6];
        int valor;

        for (int i = 0; i < nums.length; i++) {
            valor = aleatorio(49,1);

            while (buscar(nums,valor)){
                valor = aleatorio(49,1);
            }
            nums[i] = valor;

        }

        pintar(nums);



    }
}
