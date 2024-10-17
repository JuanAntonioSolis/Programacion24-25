public class Ejercicio6 {
    public static void main(String[] args) {

        //¿Qué muestra por pantalla el siguiente código?:
        //public class Ejercicio5 {
        //public static void main(String[] args)
        //{
        // System.out.println("Hola usuario."+" Bienvenido.");
        // String dia = "Lunes";
        // System.out.println("Hoy es " + dia);
        // int hora = 12;
        // System.out.println("Son las " + hora + " en punto.");
        // System.out.println("Dentro de 2 horas serán las " + hora + 2 + " en punto");
        // System.out.println("Dentro de 2 horas serán las " + (hora + 2) + " en punto");
        //}
        //}

        //Este programa muestra:
        //Hola usuario. Bienvenido.
        //Hoy es lunes //( lunes, el valor dado en la variable string)
        //Son las 12 en punto //12, el valor dado en la variable int)
        //Dentro de 2 horas serán las 14 en punto //Muestra la suma de la variable hora(12) + 2
        //Dentro de 2 horas serán las 14 en punto //Vuelve a mostrar la misma suma, solo que se representa en el
        //código entre paréntesis, el programa lo lee de la misma manera que anteriormente.

        int hora =12;
        System.out.println("Dentro de 2 horas serán las " + (hora + 2)) ;
    }
}
