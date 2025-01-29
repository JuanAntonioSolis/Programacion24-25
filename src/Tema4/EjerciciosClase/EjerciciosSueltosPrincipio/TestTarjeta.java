package Tema4.EjerciciosClase.EjerciciosSueltosPrincipio;

public class TestTarjeta {

    public static void main(String[] args) {

        TarjetaRegalo tr1 = new TarjetaRegalo(50.0);
        TarjetaRegalo tr2 = new TarjetaRegalo(25.0);

        System.out.println(tr1);
        System.out.println(tr2);

        tr2.gasta(15);

        System.out.println(tr2);

        tr1.fusionarTarjeta(tr2);

        System.out.println(tr1);
        System.out.println(tr2);
    }
}
