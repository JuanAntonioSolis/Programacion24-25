package Tema7.EjerciciosClase.RobotsClsGenericas;

public class RobotLucha extends Robot {

    private Integer fuerza;


    public RobotLucha(String nombre, Integer energia, Integer fuerza) {
        super(nombre, energia);
        this.fuerza = fuerza;
    }

    public Integer getFuerza() {
        return fuerza;
    }

    public void setFuerza(Integer fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RobotLucha{");
        sb.append("fuerza=").append(fuerza);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", energia=").append(energia);
        sb.append('}');
        return sb.toString();
    }
}
