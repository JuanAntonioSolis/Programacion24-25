package Tema5.EjerciciosPracticarPOO.Ejercicio7;

public class Operario extends Empleado{

    protected Boolean HaceHorasExtra;

    public Operario(String nombre, Integer edad, Double salario, Boolean haceHorasExtra) {
        super(nombre, edad, salario);
        HaceHorasExtra = haceHorasExtra;
    }

    public Boolean getHaceHorasExtra() {
        return HaceHorasExtra;
    }

    public void setHaceHorasExtra(Boolean haceHorasExtra) {
        HaceHorasExtra = haceHorasExtra;
    }

    @Override
    public String toString() {
        return "Operario{" +
                "HaceHorasExtra=" + HaceHorasExtra +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }




}
