package Tema6.PruebaEscrita2024;

public class AsientoBusiness extends Asiento{

    private Boolean comida;

    public AsientoBusiness(Double precioBase, Integer fila, String letra, Boolean comida) {
        super(precioBase, fila, letra);
        this.comida = comida;
        this.tipo = TipoAsiento.BUSINESS;
    }

    public Boolean getComida() {
        return comida;
    }

    public void setComida(Boolean comida) {
        this.comida = comida;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AsientoBusiness{");
        sb.append("Codigo: ").append(this.getCodigo());
        sb.append(", precio:").append(precioBase);
        sb.append(", tipo:").append(tipo);
        sb.append(", comida").append(comida);
        sb.append(", DNI Pasajero: ").append(this.pasajero.getDniPasaporte());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Double calcularPrecio() {
        if (this.comida) {
            return (this.precioBase * 1.25) + 30;
        } else
            return this.precioBase * 1.25;
    }
}
