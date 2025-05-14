package Tema7.PracticaIII;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class DAOLectura {

    private Set<Lectura> lecturas;

    public DAOLectura() {
        this.lecturas = new HashSet<>();
        this.cargarDatos();
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

    /**
     * Lee el fichero lecturas.csv y para cada línea crea una Lectura
     * Lo añade a this.lecturas
     * Busca su finca correspondiente con DAOFinca.findByID
     */
    public void cargarDatos(){

        DAOFinca df = new DAOFinca();

        try {
            Files.lines(Path.of("src/Tema7/PracticaIII/lecturas.csv"))
                    .map(line -> {
                        List<String> valores = Arrays.asList(line.split(","));

                        return new Lectura(Integer.valueOf(valores.get(0)),Double.valueOf(valores.get(1)),
                                Double.valueOf(valores.get(2)),
                                LocalDateTime.of(LocalDate.parse(valores.get(3)),LocalTime.parse(valores.get(4))),
                                df.findById(Integer.valueOf(valores.get(5))));
                    })
                    .toList();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * Los datos de this.lecturas los graba en lecturas.csv
     */
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



    /**
     * Devuelve todas las lecturas agrupadas por Finca (ID)
     * @return
     */
    public HashMap<Integer, List<Lectura>> getLecturasPorFinca(){

        Map<Integer, List<Lectura>> lecss = lecturas.stream()
                .collect(Collectors.groupingBy(lect -> lect.getFinca().getId()));

        HashMap<Integer, List<Lectura>> lecsPorFinca = new HashMap<>(lecss);

        return lecsPorFinca;
    }


    /**
     * Devuelve la temp máxima de todas las lecturas de una finca
     * @param id
     * @return
     */
    public Double getTempMaximaFinca(int id){

        return lecturas.stream()
                .filter(lectura -> lectura.getFinca().getId() == id)
                .map(Lectura::getTemperatura)
                .max(Comparator.naturalOrder())
                .orElseThrow();
    }

    /**
     * Devuelve la temperatura mínima de todas las lecturas de una finca
     * @param id
     * @return
     */
    public Double getTempMinimaFinca(int id){
        return lecturas.stream()
                .filter(lectura -> lectura.getFinca().getId() == id)
                .map(Lectura::getTemperatura)
                .min(Comparator.naturalOrder())
                .orElseThrow();
    }

     /** Para una finca devuelve una lista de los valores de humedad ordenados por fecha
     * @param id
     * @return
     */
    public List<Double> getHumedadPorFinca(int id){

        return lecturas.stream()
                .filter(lectura -> lectura.getFinca().getId()==id)
                .sorted(Comparator.comparing(Lectura::getMomento))
                .map(Lectura::getHumedad)
                .toList();

    }

    /**
     * Para una finca devuelve una lista de los valores de temperatura ordenados por fecha
     * @param id
     * @return
     */
    public List<Double> getTemperaturaPorFinca(int id){
        return lecturas.stream()
                .filter(lectura -> lectura.getFinca().getId()==id)
                .sorted(Comparator.comparing(Lectura::getMomento))
                .map(Lectura::getHumedad)
                .toList();
    }

    /**
     * Muestra todas las temperaturas de una finca  en dia concreto ordenado por fecha(hora)
     * @param id
     * @param dia
     * @return
     */
    public List<Double> getTempDiaPorFinca(int id,LocalDate dia){
        return lecturas.stream()
                .filter(lectura -> lectura.getFinca().getId()==id)
                .filter(lectura -> lectura.getMomento().equals(dia))
                .sorted(Comparator.comparing(lec -> lec.getMomento().getHour()))
                .map(Lectura::getTemperatura)
                .toList();
    }









}
