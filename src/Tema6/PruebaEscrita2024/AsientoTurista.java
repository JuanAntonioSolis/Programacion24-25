package Tema6.PruebaEscrita2024;

public class AsientoTurista extends Asiento{

    private Boolean ventana;

    public AsientoTurista(Double precioBase, Integer fila, String letra, Boolean ventana) {
        super(precioBase, fila, letra);
        this.tipo = TipoAsiento.TURISTA;
        this.ventana = ventana;
    }

    public Boolean getVentana() {
        return ventana;
    }

    public void setVentana(Boolean ventana) {
        this.ventana = ventana;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AsientoTurista{");
        sb.append("Codigo: ").append(this.getCodigo());
        sb.append(", precio: ").append(this.calcularPrecio());
        sb.append(", tipo=").append(tipo);
        sb.append(", ventana=").append(ventana);
        sb.append(", DNI Pasajero: ").append(this.getPasajero().getDniPasaporte());
        sb.append('}');
        return sb.toString();
    }


    /**
     * Devuelve el precio del asiento, si tiene ventana le suma 10€ al precio
     * @return
     */
    @Override
    public Double calcularPrecio() {
        if (this.ventana) {
            return this.precioBase+10;
        } else
            return this.precioBase;
    }
}
