package Tema5.EjerciciosPracticarPOO.Ejercicio7;

public class Repartidor extends Operario{

    private String zona;

    public Repartidor(String nombre, Integer edad, Double salario, Boolean haceHorasExtra, String zona) {
        super(nombre, edad, salario, haceHorasExtra);
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
                '}';
    }

    @Override
    public void addPlus() {
        if (this.edad < 25 && this.zona.equalsIgnoreCase("Zona3")){
            this.salario += plus;
        }

        if (getHaceHorasExtra()){
            this.salario += plus * 2;
        }
    }




}
