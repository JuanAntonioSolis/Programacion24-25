package Tema7.Examen2024.models;

import java.time.LocalDate;

public class TicketSoporte {

    private Integer id;
    private LocalDate fechaCreacion;
    private LocalDate fechaFinalizacion;
    private Estado estado;
    private Integer prioridad;
    private Usuario solicitante;
    private Tecnico asignado;
    private String comentarios;

    private static Long autoincremento = 1L;



}
