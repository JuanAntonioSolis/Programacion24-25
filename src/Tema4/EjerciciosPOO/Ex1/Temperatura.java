package Tema4.EjerciciosPOO.Ex1;

import java.util.Scanner;

public class Temperatura {

    public static double celsuisAFarenheit(double celsius){
        return (celsius * 1.8) + 32;
    }

    public static double farenheitACelsius(double farenheit){
        return (farenheit-32)/1.8;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double celsius;
        double farenheit;

        System.out.println("Escribe una temperatura en Celsius:");
        celsius = Integer.parseInt(sc.nextLine());
        System.out.println("Esa temperatura en Farenheit es: " + celsuisAFarenheit(celsius));
        System.out.println();
        System.out.println("Escribe una temperatura en Farenheit:");
        farenheit = Integer.parseInt(sc.nextLine());
        System.out.println("Esa temperatura en Celsius es: " + farenheitACelsius(farenheit));
    }




}
