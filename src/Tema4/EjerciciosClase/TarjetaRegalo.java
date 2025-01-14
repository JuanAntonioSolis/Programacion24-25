package Tema4.EjerciciosClase;

public class TarjetaRegalo {

    private String numero;
    private Double saldo;

    private static int numTarjetas=0;


    public TarjetaRegalo(Double saldo) {
        TarjetaRegalo.numTarjetas+=2;
        this.saldo = saldo;
        this.numero = TarjetaRegalo.generarCodigo();
    }

    public TarjetaRegalo() {
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TarjetaRegalo{");
        sb.append("numero='").append(numero).append('\'');
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    private static String generarCodigo() {
        int num = TarjetaRegalo.generarNumeroAleatorio(1999999,999999);
        return "TR" + TarjetaRegalo.numTarjetas + num;
    }

    private static int generarNumeroAleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    public void gasta (int cantidad) {
        this.saldo -= cantidad;
    }

    public void fusionarTarjeta(TarjetaRegalo tarjetaRegalo){
        this.saldo += tarjetaRegalo.getSaldo();
        tarjetaRegalo.setSaldo(0.0);
    }
}
