package Tema7.PracticaIII;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

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

        List<Finca> fincas = new ArrayList<>();

        try {
            Files.lines(Path.of("src/Tema7/PracticaIII/lecturas.csv"))
                    .map(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));

                        Lectura lc = new Lectura(Integer.valueOf(tokens.get(0)),Double.valueOf(tokens.get(1)),
                                Double.valueOf(tokens.get(2)), LocalDateTime.of(LocalDate.parse(tokens.get(3)),
                                LocalTime.parse(tokens.get(4))),
                                fincas.get(fincas.indexOf(new Finca(Integer.valueOf(tokens.get(5)),null,
                                        null,null,null,null,null))));

                        return lecturas.add(lc);
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void grabarDatos(){

        try {
            Files.write(Path.of("src/Tema7/PracticaIII/lecturas.csv"),
                    lecturas.stream()
                            .map(lectura -> lectura.toString())
                            .toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }






}
