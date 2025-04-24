package Tema7.PracticaII.BancoSmart;

import java.time.LocalDate;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Banco santander = new Banco();

        Cliente c1 = new Cliente("11111111A","Juan","juan@gmail.com","111111111",
                "Huercal","Almeria","España");
        Cliente c2 = new Cliente("22222222B","Bou","bou@gmail.com","222222222",
                "Eli avenue","London","GB");
        Cliente c3 = new Cliente("33333333C","Tris","tris@gmail.com","333333333",
                "Albert Park","Michigan","EEUU");
        Cliente c4 = new Cliente("44444444D","Josh","josh@gmail.com","444444444",
                "Marley","Bomboclat","Jamaica");
        Cliente c5 = new Cliente("55555555E","Sam","sam@gmail.com","555555555",
                "Montecastillo","Almeria","Spain");

        Cuenta ct1 = new Cuenta(c1);
        Cuenta ct2 = new Cuenta(c1);
        Cuenta ct3 = new Cuenta(c2);
        Cuenta ct4 = new Cuenta(c2);
        Cuenta ct5 = new Cuenta(c3);
        Cuenta ct6 = new Cuenta(c3);
        Cuenta ct7 = new Cuenta(c4);
        Cuenta ct8 = new Cuenta(c4);
        Cuenta ct9 = new Cuenta(c5);
        Cuenta ct10 = new Cuenta(c5);

        santander.addCuenta(ct1);
        santander.addCuenta(ct2);
        santander.addCuenta(ct3);
        santander.addCuenta(ct4);
        santander.addCuenta(ct5);
        santander.addCuenta(ct6);
        santander.addCuenta(ct7);
        santander.addCuenta(ct8);
        santander.addCuenta(ct9);
        santander.addCuenta(ct10);

        Transaccion t1 = new Transaccion(ct1,60.0, LocalDate.of(2025,3,28),
                TipoTransaccion.INGRESO,"Corte");
        Transaccion t2 = new Transaccion(ct3,500.0, LocalDate.of(2025,3,28),
                TipoTransaccion.GASTO,"PS4");
        Transaccion t3 = new Transaccion(ct2,1500.0, LocalDate.of(2025,4,1),
                TipoTransaccion.INGRESO,"Nomina");
        Transaccion t4 = new Transaccion(ct4,800.0, LocalDate.of(2025,4,1),
                TipoTransaccion.INGRESO,"NominaAbril");

        ct1.addTransaccion(t1);
        ct3.addTransaccion(t2);
        ct2.addTransaccion(t3);
        ct4.addTransaccion(t4);

        System.out.println("=====================");
        System.out.println("Transacciones de un importe mínimo");
        santander.getTransaccionesImporteMinimo(799.0);

        System.out.println("=====================");
        System.out.println("Ingresos totales");
        santander.getIngresosTotales();

        System.out.println("=====================");
        System.out.println("Gastos totales");
        santander.getGastosTotales();

        System.out.println("=====================");
        System.out.println("Cuentas ordenadas por saldo disponible");
        santander.getCuentasPorSaldo();

        System.out.println("=====================");
        System.out.println("Número de transacciones por cuenta");
        santander.getNumTransaccionesPorCuenta();

        System.out.println("=====================");
        System.out.println("Cuentas activas");
        santander.getCuentasActivas();

        System.out.println("=====================");
        System.out.println("Transacciones por descripcion");
        santander.getTransaccionesPorDescripcio("Nomina");

        System.out.println("=====================");
        System.out.println("Análisis temporal");
        santander.showAnalisisTemporal();















    }
}
