package Tema6.PruebaEscrita2024;

public class Pasajero extends Persona{

    private String preferenciasComida;
    private String restriccionesMedicas;
    private Asiento asiento;

    public Pasajero(Long id, String nombre, String apellidos,
                    String dniPasaporte, String email, String direccion,
                    String ciudad, String pais, String telefono,
                    String preferenciasComida, String restriccionesMedicas,
                    Asiento asiento) {
        super(id, nombre, apellidos, dniPasaporte, email, direccion, ciudad, pais, telefono);
        this.preferenciasComida = preferenciasComida;
        this.restriccionesMedicas = restriccionesMedicas;
        this.asiento = asiento;
    }

    public Pasajero(Pasajero j){
        this.id = j.id;
        this.nombre = j.nombre;
        this.apellidos = j.apellidos;
        this.dniPasaporte = j.dniPasaporte;
        this.email = j.email;
        this.direccion = j.direccion;
        this.ciudad = j.ciudad;
        this.pais = j.pais;
        this.telefono = j.telefono;
        this.preferenciasComida = j.preferenciasComida;
        this.restriccionesMedicas = j.restriccionesMedicas;
        this.asiento = j.asiento;
    }

    public String getPreferenciasComida() {
        return preferenciasComida;
    }

    public void setPreferenciasComida(String preferenciasComida) {
        this.preferenciasComida = preferenciasComida;
    }

    public String getRestriccionesMedicas() {
        return restriccionesMedicas;
    }

    public void setRestriccionesMedicas(String restriccionesMedicas) {
        this.restriccionesMedicas = restriccionesMedicas;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pasajero{");
        sb.append("preferenciasComida='").append(preferenciasComida).append('\'');
        sb.append(", restriccionesMedicas='").append(restriccionesMedicas).append('\'');
        sb.append(", asiento=").append(asiento);
        sb.append(", id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", dniPasaporte='").append(dniPasaporte).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", ciudad='").append(ciudad).append('\'');
        sb.append(", pais='").append(pais).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
