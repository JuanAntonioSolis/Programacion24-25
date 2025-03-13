package Tema6.PruebaEscrita2023;

import java.util.Objects;

public class LineaCompra {

    private Integer orden;
    private Producto producto;
    private Integer cantidad;

    public LineaCompra(Producto producto, Integer cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.orden = null;
    }

    //Constructor copia
    public LineaCompra(LineaCompra ln) {
        this.orden = ln.orden;
        this.producto = ln.producto;
        this.cantidad = ln.cantidad;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("LineaCompra{");
        sb.append("orden=").append(orden);
        sb.append(", producto=").append(producto);
        sb.append(", cantidad=").append(cantidad);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineaCompra that = (LineaCompra) o;
        return Objects.equals(producto, that.producto);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(producto);
    }


    /**
     * Devuelve el subtotal de la línea.
     * Con el descuento correspondiente del producto aplicado
     * @return
     */
    public Double subtotal(){
        return this.getProducto().getPrecio()*cantidad - this.getProducto().descuento();
    }
}
