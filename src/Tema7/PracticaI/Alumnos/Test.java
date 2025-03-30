package Tema7.PracticaI.Alumnos;

import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {

        Estudiante est1 = new Estudiante("54118457D","Juan","Solis",
                LocalDate.of(2002,6,19),"Calle Carril","Huercal","juan@gmail.com",
                        "690116691");

        Estudiante est2 = new Estudiante("11223344F","Laura","Torre",
                LocalDate.of(2003,1,17),"Alfonso Sanchez","Almeria",
                "laura@gmail.com","699974728");

        //Notas de 1ºDAW de 2025
        NotasCurso nc1 = new NotasCurso("DAW", NotasCurso.etapaEducativa.FPSUPERIOR,1,2025);

        nc1.addNota("BDAT",8.5);
        nc1.addNota("PROG",8.0);
        nc1.addNota("SINF",9.0);
        nc1.addNota("ENDES",8.0);
        nc1.addNota("LMDSGI",7.5);
        nc1.addNota("IPE1",9.5);
        nc1.addNota("DASPGS",8.5);



        //Notas de 2ºDAW de 2026
        NotasCurso nc2 = new NotasCurso("DAW", NotasCurso.etapaEducativa.FPSUPERIOR,2,2026);

        nc2.addNota("BDAT",8.5);
        nc2.addNota("DESP",6.5);
        nc2.addNota("LMSGI",10.0);
        nc2.addNota("SINF",9.0);
        nc2.addNota("ENDES",8.0);
        nc2.addNota("PROG",7.0);
        nc2.addNota("INGLES",9.5);


        Expediente ex1 = new Expediente(Boolean.TRUE,est1);

        ex1.addNotas(nc1);
        ex1.addNotas(nc2);

        ex1.mostrarNotas(2,"FPSUPERIOR");

        CentroEducativo jaroso = new CentroEducativo("IES Jaroso","Avenida","Cuevas",
                "690116691","jaroso@gmail.com");

        jaroso.addExpediente(ex1);

        System.out.println(jaroso.buscarExpediente("54118457D"));







    }
}
