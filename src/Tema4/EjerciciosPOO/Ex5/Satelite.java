package Tema4.EjerciciosPOO.Ex5;

public class Satelite {

    private Double meridiano;
    private Double paralelo;
    private Double distancia_tierra;

    public Satelite(Double paralelo, Double meridiano, Double distancia_tierra) {
        this.paralelo = paralelo;
        this.meridiano = meridiano;
        this.distancia_tierra = distancia_tierra;
    }

    public Satelite() {
        this.paralelo = 0.0;
        this.meridiano = 0.0;
        this.distancia_tierra = 0.0;
    }

    public void setPosicion(Double m, Double p, Double d) {
        meridiano = m;
        paralelo = p;
        distancia_tierra = d;
    }

    public void printPosicion(){
        System.out.println("El satétile se encuentra en ");
        System.out.println("el paralelo " + paralelo + " meridiano " + meridiano);
        System.out.println(" a una distancia de la Tierra de " + distancia_tierra+" kms.");
    }

    public void variaAltura(Double desplazamiento) {
        if (desplazamiento > 0){
            this.distancia_tierra += desplazamiento;
        } else
            this.distancia_tierra += desplazamiento;
    }

    public Boolean enOrbita(){
        if (this.distancia_tierra > 400){
            return true;
        } else
            return false;
    }

    public void variaPosicion(Double variap, double variam){
        if (variap > 0){
            this.paralelo += variap;
        } else
            this.paralelo += variap;

        if (variam > 0){
            this.meridiano += variam;
        } else
            this.meridiano += variam;
    }


}
