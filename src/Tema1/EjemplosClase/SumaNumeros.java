
import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {

        int numero1;
        int numero2;
        int suma;

        //Variable para leer los números de teclado
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un primer número");
        numero1 = sc.nextInt();
        System.out.println("Escribe un segundo número");
        numero2 = sc.nextInt();

        suma = numero1 + numero2;

        //Muestra en pantalla la suma de los dos numeros, esta vez, registrado el total en la variable suma
        System.out.println("La suma de esos dos números es igual a: " + suma);


    }
}
