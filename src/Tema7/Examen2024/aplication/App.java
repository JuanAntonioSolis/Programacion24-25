package Tema7.Examen2024.aplication;

import Tema7.Examen2024.io.DAOTicketsSoporte;
import Tema7.Examen2024.services.ServicioSoporte;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ServicioSoporte ss = DAOTicketsSoporte.cargarCSV();

        //Menu
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        do {

            System.out.println("1. Ver tickets abiertos");
            System.out.println("2. Ver tecnicos agrupados por especialidad");
            System.out.println("3. Ver total de tickets resueltos");
            System.out.println("4. Ver media de dias de resolucion de tickets");
            System.out.println("5. Crear nuevo ticket");
            System.out.println("6. Eliminar ticker");
            System.out.println("7. Salir");

            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion){
                case 1:
                    ss.getTicketsAbiertos().forEach(System.out::println);
                    break;
                case 2:
                    ss.getTecnicosGroupByEspecialidad().forEach((k,v) -> System.out.println(k + " - " + v));
                    break;
                case 3:
                    System.out.println(ss.getTotalTicketsResueltos(1));
                    break;
                case 4:
                    Integer prioridad = Integer.parseInt(sc.nextLine());
                    System.out.println(ss.getMediaResolucionTickets(prioridad));
                    break;
                case 5:
                    break;
                case 6:
                    Integer idTick = Integer.parseInt(sc.nextLine());
                    ss.deleteTicketSoporte(idTick);
                    break;
                case 7:
                    DAOTicketsSoporte.grabarCSV(ss);
                    break;
            }

        } while (opcion != 7);

        DAOTicketsSoporte.grabarCSV(ss);


    }
}
