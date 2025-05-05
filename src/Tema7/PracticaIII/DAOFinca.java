package Tema7.PracticaIII;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DAOFinca {

    private ArrayList<Finca> fincas;

    public DAOFinca() {
        fincas = new ArrayList<>();
        //this.cargarDatos();
    }

    public ArrayList<Finca> getFincas() {
        return fincas;
    }

    public void addFinca(Finca finca) {
        fincas.add(finca);
    }

    public void deleteFinca(Finca finca) {
        fincas.remove(finca);
    }

    /**
     * Metodo que busca finca por id
     * @param id Id de la finca que se busca
     * @return Devuelve la finca que se buscaba
     */
    public Finca findById(int id) {
        return fincas.stream()
                .filter(f -> f.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    /**
     * Metodo que busca finca por nombre
     * @param name Nombre de la finca que se busca
     * @return Devuelve la finca que se buscaba
     */
    public Finca findByName(String name) {
        return fincas.stream().
                filter(f -> f.getNombre().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }


    /**
     * Metodo que lee el fichero creado, y crea objetos Finca con los datos del fichero
     * Y además, añade estos objetos en el array de fincas
     */
    public void cargarDatos(){

        try {
            List<Finca> huertos = Files.lines(Paths.get("scr/Tema7/PracticaIII/fichero.csv"))
                    .map(line -> {
                        List<String> tokens = Arrays.asList(line.split(","));

                        return new Finca(Integer.parseInt(tokens.get(0)), tokens.get(1),Double.parseDouble(tokens.get(2)),
                                Integer.parseInt(tokens.get(3)),Double.parseDouble(tokens.get(4)), tokens.get(5),tokens.get(6));
                    })
                    .toList();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }




}
