package Tema2.Bucles;

import java.util.Scanner;

public class EjercicioMenuCalculadora {

    public static void main(String[] args) {

        //Mostrar un menú con las siguientes opciones.
        //1. Sumar: pide dos números y súmalos.
        //2. Restar: pide dos números y réstalos.
        //3. Multiplicar: pide dos números y multiplícalos.
        //4. Dividir: pide dos números y divídelos.
        //5. Resto división: pide dos números y sacas el resto de la división entre ellos.
        //6. Elevar a: pide dos números y eleva el primero al segundo.
        //7. Salir


        int opcion = -1;
        int num1;
        int num2;
        int resultado;

        Scanner sc = new Scanner(System.in);

        while (opcion != 7) {

            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Resto división");
            System.out.println("6. Elevar a");
            System.out.println("7. Salir");

            System.out.println("Elige una de las opciones");
            opcion = Integer.parseInt(sc.nextLine());


            //También se pueden pedir aquí las variables, antes del switch.
            //Dentro de if opción >=1 && opcion <7

            switch (opcion) {
                case 1:
                    System.out.println("Has elegido la 1ra opción");
                    System.out.println("Introduce el 1er número");
                    num1 = Integer.parseInt(sc.nextLine());
                    System.out.println("Introduce el 2do número");
                    num2 = Integer.parseInt(sc.nextLine());
                    resultado = num1 + num2;
                    System.out.println("La suma de los 2 números es = " + resultado);
                    break;
                case 2:
                    System.out.println("Has elegido la 2da opción");
                    System.out.println("Introduce el 1er número");
                    num1 = Integer.parseInt(sc.nextLine());
                    System.out.println("Introduce el 2do número");
                    num2 = Integer.parseInt(sc.nextLine());
                    resultado = num1 - num2;
                    System.out.println("La resta de los 2 números es = " + resultado);
                    break;
                case 3:
                    System.out.println("Has elegido la 3er opción");
                    System.out.println("Introduce el 1er número");
                    num1 = Integer.parseInt(sc.nextLine());
                    System.out.println("Introduce el 2do número");
                    num2 = Integer.parseInt(sc.nextLine());
                    resultado = num1 * num2;
                    System.out.println("La multiplicación de los 2 números es = " + resultado);
                    break;
                case 4:
                    System.out.println("Has elegido la 4ta opción");
                    System.out.println("Introduce el 1er número");
                    num1 = Integer.parseInt(sc.nextLine());
                    System.out.println("Introduce el 2do número");
                    num2 = Integer.parseInt(sc.nextLine());
                    resultado = num1 / num2;
                    System.out.println("La divisón de los 2 números es = " + resultado);
                    break;
                case 5:
                    System.out.println("Has elegido la 5ta opción");
                    System.out.println("Introduce el 1er número");
                    num1 = Integer.parseInt(sc.nextLine());
                    System.out.println("Introduce el 2do número");
                    num2 = Integer.parseInt(sc.nextLine());
                    resultado = num1 % num2;
                    System.out.println("El resto de la divisón de los 2 números es = " + resultado);
                    break;
                case 6:
                    System.out.println("Has elegido la 6ta opción");
                    System.out.println("Introduce el 1er número");
                    num1 = Integer.parseInt(sc.nextLine());
                    System.out.println("Introduce el 2do número");
                    num2 = Integer.parseInt(sc.nextLine());
                    resultado = (int) Math.pow(num1,num2);
                    System.out.println("El primer número elevado al segundo es = " + resultado);
                    break;
                case 7:
                    System.out.println("Adiós, gracias por usar mi programa");
                    break;
                default:
                    System.out.println("Error, no existe esa opción");
            }
            System.out.println("Pulsa cualquier tecla para continuar");
            sc.nextLine(); //Mejora para ver el resultado tranquilamente


        }





    }
}
