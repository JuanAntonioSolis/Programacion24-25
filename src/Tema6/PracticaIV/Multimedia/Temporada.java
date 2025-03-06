package Tema6.PracticaIV.Multimedia;

import java.util.ArrayList;

public class Temporada {

    private Integer numero;
    private ArrayList<Episodio> episodios;
    private Serie serie;

    public Temporada() {

        this.episodios = new ArrayList<>();
    }

    public Temporada(Integer numero) {
        this.numero = numero;
        this.episodios = new ArrayList<>();
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public ArrayList<Episodio> getEpisodios() {
        return episodios;
    }

    /**
     * Devuelve el número de episodios de la lista de episodios
     * @return
     */
    public Integer getNumeroEpisodios(){
        return this.episodios.size();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Temporada{");
        sb.append("numero=").append(numero);
        sb.append(", episodios=").append(episodios);
        sb.append(", titulo de la serie=").append(serie.getTitulo());
        sb.append('}');
        return sb.toString();
    }


    /**
     * Añade episodios a la lista
     * @param e
     */
    public void addEpisodio(Episodio e){
        e.setTemporada(this);
        this.episodios.add(e);
    }

    public void delEpisodio(Episodio e){
        this.episodios.remove(e);
    }




}
