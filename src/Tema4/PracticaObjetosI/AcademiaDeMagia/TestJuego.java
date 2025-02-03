package Tema4.PracticaObjetosI.AcademiaDeMagia;

public class TestJuego {

    public static void main(String[] args) {

        Mago wiz = new Mago("Wizard",100);

        //Hechizos
        Hechizo bolaF = new Hechizo("Bola de fuego",20,7);
        Hechizo escudoM = new Hechizo("Escudo magico",15,5);
        Hechizo rayoE = new Hechizo("Rayo electrico",25,11);

        //Aprendiendo los hechizos(guardandolos en la lista de hechizos del mago
        wiz.aprenderHechizo(bolaF);
        wiz.aprenderHechizo(escudoM);
        wiz.aprenderHechizo(rayoE);

        //Pruebas
        Prueba T1 = new Prueba("Romper muro",5,10);
        Prueba T2 = new Prueba("Derrotar orco", 8,15);
        Prueba T3 = new Prueba("Derrotar elfo oscuro", 10,20);

        //El mago empieza con 100 de energía
        System.out.println(wiz);

        //Primera prueba, de 5 de dificultad, 10 de recompensa
        wiz.lanzarHechizo("rayo electrico", T1);

        //Si el hechizo es efectivo contra la prueba, el mago ni pierde energia, ni suma porque tiene 100 max
        System.out.println(wiz);

        //Segunda prueba, de 8 de dificultad, 15 de recompensa
        wiz.lanzarHechizo("bola de fuego",T2);

        //El hechizo no es efectivo, pierde la energía de recompensa de la prueba, 15 en este caso.
        System.out.println(wiz);

        //Segunda prueba, con otro hechizo
        wiz.lanzarHechizo("escudo magico",T2);

        //Vuelve a no superarlo y pierde 15 de energia de nuevo
        System.out.println(wiz);

        //Segunda prueba, con otro hechizo
        wiz.lanzarHechizo("rayo electrico", T2);

        //Supera la prueba y recupera 15 de energía porque se le puede sumar
        System.out.println(wiz);

        //Tercera prueba 10 de dificultad, 20 de recompensa
        wiz.lanzarHechizo("rayo electrico", T3);

        //Supera la prueba y se queda en 100 de energia porque es el max
        System.out.println(wiz);



    }
}
