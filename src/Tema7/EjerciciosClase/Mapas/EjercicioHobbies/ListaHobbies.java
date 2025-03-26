package Tema7.EjerciciosClase.Mapas.EjercicioHobbies;

import java.util.*;

public class ListaHobbies {

    private TreeMap<Persona, List<String>> hobbies;

    public ListaHobbies() {
        hobbies = new TreeMap<>(Comparator.comparing(Persona::getEdad));
    }

    public TreeMap<Persona, List<String>> getHobbies() {
        return hobbies;
    }

    public void addPersona(Persona pers){
        hobbies.put(pers,new ArrayList<>());
    }

    public void addHobbie(Persona pers, String hobbie){
        List<String> hobbieList = hobbies.get(pers);
        hobbieList.add(hobbie);
    }

    public void listarTodos(){

        for (Persona pers : hobbies.keySet()){
            System.out.println(pers.getNombre() + pers.getEdad());
            for (String hb : hobbies.get(pers)){
                System.out.println(hb);
            }
        }


    }
}
