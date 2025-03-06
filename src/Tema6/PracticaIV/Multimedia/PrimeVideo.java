package Tema6.PracticaIV.Multimedia;

import java.util.ArrayList;

public class PrimeVideo {

    private ArrayList<Multimedia> catalogo;
    private ArrayList<Cliente> suscriptores;
    private Double ganancias;

    public PrimeVideo() {
        this.catalogo = new ArrayList<>();
        this.suscriptores = new ArrayList<>();
        this.ganancias = 0.0;
    }

    public ArrayList<Multimedia> getCatalogo() {
        return catalogo;
    }

    public ArrayList<Cliente> getSuscriptores() {
        return suscriptores;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PrimeVideo{");
        sb.append("catalogo=").append(catalogo);
        sb.append(", suscriptores=").append(suscriptores);
        sb.append(", ganancias=").append(ganancias);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Metodo que añade clientes a la lista de suscriptores
     * Primero comprueba que el cliente no esté en la lista
     * @param cte
     */
    public void addSuscriptor(Cliente cte){

        if (!this.suscriptores.contains(cte)){
            this.suscriptores.add(cte);
        }
    }

    /**
     * Metdodo que añade multimedia a la lista de catálogo
     * Primero se comprueba que la multimedia no esté ya en la lista
     * @param multi
     */
    public void addMultimedia(Multimedia multi){

        if (!this.catalogo.contains(multi)){
            this.catalogo.add(multi);
        }
    }


    /**
     * Metodo que hace un cliente ver una serie.
     * En caso de que no sea pro, se añade el precio de la multimedia a las ganancias
     * @param m
     * @param c
     */
    public void ver(Multimedia m, Cliente c){
        if (m.getPlus()){
            if (!c.esPro()){
                this.ganancias+=m.getPrecio();
            }
        }
    }

    public Double getGanancias() {

        for (Cliente c : suscriptores){
            this.ganancias += c.getPrecioMensual()*12;
        }

        return this.ganancias;

    }
}
