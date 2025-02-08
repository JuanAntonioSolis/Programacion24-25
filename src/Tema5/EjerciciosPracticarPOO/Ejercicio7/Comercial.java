package Tema5.EjerciciosPracticarPOO.Ejercicio7;

public class Comercial extends Empleado{

    private Double comision;

    public Comercial(String nombre, Integer edad, Double salario, Double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    public Double getComision() {
        return comision;
    }

    public void setComision(Double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return "Comercial{" +
                "comision=" + comision +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void addPlus() {
        if (this.edad > 30 && this.comision>200){
            this.salario += plus;
        }
    }
}
