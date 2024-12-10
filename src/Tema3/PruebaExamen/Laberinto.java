package Tema3.PruebaExamen;

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


    }


    public static void main(String[] args) {

        char tablero[][] = new char[20][20];

        rellenarLaberinto(tablero);

        pintar(tablero);



    }
}
