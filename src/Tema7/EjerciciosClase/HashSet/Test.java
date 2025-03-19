package Tema7.EjerciciosClase.HashSet;

public class Test {

    public static void main(String[] args) {

        Aula a1 = new Aula("AulaInformatica","Arriba");
        AulaNueva a2 = new AulaNueva("AulaTecnologia","Abajo");

        a2.addAlumno(new Alumno("54118457D","Pepe","Perez","pep@gmail.com",15,"Madrid"));
        a2.addAlumno(new Alumno("11111111A","Pedro","Mulero","mulero@gmail.com",30,"Almeria"));
        a2.addAlumno(new Alumno("22222222F","Mario","Soler","soler@gmail.com",25,"Murcia"));
        a2.addAlumno(new Alumno("33333333R","Pepa","Luz","luz@gmail.com",16,"Madrid"));
        a2.addAlumno(new Alumno("44444444T","Jesus","Villegas","villegas@gmail.com",51,"Granada"));;

        a1.addAlumno(new Alumno("54118457D","Pepe","Perez","pep@gmail.com",15,"Madrid"));
        a1.addAlumno(new Alumno("11111111A","Pedro","Mulero","mulero@gmail.com",30,"Almeria"));
        a1.addAlumno(new Alumno("22222222F","Mario","Soler","soler@gmail.com",25,"Murcia"));
        a1.addAlumno(new Alumno("33333333R","Pepa","Luz","luz@gmail.com",16,"Madrid"));
        a1.addAlumno(new Alumno("44444444T","Jesus","Villegas","villegas@gmail.com",51,"Granada"));


        System.out.println(a1.getNombre());
        a1.listarAlumnos();
        System.out.println(a2.getNombre());
        a2.listarAlumnos();

        a1.addAlumno(new Alumno("54118457D","Pepe","Perez","pep@gmail.com",15,"Madrid"));
        a2.addAlumno(new Alumno("54118457D","Pepe","Perez","pep@gmail.com",15,"Madrid"));


        System.out.println(a1.getNombre() + "con repetidos");
        a1.listarAlumnos();
        System.out.println(a2.getNombre() + "con repetidos");
        a2.listarAlumnos();



    }
}
