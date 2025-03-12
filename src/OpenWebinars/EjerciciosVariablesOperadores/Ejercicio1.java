package OpenWebinars;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        /*
        El precio de final de venta de un portatil es la suma total de:
        - El coste de fabricación --> Leer de teclado
        - El margen (en porcentaje) de beneficio de ganancia del vendedor. 30%
        - Los impuestos (calculados sobre el coste de fabricaión más el margen de beneficio). 21%

        Además de mostar el precio, debemos mostrar si el precio del portatil es Normal o de Lujo.
        Será de lujo si el precio es mayor de 600€, será normal si es igual o de menos de 600€.
         */

        double precioProduccion;
        double precioFinal;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el coste de fabricación del producto: ");
        precioProduccion = Integer.parseInt(sc.nextLine());

        System.out.println("El precio de fabricación más el margen de ganancia es " + precioProduccion * 1.3);

        precioFinal = (precioProduccion * 1.3) * 1.21;

        System.out.println("El precio final para el cliente será " + precioFinal + " €");

        if (precioFinal <= 600) {
            System.out.println("Es un portátil normal");
        } else
            System.out.println("Es un portátil del lujo");




    }
}
