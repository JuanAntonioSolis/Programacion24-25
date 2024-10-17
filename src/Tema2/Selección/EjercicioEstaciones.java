package Tema2.Selección;

import java.util.Scanner;

public class EjercicioEstaciones {
    public static void main(String[] args) {

        int dia, mes;
        int estación;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el día");
        dia = sc.nextInt();
        System.out.println("Introduce el mes");
        mes = sc.nextInt();

        if ((dia > 22 && dia < 31 && mes == 12) || (mes < 3) || (mes == 3 && dia <=19)){
            System.out.println("La estación es Invierno");
        } else if ((dia > 20 && dia < 31 && mes == 3) || (mes < 6) || (mes == 6 && dia <=19)) {
            System.out.println("La estación es Primavera");
        } else if ((dia > 20 && dia < 31 && mes == 6) || (mes < 9) || (mes == 9 && dia <=21)) {
            System.out.println("La estación es Verano");
        } else
            System.out.println("La estación es Otoño");

    }
}
