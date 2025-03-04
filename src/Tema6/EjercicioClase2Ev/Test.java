package Tema6.EjercicioClase2Ev;

import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {

        Autor at1 = new Autor("Pedro","Pino","pedropino@pedropino.com",
                LocalDate.of(1993,8,17), Rol.DIBUJANTE);
        Autor at2 = new Autor("Pablo","Lescano","pablitolesc@atr.ar",
                LocalDate.of(1970,11,14), Rol.GUIONISTA);

        Anime an1 = new Anime("ShinChan",LocalDate.of(2002,06,19),
                45,30,"Serie10");
        NovelaGrafica nv1 = new NovelaGrafica("Superman",LocalDate.of(1965,12,3),
                100,"BlaBlaBla");

        TiendaComics t1 = new TiendaComics();

        an1.addAutor(at1);
        an1.addAutor(at2);

        t1.addComic(an1);
        t1.addComic(nv1);

        System.out.println(an1);



    }
}
