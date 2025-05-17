package Tema7.Examen2024.services;

import Tema7.Examen2024.models.Especialidad;
import Tema7.Examen2024.models.Tecnico;
import Tema7.Examen2024.models.TicketSoporte;
import Tema7.Examen2024.models.Usuario;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class ServicioSoporte {

    List<TicketSoporte> tickets;
    Set<Usuario> usuarios;
    Set<Tecnico> tecnicos;

    public ServicioSoporte() {
        tickets = new ArrayList<>();
        usuarios = new HashSet<>();
        tecnicos = new HashSet<>();
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

        this.tickets.add(new TicketSoporte(max+1L,fechaCreacion,fechaFin,null,
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
    public Tecnico getTecnico(int id) {

        return tecnicos.stream()
                .findFirst()
                .filter(t -> t.getId().equals(id))
                .orElseThrow();
    }

    /**
     * Usuario con el id indicado
     * @param id
     * @return
     */
    public Usuario getUsuario(int id) {
        return usuarios.stream()
                .findFirst()
                .filter(u -> u.getId().equals(id))
                .orElseThrow();
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

    public Map<Especialidad, List<Tecnico>> getTecnicosGroupByEspecialidad(){
        return tecnicos.stream()
                .collect(Collectors.groupingBy(t -> t.getEspecialidad()));
    }









}
