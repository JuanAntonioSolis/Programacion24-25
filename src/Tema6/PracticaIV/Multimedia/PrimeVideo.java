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


    /**
     * Metodo que añade clientes a la lista de suscriptores
     * Primero comprueba que el cliente no esté en la lista
     * @param cte
     */
    public void addSuscriptor(Cliente cte){

        for (Cliente suscrip : suscriptores){
            if (!suscrip.getDni().equals(cte.getDni())){
                this.suscriptores.add(suscrip);
                break;
            }
        }

    }

    /**
     * Metdodo que añade multimedia a la lista de catálogo
     * Primero se comprueba que la multimedia no esté ya en la lista
     * @param multi
     */
    public void addMultimedia(Multimedia multi){
        for (Multimedia m : catalogo){
            if (!m.getCodigo().equals(multi.getCodigo())){
                this.catalogo.add(multi);
                break;
            }
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
        return ganancias;
    }
}
