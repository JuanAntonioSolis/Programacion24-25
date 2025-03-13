package Tema6.PruebaEscrita2023;

import Tema6.PruebaEscrita2023.Interfaces.Decontable;

import java.util.Objects;
import java.util.UUID;

abstract class Producto implements Decontable {

    protected String codigo;
    protected String nombre;
    protected String descripcion;
    protected int precio;
    protected int unidadesStock;

    public Producto(String nombre, String descripcion, int precio, int unidadesStock) {
        this.codigo = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.unidadesStock = unidadesStock;
    }

    public Producto(Producto p) {
        this.codigo=p.codigo;
        this.nombre=p.nombre;
        this.descripcion=p.descripcion;
        this.precio=p.precio;
        this.unidadesStock=p.unidadesStock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getUnidadesStock() {
        return unidadesStock;
    }

    public void setUnidadesStock(int unidadesStock) {
        this.unidadesStock = unidadesStock;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Producto{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", precio=").append(precio);
        sb.append(", unidadesStock=").append(unidadesStock);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(codigo, producto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    @Override
    public Double descuento() {

        return 0.0;
    }
}
