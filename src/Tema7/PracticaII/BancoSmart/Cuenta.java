package Tema7.PracticaII.BancoSmart;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cuenta {

    private String id;
    private Cliente propietario;
    private Double saldo;
    private List<Transaccion> transacciones;

    public Cuenta(Cliente propietario) {
        this.propietario = propietario;
        this.id = UUID.randomUUID().toString();
        this.saldo = 0.0;
        this.transacciones = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("{").append(id);
        sb.append("} - {").append(propietario.getDni());
        sb.append("} | Saldo: {").append(saldo).append("}€");
        return sb.toString();
    }

    /**
     * Metodo que añade transacciones a la lista
     * Dependiendo del tipo de transaccion aumenta o reduce el saldo de la cuenta
     * @param t Transacción que se añade a la lista
     */
    public void addTransaccion(Transaccion t) {
        this.transacciones.add(t);
        if (t.getTipo().equals(TipoTransaccion.INGRESO)){
            setSaldo(getSaldo()+t.getImporte());
        } else
            setSaldo(getSaldo()-t.getImporte());
    }




}
