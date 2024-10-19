package Tema2.EjerciciosRepaso;

public class Ejercicio6 {

    public static void main(String[] args) {

        /*
        Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de la forma:
        suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número de suspensos, el número
        de suficientes, el número de bienes, etc.
         */

        int nota;
        int contSuspenso = 0;
        int contSuficiente = 0;
        int contBien = 0;
        int contNotable = 0;
        int contSobresaliente = 0;

        for (int i=1; i <= 20; i++) {
            nota = (int)(Math.random()*(10-1+1)+1);
            System.out.println(nota);
            if (nota >= 9 && nota <= 10) {
                contSobresaliente++;
            } else if (nota <9 && nota >=7) {
                contNotable++;
            } else if (nota <7 && nota>=6) {
                contBien++;
            } else if (nota <6 && nota>=5) {
                contSuficiente++;
            } else
                contSuspenso++;
        }

        System.out.println("Hay " + contSobresaliente + " sobresalientes, " + contNotable + " notables, " + contBien +
                " bienes, " + contSuficiente + " suficientes y " + contSuspenso + " suspensos.");

    }
}
