package Tema5.EjerciciosPracticarPOO.Ejercicio7;

public class Empleado {

    protected String nombre;
    protected Integer edad;
    protected Double salario;

    //Constante
    protected final Double plus=300.0;

    public Empleado(String nombre, Integer edad, Double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getPlus() {
        return plus;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", plus=" + plus +
                '}';
    }




}
