package Tema7.EjerciciosClase.RepasoColecciones.HashMapHashSet;

import Tema5.EjerciciosPracticarPOO.Ejercicio7.Empleado;

import java.util.*;

public class Project {

    private UUID id;
    private String name;
    private Set<Employee> members;
    private Map<Employee,Set<Task>> tasks;

    public Project(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.members = new HashSet<>(5);
        this.tasks = new HashMap<>(5);
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Employee> getMembers() {
        return members;
    }

    public Map<Employee, Set<Task>> getTasks() {
        return tasks;
    }

    /**
     * Añadimos el empleado a los miembros de proyecto y creamos su lista de tareas vacía
     * Si el empleado ya estaba en el proyecto no hacemos nada
     * @param e
     */
    public boolean addTeamMember(Employee e){

        if (!this.members.contains(e)){
            this.members.add(e);
            this.tasks.put(e,new HashSet<>());
            return true;
        } else
            return false;

    }


    /**
     * Si el empleado no está en el proyecto, return false
     * Si el empleado está en el pryecto, obtenemos su lista de tareas y le añadimos la nueva
     * Return True ^
     * @param e
     * @param t
     * @return
     */
    public boolean assignTask(Employee e, Task t){
        //Primero comprobar que el empleado esté
        if (!members.contains(e)){
            return false;
        } else{
            //Sacar el set de tareas, y añadirle la tarea
            tasks.get(e).add(t);
            return true;
        }
    }


    /**
     * Mostrar para cada empleado las tareas que tiene asignadas en el proyecto
     */
    public void showInfoProject(){

        for (Employee e : members){
            System.out.println(e);
            System.out.println("----------------");
            for (Task t : tasks.get(e)){
                System.out.println(t);
            }
            System.out.println("#################");
        }

    }






}
