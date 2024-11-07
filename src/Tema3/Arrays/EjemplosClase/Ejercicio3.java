package Tema3.Arrays.EjemplosClase;

public class Ejercicio3 {

    public static int aleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static boolean primo(int num) {

        boolean primo = true;

        for (int i = num - 1; i >= 2; i--) {
            if (num % i == 0) {
                primo = false;
            }
        }

        return primo;
    }

    public static void main(String[] args) {

        //Genera un array de 20 números enteros aleatorios entre 1 y 1000
        //Muestra sólo aquellos que sean primos

        int num[] = new int[20];

        for (int i = 0; i < num.length; i++) {
            num[i] = aleatorio(1000,1);

        }


        for (int i = 0; i < num.length; i++) {
            if (primo(num[i])) {
                System.out.println(num[i]);
            }

        }







    }
}
