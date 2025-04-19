package Tema7.PracticaII.SensoresPlantacion;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
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

        System.out.println("---------------------------");
        System.out.println("2. Registro con la temperatura más alta");
        Optional<Registro> registro = registros.stream()
                .max(Comparator.comparing(Registro::getTemperatura));

        System.out.println(registro);

        System.out.println("---------------------------");
        System.out.println("3. Lista con las fechas/horas de cada registro");
        List<LocalDateTime> fechayhora = registros.stream()
                .map(Registro::getFechaHora)
                .collect(Collectors.toList());

        System.out.println(fechayhora);

        System.out.println("---------------------------");
        System.out.println("4. 5 de humedad más en cada registro");
        System.out.println(registros);
        registros.stream()
                .forEach(r -> r.setHumedad(r.getHumedad()+5));
        System.out.println(registros);












    }
}
