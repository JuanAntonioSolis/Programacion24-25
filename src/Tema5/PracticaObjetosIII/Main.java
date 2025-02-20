package Tema5.PracticaObjetosIII;

public class Main {

    public static void main(String[] args) throws Exception {

        Equipo eq1 = new FPS("Snipers",85,8);
        Equipo eq2 = new FPS("Assassins",95,7);
        Equipo eq3 = new FPS("Hunters",70,9);

        Equipo eq4 = new MOBA("Dragons",80,4);
        Equipo eq5 = new MOBA("Phoenix",70,5);
        Equipo eq6 = new MOBA("Wolves",90,3);

        Torneo t1 = new TorneoFPS("Torneo FPS");
        Torneo t2 = new TorneoMOBA("Torneo MOBA");

        t1.inscribirEquipo(eq1);
        t1.inscribirEquipo(eq2);
        t1.inscribirEquipo(eq3);

        t2.inscribirEquipo(eq4);
        t2.inscribirEquipo(eq5);
        t2.inscribirEquipo(eq6);

        System.out.println("Equipos inscritos en el Torneo MOBA: ");
        t2.imprimirEquipos();
        System.out.println();
        System.out.println("Ganador del torneo MOBA: " + t2.jugarTorneo().getNombre() + " (" + t2.jugarTorneo().calcularPuntos() + " puntos)" );

        System.out.println("Equipos inscritos en el Torneo FPS: ");
        t1.imprimirEquipos();
        System.out.println();
        System.out.println("Ganador del torneo FPS: " + t1.jugarTorneo().getNombre() + " (" + t1.jugarTorneo().calcularPuntos() + " puntos)" );








    }
}
