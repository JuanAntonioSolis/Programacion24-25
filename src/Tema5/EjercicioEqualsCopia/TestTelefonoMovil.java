package Tema5.EjercicioEqualsCopia;

public class TestTelefonoMovil {

    public static void main(String[] args) {

        TelefonoMovil t1 = new TelefonoMovil("Motorola",100.60,"24","EU");
        TelefonoMovil t2 = new TelefonoMovil(t1);
        TelefonoMovil t3 = t1;

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.println(t1 == t2);
        System.out.println(t1 == t3);

        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(t3));



    }




}
