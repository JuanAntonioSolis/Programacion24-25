package Tema7.EjerciciosClase.RepasoColecciones.HashMapHashSet;

public class Test {

    public static void main(String[] args) {

        Employee e1 = new Employee(3,"Juan","juan@gmail.com", Employee.Department.VENTAS);
        Employee e2 = new Employee(2,"Antonia","anto@gmail.com", Employee.Department.DESARROLLO);
        Employee e3 = new Employee(1,"Mario","mario@gmail.com", Employee.Department.DIRECCION);

        Project p1 = new Project("Project1");

        p1.addTeamMember(e1);
        p1.addTeamMember(e2);
        p1.addTeamMember(e3);

        p1.assignTask(e1,new Task("Task1-e1"));
        p1.assignTask(e1,new Task("Task2-e1"));

        p1.assignTask(e2, new Task("Task1-e2"));

        p1.showInfoProject();


    }
}
