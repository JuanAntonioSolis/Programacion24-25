package Tema5.EjerciciosPracticarPOO.Ejercicio2;

public class Password {

    private Integer longitud;
    private String contraseña;

    public Password() {
        this.contraseña = "this";
        this.longitud = 8;
    }

    public Password(Integer longitud) {
        this.longitud = longitud;
        this.contraseña = "this";
    }

    public Integer getLongitud() {
        return longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    //Constructor copia
    public Password(Password contra) {
        this.longitud = contra.longitud;
        this.contraseña = contra.contraseña;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Password{");
        sb.append("longitud=").append(longitud);
        sb.append(", contraseña='").append(contraseña).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
        this.contraseña = "";
    }

    /**
     * Generar contraseña con la longitud igual a la propiedad
     * Generar aleatoriamente cada caracter: Mayus, minus, número o símbolo
     *
     * @return
     */
    private String generarPassword(){

        StringBuffer pass = new StringBuffer(this.longitud);

        //Decidimos aleatoriamente si es mayuscula, minuscula, numero o simbolo


        Integer tipo = Password.aleatorio(1,4);
        switch (tipo){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;

        }





        return "";
    }

    private static int aleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }


}
