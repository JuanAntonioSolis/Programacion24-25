package Tema5.EjerciciosPracticarPOO.Ejercicio8;

import java.util.ArrayList;

public class Banco {

    private ArrayList<CuentaBancaria> cuentas;

    public Banco() {
        this.cuentas = new ArrayList<>();
    }

    public void addCuenta(CuentaBancaria cta){
        this.cuentas.add(cta);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Banco{");
        for (CuentaBancaria cuenta : cuentas){
            cuenta.toString();
        }
        sb.append("cuentas=").append(cuentas);
        sb.append('}');
        return sb.toString();
    }

    public CuentaBancaria getCuenta(String numeroCuenta){

        CuentaBancaria cb = new CuentaBancaria();
        cb.setNumeroCuenta(numeroCuenta);

        int posicion = this.cuentas.indexOf(cb);

        if (posicion<0){
            return null;
        } else
            return this.cuentas.get(posicion);
    }
}
