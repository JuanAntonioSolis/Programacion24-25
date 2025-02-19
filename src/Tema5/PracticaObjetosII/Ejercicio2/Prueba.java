package Tema5.PracticaObjetosII.Ejercicio2;

import Tema5.EjerciciosPracticarPOO.Ejercicio6.Contacto;

import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Equipo eq1 = new Equipo("Cofidis","Francia");

        Ciclista c1 = new Contrarrelojista(93,"Tomas Champion",4800,62.8);
        Ciclista c2 = new Velocista(99, "Jorge Martinez",3600,400.3,
                40.2);
        Ciclista c3 = new Escalador(02,"Esteban Gutierrez",5000,
                23.0f,20.0f);

        eq1.agregarCliclista(c1);
        eq1.agregarCliclista(c2);
        eq1.agregarCliclista(c3);

        int opcion = -1;

        while (opcion != 6) {

            System.out.println("MENU VUELTA CICLISTA");
            System.out.println();
            System.out.println("1. Imprimir datos del equipo");
            System.out.println("2. Añadir ciclista al equipo");
            System.out.println("3. Calcular el total de tiempos de los ciclistas del equipo");
            System.out.println("4. Listar nombres de los ciclistas");
            System.out.println("5. Buscar ciclista");
            System.out.println("6. Salir");
            System.out.println("Elige una de las opciones");

            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:

                    System.out.println(eq1);

                    break;
                case 2:
                    int opcionCiclista = 0;

                    while (opcionCiclista <= 3){
                        System.out.println("Elige que tipo de ciclista quieres añadir: ");
                        System.out.println("1. Velocista");
                        System.out.println("2. Contrarrelojista");
                        System.out.println("3. Escalador");
                        System.out.println("4. Salir");

                        opcionCiclista = Integer.parseInt(sc.nextLine());

                        switch (opcionCiclista){
                            case 1:
                                System.out.println("Escribe el ID del ciclista:");
                                int id = Integer.parseInt(sc.nextLine());
                                System.out.println("Escribe el nombre del ciclista:");
                                String nombre = sc.nextLine();
                                System.out.println("Escribe su tiempo acumulado:");
                                int tiempoAc = Integer.parseInt(sc.nextLine());
                                System.out.println("Escribe su potencia media:");
                                double potenciaM = Double.parseDouble(sc.nextLine());
                                System.out.println("Escribe su velocidad media en sprint:");
                                double velocidadM = Double.parseDouble(sc.nextLine());

                                eq1.agregarCliclista(new Velocista(id,nombre,tiempoAc,potenciaM,velocidadM));

                                System.out.println(eq1.getEquipo());
                                break;
                            case 2:
                                System.out.println("Escribe el ID del ciclista:");
                                id = Integer.parseInt(sc.nextLine());
                                System.out.println("Escribe el nombre del ciclista:");
                                nombre = sc.nextLine();
                                System.out.println("Escribe su tiempo acumulado:");
                                tiempoAc = Integer.parseInt(sc.nextLine());
                                System.out.println("Escribe su velocidad máxima:");
                                Double velocidadMax = Double.parseDouble(sc.nextLine());

                                eq1.agregarCliclista(new Contrarrelojista(id,nombre,tiempoAc,velocidadMax));
                                System.out.println(eq1.getEquipo());
                                break;
                            case 3:
                                System.out.println("Escribe el ID del ciclista:");
                                id = Integer.parseInt(sc.nextLine());
                                System.out.println("Escribe el nombre del ciclista:");
                                nombre = sc.nextLine();
                                System.out.println("Escribe su tiempo acumulado:");
                                tiempoAc = Integer.parseInt(sc.nextLine());
                                System.out.println("Escribe su aceleracion media en subida: ");
                                float aceleracionMedia = Float.parseFloat(sc.nextLine());
                                System.out.println("Escribe que grado de rampa soporta:");
                                float gradosRampa = Float.parseFloat(sc.nextLine());

                                eq1.agregarCliclista(new Escalador(id,nombre,tiempoAc,aceleracionMedia,gradosRampa));
                                System.out.println(eq1.getEquipo());
                                break;
                            case 4:
                                System.out.println("Gracias por añadir ciclistas");
                                break;

                            default:
                                System.out.println("Tipo de ciclista no encontrado");
                        }
                        sc.nextLine();
                    }
                    break;
                case 3:

                    System.out.println("El tiempo total de los ciclistas del equipo son: " +
                             eq1.calcularTiempoCarrera() + " minutos");

                    break;
                case 4:

                    eq1.nombresCiclistas();

                    break;
                case 5:

                    System.out.println("Escribe el ID del ciclista que quieres encontrar:");
                    int id = Integer.parseInt(sc.nextLine());

                    eq1.encontrarCiclista(id);

                    break;
                case 6:
                    System.out.println("Adiós, gracias por usar este programa");
                    break;
                default:
                    System.out.println("Error, oción incorrecta");
            }
            sc.nextLine();



        }



    }
}
