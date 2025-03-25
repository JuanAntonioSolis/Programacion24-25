package Tema7.EjerciciosClase.MiniRela.Ej1;

public class Test {

    public static void main(String[] args) {

        Diccionario rae = new Diccionario();

        rae.addEntrada(new Entrada("Uno","One"));
        rae.addEntrada( new Entrada("Dos","Two"));
        rae.addEntrada(new Entrada("Tres","Three"));
        rae.addEntrada(new Entrada("Cuatro","Four"));
        rae.addEntrada(new Entrada("Cinco","Five"));
        rae.addEntrada(new Entrada("Seis","Six"));
        rae.addEntrada(new Entrada("Siete","Seven"));
        rae.addEntrada(new Entrada("Ocho","Eight"));
        rae.addEntrada(new Entrada("Nueve","Nine"));
        rae.addEntrada(new Entrada("Diez","Ten"));
        rae.addEntrada(new Entrada("Once","Eleven"));
        rae.addEntrada(new Entrada("Doce","Twelve"));
        rae.addEntrada(new Entrada("Trece","Thirteen"));
        rae.addEntrada(new Entrada("Catorce","Fourteen"));
        rae.addEntrada(new Entrada("Quince","Fifteen"));
        rae.addEntrada(new Entrada("Dieciseis","Sixteen"));
        rae.addEntrada(new Entrada("Diecisiete","Seventeen"));
        rae.addEntrada(new Entrada("Dieciocho","Eighteen"));
        rae.addEntrada(new Entrada("Diecinueve","Nineteen"));
        rae.addEntrada(new Entrada("Veinte","Twenty"));
        rae.addEntrada(new Entrada("Veintiuno","Twenty One"));
        rae.addEntrada(new Entrada("Veintidos","Twenty two"));
        rae.addEntrada(new Entrada("Veintitres","Twenty three"));
        rae.addEntrada(new Entrada("Veinticuatro","Twenty four"));
        rae.addEntrada(new Entrada("Veinticinco","Twenty five"));
        rae.addEntrada(new Entrada("Veintiseis","Twenty six"));
        rae.addEntrada(new Entrada("Veintisiete","Twenty seven "));
        rae.addEntrada(new Entrada("Veintiocho","Twenty eight"));
        rae.addEntrada(new Entrada("Veintinueve","Twenty nine"));
        rae.addEntrada(new Entrada("Treinta","Thirty"));
        rae.addEntrada(new Entrada("Treinta y uno","Thirty one"));
        rae.addEntrada(new Entrada("Treinta y dos","Thirty two"));
        rae.addEntrada(new Entrada("Treinta y tres","Thirty three"));
        rae.addEntrada(new Entrada("Treinta y cuatro","Thirty four"));
        rae.addEntrada(new Entrada("Treinta y cinco","Thirty five"));
        rae.addEntrada(new Entrada("Treinta y seis","Thirty six"));
        rae.addEntrada(new Entrada("Treinta y siete","Thirty seven"));
        rae.addEntrada(new Entrada("Treinta y ocho","Thirty eight"));
        rae.addEntrada(new Entrada("Treinta y nueve","Thirty nine"));
        rae.addEntrada(new Entrada("Cuarenta","Forty"));
        rae.addEntrada( new Entrada("Cuarenta y uno","Forty one"));
        rae.addEntrada(new Entrada("Cuarenta y dos","Forty two"));
        rae.addEntrada(new Entrada("Cuarenta y tres","Forty three"));
        rae.addEntrada(new Entrada("Cuarenta y cuatro","Forty four"));
        rae.addEntrada(new Entrada("Cuarenta y cinco","Forty five"));
        rae.addEntrada(new Entrada("Cuarenta y seis","Forty six"));
        rae.addEntrada(new Entrada("Cuarenta y siete","Forty seven"));
        rae.addEntrada(new Entrada("Cuarenta y ocho","Forty eight"));
        rae.addEntrada(new Entrada("Cuarenta y nueve","Forty nine"));
        rae.addEntrada(new Entrada("Cincuenta","Fifty"));

        System.out.println(rae.listarPalabras());

        System.out.println(rae.buscarEntrada("Cuarenta"));



    }
}
