package Tema6.EjercicioClase2Ev;

import java.util.ArrayList;

public class TiendaComics {

    private ArrayList<Comic> comics;

    public TiendaComics() {
        this.comics = new ArrayList<>();
    }

    public ArrayList<Comic> getComics() {
        return comics;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TiendaComics{");
        sb.append("comics=").append(comics);
        sb.append('}');
        return sb.toString();
    }

    public void addComic(Comic c){

        if (!this.comics.contains(c)){
            this.comics.add(c);
        }
    }

    public void removeComic(Comic c){
        this.comics.remove(c);
    }


}
