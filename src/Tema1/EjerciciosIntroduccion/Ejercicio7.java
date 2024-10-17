public class Ejercicio7 {

    public static void main(String[] args) {

        //¿Por qué no compila el siguiente programa? Modifícalo para hacer que funcione
        //No funciona porque la primera línea de código, donde se declaran las variables, no se cierra con punto y coma.
        //Tampoco se debe usar la variable boolean para declarar un número decimal. Es sólo para valores true o false.
        //Se debe usar int,long,short...

        int n1=50, n2=30;
        long suma=0;
        suma = n1 + n2;
        System.out.println("LA SUMA ES: " + suma);
    }
}
