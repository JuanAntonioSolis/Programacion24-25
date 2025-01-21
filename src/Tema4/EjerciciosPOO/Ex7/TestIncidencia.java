package Tema4.EjerciciosPOO.Ex7;

public class TestIncidencia {

    public static void main(String[] args) {

        Incidencia puerta = new Incidencia(010,"No abre");
        Incidencia garaje = new Incidencia(120,"Espejo puerta");
        Incidencia ascensor = new Incidencia(738,"Botones no van");
        Incidencia goteras = new Incidencia(472,"Goteras en el pasillo");
        Incidencia barandillas = new Incidencia(313,"Barandillas para cambiar");

        System.out.println(Incidencia.getPendientes());

        ascensor.resuelve();

        System.out.println(Incidencia.getPendientes());
    }
}
