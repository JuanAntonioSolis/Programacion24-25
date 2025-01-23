package Tema4.EjerciciosPOO.Ex8;

public class TestConsumo {

    public static void main(String[] args) {

        Consumo viaje1 = new Consumo();

        viaje1.setKms(120.9);
        viaje1.setLitros(8.0);
        viaje1.setVmed(80.5);
        viaje1.setPgas(1.40);
        System.out.println(viaje1.getTiempo());
        System.out.println(viaje1.consumoMedio());
        System.out.println(viaje1.consumoEuros());




    }
}
