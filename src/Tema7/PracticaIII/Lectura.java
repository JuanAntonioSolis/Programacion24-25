package Tema7.PracticaIII;

import java.time.LocalDateTime;
import java.util.Objects;

public class Lectura {

    private Integer id;
    private Double temperatura;
    private Double humedad;
    private LocalDateTime momento;
    private Finca finca;

    public Lectura(Integer id, Double temperatura, Double humedad, LocalDateTime momento, Finca finca) {
        this.id = id;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.momento = momento;
        this.finca = finca;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public Double getHumedad() {
        return humedad;
    }

    public void setHumedad(Double humedad) {
        this.humedad = humedad;
    }

    public LocalDateTime getMomento() {
        return momento;
    }

    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }

    public Finca getFinca() {
        return finca;
    }

    public void setFinca(Finca finca) {
        this.finca = finca;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Lectura{");
        sb.append("id=").append(id);
        sb.append(", temperatura=").append(temperatura);
        sb.append(", humedad=").append(humedad);
        sb.append(", momento=").append(momento);
        sb.append(", finca=").append(finca.getId());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lectura lectura = (Lectura) o;
        return Objects.equals(id, lectura.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
