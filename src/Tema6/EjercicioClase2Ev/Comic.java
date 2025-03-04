package Tema6.EjercicioClase2Ev;

import java.time.LocalDate;
import java.util.ArrayList;

public class Comic {

    protected String titulo;
    protected LocalDate fecha;
    protected Integer numPaginas;
    protected ArrayList<Autor> autores;


    public Comic(String titulo, LocalDate fecha, Integer numPaginas) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.numPaginas = numPaginas;
        this.autores = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }



    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Comic{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", numPaginas=").append(numPaginas);
        sb.append(", autores=").append(autores);
        sb.append('}');
        return sb.toString();
    }

    public void addAutor(Autor a){

        if (!this.autores.contains(a)){
            this.autores.add(a);
            a.addComic(this);
        }

    }

    public void removeAutor(Autor a){
        this.autores.remove(a);
        a.removeComic(this);
    }
}
