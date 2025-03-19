package Tema7.Listas.EjemplosColaPila;

public class Test {

    public static void main(String[] args) {

        Pila<Proceso> procesos = new Pila<>();

        procesos.insertar(new Proceso(12, "htop", "/usr/bin/htop", 3));
        procesos.insertar(new Proceso(13, "firefox", "/usr/local/firefox/bin/firefox", 2));
        procesos.insertar(new Proceso(14, "intellij", "/usr/local/intellij/bin/ij", 3));

        System.out.println(procesos.mostrarElemento());
    }




}
