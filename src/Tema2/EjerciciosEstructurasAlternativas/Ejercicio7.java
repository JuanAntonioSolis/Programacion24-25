package Tema2.EjerciciosEstructurasAlternativas;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        /*
        La política de cobro de una compañia telefónica es: cuando se realiza una llamada, el cobro es por el tiempo
        que ésta dura, de tal forma que los primeros cinco minutos cuestan 1 euro, los siguientes tres, 80 cents,
        los siguientes dos minutos, 70 cents, y a partir del decimo minuto, 50 cents.
        Además, se carga un impuesto de 3% cuando es domingo, y si es otro día, en turno de mañana, 15%, y en turno
        de tarde, 10%. Realice un algoritmo para determinar cuánto debe pagar por cada concepto una persona que realiza
        una llamada.
         */

        int minutos = 9;
        double precio;
        boolean domingo = true;
        boolean mañana = false;
        double impuestoDomingo = 0.03;
        double impuestoMañana = 0.15;
        double impuestoTarde = 0.10;


        if (minutos <= 5 ){
            if (domingo && mañana){
                precio = 1 + 1 * (impuestoDomingo) + 1 * (impuestoMañana);
                System.out.println("El coste de la llamada es " + precio);
            } else if (domingo && !mañana) {
                precio = 1 + 1 * impuestoDomingo + 1 * impuestoTarde;
                System.out.println("El coste de la llamada es " + precio);
            } else if (!domingo && mañana) {
                precio = 1 + 1 * impuestoMañana;
                System.out.println("El coste de la llamada es " + precio);
            } else if (!domingo && !mañana){
                precio = 1 + 1 * impuestoTarde;
                System.out.println("El coste de la llamada es  " + precio);
            }
        } else if (minutos > 5 && minutos <= 8 ){
            if (domingo && mañana){
                precio = 1.8 + 1.8 * impuestoDomingo + 1.8 * impuestoMañana;
                System.out.println("El coste de la llamada es " + precio);
            } else if (domingo && !mañana) {
                precio = 1.8 + 1.8 * impuestoDomingo + 1.8 * impuestoTarde;
                System.out.println("El coste de la llamada es " + precio);
            } else if (!domingo && mañana) {
                precio = 1.8 + 1.8 * impuestoMañana;
                System.out.println("El coste de la llamada es " + precio);
            } else if (!domingo && !mañana){
                precio = 1.8 + 1.8 * impuestoTarde;
                System.out.println("El coste de la llamada es " + precio);
            }
        } else if (minutos > 8 && minutos <= 10){
            if (domingo && mañana){
                precio = 2.5 + 2.5 * impuestoDomingo + 2.5 * impuestoMañana;
                System.out.println("El coste de la llamada es " + precio);
            } else if (domingo && !mañana) {
                precio = 2.5 + 2.5 * impuestoDomingo + 2.5 * impuestoTarde;
                System.out.println("El coste de la llamada es " + precio);
            } else if (!domingo && mañana) {
                precio = 2.5 + 2.5 * impuestoMañana;
                System.out.println("El coste de la llamada es " + precio);
            } else if (!domingo && !mañana){
                precio = 2.5 + 2.5 * impuestoTarde;
                System.out.println("El coste de la llamada es " + precio);
            }
        } else if (minutos > 10){
            if (domingo && mañana){
                precio = 3 + 3 * impuestoDomingo + 3 * impuestoMañana;
                System.out.println("El coste de la llamada es " + precio);
            } else if (domingo && !mañana) {
                precio = 3 + 3 * impuestoDomingo + 3 * impuestoTarde;
                System.out.println("El coste de la llamada es " + precio);
            } else if (!domingo && mañana) {
                precio = 3 + 3 * impuestoMañana;
                System.out.println("El coste de la llamada es " + precio);
            } else if (!domingo && !mañana){
                precio = 3 + 3 * impuestoTarde;
                System.out.println("El coste de la llamada es " + precio);
            }
        }

    }
}


/*

 */
