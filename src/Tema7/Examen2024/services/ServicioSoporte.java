package Tema7.Examen2024.services;

import Tema7.Examen2024.models.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class ServicioSoporte {

    ArrayList<TicketSoporte> tickets;
    HashSet<Usuario> usuarios;
    HashSet<Tecnico> tecnicos;

    public ServicioSoporte() {
        tickets = new ArrayList<>();
        usuarios = new HashSet<>();
        tecnicos = new HashSet<>();
    }

    public void setTickets(ArrayList<TicketSoporte> tickets) {
        this.tickets = tickets;
    }

    public void setUsuarios(HashSet<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void setTecnicos(HashSet<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }

    public List<TicketSoporte> getTickets() {
        return tickets;
    }

    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public Set<Tecnico> getTecnicos() {
        return tecnicos;
    }

    public void addUsuario(Usuario u){
        usuarios.add(u);
    }

    public void deleteUsuario(int id){
        usuarios.removeIf(u -> u.getId().equals(id));
    }

    public void addTecnico(Tecnico t){
        tecnicos.add(t);
    }

    public void deleteTecnico(int id){
        tecnicos.removeIf(t -> t.getId().equals(id));
    }

    public void addTicketSoporte(LocalDate fechaCreacion, LocalDate fechaFin, Integer prioridad,
                                 String comentarios, Usuario usuario, Tecnico tecnico){
        Long max = tickets.stream()
                .max(Comparator.comparing(TicketSoporte::getId))
                .map(t -> t.getId())
                .orElseThrow();

        this.tickets.add(new TicketSoporte(max+1,fechaCreacion,fechaFin,Estado.ABIERTO,
                prioridad,usuario,tecnico,comentarios));
    }

    public void deleteTicketSoporte(int id){
        tickets.removeIf(t -> t.getId().equals(id));
    }

    /**
     * Tecnico con el id indicado
     * @param id
     * @return
     */
    public Tecnico getTecnico(Long id) {

        return tecnicos.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    /**
     * Usuario con el id indicado
     * @param id
     * @return
     */
    public Usuario getUsuario(Long id) {
        return usuarios.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    /**
     * Lista de técnicos de una especialidad
     * @param e
     * @return
     */
    public List<Tecnico> getTecnicosByEspecialidad(Especialidad e){
        return tecnicos.stream()
                .filter(t -> t.getEspecialidad().equals(e))
                .toList();
    }

    /**
     * Lista de Tecnico por cada especialidad, ordenados por valoracion
     * @return
     */
    public Map<Especialidad, List<Tecnico>> getTecnicosGroupByEspecialidad(){
        Map<Especialidad, List<Tecnico>> tecs = tecnicos.stream()
                .collect(Collectors.groupingBy(t -> t.getEspecialidad()));

        tecs.forEach((k,v) -> {
            v.sort(Comparator.comparing(Tecnico::getValoracion));
        });

        return tecs;

    }

    /**
     * Lista de tickets abiertos ordenados por fecha de creacion descendente
     * @return
     */
    public List<TicketSoporte> getTicketsAbiertos(){
        return tickets.stream()
                .filter(t -> t.getEstado().equals(Estado.ABIERTO))
                .sorted(Comparator.comparing(TicketSoporte::getFechaCreacion).reversed())
                .toList();
    }

    /**
     * Lista de tickets cerrados ordenados por fecha de fin descendente
     * @return
     */
    public List<TicketSoporte> getTicketsCerrados(){
        return tickets.stream()
                .filter(t -> t.getEstado().equals(Estado.RESUELTO))
                .sorted(Comparator.comparing(TicketSoporte::getFechaFinalizacion).reversed())
                .toList();
    }

    /**
     * Tickets en proceso que tienen asignado un tecnico de especialidad informática
     * @return
     */
    public List<TicketSoporte> getTicketsEnProcesoTecnicoInformatico(){
        return tickets.stream()
                .filter(t -> t.getEstado().equals(Estado.ENPROCESO))
                .filter(t -> t.getAsignado().getEspecialidad().equals(Especialidad.INFORMATICA))
                .toList();
    }

    /**
     * Devuelve el total de tickets resueltos de una prioridad especifica
     * @param prioridad
     * @return
     */
    public Long getTotalTicketsResueltos(Integer prioridad){

        return tickets.stream()
                .filter(t -> t.getEstado().equals(Estado.RESUELTO))
                .filter(t -> t.getPrioridad().equals(prioridad))
                .count();
    }

    /**
     * Conjunto con los tickets con el estado y prioridad indicados,
     * ordenados por fecha de creacion ascendente
     * @param estado
     * @param prioridad
     * @return
     */
    public Set<TicketSoporte> findTicketsByEstadoAndPrioridad(Estado estado, Integer prioridad){
       return tickets.stream()
                .filter(t -> t.getPrioridad().equals(prioridad))
                .filter(t -> t.getEstado().equals(estado))
                .collect(Collectors.toCollection(TreeSet::new));
    }

    /**
     * Tecnicos que han trabajado en algun ticket, agrupados por especialidad
     * @return
     */
    public Map<Especialidad,List<Tecnico>> findTecnicosInTickets(){

        return tickets.stream()
                .map(TicketSoporte::getAsignado)
                .collect(Collectors.groupingBy(t -> t.getEspecialidad()));
    }

    /**
     * Muestra la lista de los técnicos que han solucionado tickets en menos de 5 días
     * @return
     */
    public Set<Tecnico> findTecnicosRapidos(){
        return tickets.stream()
                .filter(t -> ChronoUnit.DAYS.between(t.getFechaFinalizacion(),t.getFechaCreacion()) < 5)
                .map(TicketSoporte::getAsignado)
                .collect(Collectors.toSet());
    }

    /**
     * Devuelve un total de tickets cerrados que han tardado más de una semana en cerrarse desde que se abrieron
     * @return
     */
    public Long getTotalTicketsRetardados(){

        return tickets.stream()
                .filter(t -> t.getEstado().equals(Estado.RESUELTO))
                .filter(t -> ChronoUnit.DAYS.between(t.getFechaFinalizacion(),t.getFechaCreacion()) > 7)
                .count();

    }

    /**
     * Devuelve la media de días en que se resuelven los tickets de una determinada prioridad
     * @param prioridad
     * @return
     */
    public Double getMediaResolucionTickets(Integer prioridad){
        return tickets.stream()
                .filter(t -> t.getPrioridad().equals(prioridad))
                .filter(t -> t.getEstado().equals(Estado.RESUELTO))
                .mapToLong(t -> ChronoUnit.DAYS.between(t.getFechaCreacion(),t.getFechaFinalizacion()))
                .average()
                .orElse(0.0);
    }

    /**
     * Devuelve un mapa donde para cada técnico que resuelve tickets muestre la media de días en que
     * los resuelve.
     * @return
     */
    public Map<Tecnico, Double> getMediaResolucionTicketsGroupByTecnico(){
        return tickets.stream()
                .filter(t -> t.getEstado().equals(Estado.RESUELTO))
                .collect(Collectors.groupingBy(TicketSoporte::getAsignado,Collectors.averagingLong(t ->
                        ChronoUnit.DAYS.between(t.getFechaCreacion(),t.getFechaFinalizacion()))));
    }

    /**
     * Dice si todos los tickets han sido o no resueltos en menos de 10 días,
     * sólo para tickets resueltos.
     * @return
     */
    public Boolean areAllTicketsFinishedLessThanTenDays(){
        return tickets.stream()
                .filter(t -> t.getEstado().equals(Estado.RESUELTO))
                .allMatch(t -> ChronoUnit.DAYS.between(t.getFechaCreacion(),t.getFechaFinalizacion()) < 10);
    }

    /**
     * Devuelve un ticket que haya sido resuelto en el mismo dia
     * @return
     */
    public Optional<TicketSoporte> getFirstTicketSolvedOneDay(){
        return tickets.stream()
                .filter(t -> t.getFechaCreacion().equals(t.getFechaFinalizacion()))
                .findFirst();
    }


















}
