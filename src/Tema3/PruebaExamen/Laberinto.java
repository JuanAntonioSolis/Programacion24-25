package Tema3.PruebaExamen;

import java.util.Scanner;

public class Laberinto {

    public static int numero_aleatorio(int min , int max){
        return (int) (Math.random()*(max-min+1) +min);
    }

    public static void pintar(char matriz[][]) {
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Elige un movimiento");
        System.out.println("1. Derecha");
        System.out.println("2. Izquierda");
        System.out.println("3. Abajo");
        System.out.println("4. Arriba");
    }

    public static void rellenarLaberinto(char lab[][]){

        //Rellena el centro con '.'
        for (int i = 1; i < lab.length-1;i++){
            for (int j = 1; j < lab[i].length-1;j++){
                lab[i][j] = '.';
            }
        }

        //Rellena los bordes superior e inferior con '-'
        for (int i = 0; i < lab.length;i++){
            lab[0][i] = '-';
            lab[lab.length-1][i] = '-';
        }

        //Rellena ambos laterales con '|'
        for (int i = 0; i < lab.length;i++){
            lab[i][lab.length-1] = '|';
            lab[i][0] = '|';
        }

        lab[0][0] = '@';

    }

    public static void generarSalida(char lab[][]) {

        int posicion = numero_aleatorio(20,0);
        int borde = numero_aleatorio(4,1);

        switch (borde) {
            case 1:
                //Fila superior x=0, y=posicion
                lab[0][posicion] = '#';
                break;
            case 2:
                //Fila inferior x=length-1,y=posicion
                lab[lab.length-1][posicion] = '#';
                break;
            case 3:
                //Borde izquierdo x=posicion, y=0
                lab[posicion][0] = '#';
                break;
            case 4:
                //Borde derecho x=posicion, y=length-1
                lab[posicion][lab[0].length-1] = '#';
                break;

        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char tablero[][] = new char[20][20];

        //Posicion de la bomba
        int xBomba;
        int yBomba;

        //Posicion del jugador
        int xJug = 0;
        int yJug = 0;

        rellenarLaberinto(tablero);

        generarSalida(tablero);

        //Generamos la bomba
        xBomba = numero_aleatorio(18,1);
        yBomba = numero_aleatorio(18,1);

        int direccion;
        boolean salida = false;
        boolean bomba = false;
        boolean fuera = false;

        while (!salida && !bomba && !fuera) {

            pintar(tablero);

            try {
                direccion = Integer.parseInt(sc.nextLine());
                if (direccion > 0 && direccion < 5) {
                    switch (direccion) {
                        case 1:
                            //Derecha
                            yJug++;
                            break;
                        case 2:
                            //Izquierda
                            yJug--;
                            break;
                        case 3:
                            //Abajo
                            xJug++;
                            break;
                        case 4:
                            //Arriba
                            xJug--;
                            break;
                    }

                    //Comprobamos si ha llegado a la salida
                    if (tablero[xJug][yJug] == '#'){
                        salida = true;
                    }

                    //Comprobamos si hemos tocado la bomba
                    if (xJug == xBomba && yJug == yBomba) {
                        bomba = true;
                    }

                    //Movemos al jugador
                    tablero[xJug][yJug] = '@';
                } else {
                    System.out.println("Dirección incorrecta");
                }
            } catch (IndexOutOfBoundsException e) {
                fuera = true;
            }

        }

        //Comprombamos si se ha salido o ha tocado la bomba

        if (salida) {
            System.out.println("Felicidades, has conseguido salir");
            System.out.println("La bomba estaba en (" + xBomba + "," + yBomba + ").");
        } else if (bomba) {
            System.out.println("Has tocado la bomba, vuelve a intentarlo :((");
        } else if (fuera) {
            System.out.println("Te has salido del laberinto por donde no es...");
        }






    }
}
