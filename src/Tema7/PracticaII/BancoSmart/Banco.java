package Tema7.PracticaII.BancoSmart;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

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
                .filter(t -> t.getImporte() > valor)
                .sorted(Comparator.comparing(Transaccion::getFecha))
                .forEach(System.out::println);
    }

    public void getIngresosTotales(){
        cuentas.stream()
                .flatMap(c -> c.getTransacciones().stream())
                .filter(t -> t.getTipo().equals(TipoTransaccion.INGRESO))
                .mapToDouble(Transaccion::getImporte)
                .summaryStatistics()
                .getSum();
    }

    public void getGastosTotales(){
        cuentas.stream()
                .flatMap(c -> c.getTransacciones().stream())
                .filter(t -> t.getTipo().equals(TipoTransaccion.GASTO))
                .map(Transaccion::getImporte)
                .reduce(Double::sum);
    }

    public void getCuentasPorSaldo(){
        cuentas.stream()
                .sorted(Comparator.comparing(Cuenta::getSaldo))
                .forEach(System.out::println);
    }

    public void getNumTransaccionesPorCuenta(){
        Map<String,Long> transPorCuenta = cuentas.stream()
                .collect(Collectors.groupingBy(Cuenta::getId,Collectors.counting()));

        transPorCuenta.forEach( (k,v) -> System.out.println(k + ": " + v));
    }

    public void getCuentasActivas(){
        cuentas.stream()
                .filter(c -> !c.getTransacciones().isEmpty())
                .flatMap(c -> c.getTransacciones().stream())
                .filter(t -> t.getFecha().getMonth().equals(LocalDate.now().getMonth()))
                .forEach(System.out::println);
    }

    public void getTransaccionesPorDescripcio(String palabra){
        Map<String, Set<Transaccion>> transPorDesc = cuentas.stream()
                .collect(Collectors.toMap(Cuenta::getId, c -> c.getTransacciones().stream()
                        .filter(t -> t.getDescripcion().contains(palabra))
                        .collect(Collectors.toSet())));
        transPorDesc.forEach((k,v) -> {
            System.out.println(k + " - ");
            v.stream().forEach( t -> System.out.println(t + ", "));
            System.out.println();
        });
    }

    public void showAnalisisTemporal(){
        Map<Month, List<Transaccion>> analisis = cuentas.stream()
                .flatMap(c -> c.getTransacciones().stream())
                .collect(Collectors.groupingBy(t -> t.getFecha().getMonth()));

        analisis.forEach((k,v) ->{
            System.out.print(k + " - ");
            double ingresos = v.stream()
                    .filter(t -> t.getTipo().equals(TipoTransaccion.INGRESO))
                    .mapToDouble(Transaccion::getImporte)
                    .sum();
            double gastos = v.stream()
                    .filter(t -> t.getTipo().equals(TipoTransaccion.GASTO))
                    .mapToDouble(Transaccion::getImporte)
                    .sum();

            System.out.println("ingresos: " + ingresos + ", gastos: " + gastos + "€");
        });
    }





}
