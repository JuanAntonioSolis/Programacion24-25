package Tema7.PracticaII.SensoresPlantacion;

import java.time.LocalDateTime;
import java.util.ArrayList;

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

        //1. Filtrar los registros de temperatura que sean mayores a 25 grados, la humedad sea menor a 70 y la
        //   fecha sea anterior a la fecha actual, y mostrarlos.





    }
}
