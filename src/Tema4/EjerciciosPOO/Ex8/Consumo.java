package Tema4.EjerciciosPOO.Ex8;

public class Consumo {

    Integer kms;
    Integer litros;
    Integer vmed;
    Double pgas;

    public Integer getKms() {
        return kms;
    }

    public void setKms(Integer kms) {
        this.kms = kms;
    }

    public Integer getLitros() {
        return litros;
    }

    public void setLitros(Integer litros) {
        this.litros = litros;
    }

    public Integer getVmed() {
        return vmed;
    }

    public void setVmed(Integer vmed) {
        this.vmed = vmed;
    }

    public Double getPgas() {
        return pgas;
    }

    public void setPgas(Double pgas) {
        this.pgas = pgas;
    }

    public Consumo(Integer kms, Integer litros, Integer vmed, Double pgas) {
        this.kms = kms;
        this.litros = litros;
        this.vmed = vmed;
        this.pgas = pgas;
    }

    public Double getTiempo(){
        double tiempo;

        tiempo = (double) this.kms / this.vmed;

        return tiempo;
    }

    public Double consumoMedioLitros(){
        Double cons;

        cons = (double) (this.litros / this.kms) * 100;

        return cons;
    }




}
