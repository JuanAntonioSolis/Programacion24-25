package Tema5.Ejercicio1ArrayList;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Expediente {

    enum Modalidad {FPB, GRADOMEDIO, GRADOSUPERIOR}

    private static Integer numExpedientes = 0;

    private final Integer id = Expediente.numExpedientes + 10000;
    private String nombre;
    private String apellidos;
    private Character sexo;
    private LocalDate fechaNacimiento;
    private Modalidad modalidad;
    private Integer curso;
    private List<NotasCurso> calificaciones;

    public Expediente(String nombre, String apellidos, Character sexo, LocalDate fechaNacimiento, Modalidad modalidad, Integer curso) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.modalidad = modalidad;
        this.curso = curso;
        this.calificaciones = new ArrayList<>();
        Expediente.numExpedientes++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }

    public Integer getCurso() {
        return curso;
    }

    public void setCurso(Integer curso) {
        this.curso = curso;
    }

    public Integer getId() {
        return id;
    }

    public List<NotasCurso> getCalificaciones() {
        return calificaciones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expediente that = (Expediente) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Expediente{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", sexo=").append(sexo);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", modalidad=").append(modalidad);
        sb.append(", curso=").append(curso);
        sb.append(", calificaciones=").append(calificaciones);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Para añadir una nota a la lista de calificaciones
     * @param nc
     */
    public void addNota(NotasCurso nc){
        this.calificaciones.add(nc);
    }

    /**
     * Añade varias calificaciones (NotasCurso) a las calificaciones de un expediente
     * @param notas
     */
    public void addNotas(List<NotasCurso> notas){
        this.calificaciones.addAll(notas);
    }

    /**
     * Metodo para ver si el alumno titula
     * Si es de FPB puede tener 2 suspensos
     * Sino tiene que tener todo aprobado para titular
     * Devuelve un boolean indicando si titula o no
     * @return
     */
    public Boolean titula(){
        Integer suspensos = this.getSuspensos();

        //Si FPB puede tener 2 suspensos
        if (this.modalidad.equals(Modalidad.FPB)){
            if (suspensos > 2){
                return false;
            } else
                return true;
        } else{
            //Si no FPB no puede tener ningún suspenso
            if (suspensos == 0){
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * Saca directamente los suspensos
     * @return
     */
    private Integer getSuspensos(){
        Integer suspensos = 0;

        //Recorro las calificaciones y para cada una veo la nota final si >= 5
        for (NotasCurso nc : this.calificaciones){
            if (nc.getNotaFinal() < 5 ){
                suspensos++;
            }
        }
        return suspensos;
    }

    /**
     * Suma la notafinal de cada nc de las calificaciones
     * y lo divide entre el total de calificaciones
     * @return
     */
    public Double getMediaExpediente(){
        Double media=0.0;
        for (NotasCurso nc : this.calificaciones){
            media += nc.getNotaFinal();
        }

        return media / this.calificaciones.size();
    }

    /**
     * Devuelve los años transcurridos entre la fecha de nacimiento y la fecha actual
     * Para fechas siempre utilizaremos LocalDate**
     * @return
     */
    public Integer getEdad(){
        LocalDate fechaActual = LocalDate.now();//Saca la fecha actual
        //Periodo de tiempo entre la fecha de nacimiento y la fecha actual
        Period periodo = Period.between(this.fechaNacimiento,fechaActual);

        return periodo.getYears();//Solo devuelve los años que han pasado
    }

    /**
     * Si la edad es >= 18 devuelve true
     * Sino devuelve false
     * @return
     */
    public Boolean mayorEdad(){
        return this.getEdad() >= 18 ? true : false;//Operador ternario**
    }



}
