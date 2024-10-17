import java.util.Scanner;

public class PrecioTeclado {

    public static void main(String[] args) {
        //Crea un programa que pida por teclado el precio de un producto. Pide también la cantidad de ese producto
        //que vas a comprar. Devuelve el precio final con el IVA incluido.

        //Datos de entrada: precio y cantidad
        //Datos de salida: precio final con IVA incluido

        double precioInicial;
        int cantidad;
        double precioFinal;

        //Variable para leer los números de teclado
        Scanner sc = new Scanner(System.in);

        //Escribir los
        System.out.println("Introduce el precio del producto");
        precioInicial = sc.nextDouble();
        System.out.println("Introduce la cantidad que deseas comprar");
        cantidad = sc.nextInt();

        precioFinal = precioInicial * 1.21 * cantidad;

        System.out.println("El precio final de la compra es: " + precioFinal);

    }
}
