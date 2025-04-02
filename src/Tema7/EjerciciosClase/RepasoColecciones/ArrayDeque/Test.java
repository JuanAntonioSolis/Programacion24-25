package Tema7.EjerciciosClase.RepasoColecciones.ArrayDeque;

public class Test {

    public static void main(String[] args) {

        LogBuffer lb = new LogBuffer(10);

        for (int i = 1; i<=15;i++){
            lb.addLog("Mensaje " + i);
        }

        lb.showLogs();
    }
}
