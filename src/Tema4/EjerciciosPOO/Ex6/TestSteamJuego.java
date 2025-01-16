package Tema4.EjerciciosPOO.Ex6;

public class TestSteamJuego {

    public static void main(String[] args) {

        SteamJuego callofduty = new SteamJuego("Call of Duty", "FPS",40000,687,0,10);
        SteamJuego automobilista = new SteamJuego("Automobilista 2","Simulador",2000,500,30,30);
        SteamJuego fifa = new SteamJuego("Fifa 18","Futbol",45000,700,60,7);

        Integer masVentas = 100;

        if (callofduty.getPuestoMasVendidos() < masVentas){
            masVentas = callofduty.getPuestoMasVendidos();
        }
        if (automobilista.getPuestoMasVendidos() < masVentas){
            masVentas = automobilista.getPuestoMasVendidos();
        }
        if (fifa.getPuestoMasVendidos() < masVentas){
            masVentas = fifa.getPuestoMasVendidos();
        }

        System.out.println(masVentas);
    }
}
