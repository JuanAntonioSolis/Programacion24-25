package Tema5.PracticaObjetosII.Ejercicio2;

public class Prueba {

    public static void main(String[] args) {

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

        }



    }
}
