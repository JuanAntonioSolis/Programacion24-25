package Tema7.EjerciciosClase.RepasoColecciones.ArrayDeque;

import java.util.ArrayDeque;
import java.util.LinkedList;

/**
 * Vamos guardandno mensajes de log en el buffer
 * Cunando superamos la capacidad, borramos el primer log que se insertó
 * Así siempore tenemos un buffer del tamaño elegido con los últimos logs
 */
public class LogBuffer {

    private ArrayDeque<String> log;
    private Integer capacity;

    public LogBuffer(Integer capacity) {
        this.capacity = capacity;
        this.log = new ArrayDeque<>(capacity);
    }

    public Integer getCapacity(){
        return this.capacity;
    }

    public Integer getLogSize(){
        return this.log.size();
    }

    /**
     * Si el tamaño actual es menor que la capacidad, se añade el log
     * Si el tamaño es igual que la capacidad, se borra el log más antiguo y se añade el nuevo
     *
     * @param str
     */
    public void addLog(String str){
        if (this.capacity > this.log.size()){
            this.log.add(str);
        } else {
            this.log.removeFirst();
            this.log.add(str);
        }
    }

    public void showLogs(){
        for (String l : this.log){
            System.out.println(l);
        }
    }
}
