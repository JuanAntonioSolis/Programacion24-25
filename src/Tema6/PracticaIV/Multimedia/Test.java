package Tema6.PracticaIV.Multimedia;

public class Test {

    public static void main(String[] args) {

        PrimeVideo pv = new PrimeVideo();

        for (int i = 1; i <= 170; i++){
            pv.addMultimedia(new Pelicula("Film",Boolean.FALSE,10.0,110));
        }

        for (int i = 1; i <= 30; i++){
            pv.addMultimedia(new Pelicula("FilmPlus",Boolean.TRUE,10.0,110));
        }

        for (int i = 1; i <= 75; i++){
            pv.addSuscriptor(new ClientePrime("11223344D"+i,"SusPrime","notpro@gmail.com"));
        }

        for (int i = 1; i <= 25; i++){
            pv.addSuscriptor(new ClientePrimePro("11223344D"+i,"SusPrimePro","pro@gmail.com"));
        }


        for (Cliente c : pv.getSuscriptores()){

        }










    }
}
