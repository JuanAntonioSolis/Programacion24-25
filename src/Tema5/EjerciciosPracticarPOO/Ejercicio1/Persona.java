package Tema5.EjerciciosPracticarPOO.Ejercicio1;

public class Persona {

        private String nombre;
        private Integer edad;
        private String dni;
        private Character sexo;
        private Double peso;
        private Double altura;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.dni = "";
        this.sexo = 'H';
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona(String nombre, Integer edad, String dni, Character sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = 0.0;
        this.altura = 0.0;
    }


    public Persona(String nombre, Integer edad, String dni, Character sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(Persona p){
        this.nombre = p.getNombre();
        this.edad = p.getEdad();
        this.dni = p.getDni();
        this.sexo = p.getSexo();
        this.peso = p.getPeso();
        this.altura = p.getAltura();
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    /**
     * Devuelve true si edad >= 18
     * Si no, devuelve false
     * @return
     */
    public Boolean esMayordeEdad(){
        return this.getEdad() >= 18;
    }

    /**
     * Metodo para calcular peso ideal de la persona
     * Devuelve 1 si el resultado es < 20 (Peso ideal)
     * Devuelve 0 si el resultado es >=20 && <=25 (Por debajo del peso ideal)
     * Devuelve -1 si el resultado es >25 (Sobrepeso)
     * @return
     */
    public Integer calcularIMC(){
        Double resultado;

        resultado = this.peso / Math.pow(this.altura,2);

        if (resultado < 20){
            return 1;
        } else if (resultado >= 20 && resultado <= 25) {
            return 0;
        } else
            return -1;
    }



}
