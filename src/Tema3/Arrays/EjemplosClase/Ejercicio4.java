package Tema3.Arrays.EjemplosClase;

public class Ejercicio4 {

    public static int aleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static void main(String[] args) {

        /*
        En el primer trimestre del curso hay 85 dias de clase.
        En un array de boolean guardamos si un alumno ha faltado (true) o no (false) a clase.
        Realiza un programa que diga si el alumno ha perdido la evaluación continua.
        (20% de faltas al trimestre)
         */

        boolean falta[] = new boolean[85];
        int contFaltas = 0;

        for (int i = 0; i < falta.length; i++) {
            if (aleatorio(5,0) < 1) {
                falta[i] = true;
                contFaltas++;
            }
            else
                falta[i] = false;
        }

        for (int i = 0; i < falta.length; i++) {
            System.out.println(falta[i]);

        }

        System.out.println("El alumno tiene " + contFaltas + " faltas.");

        if (contFaltas > (falta.length * 0.20)) {
            System.out.println("Ha perdido el derecho a la evaluación continua.");
        } else
            System.out.println("Sigue teniendo derecho a evaluación continua.");




    }
}
