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

    /**
     * Se le suma el Plus si:
     * Peligrosidad3 o Peligrosidad2 Y Edad > 30 o Peligrosidad 1 Y Edad < 30
     * Y si hace horas extra recible el plus x2
     *
     */
    @Override
    public void addPlus() {
        if (this.peligrosidad == 3 || (this.peligrosidad == 2 && this.edad > 30) ||
                (this.peligrosidad == 1 && this.edad <30)) {
            this.salario += plus;
            if (getHaceHorasExtra()){
                this.salario += plus;
            }
        }
    }
}
