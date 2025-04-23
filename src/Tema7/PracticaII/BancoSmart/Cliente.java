package Tema7.PracticaII.BancoSmart;

public class Cliente {

    private String dni;
    private String nombre;
    private String mail;
    private String telefono;
    private String direccion;
    private String ciudad;
    private String pais;

    public Cliente(String dni, String nombre, String mail, String telefono, String direccion, String ciudad, String pais) {
        this.dni = dni;
        this.nombre = nombre;
        this.mail = mail;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("DNI: {").append(this.dni);
        sb.append("| Nombre: {").append(this.nombre);
        sb.append("} | {").append(this.mail);
        sb.append("} - {").append(this.telefono).append("}");
        return sb.toString();
    }
}
