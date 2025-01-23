package Tema4.EjerciciosPOO.Ex8;

public class Consumo {

    private Double kms;
    private Double litros;
    private Double vmed;
    private Double pgas;

    public String getTiempo(){
        Double tiempo;

        tiempo = this.kms / this.vmed;

        return "Se tarda " + tiempo + " horas en hacer el recorrido.";
    }

    public Double consumoMedio(){
        Double consumoLitros;

        consumoLitros = (this.litros / this.kms) * 100;

        return consumoLitros ;
    }

    public String consumoEuros(){
        Double consumoEu;

        consumoEu = consumoMedio() / this.pgas;

       return "Hemos obtenido un consumo de media de " + consumoEu + " euros cada 100kms.";
    }

    public void setKms(Double kms) {
        this.kms = kms;
    }

    public void setLitros(Double litros) {
        this.litros = litros;
    }

    public void setVmed(Double vmed) {
        this.vmed = vmed;
    }

    public void setPgas(Double pgas) {
        this.pgas = pgas;
    }
}
