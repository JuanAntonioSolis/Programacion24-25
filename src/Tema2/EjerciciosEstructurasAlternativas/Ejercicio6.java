package Tema2.EjerciciosEstructurasAlternativas;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        /*
        La asociacion de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se clasifica
        en dos tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la venta del producto, ésta es de un sólo tipo
        y tamaño, se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque, considerando
        lo siguiente: si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1; y 30 céntimos
        si es de tamaño 2. Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 centimos cuando es de
        tamaño 2. Realice un algoritmo para determinar la ganancia obtenida.
         */

        String tipo;
        int tamaño;
        double precio = 4.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce si la uva es de tipo A o B");
        tipo = sc.nextLine();
        System.out.println("Introduce si la uva es de tamaño 1 o 2");
        tamaño = sc.nextInt();

        switch (tipo) {
            case "A":
                if (tamaño == 1){
                    precio = precio + 0.20;
                } else
                    precio = precio + 0.30;
                break;
            case "B":
                if (tamaño == 1){
                    precio = precio - 0.30;
                } else
                    precio = precio - 0.50;
        }

        System.out.println("El precio del kilo de uva es: " + precio + " €");




    }
}
