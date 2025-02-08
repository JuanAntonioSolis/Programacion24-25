package Tema5.EjerciciosPracticarPOO.Ejercicio7;

public class Repartidor extends Empleado{

    private String zona;

    public Repartidor(String nombre, Integer edad, Double salario, String zona) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Repartidor{" +
                "zona='" + zona + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", plus=" + plus +
                '}';
    }
}
