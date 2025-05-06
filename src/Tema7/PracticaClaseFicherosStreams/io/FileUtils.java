package Tema7.PracticaClaseFicherosStreams.io;

import Tema7.PracticaClaseFicherosStreams.Models.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class FileUtils {

    public static Set<Material> loadMaterial(){

        List<Localizacion> locals = new ArrayList<>();
        Set<Material> materials = new HashSet<>();

        try {
            Files.lines(Path.of("scr/Tema7/PracticaClaseFicherosStreams/Models/local.csv"))
                    .forEach(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));
                        Localizacion lo = new Localizacion(
                                Long.valueOf(tokens.get(0)), tokens.get(1),tokens.get(2));
                        locals.add(lo);
                    });

            Files.lines(Path.of("scr/Tema7/PracticaClaseFicherosStreams/Models/material.csv"))
                    .forEach(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));
                        Material mat = new Material(
                                tokens.get(0),tokens.get(1),tokens.get(2), Estado.valueOf(tokens.get(3)),
                                Tipo.valueOf(tokens.get(4)), Departamento.valueOf(tokens.get(5)),
                                FileUtils.buscar(Long.valueOf(tokens.get(6)),locals));
                        materials.add(mat);
                    });

            return materials;


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static Localizacion buscar(Long id, List<Localizacion> localiz){
        return  localiz.stream()
                .filter(l -> l.getId().equals(id))
                .findFirst()
                .orElse(null);
    }


}
