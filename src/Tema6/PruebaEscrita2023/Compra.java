package Tema6.PruebaEscrita2023;

import Tema6.PruebaEscrita2023.Interfaces.Enviable;

import java.time.LocalDate;
import java.util.ArrayList;

public class Compra implements Enviable {

    private ArrayList<LineaCompra> listaCompra;
    private LocalDate fecha;
    private Double precioTotal;

    public Compra(LocalDate fecha) {
        this.fecha = fecha;
        this.listaCompra = new ArrayList<>();
        this.precioTotal = 0.0;
    }

    public ArrayList<LineaCompra> getListaCompra() {
        return listaCompra;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Compra{");
        sb.append("listaCompra=").append(listaCompra);
        sb.append(", fecha=").append(fecha);
        sb.append(", precioTotal=").append(precioTotal);
        sb.append('}');
        return sb.toString();
    }


    /**
     * Añade lineas de compra a la lista y actualiza el precioTotal de la compra
     * Si ya hay una linea de compra con ese producto, suma a esa línea la nueva cantidad
     * Si no existe una linea con ese producto, se añade directamente
     * @param lc
     */
    public void addLinea(LineaCompra lc){
        for (LineaCompra l : listaCompra) {
            if (l.getProducto().equals(lc.getProducto())) {
                l.setOrden(l.getOrden() + this.listaCompra.indexOf(l));
                l.setCantidad(lc.getCantidad());
                this.precioTotal = l.subtotal();
            }
        }
        this.listaCompra.add(lc);
        this.precioTotal = lc.subtotal();
    }


    /**
     * Elimina una lineaCompra de la lista
     * @param lc
     */
    public void deleteLinea(LineaCompra lc){
        this.listaCompra.remove(lc);
    }


    /**
     * Devuelve detalles totales del pedido
     * @return
     */
    @Override
    public String crearEmail() {
        StringBuffer sb = new StringBuffer();

        sb.append("Hola, ");
        sb.append("\n");
        sb.append("Resumen de su pedido: ").append("\n");
        for (LineaCompra lc : listaCompra) {
            sb.append("Orden de linea de Compra: ").append(lc.getOrden());
            sb.append("\n");
            sb.append("Producto pedido: ").append(lc.getProducto());
            sb.append("\n");
            sb.append("Cantidad pedida: ").append(lc.getCantidad());
            sb.append("\n");
        }
        sb.append("Precio total: ").append(this.getPrecioTotal());
        sb.append("\n");
        sb.append("Fecha del pedido: ").append(this.getFecha());

        return sb.toString();
    }
}
