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

    }
}
