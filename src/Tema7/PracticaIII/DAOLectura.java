package Tema7.PracticaIII;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DAOLectura {

    private Set<Lectura> lecturas;

    public DAOLectura() {
        this.lecturas = new HashSet<>();
        //this.cargarDatos();
    }

    public DAOLectura(Set<Lectura> lecturas) {
        this.lecturas = lecturas;
    }

    public Set<Lectura> getLecturas() {
        return lecturas;
    }

    public void addLectura(Lectura lectura) {
        this.lecturas.add(lectura);
    }

    public void deleteLectura(Lectura lectura) {
        this.lecturas.remove(lectura);
    }

    public void cargarDatos(){
        try {
            Files.lines(Path.of("src/Tema7/PracticaIII/lecturas.csv"))
                    .map(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));

                        Lectura lc = new Lectura(tokens.get(0),Double.valueOf(tokens.get(1)),
                                Double.valueOf(tokens.get(2)), LocalDateTime.of(tokens.get(3), LocalTime.of(Integer.valueOf(tokens.get(4)))),
                                Integer.valueOf(tokens.get(5)));
                    })
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }




}
