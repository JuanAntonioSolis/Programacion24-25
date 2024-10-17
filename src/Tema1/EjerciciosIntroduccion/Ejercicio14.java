package Tema1.EjerciciosIntroduccion;

public class Ejercicio14 {
    public static void main(String[] args) {

        //Realiza un programa en java que genere números de forma aleatoria simulando la tirada de un dado.

        int dado;

        dado = (int) (Math.random() * (6 - 1 + 1) + 1 );

        System.out.println(dado);
    }
}
