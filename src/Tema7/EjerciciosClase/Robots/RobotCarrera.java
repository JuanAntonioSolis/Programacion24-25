package Tema7.EjerciciosClase.Robots;

public class RobotCarrera extends Robot{

    private Integer velocidad;

    public RobotCarrera(String nombre, Integer energia, Integer velocidad) {
        super(nombre, energia);
        this.velocidad = velocidad;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RobotCarrera{");
        sb.append("velocidad=").append(velocidad);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", energia=").append(energia);
        sb.append('}');
        return sb.toString();
    }
}
