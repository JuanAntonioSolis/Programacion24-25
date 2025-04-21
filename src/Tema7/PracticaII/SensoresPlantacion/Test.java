package Tema7.PracticaII.SensoresPlantacion;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static double numero_aleatorio(double min , double max){
        return (Math.random()*(max-min+1) +min);
    }


    public static void main(String[] args) {

        ArrayList<Registro> registros = new ArrayList<>();

        for (int i = 0; i <= 100; i++){
            registros.add(new Registro(LocalDateTime.now().plusMinutes(i),
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
        registros.stream()
                .map(Registro::getFechaHora)
                .forEach(System.out::println);


        System.out.println("---------------------------");
        System.out.println("4. 5 de humedad más en cada registro");
        //System.out.println(registros);

        System.out.println("---------------------------");
        System.out.println("5. Registro con temperatura más baja que tenga humedad mayor a 80, todos sus datos");
        Optional<Registro> nuevo = registro.stream()
                .min(Comparator.comparing(Registro::getTemperatura))
                .filter(r -> r.getHumedad() > 80);

        nuevo.ifPresent(System.out::println);

        System.out.println("---------------------------");
        System.out.println("6. Verificar si algun registro tiene: temp > 30, hum > 90 y fecha=hoy");
        registros.add(new Registro(LocalDateTime.now(),35.0,92.0));
        boolean regRequisitos = registros.stream()
                .anyMatch(r -> r.getTemperatura() > 30 && r.getHumedad() > 90
                        && r.getFechaHora().equals(LocalDateTime.now()));
        if (regRequisitos) {
            System.out.println("Hay un registro que cumple esta condición");
        } else
            System.out.println("NO hay un registro que cumpla esta condición");

        System.out.println("---------------------------");
        System.out.println("7. 10 registros saltándote los 5 primeros");
        registros.stream()
                .skip(5)
                .limit(10)
                .forEach(System.out::println);

        System.out.println("---------------------------");
        System.out.println("8. Muestra los registros ordenados por fecha (sorted(Comparator))");
        registros.stream()
                .sorted(Comparator.comparing(Registro::getFechaHora))
                .forEach(System.out::println);

        System.out.println("---------------------------");
        System.out.println("9. Cuenta los registros que tengan temperatura mayor a 35 grados");
        long filtrado = registros.stream()
                .filter(r -> r.getTemperatura() > 35)
                .count();
        System.out.println("Hay " + filtrado + " registros con temperatura mayor de 35ºC");

        System.out.println("---------------------------");
        System.out.println("10. Temperatura promedio de todos los registros");
        Double media = registros.stream()
                .map(Registro::getTemperatura)
                .collect(Collectors.averagingDouble(Double::doubleValue));

        System.out.println(media);

















    }
}
