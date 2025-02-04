package Tema5.EjerciciosPracticarPOO.Ejercicio4;

import java.util.Objects;

public class Producto {

    private Integer id;
    private String descripcion;
    private Double precioUnitario;
    private Integer unidadesDisponibles;
    private Integer stockMaximo;
    private Double descuento;

    public Producto() {
    }

    public Producto(Integer id, String descripcion, Double precioUnitario, Integer unidadesDisponibles, Integer stockMaximo, Double descuento) {
        this.id = id;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.unidadesDisponibles = unidadesDisponibles;
        this.stockMaximo = stockMaximo;
        this.descuento = descuento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Integer getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(Integer unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public Integer getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(Integer stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "El producto " + descripcion
                + " con ID " + id
                + " tiene un precio de " + precioUnitario + " €, "
                + " hay " + unidadesDisponibles + " unidades disponibles, "
                + " tiene un Stock Maximo de " + stockMaximo + " unidades "
                + " y dispone de un descuento de un " + descuento * 100 + " %";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(id, producto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    /** Metodo para vender producto
     * Decrementa las unidades disponibles con la venta
     * No se puede vender una cantidad negativa
     * Si no hay unidades suficientes, no se vende, devuelve False
     * Si hay unidades, se restan las unidades disponibles, devuelve True
     * @param cantidad
     * @return
     */
    public boolean vender(Integer cantidad){
        if (cantidad < 0 || this.unidadesDisponibles < cantidad){
            System.out.println("No se puede vender el artículo");
            return false;
        } else{
            this.unidadesDisponibles -= cantidad;
            return true;
        }
    }

    /** Reponer productos hasta que llegar a stock max
     * Primero se calcula la diferencia entre stock maximo y unidades disponibles
     * La cantidad que de, es la que hay que reponer en unidades disponibles
     *
     * @return
     */
    public Integer reponer(){

        Integer diferencia;

        diferencia = this.stockMaximo - this.unidadesDisponibles;

        this.unidadesDisponibles += diferencia;

        return diferencia;
    }
}
