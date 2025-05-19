package Tema7.Examen2024.models;

public class Tecnico extends Persona{

    private Especialidad especialidad;
    private Integer valoracion;

    public Tecnico(Long id, String nombre, String apellidos, String mail, String movil, Especialidad especialidad, Integer valoracion) {
        super(id, nombre, apellidos, mail, movil);
        this.especialidad = especialidad;
        this.valoracion = valoracion;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getValoracion() {
        return valoracion;
    }

    public void setValoracion(Integer valoracion) {
        this.valoracion = valoracion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tecnico{");
        sb.append("especialidad=").append(especialidad);
        sb.append(", valoracion=").append(valoracion);
        sb.append(", id='").append(id).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", mail='").append(mail).append('\'');
        sb.append(", movil=").append(movil);
        sb.append('}');
        return sb.toString();
    }


}
