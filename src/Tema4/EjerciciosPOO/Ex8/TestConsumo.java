package Tema4.EjerciciosPOO.Ex8;

public class TestConsumo {

    public static void main(String[] args) {

        Consumo viaje1 = new Consumo(390,12,98,1.51);

        System.out.println(viaje1.getTiempo());

        System.out.println(viaje1.consumoMedioLitros());

    }
}
