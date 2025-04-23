package Tema7.PracticaII.BancoSmart;

import java.time.LocalDate;

public class Transaccion {

    private long id;
    private Cuenta cuenta;
    private Double importe;
    private LocalDate fecha;
    private TipoTransaccion tipo;
    private String descripcion;

    private static Long autoincremento = 1L;

    public Transaccion(Cuenta cuenta, Double importe, LocalDate fecha, TipoTransaccion tipo, String descripcion) {
        this.cuenta = cuenta;
        this.importe = importe;
        this.fecha = fecha;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.id = autoincremento++;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public TipoTransaccion getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransaccion tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public static Long getAutoincremento() {
        return autoincremento;
    }

    public static void setAutoincremento(Long autoincremento) {
        Transaccion.autoincremento = autoincremento;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("ID: {").append(id);
        sb.append("} | Cuenta: {").append(cuenta.getId());
        sb.append("} | {").append(tipo);
        sb.append("} de {").append(importe);
        sb.append("}€ el {").append(fecha);
        sb.append("} | {").append(descripcion).append("}");
        return sb.toString();
    }
}
