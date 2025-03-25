package Tema7.EjerciciosClase.MiniRela.Ej1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Diccionario {

    private TreeSet<Entrada> dictionary;

    public Diccionario() {
        dictionary = new TreeSet<>(Comparator.comparing(Entrada::getPalabra));
    }

    public TreeSet<Entrada> getDictionary() {
        return dictionary;
    }

    public void setDictionary(TreeSet<Entrada> dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Diccionario{");
        sb.append("dictionary=").append(dictionary);
        sb.append('}');
        return sb.toString();
    }

    public void addEntrada(Entrada e){
        this.dictionary.add(e);
    }

    public void removeEntrada(Entrada e){
        this.dictionary.remove(e);
    }

    public String listarPalabras(){
        ArrayList<Entrada> orden = new ArrayList<>(this.dictionary);
        orden.sort(Comparator.comparing(Entrada::getPalabra));
        StringBuffer sb = new StringBuffer();
        for (Entrada en : dictionary){
            sb.append(en.getPalabra());
            sb.append("\n");
        }
        return sb.toString();
    }

    public String buscarEntrada(String palabra){
        for (Entrada en:dictionary){
            if (en.getPalabra().equals(palabra)){
                return en.getTraduccion();
            }
        }
        return null;
    }
}
