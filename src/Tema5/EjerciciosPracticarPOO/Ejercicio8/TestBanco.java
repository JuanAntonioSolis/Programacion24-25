package Tema5.EjerciciosPracticarPOO.Ejercicio8;

public class TestBanco {

    public static void main(String[] args) {

        Banco cajamar = new Banco();

        CuentaAhorro ch1 = new CuentaAhorro(800.0,6.0,0.25);
        CuentaAhorro ch2 = new CuentaAhorro(1200.90,7.5,0.25);

        CuentaJoven cj1 = new CuentaJoven(700.0,3.0);
        CuentaJoven cj2 = new CuentaJoven(13.5,4.5);

        CuentaCorriente cc1 = new CuentaCorriente(10000.0,5.0,
                new Tarjeta("tc0101",800.0),null);
        CuentaCorriente cc2 = new CuentaCorriente(8060.0,4.0,
                new Tarjeta("tc0102",50.0),new Tarjeta("tc0201",700.00));

        ch1.ingresar(75.0);
        ch1.retirar(10.0);

        ch2.ingresar(200.0);
        ch2.retirar(70.0);

        cj1.ingresar(200.0);
        cj1.retirar(20.0);

        cj2.ingresar(150.0);
        cj2.retirar(15.0);

        cc1.ingresar(1700.0);
        cc2.retirar(600.0);

        cc1.ingresar(1150.0);
        cc2.retirar(80.0);

        cajamar.addCuenta(ch1);
        cajamar.addCuenta(ch2);
        cajamar.addCuenta(cj1);
        cajamar.addCuenta(cj2);
        cajamar.addCuenta(cc1);
        cajamar.addCuenta(cc2);

        System.out.println(cc1);

        CuentaBancaria cbb = cajamar.getCuenta(cc1.getNumeroCuenta());









    }
}
