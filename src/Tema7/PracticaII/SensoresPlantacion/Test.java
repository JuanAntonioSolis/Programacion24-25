package Tema7.PracticaII.SensoresPlantacion;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Test {

    public static double numero_aleatorio(double min , double max){
        return (Math.random()*(max-min+1) +min);
    }


    public static void main(String[] args) {

        ArrayList<Registro> registros = new ArrayList<>();

        for (int i = 0; i <= 100; i++){
            registros.add(new Registro(LocalDateTime.now().plusMinutes(1),
                    numero_aleatorio(18.0,40.0),numero_aleatorio(100.0,20.0)));
        }


        System.out.println("1. Filtra registros: temp > 25, humedad < 70, fecha < hoy");
        registros.stream()
                .filter(r -> r.getTemperatura() > 25)
                .filter(r -> r.getHumedad() < 70)
                .forEach(System.out::println);

        System.out.println("2. Registro con la temperatura más alta");
        long maxi = Stream.of(registros)
                .max(Comparator.comparing(Registro::getTemperatura))
                .orElseThrow();









    }
}
