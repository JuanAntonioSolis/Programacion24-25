package Tema2.Bucles;

public class EjercicioAcumulador2 {

    public static void main(String[] args) {

        //Genera 100 números entre el 1 y el 100
        //Muestra la suma de los pares y la suma de los impares

        int totalPar = 0;
        int totalImpar = 0;
        int numero;

        for (int i = 0; i < 100; i++) {
            numero = (int) (Math.random() * (100-1+1)+1);
            if (numero % 2 == 0) {
                totalPar = totalPar + numero;
            } else
                totalImpar = totalImpar + numero;
        }

        System.out.println("La suma de los números pares es " + totalPar);
        System.out.println("La suma de los números impares es " + totalImpar);

        System.out.println("Asopla ahí, papapapa");



    }
}
