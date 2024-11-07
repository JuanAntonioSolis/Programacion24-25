package Tema3.Arrays.EjemplosClase;

public class Ejercicio2 {

    public static void main(String[] args) {

        //Genera de forma aleatoria un array de doubles con 30 elementos
        //Los valores estarán entre -100 y 100

        //Pinta los valores

        //Pinta los valores al reves

        //Dime la media de todos los valores

        double numeros[] = new double[30];

        double suma = 0;


        //Los valores estarán entre -100 y 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Math.random() * (100 - (-100) +1 ) + (-100);
            suma += numeros[i];
        }


        //Pinta los valores
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }


        //Pinta los valores al reves
        System.out.println();
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        //Pinta la media
        System.out.println("La media es: " + suma / numeros.length);




    }
}
