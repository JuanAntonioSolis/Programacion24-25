package Tema6.PracticaIV.Multimedia;

public class ClientePrime extends Cliente{

    private static final Double precio=3.0;

    public ClientePrime() {
        super();
        this.precioMensual = precio;
    }

    public ClientePrime(String dni, String nombre, String mail) {
        super(dni, nombre, mail);
        this.precioMensual = precio;
    }

    @Override
    public boolean esPro() {
        return false;
    }

    @Override
    public Double getPrecioMensual() {
        return this.precioMensual;
    }


}
