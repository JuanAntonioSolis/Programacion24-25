package Tema7.EjerciciosClase.MiniRela.Ej1;

import java.util.Objects;

public class Entrada {

    private String palabra;
    private String traduccion;

    public Entrada(String palabra, String traduccion) {
        this.palabra = palabra;
        this.traduccion = traduccion;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getTraduccion() {
        return traduccion;
    }

    public void setTraduccion(String traduccion) {
        this.traduccion = traduccion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Entrada{");
        sb.append("palabra='").append(palabra).append('\'');
        sb.append(", traduccion='").append(traduccion).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entrada entrada = (Entrada) o;
        return Objects.equals(palabra, entrada.palabra);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(palabra);
    }
}
