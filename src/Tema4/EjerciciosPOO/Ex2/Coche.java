package Tema4.EjerciciosPOO.Ex2;

public class Coche {

    private int velocidad;

    Coche() {velocidad = 0;}

    public int getVelocidad() {
        return velocidad;
    }

    public void acelera(int mas){
        this.velocidad += mas;
    }

    public void frena(int menos){
        this.velocidad -= menos;
    }
}
