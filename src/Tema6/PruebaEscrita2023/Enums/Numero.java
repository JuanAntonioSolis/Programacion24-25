package Tema6.PruebaEscrita2023.Enums;

public enum Numero {

    TREINTAYCINCO(35),
    TREINTAYSEIS(36),
    TREINTAYSIETE(37),
    TREINTAYOCHO(38),
    TTREINTAYNUEVE(39),
    CUARENTA(40),
    CUARENTAYUNO(41),
    CUARENTAYDOS(42),
    CUARENTAYTRES(43),
    CUARENTAYCUATRO(44),
    CUARENTAYCINCO(45),
    CUARENTAYSEIS(46),
    CUARENTAYSIETE(47),
    CUARENTAYOCHO(48),
    CUARENTAYNUEVE(49),
    CINCUENTA(50);

    private int numero;

    private Numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }




}
