package Tema7.EjerciciosClase.RepasoColecciones.TreeMap;

import java.time.LocalDateTime;

public class Test {

    public static void main(String[] args) {

        AgendaCitas acc = new AgendaCitas();

        acc.addCita("Reunión Prácticas",LocalDateTime.of(2025,4,3,10,0));
        acc.addCita("Reunión RRHH",LocalDateTime.of(2025,4,6,10,0));
        acc.addCita("Reunión Ventas",LocalDateTime.of(2025,4,7,10,0));
        acc.addCita("Reunión Alcalde",LocalDateTime.of(2025,4,4,10,0));
        acc.addCita("Reunión Concejal Urbanismo",LocalDateTime.of(2025,4,3,11,0));
        acc.addCita("Reunión Rajoy",LocalDateTime.of(2025,4,3,11,0));

        acc.mostrarProximasCitas();

    }
}
