package Tema5.EjerciciosPracticarPOO.Ejercicio7;

public class TestEmpleado {

    public static void main(String[] args) {

        Comercial em1 = new Comercial("Juan",22,1700.00,350.00);
        Comercial em2 = new Comercial("Mario",34,1800.00,450.00);
        Repartidor em3 = new Repartidor("Sandra",23,1100.00,Boolean.TRUE,"Zona3");
        MozoAlmacen em4 = new MozoAlmacen("Pedro",29,1400.00,true,3);


        em4.addPlus();

        System.out.println(em4);







    }
}
