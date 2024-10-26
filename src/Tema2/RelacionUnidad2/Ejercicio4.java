package Tema2.RelacionUnidad2;

public class Ejercicio4 {

    public static void billetes(int dinero) {

        if (dinero >= 200) { //En caso de que la cantidad entre aqui:
            System.out.println(dinero / 200 + " billetes de 200");
            dinero = dinero % 200; //Se ha dividido la cantidad entre 200, la nueva cantidad es el resto de esa división.
        }
        if (dinero >= 100) { //En caso de que la nueva cantidad (dinero) entre aquí
            System.out.println(dinero / 100 + " billetes de 100");
            dinero = dinero % 100; // Se ha dividido la cantidad entre 100, la nueva cantidad es el resto de la división.
            //Así sucesivamente con todos los billetes.
        }
        if (dinero >= 50) {
            System.out.println(dinero / 50 + " billetes de 50");
            dinero = dinero % 50;
        }
        if (dinero >= 20) {
            System.out.println(dinero / 20 + " billetes de 20");
            dinero = dinero % 20;
        }
        if (dinero >= 10) {
            System.out.println(dinero / 10 + " billetes de 10");
            dinero = dinero % 10;
        }
        if (dinero >= 5) {
            System.out.println(dinero / 5 + " billetes de 5");
            dinero = dinero % 5;
        }
        System.out.println(dinero + " en monedas.");

    }

    public static void main(String[] args) {

        /*
        Crea una función que no devuelva nada (void) que, dado un importe en euros, nos indique el mínimo número de
        billetes y la cantidad sobrante que se pueden utilizar para obtener dicha cantidad. Ejemplo:
        362 euros → 1 billete de 200, 1 billete de 100, 1 billete 50, un billete de 10, sobran 2 euros. Pista: hay
        que ir sacando la división entera, y el resto se lleva al siguiente billete.
         */

        int euros = 362;

        billetes(euros);

    }
}
