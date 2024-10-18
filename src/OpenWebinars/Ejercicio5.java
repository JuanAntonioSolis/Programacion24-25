package OpenWebinars;

public class Ejercicio5 {

    public static void main(String[] args) {

        /*
        Escribir un programa que, dada una cantidad en euros, nos indique cuál es su valor en dólares americanos. Además
        de la variable para la cantidad de euros, se debe declarar otra para el cambio (el valor de un dolar en euros)
        y para el resultado final. Muestra el resultado por consola.
         */

        double euros = 80;
        double cambio = 0.92;
        double dolar = euros / cambio;

        System.out.println(euros + " Euros, equivalen a " + dolar + " dólares americanos." );


    }
}
