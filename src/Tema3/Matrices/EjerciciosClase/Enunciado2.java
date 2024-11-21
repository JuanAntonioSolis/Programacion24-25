package Tema3.Matrices.EjerciciosClase;

/*
2. Simulación sensores de movimiento
Un edificio tiene una matriz de sensores de movimiento simulando una sala.
Tendría una matriz de 5x5, total 25 sensores. Si tiene un 0 una casilla
es que no hay movimiento, si tiene 1, es que sí hay movimiento

- Genera aleatoriamente el estado de los sensores de la sala
- Calcula cuántos sensores están activados
- Identifica si hay una región de movimiento contínuo, es decir al menos un bloque 2x2 con
todos los sensores activados.
 */



public class Enunciado2 {

    public static int numero_aleatorio(int min , int max){
        return (int) (Math.random()*(max-min+1) +min);
    }

    public static void pintar(int matriz[][]) {
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean bloqueActivo(int sens[][]) {

        for (int i = 0; i < sens.length - 1; i++) {
            for (int j = 0; j < sens[i].length - 1; j++) {
                if (sens[i][j] == 1 && sens[i][j+1] == 1 && sens[i+1][j] == 1 && sens[i+1][j+1] == 1){
                    return true;

                } break;
            }
        }

        return false;
    }


    public static void main(String[] args) {

        int sensores[][] = new int[5][5];
        int contActivos = 0;

        for (int i = 0; i < sensores.length; i++) {
            for (int j = 0; j < sensores[i].length; j++) {
                sensores[i][j] = numero_aleatorio(0,1);
                if (sensores[i][j] == 1) {
                    contActivos++;
                }
            }
        }

        pintar(sensores);

        if (bloqueActivo(sensores)){
            System.out.println("Hay un bloque de sensores activo.");
        } else
            System.out.println("No hay ningún bloque de sensores activo");



    }
}
