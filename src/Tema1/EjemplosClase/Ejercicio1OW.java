import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio1OW {
    public static void main(String[] args) {

        //Pedimos por teclado el coste de fabricación de un producto
        //Queremos pintar por pantalla el precio que le vamos a poner al producto para el cliente
        //Al coste de fabricacion hay que sumarle la ganancia para el vendedor (30%)
        //Al precio resultante le tengo que sumar el IVA (21%)
        //Por ultimo imprimo por pantalla el precio para el cliente final

        double producción;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el coste de fabricación del producto:");
        producción = sc.nextDouble();

        producción = producción * 1.3;

        System.out.println("El precio de fabricación más la ganancia es " + producción);

        producción = producción * 1.21;

        System.out.println("El precio con IVA incluido para el cliente será: " + producción);


    }
}
