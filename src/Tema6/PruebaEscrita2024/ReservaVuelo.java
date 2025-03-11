package Tema6.PruebaEscrita2024;

import java.util.ArrayList;
import java.util.Scanner;

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
        this.pasajeros = pasajeros;
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
        sb.append(", codigo del vuelo^= ").append(vuelo.getCodigo());
        sb.append(", dias restantes=").append(vuelo.diasFaltanVuelo());
        //Llamar a imprimir billetes
        sb.append('}');
        return sb.toString();
    }


    /**
     * Añade pasajeros a la lista
     * @param p
     */
    public void addPasajero(Pasajero p) {
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

    public void reservaAsiento(Pasajero p) {
        if (this.vuelo.verificarDisponibilidad(this.tipoA) > 0){
            this.vuelo.ocuparAsiento(p,this.vuelo.buscarAsientoDisponible(this.tipoA));
            this.pasajeros.add(p);
        }
    }




}
