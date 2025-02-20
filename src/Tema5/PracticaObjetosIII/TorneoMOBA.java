package Tema5.PracticaObjetosIII;

public class TorneoMOBA extends Torneo{


    public TorneoMOBA(String nombre) {
        super(nombre);
    }

    @Override
    public void inscribirEquipo(Equipo equipo) throws Exception{

        if (equipo instanceof MOBA){
            super.inscribirEquipo(equipo);
        } else
            throw new Exception("El equipo no es válido para este torneo");
    }




}
