package Tema1.EjerciciosIntroduccion;

public class Ejercicio16 {
    public static void main(String[] args) {

        /*Escriba un programa para calcular el área y el volumen de un cilindro. Para ello declare una constante
        que guarde el valor de Pi. Declare, también, variables para el diámetro y la altura del cilindro. Suponga
        pra el ejemplo que el cilindro tiene un diámetro de 15,5cm y una altura de 42,4cm.
         */

        double diametro = 15.5;
        double radio = diametro / 2;
        double altura = 42.4;
        double PI = Math.PI;

        System.out.println("El área del cilindro es " + ((2*PI*radio*altura) + (2*PI*Math.pow(radio,2))));
        System.out.println("El volúmen de un cilindro es " + (PI*Math.pow(radio,2)*altura));






    }
}
