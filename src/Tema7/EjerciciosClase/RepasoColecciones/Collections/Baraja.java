package Tema7.EjerciciosClase.RepasoColecciones.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Baraja {

    //Números:1(A),2,3,4,5,6,7,8,9,10,11(J),12(Q),13(K)
    //Palos: Diamantes, Corazones, Treboles, Picas
    private ArrayList<Carta> cartas;

    public Baraja() {
        this.cartas = new ArrayList<>();
        //Añadir cartas a la baraja
        for (int i = 1;i<=12;i++){
            this.cartas.add(new Carta(i,"Diamantes"));
            this.cartas.add(new Carta(i,"Corazones"));
            this.cartas.add(new Carta(i,"Treboles"));
            this.cartas.add(new Carta(i,"Picas"));
        }

        Collections.shuffle(cartas);
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Baraja{");
        sb.append("cartas=\n");
        for (Carta c : cartas){
            sb.append(pintarCarta(c));
        }
        sb.append('}');
        return sb.toString();
    }

    public static String pintarCarta(Carta c){

        StringBuffer sb = new StringBuffer();
        switch (c.getNumero()) {

            case 2,3,4,5,6,7,8,9,10:
                sb.append(c.getNumero() + " de " + c.getPalo()).append("\n");
                break;
            case 1:
                sb.append("As de " + c.getPalo()).append("\n");
                break;
            case 11:
                sb.append("Jota de " + c.getPalo()).append("\n");
                break;
            case 12:
                sb.append("Dama de " + c.getPalo()).append("\n");
                break;
            case 13:
                sb.append("Rey de " + c.getPalo()).append("\n");
                break;
        }
        return sb.toString();
    }

    public Carta sacarArriba(){
        return this.cartas.removeFirst();

    }

    public Carta sacarAbajo(){
        return this.cartas.removeLast();
    }

    public void barajar(){
        Collections.shuffle(cartas);
    }

    public void ordernarPorPalo(){
        cartas.sort(Comparator.comparing(Carta::getPalo));
    }

    public void ordernarPorNumero(){
        cartas.sort(Comparator.comparing(Carta::getNumero));
    }

}
