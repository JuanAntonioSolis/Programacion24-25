package Tema7.PracticaIII;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DAOFinca {

    private ArrayList<Finca> fincas;

    public DAOFinca() {
        fincas = new ArrayList<>();
        this.cargarDatos();
    }

    public void setFincas(ArrayList<Finca> fincas) {
        this.fincas = fincas;
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
            Files.lines(Paths.get("scr/Tema7/PracticaIII/fichero.csv"))
                    .map(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));

                        Finca fn = new Finca(Integer.valueOf(tokens.get(0)),tokens.get(1),Double.valueOf(tokens.get(2)),
                                Integer.valueOf(tokens.get(3)),Double.valueOf(tokens.get(4)),tokens.get(5),tokens.get(6));

                        return fincas.add(fn);
                    });

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * Devuelve todas las fincas ordenadas de mayor a menor superficie.
     * @return
     */
    public List<Finca> getFincasPorSuperficie(){
        return fincas.stream()
                .sorted(Comparator.comparing(Finca::getSuperficie).reversed())
                .toList();
    }

    /**
     * Devuelve las tres fincas más grandes
     * @return
     */
    public List<Finca> getMasGrandes(){

    }




}
