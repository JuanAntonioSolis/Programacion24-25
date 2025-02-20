package Tema5.PracticaObjetosIII;

public class TorneoFPS extends Torneo{


    public TorneoFPS(String nombre) {
        super(nombre);
    }

    @Override
    public void inscribirEquipo(Equipo equipo) throws Exception {

        if (equipo instanceof FPS){
            super.inscribirEquipo(equipo);
        } else
            throw new Exception("El equipo no es válido para este torneo");

    }


}
