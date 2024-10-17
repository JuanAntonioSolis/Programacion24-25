package Tema1.EjemplosClase;

import java.util.Scanner;

public class ConversorDivisas {
    public static void main(String[] args) {

        //Nos dicen una cantidad en euros, tenemos que devolverla en dólares y en pesos argentinos.

        double euros;
        double CambioDolar = 1.10f;
        double CambioPesoArg = 1071.77f;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad en euros:");

        euros = sc.nextInt();

        System.out.println("La cantidad en dólares es: " + (euros * CambioDolar) );
        System.out.println("La cantidad en pesos argentinos es: " + (euros * CambioPesoArg));
    }
}
