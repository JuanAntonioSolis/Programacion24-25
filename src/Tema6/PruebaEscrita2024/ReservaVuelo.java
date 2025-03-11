package Tema6.PruebaEscrita2024;

import java.util.ArrayList;


public class ReservaVuelo {

    private Long id;
    private Vuelo vuelo;
    private ArrayList<Pasajero> pasajeros;
    private TipoTarifa tipoT;
    private TipoAsiento tipoA;

    private static Long autoincremento = 1L;

    public ReservaVuelo(Vuelo vuelo, ArrayList<Pasajero> pasajeros,
                        TipoTarifa tipoT, TipoAsiento tipoA) {
        autoincremento++;
        this.id = autoincremento;
        this.vuelo = vuelo;
        this.pasajeros = new ArrayList<>();
        this.tipoT = tipoT;
        this.tipoA = tipoA;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public TipoTarifa getTipoT() {
        return tipoT;
    }

    public void setTipoT(TipoTarifa tipoT) {
        this.tipoT = tipoT;
    }

    public TipoAsiento getTipoA() {
        return tipoA;
    }

    public void setTipoA(TipoAsiento tipoA) {
        this.tipoA = tipoA;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ReservaVuelo{");
        sb.append("id=").append(id);
        sb.append(", codigo del vuelo= ").append(vuelo.getCodigo());
        sb.append(", dias restantes=").append(vuelo.diasFaltanVuelo());
        sb.append(", billetes=").append(this.imprimirBilletes());
        sb.append('}');
        return sb.toString();
    }


    /**
     * Añade pasajeros a la lista
     * @param p
     */
    private void addPasajero(Pasajero p) {
        if (!pasajeros.contains(p)) {
            pasajeros.add(p);
        }
    }

    public void deletePasajero(Pasajero p) {
        pasajeros.remove(p);
    }

    /**
     * Devuelve una lista de asientos asignados
     * @return
     */
    public ArrayList<Asiento> getAsientos() {
        ArrayList<Asiento> asientos = new ArrayList<>();

        for (Pasajero p : pasajeros) {
                asientos.add(p.getAsiento());
        }
        return asientos;
    }

    /**
     * Verifica si hay dispo. de asientos del tipo pedido,
     * busca asiento libre y ocupa el asiento con el pasajero.
     * @param p
     * @return
     */
    public boolean reservaAsiento(Pasajero p) {
        if (this.vuelo.verificarDisponibilidad(this.tipoA) > 0){
            Pasajero nuevo = new Pasajero(p);
            this.vuelo.ocuparAsiento(nuevo,this.vuelo.buscarAsientoDisponible(this.tipoA));
            this.addPasajero(nuevo);
            return true;
        } else
            return false;
    }

    /**
     * Devuelve el total de los precios de todas las reservas.
     * Dependiendo del tipo de tarifas devuelve un valor u otro.
     * @return
     */
    public Double calcularPrecioTotal(){
        Double precioTotal = 0.0;

        for (Asiento asiento : getAsientos()){
            if (tipoT.equals(TipoTarifa.CONFORT)){
                precioTotal += 1.15 * asiento.calcularPrecio();
            }
            if (tipoT.equals(TipoTarifa.OPTIMA)){
                precioTotal += 1.1 * asiento.calcularPrecio();
            }
            if (tipoT.equals(TipoTarifa.FLEXIBLE)){
                precioTotal += 1.30 * asiento.calcularPrecio();
            }
        }

        return precioTotal;
    }

    public String imprimirBilletes(){
        StringBuffer sb = new StringBuffer();
        for (Pasajero pasajero : this.getPasajeros()){
            sb.append(pasajero.getDniPasaporte());
            sb.append(" : ");
            sb.append(pasajero.getAsiento().getCodigo());
            sb.append("\n");
        }

        sb.append("Precio total: ");
        sb.append(this.calcularPrecioTotal());

        return sb.toString();
    }




}
