import java.util.Scanner;

public class NotaFinal {
    public static void main(String[] args) {

        double nota1, nota2, nota3, examenFinal, trabajoFinal, notaFinal, notaMedia;

        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe la nota del 1er examen:");
        nota1=sc.nextDouble();
        System.out.println("Escribe la nota del 2do examen:");
        nota2=sc.nextDouble();
        System.out.println("Escribe la nota del 3er examen:");
        nota3=sc.nextDouble();

        notaMedia = (nota1+nota2+nota3) / 3;

        System.out.println("La nota media de los exámenes es = " + notaMedia);

        System.out.println("Escribe la nota del Examen Final:");
        examenFinal=sc.nextDouble();
        System.out.println("Escribe la nota del Trabajo Final:");
        trabajoFinal=sc.nextDouble();

        notaFinal = ((notaMedia * 0.55) + (examenFinal * 0.3) + (trabajoFinal * 0.15));

        System.out.println("La nota final de programación es: " + notaFinal);

    }
}
