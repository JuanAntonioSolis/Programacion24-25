package Tema3.Cadenas.Practica5;

/*
Cuenta las vocales del texto "Me gusta programar en Java los sábados por la mañana".
 */

public class act7 {

    public static void main(String[] args) {

        String frase = "Me gusta programar en Java los sábados por la mañana";
        frase = frase.toLowerCase();
        int contadorVocales = 0;
        char vocal;

        for (int i = 0; i < frase.length(); i++) {
            vocal = frase.charAt(i);

            switch (vocal) {
                case 'a','e','i','o','u','á':
                    contadorVocales++;
                    break;
            }
        }

        System.out.println("La frase tiene " + contadorVocales + " vocales.");



    }
}
