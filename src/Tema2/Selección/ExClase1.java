package Tema2.Selección;

import java.util.Scanner;

public class ExClase1 {
    public static void main(String[] args) {

        /*
        1.- Pedir por teclado la hora del día (0-23)
        6-12 Buenos días
        12 - 20 Buenas tardes
        En otro caso buenas noches

        2.- Pedir nivel del jugador
        1-5:
        1. Iniciado
        2. Amateur
        3. Profesional
        4. Experto
        5. Dios

        Buenos días jugador de nivel Iniciado
        Buenas tardes jugador de nivel Experto
        ....

         */

        int hora;
        int nivel;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe qué hora es");
        hora = sc.nextInt();
        System.out.println("Escribe tu nivel");
        nivel = sc.nextInt();

        if (hora >=6 && hora <=12){
            if (nivel==1){
                System.out.println("Buenos días jugador de nivel Iniciado");
            } else if (nivel==2) {
                System.out.println("Buenos días jugador de nivel Amateur");
            } else if (nivel==3) {
                System.out.println("Buenos días jugador de nivel Profesional");
            } else if (nivel==4) {
                System.out.println("Buenos días jugador de nivel Experto");
            } else if (nivel==5) {
                System.out.println("Buenos días jugador de nivel Dios");
            }
        } else if (hora >12 && hora <=20){
            if (nivel==1){
                System.out.println("Buenas tardes jugador de nivel Iniciado");
            } else if (nivel==2) {
                System.out.println("Buenas tardes jugador de nivel Amateur");
            } else if (nivel==3) {
                System.out.println("Buenas tardes jugador de nivel Profesional");
            } else if (nivel==4) {
                System.out.println("Buenas tardes jugador de nivel Experto");
            } else if (nivel==5) {
                System.out.println("Buenas tardes jugador de nivel Dios");
            }
        } else {
            if (nivel==1){
                System.out.println("Buenas noches jugador de nivel Iniciado");
            } else if (nivel==2) {
                System.out.println("Buenas noches jugador de nivel Amateur");
            } else if (nivel==3) {
                System.out.println("Buenas noches jugador de nivel Profesional");
            } else if (nivel==4) {
                System.out.println("Buenas noches jugador de nivel Experto");
            } else if (nivel==5) {
                System.out.println("Buenas noches jugador de nivel Dios");
            }
        }


    }
}
