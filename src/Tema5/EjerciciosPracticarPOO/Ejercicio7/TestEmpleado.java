package Tema5.EjerciciosPracticarPOO.Ejercicio7;

public class TestEmpleado {

    public static void main(String[] args) {

        Empleado em1 = new Comercial("Juan",22,1700.00,350.00);
        Empleado em2 = new Comercial("Mario",34,1800.00,450.00);
        //Empleado em3 = new Repartidor("Pedro",29,600.00,"Zona3");
        //Empleado em4 = new Repartidor("Samuel",23,800.00,"Zona3");

        System.out.println(em2);

        em2.addPlus();

        System.out.println(em2);

        em1.addPlus();

        System.out.println(em1);

        //em3.addPlus();

       // System.out.println(em3);

        //em4.addPlus();

       // System.out.println(em4);





    }
}
