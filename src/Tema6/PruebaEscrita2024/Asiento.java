package Tema6.PruebaEscrita2024;

import java.util.Objects;

public abstract class Asiento {

    protected Long id;
    protected Pasajero pasajero;
    protected Double precioBase;
    protected Integer fila;
    protected String letra;
    protected TipoAsiento tipo;

    private static Long autoincremento = 1L;

    public Asiento(Double precioBase, Integer fila, String letra) {
        autoincremento++;
        this.id = autoincremento;
        this.precioBase = precioBase;
        this.fila = fila;
        this.letra = letra;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Integer getFila() {
        return fila;
    }

    public void setFila(Integer fila) {
        this.fila = fila;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public TipoAsiento getTipo() {
        return tipo;
    }

    public void setTipo(TipoAsiento tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Asiento{");
        sb.append("id=").append(id);
        sb.append(", pasajero=").append(pasajero.getDniPasaporte());
        sb.append(", precioBase=").append(precioBase);
        sb.append(", fila=").append(fila);
        sb.append(", letra='").append(letra).append('\'');
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asiento asiento = (Asiento) o;
        return Objects.equals(id, asiento.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    /**
     * Para un asiento, devuelve su fila y su letra de asiento
     * @return
     */
    public String getCodigo(){

        return "Fila " + this.fila.toString() + ", letra " + this.letra;
    }

    /**
     * Devuelve el precio de cada asiento
     * @return
     */
    public abstract Double calcularPrecio();
}
