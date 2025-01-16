package Tema4.EjerciciosPOO.Ex4;

public class Finanzas {

    private Double cambioDolarEuro;

    public Finanzas() {
        this.cambioDolarEuro = 1.36;
    }

    public Finanzas(Double cambioDolarEuro) {
        this.cambioDolarEuro = cambioDolarEuro;
    }

    public double getCambioDolarEuro() {
        return cambioDolarEuro;
    }

    public void setCambioDolarEuro(double cambioDolarEuro) {
        this.cambioDolarEuro = cambioDolarEuro;
    }

    public double dolaresAEuros(Double dolar){
        return dolar * this.cambioDolarEuro;
    }

    public double eurosADolares(Double euro){
        return euro / this.cambioDolarEuro;
    }


}
