package Tema7.PracticaI.GestionBiblioteca;

public class Test {

    public static void main(String[] args) {

        Biblioteca bt1 = new Biblioteca("Municipal",
                "Calle Mayor","690116691","biblio@gmail.com");

        //20 libros
        for (int i = 0; i<=20;i++){

            bt1.addLibro(new Libro("LB"+i,"Libro " + i,"Molina","Generico",2020));

        }

        //4 Usuarios registrados en la biblioteca
        bt1.addUsuario(new Usuario("54118457D","Juan","Solis","Calle Menor",
                "666888777","juan@gmail.com"));
        bt1.addUsuario(new Usuario("11111111A","UsuarioA","ApellidoA","Calle A",
                "999999999","usuarioa@gmail.com"));
        bt1.addUsuario(new Usuario("22222222B","UsuarioB","ApellidoB","Calle B",
                "888888888","usuariob@gmail.com"));
        bt1.addUsuario(new Usuario("33333333C","UsuarioC","ApellidoC","Calle C",
                "777777777","usuarioc@gmail.com"));


        bt1.prestarLibro("54118457D","LB0");
        bt1.prestarLibro("54118457D","LB1");


        bt1.listarLibrosDisponibles();






    }
}
