package Tema5.EjerciciosPracticarPOO.Ejercicio3;

public class TestLibreria {

    public static void main(String[] args) {

        Libro l1 = new Libro(104,"Reina Roja", "Juan Gomez Jurado",300);
        Libro l2 = new Libro(102,"Todo muere", "Juan Gomez Jurado",288);
        Libro l3 = new Libro(101,"Rey Blanco", "Juan Gomez Jurado",275);
        Libro l4 = new Libro(103,"Loba negra", "Juan Gomez Jurado",324);
        Libro l5 = new Libro(105,"El paciente", "Juan Gomez Jurado",289);
        Libro l6 = new Libro(106,"Todo vuelve", "Juan Gomez Jurado",398);
        Libro l7 = new Libro(107,"Todo arce", "Juan Gomez Jurado",201);
        Libro l8 = new Libro(108,"Cicatriz", "Juan Gomez Jurado",303);
        Libro l9 = new Libro(180,"Tres enigmas para la organización",
                "Eduardo Mendoza",408);
        Libro l10 = new Libro(200,"El esplendor", "Agustín Martinez",390);

        Libreria libreria = new Libreria();

        libreria.adquirir(l1,6.50);
        libreria.adquirir(l2,5.50);
        libreria.adquirir(l3,4.50);
        libreria.adquirir(l4,6.50);
        libreria.adquirir(l5,7.00);
        libreria.adquirir(l6,6.00);
        libreria.adquirir(l7,5.50);
        libreria.adquirir(l8,5.00);
        libreria.adquirir(l9,6.99);
        libreria.adquirir(l10,7.50);

        libreria.vender(l1, 8.99);
        libreria.vender(l2, 7.99);
        libreria.vender(l3, 6.50);
        libreria.vender(l4, 8.99);
        libreria.vender(l5, 9.99);
        libreria.vender(l6, 8.00);
        libreria.vender(l7, 7.99);
        libreria.vender(l8, 8.00);
        libreria.vender(l9, 8.99);
        libreria.vender(l10, 10.99);

        System.out.println(libreria.ganancias());
    }
}
