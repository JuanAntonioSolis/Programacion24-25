package Tema7.EjerciciosClase.RepasoColecciones.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PendingTasks {

    private PriorityQueue<Task> tasks;

    public PendingTasks() {
        this.tasks = new PriorityQueue<>(Comparator.comparing(Task::getPriority));
    }


    public PriorityQueue<Task> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PendingTasks{");
        sb.append("tasks=").append(tasks);
        sb.append('}');
        return sb.toString();
    }

    public Boolean addTask(Task t){
        return tasks.offer(t);
    }

    public Task viewHPriorityTask(){
        return tasks.peek();
    }

    public Task pollHigherPriorityTask(){
        return tasks.poll();
    }

    public void showPendingTastks(){
        for (Task tk : this.tasks){
            //No las muestra ordenadas por prioridad
            System.out.println(tk);
        }
    }






}
