package Tema7.EjerciciosClase.MiniRela.Ej2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class CitasConsulta {


    private HashSet<Cita> citas;

    public CitasConsulta() {
        this.citas = new HashSet<>();
    }

    public HashSet<Cita> getCitas() {
        return citas;
    }

    public void setCitas(HashSet<Cita> citas) {
        this.citas = citas;
    }

    public void addCita(Cita c){
        this.citas.add(c);
    }

    public void deleteCita(Cita c){
        this.citas.remove(c);
    }

    public void listarCitasPorNombre(){
        ArrayList<Cita> ordenao = new ArrayList<>(this.citas);
        ordenao.sort(new Comparator<Cita>() {
            @Override
            public int compare(Cita o1, Cita o2) {
                return o1.getPersona().getNombre().compareTo(o2.getPersona().getNombre());
            }
        });
        listarCitas(ordenao);
    }

    public void listarCitasPorApellidos(){

        ArrayList<Cita> ordenaSur = new ArrayList<>(this.citas);

        ordenaSur.sort(new Comparator<Cita>() {
            @Override
            public int compare(Cita o1, Cita o2) {
                return o1.getPersona().getApellidos().compareTo(o2.getPersona().getApellidos());
            }
        });

        listarCitas(ordenaSur);
    }

    public void listarCitasPorFechaYApellidos(){
        ArrayList<Cita> ordenaSur = new ArrayList<>(this.citas);

        ordenaSur.sort(new Comparator<Cita>() {

            @Override
            public int compare(Cita o1, Cita o2) {
                if (o1.getFecha().equals(o2.getFecha())) {
                    return o1.getPersona().getApellidos().compareTo(o2.getPersona().getApellidos());
                } else
                    return o1.getFecha().compareTo(o2.getFecha());
            }
        });

        listarCitas(ordenaSur);

    }

    public void listarCitasPorHora(LocalDate fecha){
        ArrayList<Cita> citasFecha = new ArrayList<>();
        for (Cita c : citas) {
            if (c.getFecha().equals(fecha)){
                citasFecha.add(c);
            }
        }

        citasFecha.sort(Comparator.comparing(Cita::getHora));
        listarCitas(citasFecha);
    }

    public void buscarCitasFuturas(String email){
        for (Cita c : citas) {
            if (c.getPersona().getMail().equals(email) && c.getFecha().isAfter(LocalDate.now())) {
                System.out.println(c);
            }
        }
    }

    public void listarCitas(ArrayList<Cita> appoint){
        StringBuffer sb = new StringBuffer();

        for (Cita ct : appoint){
            sb.append(ct);
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
