package Tema6.PracticaIV.Multimedia;

public abstract class Cliente {

    protected String dni;
    protected String nombre;
    protected String mail;
    protected Double precioMensual;

    public Cliente() {
    }

    public Cliente(String dni, String nombre, String mail) {
        this.dni = dni;
        this.nombre = nombre;
        this.mail = mail;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Double getPrecioMensual() {
        return precioMensual;
    }

    public void setPrecioMensual(Double precioMensual) {
        this.precioMensual = precioMensual;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cliente{");
        sb.append("dni='").append(dni).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", mail='").append(mail).append('\'');
        sb.append(", precioMensual=").append(precioMensual);
        sb.append('}');
        return sb.toString();
    }



}
