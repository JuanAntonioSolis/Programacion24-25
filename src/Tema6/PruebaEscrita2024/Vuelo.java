package Tema6.PruebaEscrita2024;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;

public class Vuelo {

    private String codigo;
    private String origen;
    private String destino;
    private LocalDate fecha;
    private LocalTime hora;
    private Double precioBase;
    private Integer asientosDisponibles;
    private ArrayList<Asiento> asientos;

    public Vuelo(String origen, String destino,
                 LocalDate fecha, LocalTime hora, Double precioBase, Integer asientosDisponibles) {
        this.codigo = UUID.randomUUID().toString();
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.precioBase = precioBase;
        this.asientosDisponibles = asientosDisponibles;
        this.asientos = new ArrayList<>();

        //Añade asientos turista
        for (int i = 0; i < asientosDisponibles * 0.7; i++) {
            this.addAsiento(new AsientoTurista(200.0,i/4,"A"+i, Boolean.TRUE));
        }

        //Añade asientos business
        for (int i = 0; i < asientosDisponibles * 0.3; i++) {
            this.addAsiento(new AsientoBusiness(300.0,i/4,"B"+i, Boolean.TRUE));
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Integer getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(Integer asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Vuelo{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append(", origen='").append(origen).append('\'');
        sb.append(", destino='").append(destino).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", hora=").append(hora);
        sb.append(", precioBase=").append(precioBase);
        sb.append(", asientosDisponibles=").append(asientosDisponibles);
        sb.append(", asientos=\n");
        for (Asiento as : asientos){
            sb.append(as.toString());
            sb.append("\n");
        }
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vuelo vuelo = (Vuelo) o;
        return Objects.equals(codigo, vuelo.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    public void addAsiento(Asiento asiento) {
        this.asientos.add(asiento);
    }

    /**
     * Verifica cuantos asientos disponibles del tipo especificado hay
     * @param tipodeAsiento
     * @return
     */
    public int verificarDisponibilidad(TipoAsiento tipodeAsiento){

        int cont = 0;

        for (Asiento asiento : this.asientos){
            if (asiento.getTipo().equals(tipodeAsiento)){
                if (asiento.getPasajero() == null){
                    cont++;
                }
            }
        }
        return cont;
    }

    /**
     * Devuelve el primer asiento libre del tipo indicado.
     * @param tipodeAsiento
     * @return
     */
    public Asiento buscarAsientoDisponible(TipoAsiento tipodeAsiento){
        for (Asiento asiento : this.asientos){
            if (asiento.getTipo().equals(tipodeAsiento) && asiento.getPasajero() == null){
                return asiento;
            }
        }
        return null;
    }

    /**
     * Asigna un asiento a un pasajero, y el pasajero ocupa ese asiento
     * @param p
     * @param asiento
     * @return
     */
    public boolean ocuparAsiento(Pasajero p, Asiento asiento){
        if (asiento.getPasajero() == null){
            p.setAsiento(asiento);
            asiento.setPasajero(p);
            return true;
        } else
            return false;
    }

    /**
     * Se quita el pasajero del asiento, y el asiento del pasajero
     * @param asiento
     */
    public void liberarAsiento(Asiento asiento){

        if (asiento.getPasajero() != null){
            asiento.getPasajero().setAsiento(null);
            asiento.setPasajero(null);
        }
    }


    /**
     * Devuelve los dias que faltan para el vuelo
     * @return
     */
    public Long diasFaltanVuelo(){

        return LocalDate.now().until(this.fecha, ChronoUnit.DAYS);

    }

    /**
     * Devuelve una lista de pasajeros de cada vuelo
     * @return
     */
    public ArrayList<Pasajero> getPasajeros() {
        ArrayList<Pasajero> listaPasajeros =  new ArrayList<>();
        for (Asiento asiento : this.asientos){
            if (asiento.getPasajero() != null){
                listaPasajeros.add(asiento.getPasajero());
            }

        }

        return listaPasajeros;
    }








}
