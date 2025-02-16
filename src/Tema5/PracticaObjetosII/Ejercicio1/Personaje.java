package Tema5.PracticaObjetosII.Ejercicio1;

public abstract class Personaje {

    protected String nombre;
    protected Integer nivel;
    protected Double salud;


    public Personaje(String nombre, Integer nivel, Double salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Double getSalud() {
        return salud;
    }

    public void setSalud(Double salud) {
        this.salud = salud;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", salud=" + salud +
                '}';
    }

    public void subirNivel(){
        if (this.nivel + 1 >= 10){
            this.nivel = 10;
            this.salud += (Math.pow(2.5,this.nivel));
        } else {
            this.nivel += 1;
            this.salud += (Math.pow(2.5, this.nivel));
        }

    }

    public Boolean reducirVida(int puntosD){
        this.salud -= puntosD;

        if (this.salud != 0){
            return false;
        } else if (this.salud == 0 || this.salud < 0){
            this.setSalud(0.0);
            return true;
        }

        return false;
    }

    public abstract void golpear(Personaje personaje);


}
