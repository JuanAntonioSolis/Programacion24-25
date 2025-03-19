package Tema7.Listas.EjemplosColaPila;

import java.util.LinkedList;

public class Pila <E>{

    LinkedList<E> elementos;

    public Pila() {
        this.elementos = new LinkedList<>();
    }

    /**
     * Inserta al principio de la pila
     * (Meter una patata en el bote de pringles)
     * @param elemento
     */
    public void insertar(E elemento){

        this.elementos.push(elemento);
    }

    /**
     * Muestra y saca el primer elemento de la pila
     * (Saca la primera patata que ves en el bote)
     * @return
     */
    public E sacarElemento (){
        return this.elementos.pop();
    }

    /**
     * Muestra el primer elemento de la pila
     * (Muestra la primera patata del bote)
     * @return
     */
    public E mostrarElemento() {
        return this.elementos.peek();
    }


}
