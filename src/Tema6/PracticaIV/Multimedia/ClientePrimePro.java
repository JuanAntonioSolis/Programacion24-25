package Tema6.PracticaIV.Multimedia;

public class ClientePrimePro extends Cliente{

    private static final Double precio = 5.0;

    public ClientePrimePro() {
        this.precioMensual=precio;
    }

    public ClientePrimePro(String dni, String nombre, String mail) {
        super(dni, nombre, mail);
        this.precioMensual = precio;
    }

    @Override
    public boolean esPro() {
        return true;
    }

    @Override
    public Double getPrecioMensual() {
        return this.precioMensual;
    }
}
