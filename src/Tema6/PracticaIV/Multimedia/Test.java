package Tema6.PracticaIV.Multimedia;

public class Test {

    public static void main(String[] args) {

        PrimeVideo pv = new PrimeVideo();

        for (int i = 1; i <= 170; i++){
            Pelicula p1 = new Pelicula("Film",Boolean.FALSE,10.0,110,Genero.INFANTIL);

            pv.addMultimedia(p1);
        }

        for (int i = 1; i <= 30; i++){
            Pelicula p1 = new Pelicula("FilmPlus",Boolean.TRUE,10.0,110,Genero.ORIENTAL);
            pv.addMultimedia(p1);
        }

        for (int i = 1; i <= 75; i++){
            Cliente ct1 = new ClientePrime("11223344D"+i,"SusPrime","notpro@gmail.com");
            pv.addSuscriptor(ct1);
        }

        for (int i = 1; i <= 25; i++){
            Cliente ct1 = new ClientePrimePro("11223344D"+i,"SusPrimePro","pro@gmail.com");
            pv.addSuscriptor(ct1);

        }


        for (Cliente c : pv.getSuscriptores()){
            for (int i = 0; i<40;i++){
                Multimedia mm = pv.getCatalogo().get(i);
                pv.ver(mm,c);
            }
        }

        for (int j=0;j<10;j++){
            Serie s = new Serie("BB",Boolean.TRUE,8.00,Genero.ACCION);

            for (int i=0; i<10;i++){
                Temporada temp = new Temporada(i+1);
                for (int h = 0;h<10; h++){

                    temp.addEpisodio(new Episodio("Ep" + (h+1), "60"));
                }
                s.addTemporada(temp);
            }
            pv.addMultimedia(s);
        }

        for (Multimedia mm : pv.getCatalogo()){
            if (mm instanceof Serie){
                for (Cliente cte : pv.getSuscriptores()){
                    pv.ver(mm,cte);
                }
            }
        }

        //sout getgananciaspv
        //sisi
        System.out.println(pv.getGanancias());









    }
}
