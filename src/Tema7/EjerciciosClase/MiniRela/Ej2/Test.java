package Tema7.EjerciciosClase.MiniRela.Ej2;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test {

    public static void main(String[] args) {

        CitasConsulta c = new CitasConsulta();

        Paciente p1 = new Paciente("Juan","Solis","690116691","juan@gmail.com",
                "Carril", "Almeria");
        Paciente p2 = new Paciente("Pedro","Voss","650650650","voss@gmail.com",
                "Estacion", "Granada");
        Paciente p3 = new Paciente("Samu","Voice","688888888","sims@gmail.com",
                "Marmol", "Huercal");
        Paciente p4 = new Paciente("Alba","Chica","677777777","barrio@gmail.com",
                "Rubi 9", "Rubi");

        c.addCita(new Cita(p1, LocalDate.of(2025,4,2),
                LocalTime.of(9,0), Cita.Tipo.PRIMERA));
        c.addCita(new Cita(p2, LocalDate.of(2025,3,1),
                LocalTime.of(10,0), Cita.Tipo.REVISION));
        c.addCita(new Cita(p3, LocalDate.of(2025,2,1),
                LocalTime.of(9,0), Cita.Tipo.PRIMERA));
        c.addCita(new Cita(p4, LocalDate.of(2025,6,19),
                LocalTime.of(16,0), Cita.Tipo.CONSULTA));
        c.addCita(new Cita(p3, LocalDate.of(2025,5,12),
                LocalTime.of(12,0), Cita.Tipo.REVISION));
        c.addCita(new Cita(p1, LocalDate.of(2025,6,19),
                LocalTime.of(19,30), Cita.Tipo.CONSULTA));


        System.out.println("Lista citas por Nombre:");
        c.listarCitasPorNombre();
        System.out.println("----------------");
        System.out.println("Lista citas por Apellido:");
        c.listarCitasPorApellidos();
        System.out.println("----------------");
        System.out.println("Lista citas por Fecha y Apellidos:");
        c.listarCitasPorFechaYApellidos();
        System.out.println("----------------");
        System.out.println("Lista citas por Hora:");
        c.listarCitasPorHora(LocalDate.of(2025,6,19));
        System.out.println("----------------");
        System.out.println("Listar citas futuras:");
        c.buscarCitasFuturas("sims@gmail.com");
        System.out.println("----------------");


    }
}
