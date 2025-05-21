package Tema7.Examen2024.io;

import Tema7.Examen2024.models.*;
import Tema7.Examen2024.services.ServicioSoporte;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class DAOTicketsSoporte {

    public static ServicioSoporte cargarCSV(){

        ServicioSoporte servSop = new ServicioSoporte();

        List<Usuario> usuarios;
        List<Tecnico> tecnicos;

        try {
            usuarios = Files.lines(Paths.get("src/Tema7/Examen2024/ceseuves/usuarios.csv"))
                    .map(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));

                        Usuario user = new Usuario(
                                Long.valueOf(tokens.get(0)),
                                tokens.get(1),
                                tokens.get(2),
                                tokens.get(3),
                                tokens.get(4),
                                LocalDate.parse(tokens.get(5))
                        );
                        return user;
                    })
                    .toList();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Set de la lista de usuarios a la obtenida en servSop
        servSop.setUsuarios(new HashSet<>(usuarios));


        //Tecnicos de otra manera, añadiendo directamente a la lista de servSop
        try {
            Files.lines(Paths.get("src/Tema7/Examen2024/ceseuves/tecnico.csv"))
                    .forEach(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));

                        Tecnico tec = new Tecnico(
                                Long.valueOf(tokens.get(0)),
                                tokens.get(1),
                                tokens.get(2),
                                tokens.get(3),
                                tokens.get(4),
                                Especialidad.valueOf(tokens.get(5)),
                                Integer.valueOf(tokens.get(6))
                        );
                        servSop.addTecnico(tec);
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            Files.lines(Paths.get("src/Tema7/Examen2024/ceseuves/tickets.csv"))
                    .forEach(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));

                        Estado state = Estado.valueOf(tokens.get(3));

                        LocalDate fechaFin = null;
                        if (state.equals(Estado.RESUELTO)){
                            fechaFin = LocalDate.parse(tokens.get(2));
                        }

                        TicketSoporte ts = new TicketSoporte(
                                Long.valueOf(tokens.get(0)),
                                LocalDate.parse(tokens.get(1)),
                                fechaFin,
                                state,
                                Integer.valueOf(tokens.get(4)),
                                servSop.getUsuario(Long.valueOf(tokens.get(5))),
                                servSop.getTecnico(Long.valueOf(tokens.get(6))),
                                tokens.get(7)
                                );

                        servSop.addTickerSpoporte(ts);

                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return servSop;

    }

    public static void grabarCSV(ServicioSoporte ss){
        try {
            Files.write(Paths.get("src/Tema7/Examen2024/ceseuves/usuarios.csv"),
                    ss.getUsuarios().stream()
                            .map(u -> { //Usuario -> String (linea)
                                StringBuffer sb = new StringBuffer();
                                sb.append(u.getId()).append(",");
                                sb.append(u.getNombre()).append(",");
                                sb.append(u.getApellidos()).append(",");
                                sb.append(u.getMail()).append(",");
                                sb.append(u.getMovil()).append(",");
                                sb.append(u.getFechaAlta());
                                return sb.toString();
                            })
                            .toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            Files.write(Paths.get("src/Tema7/Examen2024/ceseuves/tecnico.csv"),
                    ss.getTecnicos().stream()
                            .map(u -> { //Tecnico -> String (linea)
                                StringBuffer sb = new StringBuffer();
                                sb.append(u.getId()).append(",");
                                sb.append(u.getNombre()).append(",");
                                sb.append(u.getApellidos()).append(",");
                                sb.append(u.getMail()).append(",");
                                sb.append(u.getMovil()).append(",");
                                sb.append(u.getEspecialidad()).append(",");
                                sb.append(u.getValoracion());
                                return sb.toString();
                            })
                            .toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            Files.write(Paths.get("src/Tema7/Examen2024/ceseuves/tickets.csv"),
                    ss.getTickets().stream()
                            .map(u -> { //Ticket -> String (linea)
                                StringBuffer sb = new StringBuffer();
                                sb.append(u.getId()).append(",");
                                sb.append(u.getFechaCreacion()).append(",");
                                if (u.getFechaFinalizacion() != null){
                                    sb.append(u.getFechaFinalizacion()).append(",");
                                } else {
                                    sb.append(",");
                                }
                                sb.append(u.getEstado()).append(",");
                                sb.append(u.getPrioridad()).append(",");
                                sb.append(u.getSolicitante().getId()).append(",");
                                sb.append(u.getAsignado().getId()).append(",");
                                if (u.getComentarios() != null){
                                    sb.append(u.getComentarios());
                                }
                                return sb.toString();
                            })
                            .toList());
                            //, StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
