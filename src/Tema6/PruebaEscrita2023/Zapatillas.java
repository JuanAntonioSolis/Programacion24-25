package Tema6.PruebaEscrita2023;

import Tema6.PruebaEscrita2023.Enums.Categoria;
import Tema6.PruebaEscrita2023.Enums.Numero;

public class Zapatillas extends Producto{

    private Numero numero;
    private Categoria categoria;


    public Zapatillas(String nombre, String descripcion, int precio,
                      int unidadesStock, Numero numero, Categoria categoria) {
        super(nombre, descripcion, precio, unidadesStock);
        this.numero = numero;
        this.categoria = categoria;
    }

    //Constructor copia
    public Zapatillas(Zapatillas z) {
        super(z);
        this.numero = z.numero;
        this.categoria = z.categoria;
    }

    public Numero getNumero() {
        return numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Zapatillas{");
        sb.append("numero=").append(numero);
        sb.append(", categoria=").append(categoria);
        sb.append(", codigo='").append(codigo).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", precio=").append(precio);
        sb.append(", unidadesStock=").append(unidadesStock);
        sb.append('}');
        return sb.toString();
    }


    /**
     * Devuelve el precio a descontar dependiendo del numero de zapatilla
     * @return
     */
    @Override
    public Double descuento() {
        if (this.getNumero() == Numero.TREINTAYCINCO ||
                this.getNumero() == Numero.CUARENTAYSIETE ||
                this.getNumero() == Numero.CUARENTAYOCHO ||
                this.getNumero() == Numero.CUARENTAYNUEVE ||
                this.getNumero() == Numero.CINCUENTA){
            return this.getPrecio() * 0.5;
        } else
            return this.getPrecio() * 0.7;
    }
}
