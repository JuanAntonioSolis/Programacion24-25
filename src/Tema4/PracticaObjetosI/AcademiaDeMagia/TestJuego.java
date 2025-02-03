package Tema4.PracticaObjetosI.AcademiaDeMagia;

public class TestJuego {

    public static void main(String[] args) {

        Mago juan = new Mago("Wizard",100);

        Hechizo bolaF = new Hechizo("Bola de fuego",20,7);
        Hechizo escudoM = new Hechizo("Escudo magico",15,5);
        Hechizo rayoE = new Hechizo("Rayo electrico",25,9);

        Prueba romperM = new Prueba("Romper muro",5,10);
        Prueba derrotarO = new Prueba("Derrotar orco", 8,15);
        Prueba derrotarE = new Prueba("Derrotar elfo oscuro", 10,20);

        System.out.println(juan);

        juan.lanzarHechizo("escudo magico",romperM);


    }
}
