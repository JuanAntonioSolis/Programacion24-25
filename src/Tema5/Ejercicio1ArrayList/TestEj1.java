package Tema5.Ejercicio1ArrayList;

import java.time.LocalDate;
import java.util.List;

public class TestEj1 {

    public static void main(String[] args) {

        Expediente ex1 = new Expediente("Carlos","Veintisiete",'H',
                LocalDate.of(2000,12,27),
                Expediente.Modalidad.GRADOSUPERIOR,1);

        Expediente ex2 = new Expediente("Juan","Solis", 'H',
                LocalDate.of(2002,6,19),
                Expediente.Modalidad.GRADOSUPERIOR,1);

        NotasCurso nc1 = new NotasCurso("Programacion",1,4.5,6.75,5.5);
        NotasCurso nc2 = new NotasCurso("Programacion",1,6.5,6.0,2.5);
        NotasCurso nc3 = new NotasCurso("Base de Datos",1,8.5,4.0,4.5);
        NotasCurso nc4 = new NotasCurso("Base de Datos",1,4.0,8.0,4.5);

        ex1.addNotas(List.of(nc1,nc3));
        ex2.addNotas(List.of(nc2,nc4));

        System.out.println(ex1);
        System.out.println(ex2);

        System.out.println(ex1.titula());
        System.out.println(ex2.titula());

        System.out.println(ex1.getMediaExpediente());
        System.out.println(ex2.getMediaExpediente());

        System.out.println(ex1.getEdad());
        System.out.println(ex2.getEdad());



    }
}
