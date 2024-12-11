package Tema3.PruebaExamen;

/*
El usuario piensa un número, y el programa debe averiguarlo. Pide al usuario que piense un
número entre el 1 y el 100. El programa mostrará un número por pantalla y preguntará al
usuario si el número que ha pensado es menor, igual o mayor al número mostrado. Este
proceso lo repetirá hasta encontrar el número que ha pensado el usuario. Al finalizar el
proceso, mostrará el número de intentos probados hasta encontrar el número.
 */

import java.util.Scanner;

public class BusquedaBinaria {

    public static int aleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }


    public static void main(String[] args) {

        int numero;
        int intento = 0;
        String valor;

        Scanner sc = new Scanner (System.in);

        System.out.println("Escribe un número del 1 al 100, la máquina lo va a adivinar");
        numero = Integer.parseInt(sc.nextLine());

        while (intento != numero) {
            intento = aleatorio(100,1);
            System.out.println("Es " + intento + " mayor, igual o menor que tu número?");
            valor = sc.nextLine();
            valor = valor.toLowerCase();

            switch (valor){
                case "mayor":
                    intento = aleatorio(intento,1);
                    break;
                case "menor":
                    intento = aleatorio(100,intento);
                    break;
                case "igual:":
                    System.out.println("Enhorabuena maquina, adivinaste el numero");
                    break;
                default:

            }



        }







    }
}
