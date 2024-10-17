package Tema2.Selección;

public class EjercicioClaseEdadesSexo {
    public static void main(String[] args) {

        /* Si la edad está entre 1-11 Hola niño
        Si la edad está entre 12-18 Hola chaval
        Si la edad está entre 18-29 Hola tío
        Si la edad está entre 30-60 Hola señor
        Si la edad es mayor que 60 Hola abuelo
         */

        int edad = 54;
        char sexo = 'm';

        if (edad >=1 && edad <=11){
            if (sexo == 'h'){
                System.out.println("Hola niño");
            } else {
                System.out.println("Hola niña");
            }
        }
        else if (edad >12 && edad <=17){
            if (sexo == 'h'){
                System.out.println("Hola chaval");
            } else {
                System.out.println("Hola chavala");
            }
        }
        else if (edad >=18 && edad <=29){
            if (sexo == 'h'){
                System.out.println("Hola tio");
            } else {
                System.out.println("Hola tia");
            }
        }
        else if (edad >=30 && edad <=60){
            if (sexo == 'h'){
                System.out.println("Hola señor");
            } else {
                System.out.println("Hola señora");
            }
        }
        else if (edad >60){
            if (sexo == 'h'){
                System.out.println("Hola abuelo");
            } else {
                System.out.println("Hola abuela");
            }
        }

        /*
        if (edad >=1 && edad <=11){
            System.out.println("Hola niño");
        }
        else if (edad >12 && edad <=17){
            System.out.println("Hola chaval");
        }
        else if (edad >=18 && edad <=29){
            System.out.println("Hola tío");
        }
        else if (edad >=30 && edad <=60){
            System.out.println("Hola señor");
        }
        else if (edad >60){
            System.out.println("Hola abuelo");
        }
         */


    }
}
