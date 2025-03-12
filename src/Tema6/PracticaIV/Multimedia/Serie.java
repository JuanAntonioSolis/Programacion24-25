package Tema6.PracticaIV.Multimedia;

import java.util.ArrayList;

public class Serie extends Multimedia{

    private ArrayList<Temporada> temporadas;

    public Serie(String titulo, Boolean plus, Double precio,Genero genero) {
        super(titulo, plus, precio,genero);
        this.temporadas = new ArrayList<>();
    }

    public ArrayList<Temporada> getTemporadas() {
        return temporadas;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Serie{");
        sb.append("temporadas=").append(temporadas);
        sb.append(", codigo=").append(codigo);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", plus=").append(plus);
        sb.append(", precio=").append(precio);
        sb.append(", genero=").append(genero);
        sb.append('}');
        return sb.toString();
    }


    /**
     * Devuelve el número de temporadas en la lista de temporadas
     * @return
     */
    public Integer getNumeroTemporadas() {
        return temporadas.size();
    }

    /**
     * Añade temporadas a la lista
     * @param t
     */
    public void addTemporada(Temporada t) {
        t.setSerie(this);
        this.temporadas.add(t);
    }


    /**
     * Elimina temporadas de la lista
     * @param t
     */
    public void delTemorada(Temporada t) {

        this.temporadas.remove(t);
    }










}
