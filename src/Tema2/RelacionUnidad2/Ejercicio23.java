package Tema2.RelacionUnidad2;

/*

Pedir el día, mes y año de una fecha y mostrar la fecha del día siguiente (sin años bisiestos) Hacer
primero una función para determinar que la fecha introducida es correcta.

 */

public class Ejercicio23 {

    public static boolean fechaCorrecta (int dia, int mes, int year) {
        switch (mes) {
            case 1,3,5,7,8,10,12:
                if (dia > 31 ) {
                    return false;
                }
            case 4,6,9,11:
                if (dia > 30 ) {
                    return false;
                }
            case 2:
                if (dia > 29 ) {
                    return false;
                }
        }
        return true;
    }

    public static void main(String[] args) {


    }
}
