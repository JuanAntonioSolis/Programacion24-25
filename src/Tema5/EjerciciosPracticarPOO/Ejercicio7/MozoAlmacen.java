package Tema5.EjerciciosPracticarPOO.Ejercicio7;

public class MozoAlmacen extends Operario{

    private Integer peligrosidad;

    public MozoAlmacen(String nombre, Integer edad, Double salario, Boolean haceHorasExtra, Integer peligrosidad) {
        super(nombre, edad, salario, haceHorasExtra);
        this.peligrosidad = peligrosidad;
    }

    public Integer getPeligrosidad() {
        return peligrosidad;
    }

    public void setPeligrosidad(Integer peligrosidad) {
        this.peligrosidad = peligrosidad;
    }

    @Override
    public String toString() {
        return "MozoAlmacen{" +
                "peligrosidad=" + peligrosidad +
                ", HaceHorasExtra=" + HaceHorasExtra +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }


}
