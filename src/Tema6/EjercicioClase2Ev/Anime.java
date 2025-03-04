package Tema6.EjercicioClase2Ev;

import java.time.LocalDate;

public class Anime extends Comic{

    private Integer episodio;
    private String serie;


    public Anime(String titulo, LocalDate fecha, Integer numPaginas, Integer episodio, String serie) {
        super(titulo, fecha, numPaginas);
        this.episodio = episodio;
        this.serie = serie;
    }

    public Integer getEpisodio() {
        return episodio;
    }

    public void setEpisodio(Integer episodio) {
        this.episodio = episodio;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
   }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Anime{");
        sb.append("episodio=").append(episodio);
        sb.append(", serie='").append(serie).append('\'');
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", numPaginas=").append(numPaginas);
        sb.append(", autores=").append(autores);
        sb.append('}');
        return sb.toString();
    }
}
