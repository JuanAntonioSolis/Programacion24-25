package Tema6.PruebaEscrita2023;

import Tema6.PracticaIV.Multimedia.Cliente;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Tienda {

    private ArrayList<Producto> inventario;
    private ArrayList<Compra> compras;

    public Tienda() {
        this.inventario = new ArrayList<>();
        this.compras = new ArrayList<>();
    }

    public ArrayList<Producto> getInventario() {
        return inventario;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public String mostrarInventario(){
        StringBuffer sb = new StringBuffer();

        for (Producto p : inventario) {
            sb.append("Codigo producto: ").append(p.getCodigo()).append("\n");
            sb.append("Nombre del producto: ").append(p.getNombre()).append("\n");
            sb.append("Unidades en stock: ").append(p.getUnidadesStock()).append("\n");
        }

        return sb.toString();
    }

    public String mostrarCompras(){
        StringBuffer sb = new StringBuffer();

        for (Compra c : compras) {
            for (LineaCompra ln : c.getListaCompra()){
                sb.append("Lista de compras: ").append(c.getListaCompra()).append("\n");
            }
            sb.append("Suma total de las compras: ").append(c.getPrecioTotal()).append("\n");
        }

        return sb.toString();
    }

    public String mostrarCompras(Month mes){
        StringBuffer sb = new StringBuffer();

        for (Compra c : compras) {
            if (c.getFecha().getMonth().equals(mes)){
                for (int i = 0; i < c.getFecha().lengthOfMonth();i++){
                    for (LineaCompra ln : c.getListaCompra()){
                        sb.append("Lista de compras: ").append(c.getListaCompra()).append("\n");
                    }
                }
            }
            sb.append("Suma total de las compras: ").append(c.getPrecioTotal()).append("\n");
        }

        return sb.toString();
    }

    public void addProducto(Producto p){
        if (!this.inventario.contains(p)) {
            this.inventario.add(p);
        }
    }

    public void deleteProducto(Producto p){
        this.inventario.remove(p);
    }


    /**
     * Añade compras a la lista de compras
     * Primero comprueba que haya stock suficiente de ese producto para hacer el pedido.
     * Si no hay, lanza excepción.
     * Si hay, añade la compra a la lista
     * y decrementa el stock del producto segun la cantidad de la LineaCompra de la Compra
     * @param c
     * @throws Exception
     */
    public void addCompra(Compra c) throws Exception{
        /*
        if (!this.compras.contains(c)) {
            this.compras.add(c);
            for (Producto p : this.inventario) {
                for (LineaCompra lc : c.getListaCompra()) {
                    p.setUnidadesStock(p.getUnidadesStock()-lc.getCantidad());
                }
            }
        }
         */
        for (LineaCompra lc : c.getListaCompra()) {
            if (lc.getProducto().getUnidadesStock()<lc.getCantidad()) {
                throw new Exception("No se puede realizar la compra");
            } else if (!this.compras.contains(c)) {
                    this.compras.add(c);
                    for (Producto p : this.inventario) {
                        p.setUnidadesStock(p.getUnidadesStock()-lc.getCantidad());
                    }
                }
        }
    }


    /**
     * Busca todos los productos con el nombre especificado y devuelve una lista.
     * @param texto
     * @return
     */
    public ArrayList<Producto> buscarProducto(String texto){
        ArrayList<Producto> productos = new ArrayList<>();

        for (Producto p : this.inventario) {
            if (p.getNombre().equals(texto)) {
                productos.add(p);
                return productos;
            }
        }
        return null;
    }




}
