package Tema6.PruebaEscrita2023;

import Tema6.PruebaEscrita2023.Enums.Talla;
import Tema6.PruebaEscrita2023.Enums.TipoRopa;

public class Ropa extends Producto{

    private Talla talla;
    private String colorBasico;
    private TipoRopa tipoRopa;


    public Ropa(String nombre, String descripcion, int precio, int unidadesStock,Talla talla,
                String colorBasico, TipoRopa tipoRopa) {
        super(nombre, descripcion, precio, unidadesStock);
        this.talla = talla;
        this.colorBasico = colorBasico;
        this.tipoRopa = tipoRopa;
    }

    //Constructor copia
    public Ropa(Ropa r) {
        super(r);
        this.talla = r.talla;
        this.colorBasico = r.colorBasico;
        this.tipoRopa = r.tipoRopa;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    public String getColorBasico() {
        return colorBasico;
    }

    public void setColorBasico(String colorBasico) {
        this.colorBasico = colorBasico;
    }

    public TipoRopa getTipoRopa() {
        return tipoRopa;
    }

    public void setTipoRopa(TipoRopa tipoRopa) {
        this.tipoRopa = tipoRopa;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Ropa{");
        sb.append("talla=").append(talla);
        sb.append(", colorBasico='").append(colorBasico).append('\'');
        sb.append(", tipoRopa=").append(tipoRopa);
        sb.append(", codigo='").append(codigo).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", precio=").append(precio);
        sb.append(", unidadesStock=").append(unidadesStock);
        sb.append('}');
        return sb.toString();
    }


    /**
     * Devuelve que cantidad de descuento se le aplicará al producto dependiendo de su talla
     * @return
     */
    @Override
    public Double descuento() {
        if (this.getTalla() == Talla.XS || this.getTalla() == Talla.XXL) {
            return this.getPrecio()*0.5;
        } else {
            return this.getPrecio()*0.7;
        }
    }



}
