package Tema7.EjerciciosClase.Mapas.EjercicioHobbies;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        ListaHobbies lh = new ListaHobbies();

        Persona p1 = new Persona("Gloo",40);
        Persona p2 = new Persona("Pata",18);

        lh.addPersona(p1);
        lh.addPersona(p2);

        lh.addHobbie(p1,"Cantar");
        lh.addHobbie(p1,"Correr");
        lh.addHobbie(p2,"Dance");
        lh.addHobbie(p2,"Ski");

        lh.listarTodos();
    }
}
