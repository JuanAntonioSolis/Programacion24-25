package Tema5.EjerciciosPracticarPOO.Ejercicio6;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contacto> contactos;

    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }


    public Boolean existeContacto(Contacto c){
        for (Contacto contacto : contactos){
            if (contacto.getNombre().equalsIgnoreCase(c.getNombre())){
                return true;
            } else
                return false;
        }
        return false;
    }

    public void addContacto(Contacto c){

        if (!this.existeContacto(c)){
            addContacto(c);
            System.out.println("Contacto añadido correctamente");
        } else
            System.out.println("No fue posible añadir el contacto");
    }

    public void listarContactos(){
        for (Contacto contacto : contactos){
            System.out.println(contacto);
        }
    }

    public void buscarContacto(String nombre){
        for (Contacto contacto : contactos){
            if (contacto.getNombre().equalsIgnoreCase(nombre)){
                System.out.println(contacto.getTelefono());
            }
        }
    }

    public void eliminarContacto(Contacto c){
        for (Contacto contacto : contactos){

            if (contacto.equals(c)){
                this.contactos.remove(c);
                System.out.println("Este contacto se ha eliminado");
            } else
                System.out.println("No se pudo eliminar, contacto no encontrado");
        }
    }


}
