package Tema5.EjerciciosPracticarPOO.Ejercicio1;

import java.util.Scanner;

public class TestPersona {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        String id;
        char gender;
        double weight;
        double  height;

        System.out.println("Introduce tu nombre:");
        name = sc.nextLine();
        System.out.println("Introduce tu edad:");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce tu DNI:");
        id = sc.nextLine();
        System.out.println("Introduce tu sexo:");
        gender = sc.nextLine().charAt(0);
        System.out.println("Introduce tu peso:");
        weight = Double.parseDouble(sc.nextLine());
        System.out.println("Introduce tu altura:");
        height = Double.parseDouble(sc.nextLine());

        Persona p1 = new Persona(name,age,id,gender,weight,height);

        if (p1.esMayordeEdad()){
            System.out.println("Es mayor de edad");
        } else
            System.out.println("No es mayor de edad");


        if (p1.calcularIMC() == 1){
            System.out.println("Estás en tu peso ideal");
        } else if (p1.calcularIMC() == 0){
            System.out.println("Estás por debajo de tu peso ideal");
        } else
            System.out.println("Tienes sobrepeso");

    }
}
