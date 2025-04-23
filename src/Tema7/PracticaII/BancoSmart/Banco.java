package Tema7.PracticaII.BancoSmart;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Banco {

    private List<Cuenta> cuentas;

    public Banco() {
        this.cuentas = new ArrayList<>();
    }

    /**
     * Añade una cuenta a la lista
     * @param c Cuenta que se añade a la lista
     */
    public void addCuenta(Cuenta c) {
        this.cuentas.add(c);
    }

    /**
     * Busca cuentas por ID de cuenta
     * Si la encuentra, la muestra por pantalla
     * @param id ID de la cuenta a buscar
     */
    public void getCuentaPorID(String id) {

        for (Cuenta c : cuentas) {
            if (c.getId().equals(id)) {
                System.out.println(c);
            }
        }
    }

    /**
     * Devuelve una lista con todas las transacciones del banco
     */
    public void getTodasTransacciones(){
        for (Cuenta c : cuentas) {
            System.out.println(c.getTransacciones());
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Banco{");
        sb.append("cuentas=").append(cuentas).append("\n");
        sb.append('}');
        return sb.toString();
    }

    public void getTransaccionesImporteMinimo(double valor){
        cuentas.stream()
                .flatMap(cuenta -> cuenta.getTransacciones().stream())
                .filter(t -> t.getImporte() >= valor)
                .sorted(Comparator.comparing(Transaccion::getFecha))
                .forEach(System.out::println);
    }

    public void getIngresosTotales(){

    }


}
