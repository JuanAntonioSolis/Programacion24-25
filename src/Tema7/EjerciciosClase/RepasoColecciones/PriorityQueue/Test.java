package Tema7.EjerciciosClase.RepasoColecciones.PriorityQueue;

public class Test {

    public static void main(String[] args) {

        PendingTasks pt = new PendingTasks();

        pt.addTask(new Task(3,"Ver la tele"));
        pt.addTask(new Task(2,"Hacer la compra"));
        pt.addTask(new Task(3,"Tomar un cafe fuera"));
        pt.addTask(new Task(4,"Quedar con los amigos"));
        pt.addTask(new Task(1, "Estudiar prog"));


        System.out.println(pt.viewHPriorityTask());

        System.out.println("Pinta tareas:");
        pt.showPendingTastks();



        System.out.println("Elimina tareas");
        while (true){
            Task t = pt.pollHigherPriorityTask();
            if (t==null){
                break;
            }
            System.out.println(t);
        }


    }
}
