package Tema3.Arrays.EjerciciosClase;

/*
Vamos a crear un array de 1000 valores double, debes rellenarlos con valores aleatorios entre 5 y 50 (temperaturas).
Debes devolver la media y la mediana = ((máximo + mínimo) / 2)
 */

public class Tarea5 {

    public static int aleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static double maximo(double temp[]){

        double max = temp[0];

        for (int i = 0; i < temp.length; i++){
            if (temp[i] > max){
                max = temp[i];
            }
        }
        return max;
    }

    public static double minimo(double temp[]){

        double min = temp[0];

        for (int i = 0; i < temp.length; i++){
            if (temp[i] < min){
                min = temp[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        double temperaturas[] = new double[100];
        double suma = 0;
        double  max = 0;
        double  min = 50;

        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = aleatorio(50, 5);
            suma += temperaturas[i];
            max = maximo(temperaturas);
            min = minimo(temperaturas);

        }

        System.out.println("La media de las temperaturas es: " + suma / temperaturas.length);
        System.out.println("La mediana de las temperaturas es: " + (max + min) / 2);


    }
}
